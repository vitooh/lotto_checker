package lotto_checker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Lotcheck extends JFrame implements ActionListener{
	
	private JButton executeButton;
	private JTextField resultsArea;
	private ButtonGroup radioGroup;
	private JRadioButton radioDL, radioML, radioEL;
		
	Lotcheck() {
		this.setSize(600, 200);
		this.setTitle("Lotto Checker");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLayout(null);
		executeButton = new JButton("Execute!");
		executeButton.setBounds(0, 0, 600, 30);
		executeButton.addActionListener(this);
		this.add(executeButton);
		radioGroup = new ButtonGroup();
		radioDL = new JRadioButton("Lotto", true);
		radioDL.setBounds(0,30,200,30);
		radioGroup.add(radioDL);
		this.add(radioDL);
		radioML = new JRadioButton("Multi", false);
		radioML.setBounds(201,30,200,30);
		radioGroup.add(radioML);
		this.add(radioML);
		radioEL = new JRadioButton("Mini", false);
		radioEL.setBounds(401,30,200,30);
		radioGroup.add(radioEL);
		this.add(radioEL);
		
		resultsArea = new JTextField("");
		resultsArea.setBounds(0, 60, 600, 140);
		this.add(resultsArea);
		
	}

	public static void main(String[] args) {
		new Lotcheck();

	}

	@Override
	public void actionPerformed(ActionEvent execute) {
		//System.out.println(new LottoResult(new LottoResponse("app.lotto.pl/wyniki/?type=dl")));
		resultsArea.setText(new Date().toString() 
				+ " - "
				+ new LottoResult(new LottoResponse("app.lotto.pl/wyniki/?type=dl")).toString());
		
	}

}
