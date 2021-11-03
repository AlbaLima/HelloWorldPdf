import com.itextpdf.text.Paragraph;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;

public class HelloWorldPdf {

	public static void main(String[] args) {
		try {
			Document documento = new Document();

			FileOutputStream ficheroPdf = new FileOutputStream("HolaMundo.pdf");

			PdfWriter.getInstance(documento, ficheroPdf).setInitialLeading(12);

			documento.open();

			documento.add(new Paragraph("Hola mundo!"));

			documento.close();
		} catch (Exception e) {

		}
	}
}
