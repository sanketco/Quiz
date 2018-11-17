package demo;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;

import demo.sports;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.JOptionPane;

public class sports extends JFrame{
	ButtonGroup G = new ButtonGroup();
	//public void actionPerformed(ActionEvent e) 
		JPanel p =new JPanel();
		CardLayout cards=new CardLayout();
		int numQs;
		int c=0;
		int wrongs=0;
		int total=1;
		String[][] answers={
				{"Bangladesh","Nepal","Pakistan","Sri Lanka"},
				{"Morocco","Saudi Arabia","Qatar","Jordan"},
				{"Tripura","Nagaland","Manipur","Sikkim"},
				{"Kimi Raikkonen","Max Verstappen","Lewis Hamilton","Sebastian Vettel"},
				{"Radoslav Wojtaszek","B Adhiban","Michael Adams","Vishwanathan Anand"},
				{"France","England","Belgium","Argentina"},
				{"Gold","Silver","Bronze","None of the above"},
				{"Italy","Netherlands","Serbia","Brazil"},
				{"Goa","Mumbai","Delhi","Punjab"},
				{"Seoul, South Korea","Buenos Aires, Argentina","Sydney, Australia","New Delhi, India"},
				{"France","Japan","China","India"},
				{"Hungary","Poland","Italy","Russia"},
				{"Udit Gogoi","Adith Amarnath","Kandhavel Mahalingam","Jason Michael David"},
				{"Royal Rajasthan","Chennai Tigers","Bengaluru FC","Kerala FC"},
				{"Gold","Silver","Bronze","None of the Above"},
				{"Canada","Argentina","Brazil","Chile"},
				{"Bangladesh","England","India","Sri Lanka"},
				{"Gold","Silver","Bronze","None of the Above"},
				{"2000m race","3000m race","4000m race","5000m race"},
				{"6","7","9","12"},
			};
			
			radio5 questions[]={
				
				new radio5(
					"Question .Which team won the 5th SAFF U-15 Championship 2018 title in Nepal? .",
					answers[0],
					0,this
				),
				new radio5(
					"Question . The Arab country which will host the 23rd edition of the World Corporate Games 2019. ……….. .",
					answers[1],
					2,this
				),
				new radio5(
					"Question . Which team get the overall champions of 1st edition of North East Olympic Games 2018?. .",
					answers[2],
					2,this
				),
				new radio5(
					"Question .Who won the 2018 Formula One driver's world championship?",
					answers[3],
					2,this
				),
				new radio5(
					"Question .Who is the winner of 2018 Isle of Man Chess Tournament?",
					answers[4],
					0,this
				),
				new radio5(
					"Question . This country tops in the FIFA's world rankings.?",
					answers[5],
					2,this
				),
				new radio5(
					"Question .Indian table tennis player Ayhika Mukherjee won __________ medal in the under-21 women's singles category of the ITTF Challenge Belgium Open.",
					answers[6],
					1,this
				),
				new radio5(
					"Question .Which country won the 2018 Women's Volleyball World Championship in Yokohama, Japan??",
					answers[7],
					2,this
				),
				new radio5(
					"Question . Which team won 2018 Vijay Hazare Trophy title? .",
					answers[8],
					1,this
				),
				new radio5(
						"Question .2018 Summer Youth Olympic Games was held in which of the following? .",
						answers[9],
						1,this
					),
				new radio5(
						"Question .The fourth edition of Global Partner's Forum will be hosted by __________?",
						answers[10],
						3,this
					),
				new radio5(
						"Question . World Wrestling Championship has started in which country?",
						answers[11],
						0,this
					),
				new radio5(
						"Question .Who won the boy's under-14 title in the AITA championship series tennis tournament??",
						answers[12],
						1,this
					),
				new radio5(
						"Question .	Which football club won the Puttaiah Memorial Cup 2018? ?",
						answers[13],
						2,this
					),
				new radio5(
						"Question . Akash Malik won the __________ in archery at the Youth Olympic Games 2018.",
						answers[14],
						1,this
					),
				new radio5(
						"Question . The second country to legalize possession and use of recreational cannabis is _______ ?",
						answers[15],
						0,this
					),
				new radio5(
						"Question .Which team won the triangular series in Goa? ?",
						answers[16],
						2,this
					),
				new radio5(
						"Question .India won __________ medal at the 8th Sultan of Johor Cup U-18 2018 hockey tournament in Malaysia.?",
						answers[17],
						1,this
					),
				new radio5(
						"Question .Suraj Panwar won India's first medal in athletics at the Youth Olympic Games 2018. He claimed the silver medal in which of the following?",
						answers[18],
						3,this
					),
				new radio5(
						"Question .India took __________ rank in the third Asian Para Games, Jakarta, Indonesia.",
						answers[19],
						2,this
					),
			};
			public static void main(String args[]){
				new sports();
			}
			
			public sports(){
				super("Sports Quiz");
				setSize(1250,700);
				setResizable(true);
				//setBackground(Color.BLUE);
				//sportsFrame.setVisible(true);
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

