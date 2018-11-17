package demo;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;



import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.JOptionPane;

public class math extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ButtonGroup G = new ButtonGroup();
	//public void actionPerformed(ActionEvent e) 
		JPanel p =new JPanel();
		
		CardLayout cards=new CardLayout();
		int numQs;
		int c=0;
		int wrongs=0;
		int total=1;
		String[][] answers={
				{"25.30","25.5","25.00","12.25"},
				{"1/55","55","3/11","1/11"},
				{"149","166","150","151"},
				{"52","502","520","5002"},
				{"78","136","156","196"},
				{"15/2","17/2","19/2","8*1/3"},
				{"2004","2400","1904","1906"},
				{"15","16","18","20"},
				{"1","0","8","None of these"},
				{"6:10","15:25","0.75:1.25","3:5"},
				{"$6,872","$7,046","$7,772","$7,040"},
				{ "$5.20","$78.00","$12.48","$52.00"},
				{"$642","$724","$725","$768"},
				{"98","196","294","89"},
				{"54","40","45","50"},
				{"33.5","36.5","36","33"},
				{"734.50","734.05","724.05","None of these"},
				{"154","164","198","132"},
				{"51","24","15","42"},
				{"33","136","9","685"},
			};
			
			radio1 questions[]={
				
				new radio1(
					"Question . The average of first 50 natural numbers is …………. .",
					answers[0],
					1,this
				),
				new radio1(
					"Question . A fraction which bears the same ratio to 1/27 as 3/11 bear to 5/9 is equal to ……….. .",
					answers[1],
					0,this
				),
				new radio1(
					"Question . The number of 3-digit numbers divisible by 6, is ………….. .",
					answers[2],
					2,this
				),
				new radio1(
					"Question . What is 1004 divided by 2?",
					answers[3],
					1,this
				),
				new radio1(
					"Question . A clock strikes once at 1 o’clock, twice at 2 o’clock, thrice at 3 o’clock and so on. How many times will it strike in 24 hours?",
					answers[4],
					2,this
				),
				new radio1(
					"Question . 125 gallons of a mixture contains 20% water. What amount of additional water should be added such that water content be raised to 25%?",
					answers[5],
					3,this
				),
				new radio1(
					"Question . 106 × 106 – 94 × 94 = ?",
					answers[6],
					1,this
				),
				new radio1(
					"Question . Which of the following numbers gives 240 when added to its own square?",
					answers[7],
					0,this
				),
				new radio1(
					"Question . Evaluation of 83 × 82 × 8-5 is …………. .",
					answers[8],
					0,this
				),
				new radio1(
						"Question . The simplest form of 1.5 : 2.5 is …………… .",
						answers[9],
						3,this
					),
				new radio1(
						"Question . Annual income of A is 10% more than of B whereas income of B is 20% more than that of C. If monthly income of C is $ 2000 then what is the sum of monthly incomes of A, B and C?",
						answers[10],
						3,this
					),
				new radio1(
						"Question . $ 2496 is spend in the floor repair of 30 × 16 ft hall. What is repair cost per square feet?",
						answers[11],
						0,this
					),
				new radio1(
						"Question . $ 600 becomes $ 720 in 4 years when the interest is simple. If the rate of interest is increased by 2%, then what will be total amount?",
						answers[12],
						3,this
					),
				new radio1(
						"Question . 3/7 of 4/9 of 7/12 of 882 = ?",
						answers[13],
						0,this
					),
				new radio1(
						"Question . 45% of 640 + 64% of 450 = ? % of 1440",
						answers[14],
						1,this
					),
				new radio1(
						"Question . 3456 ÷ 12 ÷ 8 = ?",
						answers[15],
						2,this
					),
				new radio1(
						"Question . 839.093 + 31.005 – 136.048 = ?",
						answers[16],
						1,this
					),
				new radio1(
						"Question . Of what number the 2/5 of 5/8 of 4/7 = 22?",
						answers[17],
						0,this
					),
				new radio1(
						"Question . In a two digit number, the digit in the unit’s place is two more than the three times of the digit in ten’s place. If the sum of the two digits is 6, the number is",
						answers[18],
						2,this
					),
				new radio1(
						"Question . Take out the wrong number from the given series.\r\n" + 
						"3, 4, 9, 33, 136, 685, 4116",
						answers[19],
						2,this
					),
			};
			public static void main(String args[]){
				new math();
				
			}
			
			public math(){
				super("Maths Quiz");
				setSize(1250,700);
				setResizable(true);
				super.setBackground(Color.GREEN);
				//setBackground(Color.CYAN);
				//mathFrame.setVisible(true);
				//dispose();
				setBackground(Color.BLUE);
				Toolkit toolkit = getToolkit();
				Dimension size = toolkit.getScreenSize();
				setLocation(size.width/2 - getWidth()/2,
						size.height/2 - getHeight()/2);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				
				p.setLayout(cards);
				numQs=questions.length;
				for(int i=0;i<numQs;i++){
					p.add(questions[i],"q"+i);

				}
				Random r=new Random();
			    int i=r.nextInt(numQs);
				cards.show(p,"q"+i);
				add(p);
				setVisible(true);
				
			}
			public void next(){
				c++;
				if((total-wrongs)==numQs){
					showSummary();
				}else{
					Random r=new Random();
					boolean found=false;
					int i=0;
					while(!found){
						i=r.nextInt(numQs);
						if(!questions[i].used){
							found=true;
						}
					}
					cards.show(p,"q"+i);
				}
			}
			public void showSummary(){
				JOptionPane.showMessageDialog(null,"All Done :), here are your results"+
					"\nNumber of incorrect Answers: \t"+wrongs+
					"\nNumber of Correct Answers: \t"+(total-wrongs));
				
				
				System.exit(0);	
	
	  }
		    }
