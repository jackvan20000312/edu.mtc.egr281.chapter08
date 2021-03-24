package edu.mtc.egr281.chapter08;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ReversePanel extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	private JLabel plainLabel;
	private JLabel cipherLabel;
	private JTextField plainText;
	private JTextField cipherText;
	private JButton encrypt;
	
	public ReversePanel() {
		super();
		this.setPreferredSize(new Dimension(375,300));
		this.setBackground(Color.GRAY);
		this.setLayout(new FlowLayout());
		
		this.plainLabel = new JLabel("Enter plaiuntext");
		this.add(this.plainLabel);
		
		this.encrypt = new JButton("Encrypt");
		this.encrypt.setToolTipText("Click button to encrypt message");
		this.encrypt.addActionListener(this);
		this.add(this.plainText);
		
		this.cipherLabel = new JLabel("EncryptedMessage below");
		this.add(this.cipherLabel);
		
		this.cipherText = new JTextField(25);
		this.add(this.cipherText);
		
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		String actionCommand = ae.getActionCommand();
		if("Encrypt".equalsIgnoreCase(actionCommand)) {
			
			this.cipherText.setText(ReverseCipher.encode(this.plainText.getText()));
			
			
			
		}
	}
	
	
	public void clear() {
		
	}
}
