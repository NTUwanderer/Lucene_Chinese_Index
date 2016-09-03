import org.jsoup.Jsoup;

import java.io.BufferedReader;
import java.io.FileReader;

import java.io.PrintWriter;

public class Parse {
	public static String readHtmlFile(String fileName) {
		String fileString = "";
		try {
			String line;
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			while ((line = br.readLine()) != null) {
				fileString += line;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return fileString;
	}
	public static String readPdfFile(String fileName) {

	}

	public static void main(String[] args) {
		String htmlText = readHtmlFile("html\\().html.");
		// System.out.println(htmlText);
		// String text = Jsoup.parse(htmlText,"UTF-8").select("body").text();
		String text = Jsoup.parse(htmlText,"UTF-8").text();
		System.out.println(text);
		try {
			PrintWriter writer = new PrintWriter("htmlText.txt", "UTF-8");
			writer.println(text);
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}