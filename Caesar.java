package caesarcipher;
import javax.swing.JOptionPane;
public class Caesar {
	private String alpha="abcdefghijklmnopqrstuvwxyz";
	private String choice="";
	private String plainText="";
	private String encodedText="";
	private String decodedText="";
	private int key=0;
	public Caesar() {
	}
	public String getEncryptDecrypt() {
		while (true) {
			choice=JOptionPane.showInputDialog(null, "Would you like to encrypt (e) or decrypt (d)?");
			if (choice.equals("e") || choice.equals("d")) {
				break;
			}
			else {
				JOptionPane.showMessageDialog(null, "Please answer either 'e' for encryption or 'd' for decryption.");
			}
		}
		return choice;
	}
	public void getPlainText() {
		plainText=JOptionPane.showInputDialog(null, "Please enter the plain text message:");
	}
	public void getKey() {
		key=Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the shift key:"));
	}
	public void encrypt() {
		for (int i=0; i<plainText.length(); i++) {
			String s=String.valueOf(plainText.charAt(i));
			if (s.equals(" ")) {
				encodedText+=" ";
			}
			else {
				encodedText+=alpha.charAt((alpha.indexOf(plainText.charAt(i))+key)%alpha.length());
			}
		}
		JOptionPane.showMessageDialog(null, encodedText);
	}
	public void decrypt() {
		for (int i=0; i<plainText.length(); i++) {
			String s=String.valueOf(plainText.charAt(i));
			if (s.equals(" ")) {
				decodedText+=" ";
			}
			else {
				decodedText+=alpha.charAt((alpha.indexOf(plainText.charAt(i))+26-key)%alpha.length());
			}
		}
		JOptionPane.showMessageDialog(null, decodedText);
	}
}