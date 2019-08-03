import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Input the plaintext: ");
	String plaintext = in.next();
	System.out.println("Input the shift number: ");
	int shiftnumber = in.nextInt();

	CaesarCipher c = new CaesarCipher(plaintext, shiftnumber);
	System.out.println("Cipher Text: "+c.getCiphertext());
    }
}
