import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window extends JFrame {
    CaesarCipher c;
    
    public Window() {

	// New Frame
	JFrame f = new JFrame("Caesar Cipher");
	
	// Size parameters
	int size = 1000;
	int width = 300;

	// Create the PlainText TextField                                                                                                                                                                
        JTextArea text = new JTextArea("Enter the Plain Text here.");
        int tWidth = width;
        int tHeight = tWidth/2;
        text.setBounds(size/2-tWidth/2, size/2-tHeight/2-200, tWidth, tHeight);
        text.setLineWrap(true);
        f.add(text);

	// Create the CipherText label                                                                                                                                                                   
        JLabel label = new JLabel("CipherText", SwingConstants.CENTER);
        int lWidth = width;
        int lHeight = lWidth/2;
        label.setBounds(size/2-lWidth/2, size/2-lWidth/2+200, lWidth, lHeight);
        f.add(label);
	
	// Create the Encryption Button
	JButton button = new JButton("Encrypt");
	int bWidth = width/2;
	int bHeight = bWidth/2;
	button.setBounds(size/2-bWidth/2, size/2-bHeight/2, bWidth, bHeight);	
	button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		    String plaintext = text.getText();
		    c = new CaesarCipher(plaintext, 5);
		    label.setText(c.getCiphertext());
		}
	    });
	f.add(button);

	// Set up the frame
	f.setTitle("Caesar Cipher");
	f.setSize(size, size);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setLayout(null);
	f.setVisible(true);
    }
    public static void main(String[] args) {
	new Window();
    }
}
