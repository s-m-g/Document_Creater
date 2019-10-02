package package1;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

import java.io.File;
import java.io.FileOutputStream;

public class give_doc {

	public static void main(String[] args)
	{
		try 
		{
	XWPFDocument doc= new XWPFDocument();
	FileOutputStream out= new FileOutputStream(new File("C:\\RPT\\user.docx"));
	
	XWPFParagraph para = doc.createParagraph();
	XWPFRun run= para.createRun();
	
	run.setText("welcome to this finally made wordxhdfhdhdhgdhjghgfhghgh file");
	
	XWPFTable table = doc.createTable();
	
	XWPFTableRow trow1= table.getRow(0);
	trow1.getCell(0).setText("0 , Shrey ");
	
	XWPFTableRow trow2= table.createRow();
	trow2.getCell(0).setText("1 , Mohan");
	
	XWPFTableRow trow3= table.createRow();
	trow3.getCell(0).setText("2 , Gupta");
	
	doc.write(out);
	out.close();
	System.out.println("created");
	
		}
		
		catch(Exception e)
		{
			
		}

	}

}
