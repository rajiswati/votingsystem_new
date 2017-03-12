 

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class input implements ActionListener {

	JFrame frame;
	
	JButton button;
	JButton button2;
	JRadioButton A;
	JRadioButton B;
	JRadioButton C;
	JRadioButton D;
	JRadioButton E;
	double t;
	
	int votesA=0;
	int votesB=0;
	int votesC=0;
	int votesD=0;
	int votesE=0;
	
	
	
	public static void main(String args[]) {
		new input();
		
	}
	
	input() {
		
		frame = new JFrame("tally vote");
		
		JPanel panel = new JPanel(new GridLayout(5, 1));
		JPanel buttons = new JPanel(new FlowLayout());
		Container contentPane = frame.getContentPane();
		contentPane.setLayout(new BorderLayout());
		contentPane.add(panel, BorderLayout.CENTER);
		contentPane.add(buttons, BorderLayout.SOUTH);
		
		
		
		
		button = new JButton("Submit");
		button2 = new JButton("Results");
		
		button.addActionListener(this);
		button2.addActionListener(this);
		
		A = new JRadioButton("Andrew Stevens");
		B = new JRadioButton("Balaji Jasinder");
		C = new JRadioButton("Carl Burges");
		D = new JRadioButton("Dick Hannover");
		E = new JRadioButton("Everest lukaku");

		
		ButtonGroup bg = new ButtonGroup ();
		bg.add(A);
		bg.add(B);
		bg.add(C);
		bg.add(D);
		bg.add(E);
		
		
		panel.add(A);
		panel.add(B);
		panel.add(C);
		panel.add(D);
		panel.add(E);
		buttons.add(button);
		buttons.add(button2);
		
		
		
		
		int fw = 300;
		int fh = 400;
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setBounds((int) screensize.getWidth() - fw, 0, fw, fh);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==(button)) {
			if(A.isSelected()) {
				votesA++;
				System.out.println("Andrew Stevens voted for!");
			}else if(B.isSelected()) {
				votesB++;
				System.out.println("B voted for!");
			}else if(C.isSelected()) {
				votesC++;
				System.out.println("C voted for!");
			}else if(D.isSelected()) {
				votesD++;
				System.out.println("D voted for!");
			}else if(E.isSelected()) {
				votesE++;
				System.out.println("E voted for!");
			}
			 
			
			
			t = votesA + votesB + votesC + votesD + votesE;
			System.out.println("total = " + t);
			
			
			
	
			}
		
			if (e.getSource()==(button2)) {
				
				double ap = ((votesA/t) * 100);
				double bp = ((votesB/t) * 100);
				double cp = ((votesC/t) * 100);
				double dp = ((votesD/t) * 100);
				double ep = ((votesE/t) * 100);
				
				System.out.println("A has " + ap + "% of votes ");
				System.out.println("B has " + bp + "% of votes ");
				System.out.println("C has " + cp + "% of votes ");
				System.out.println("D has " + dp + "% of votes ");
				System.out.println("E has " + ep + "% of votes ");
				
			}
			
		}
	
	
		
	}
	
