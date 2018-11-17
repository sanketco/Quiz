package demo;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;

import demo.history;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.JOptionPane;

public class history extends JFrame{
	ButtonGroup G = new ButtonGroup();
	//public void actionPerformed(ActionEvent e) 
		JPanel p =new JPanel();
		CardLayout cards=new CardLayout();
		int numQs;
		int c=0;
		int wrongs=0;
		int total=1;
		String[][] answers={
				{"Portugal","Isle of Man","Majorca","Sicily","Corsica"},
				{"Theorist","Inventions","Religious leader","Cricketer"},
				{"France","Portugal","Spain","Itali"},
				{"Jesus","John the baptist","Caesar"},
				{"1822","1820","1821","1818"},
				{"Gautama","Gajanan","Gadhadhar","Gajananvihari"},
				{"Thomas Jefferson","Abraham Lincoin","George Washington","John Adams"},
				{"Austria","France","Spain","Germany","Holland"},
				{"1963","1964","1965","1966"},
				{"Flavius","Marc Anthony","Augustus"},
				{"6","8","5","4"},
				{"Crassus","Genghis Khan","Demophon"},
				{"Michelangelo","Leonardo","Donatello"},
				{"St Patrick","St Brendan","St Francis"},
				{"Beethoven","Mozart","M.S.Dhoni","Hitler"},
				{"Twosret","Nitocris","Cleopatra"},
				{"Patricia","Linda","Mary","Helen"},
				{"36","34","32","40"},
				{"Mohandas","Muhammad","Mohammed"},
				{"John Adams","Jack the Ripper","Alexander Graham ","Thomas Edison"},
			};
			
			radio3 questions[]={
				
				new radio3(
					"Question . What was Albert Einstein famous for?",
					answers[1],
					0,this
				),
				new radio3(
					"Question . How many wives had kind Henry VIII?",
					answers[10],
					0,this
				),
				new radio3(
					"Question . Where was Napoleon born?",
					answers[0],
					4,this
				),
				new radio3(
					"Question . What was the name of the women who supposedly cause the Trojan war?",
					answers[16],
					3,this
				),
				new radio3(
					"Question . Who was the saint captured by Irish raiders and taken as a slave to Ireland?",
					answers[13],
					0,this
				),
				new radio3(
					"Question . What was the Buddha's first name?",
					answers[5],
					0,this
				),
				new radio3(
					"Question . Where was Christopher Columbus born?",
					answers[2],
					3,this
				),
				new radio3(
					"Question . What year did Napoleon die?",
					answers[4],
					2,this
				),
				new radio3(
					"Question . Alexander died at what age?",
					answers[17],
					2,this
				),
				new radio3(
						"Question . Who painted the Mona Lisa?",
						answers[12],
						1,this
					),
				new radio3(
						"Question . What was Gandhi's first name?",
						answers[18],
						0,this
					),
				new radio3(
						"Question . Who was the first president of America?",
						answers[6],
						2,this
					),
				new radio3(
						"Question . Who was born first Mozart or Beethoven?",
						answers[14],
						1,this
					),
				new radio3(
						"Question . Who was the Egyptian princess that formed aliance with Marc Anthony?",
						answers[15],
						2,this
					),
				new radio3(
						"Question . Who was born in Bethlehem and became a prophet?",
						answers[3],
						0,this
					),
				new radio3(
						"Question . Who was the greatest ruler of the Mongolian Empire?",
						answers[11],
						1,this
					),
				new radio3(
						"Question . What year was JFK assassinated?",
						answers[8],
						0,this
					),
				new radio3(
						"Question . Who was Julius Caesar's grand-nephew?",
						answers[9],
						2,this
					),
				new radio3(
						"Question . What country was Hitler born?",
						answers[7],
						0,this
					),
				new radio3(
						"Question . \"When one door closes, another opens - but we often look so long and so regretfully upon the closed door that we do not see the one which has opened for us.\" Who said this?",
						answers[19],
						2,this
					),
			};
			public static void main(String args[]){
				new history();
			}
			
			public history(){
				super("historys Quiz");
				setSize(1250,700);
				setResizable(true);pack();
				setBackground(Color.BLUE);
				//historyFrame.setVisible(true);
				//dispose();
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
