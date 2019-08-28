package org.rough;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class WriteInPDF {

	public static void main(String[] args) 
	{
		String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
		System.out.println(timeStamp);
		
		///AutomationFramework/result/
		
		String File_Name="../AutomationFramework/result/TestResult_"+timeStamp+".pdf";
		
		Document doc = new Document();
		try {
			PdfWriter.getInstance(doc, new FileOutputStream(new File(File_Name)));
			
			
			doc.open();
			Paragraph p =new Paragraph();
			p.add("Automation Test Result");
			p.setAlignment(Element.ALIGN_CENTER);
			doc.add(p);
			
			Paragraph p2 = new Paragraph();
			p2.add("This is test report of run @ "+timeStamp);
			doc.add(p2);
			
			doc.close();
			System.out.println("Done");
			
			
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		


	}

}
