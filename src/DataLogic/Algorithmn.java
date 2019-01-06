package DataLogic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.text.PDFTextStripper;

public class Algorithmn {
	private String temaURL;
	private String tematPerKrahasimURL;
	private String permbajtjaTemes;
	
	public Algorithmn() {
		
	}
	public Algorithmn(String url) {
		this.temaURL = url;
		this.lexoPermbajtjenNgaURL();
	}
	private void lexoPermbajtjenNgaURL() {
		try {
			PDDocument doc = PDDocument.load(new File(this.temaURL));
			if (!doc.isEncrypted()) {
			    PDFTextStripper stripper = new PDFTextStripper();
			    this.permbajtjaTemes = stripper.getText(doc);
			}
			doc.close(); 
		} catch (InvalidPasswordException e) {
			//e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}

	}
}
