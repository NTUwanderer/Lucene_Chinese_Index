import java.io.FileInputStream;

import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;


public class Parse 
{
   public static void main(String[] args)throws Exception 
   {
	   XWPFDocument docx = new XWPFDocument(
	   new FileInputStream("D:\\Resume\\Resume_test.docx"));
	   //using XWPFWordExtractor Class
	   XWPFWordExtractor we = new XWPFWordExtractor(docx);
	   String text = we.getText();
	   System.out.println(text);
   }
}
