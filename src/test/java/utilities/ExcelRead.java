package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelRead {
	
	HSSFWorkbook file;
	HSSFSheet s;
	public String readExcel(String path,String SheetName,int r,int c) throws IOException
	{
		FileInputStream fin=new FileInputStream(path);
		file=new HSSFWorkbook(fin);
		s=file.getSheet("Sheet1");
		String data=s.getRow(r).getCell(c).getStringCellValue();
		file.close();
		return data;
	}
public int getLastRow(String path,String SheetName) throws IOException
{
	FileInputStream fin=new FileInputStream(path);
	file=new HSSFWorkbook(fin);
	s=file.getSheet("Sheet1");
	int LastRow=s.getLastRowNum();
	return LastRow;
}
public static void main(String args[]) throws IOException
{
	ExcelRead e= new ExcelRead();
	//String result=e.readExcel("C:\\Users\\Vanak\\OneDrive\\Desktop\\datasheet.xls");
		//	System.out.println(result);
		int LastRow=e.getLastRow("C:\\TestData\\datasheet.xls","Sheet1");
		for(int i=0;i<LastRow;i++)
		{
			String Username=e.readExcel("C:\\TestData\\datasheet.xls","Sheet1",i,0);
			String Password=e.readExcel("C:\\TestData\\datasheet.xls","Sheet1",i,1);
			System.out.println("Username"+i+" " +Username+"");
			System.out.println("Password"+i+" " +Password+" ");
		}
}
}
