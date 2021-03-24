package edu.mtc.egr281.chapter08;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThanksgivingDemo extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private Container contentPane;
	private JLabel buttonLabel;
	private JButton clearButton;
	private JButton everyThirdButton;
	private JButton reverseButton;
	
	private ReversePanel reverse;
	private EveryThirdPanel everyThird;
	public ThanksgivingDemo() {
		super();
		this.setTitle("Thanksgiving TextField Demo");
		this.setSize(400,375);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.contentPane = this.getContentPane();
		this.contentPane.setLayout(new FlowLayout());
		this.contentPane.setBackground(Color.ORANGE);
		
		this.buttonLabel = new JLabel("Click A Button:");
		this.contentPane.add(this.buttonLabel);
		
		this.reverseButton = new JButton("Reverse");
		this.reverseButton.addActionListener(this);
		this.contentPane.add(this.reverseButton);
		
		this.everyThirdButton = new JButton("Every Third");
		this.everyThirdButton.addActionListener(this);
		this.contentPane.add(this.everyThirdButton);
		
		this.clearButton = new JButton("Clear");
		this.clearButton.addActionListener(this);
		this.contentPane.add(this.clearButton);
		
		this.reverse = new ReversePanel();
		this.contentPane.add(this.reverse);
		this.reverse.setVisible(false);

		this.everyThird = new EveryThirdPanel();
		this.contentPane.add(this.everyThird);
	}// eniding bracket of constructor
	
	public void actionPerformed(ActionEvent ae) {
		String actionCommand = ae.getActionCommand();
		if("Clear".equalsIgnoreCase(actionCommand)) {
			this.reverse.setVisible(false);
			this.everyThird.setVisible(false);
			this.everyThirdButton.setVisible(true);
			this.reverseButton.setVisible(true);
		}
		
		else if( "Reverse".equalsIgnoreCase(actionCommand)) {
			this.reverse.setVisible(true);
			this.everyThird.setVisible(false);
			this.everyThirdButton.setVisible(false);
			this.reverseButton.setVisible(true);
		}
		else if( "Every Third".equalsIgnoreCase(actionCommand)) {
			this.reverse.setVisible(false);
			this.everyThird.setVisible(true);
			this.everyThirdButton.setVisible(false);
			this.reverseButton.setVisible(true);
		}
		
	}//ending bracket of method actionperformed
	
}//ending bracket of class ThanksGiving Demo
