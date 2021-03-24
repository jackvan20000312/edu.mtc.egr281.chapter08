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

public class EveryThirdPanel extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	JLabel cipherLabel;
	JLabel plainLabel;
	JTextField cipherText;
	JTextField plainText;
	JButton decrypt;
	
	public EveryThirdPanel() {
		super();
		this.setPreferredSize(new Dimension(375, 300));
		this.setBackground(Color.RED);
		this.setLayout(new FlowLayout());
		
		this.cipherLabel = new JLabel("Enter Encrypted Message:");
		this.add(this.cipherLabel);
		this.decrypt = new JButton("Decrypt");
		this.decrypt.setToolTipText("Click Button TO Decrypt Message!");
		this.decrypt.addActionListener(this);
		this.decrypt.add(this.decrypt);
		
		this.cipherText = new JTextField(25);
		this.add(this.cipherText);
		
		this.plainLabel = new JLabel("Decrypted Message below");
		this.add(this.plainLabel);
		
		this.plainText = new JTextField(25);
		this.add(this.plainText);
	
	}
	public void actionPerformed(ActionEvent ae) {
		String actionCommand = ae.getActionCommand();
		if("Decrypt".equalsIgnoreCase(actionCommand)) {
			this.plainText.setText(EveryThird.decode(this.cipherText.getText()));
		}
		
	}
	

	
}
