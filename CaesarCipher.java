public class CaesarCipher {
    private String plaintext;
    private String ciphertext;
    private int shift;
    
    public CaesarCipher(String plaintext, int shift) {
	this.plaintext = plaintext;
	this.ciphertext = "";
	this.shift = shift%26;
	for (int i = 0; i < plaintext.length(); i++) {
	    int character = (int)(plaintext.charAt(i));
	    if (character >= (int)('a') && character <= (int)('z')) {
		this.ciphertext += (char)( (character+this.shift-(int)('a')) % 26 + (int)('a'));
	    } else if (character >= (int)('A') && character <= (int)('Z')) {
		this.ciphertext += (char)( (character+this.shift-(int)('A')) % 26 + (int)('A'));
	    } else {
		ciphertext += (char)character;
	    }
	}
    }
    public int shiftNumber() {
	return this.shift;
    }

    public String getPlaintext() {
	return this.plaintext;
    }

    public String getCiphertext() {
	return this.ciphertext;
    }
}

