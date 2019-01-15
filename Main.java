package caesarcipher;
import javax.swing.JOptionPane;
public class Main {
	public static void main(String[] args) {
		Caesar openCaesar=new Caesar();
		String crypt=openCaesar.getEncryptDecrypt();
		if (crypt.equals("e")) {
			openCaesar.getPlainText();
			openCaesar.getKey();
			openCaesar.encrypt();
		}
		else if (crypt.equals("d")) {
			openCaesar.getPlainText();
			openCaesar.getKey();
			openCaesar.decrypt();
		}
	}
}