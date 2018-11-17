package demo;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;

import demo.tech;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.JOptionPane;

public class tech extends JFrame{
	ButtonGroup G = new ButtonGroup();
	//public void actionPerformed(ActionEvent e) 
		JPanel p =new JPanel();
		CardLayout cards=new CardLayout();
		int numQs;
		int c=0;
		int wrongs=0;
		int total=1;
		String[][] answers={
				{"2","3","4","5"},
				{"dynamic memory device","storage device","flash device","static memory device"},
				{"16 bits","4 bits","1024 bits","10 bits"},
				{"Optical Character Reader","Optical Card Reader","Office Cash Receiver","Online Computer Retrieval"},
				{"RAM","RWM","ROM","SAM"},
				{"server","client","receiver","sender"},
				{"ring","star",	"mesh","token"},
				{"network's topology","network's layout","both A and B","network's link"},
				{"bus topology","ring topology","star topology","mesh topology"},
				{"bus","ring","mesh","tree"},
				{"Application programs","Replicate programs","Logical programs","both A and B"},
				{"database packages","file packages","bus packages","software packages"},
				{"relative programs","application programs","relative programs","replicate programs"},
				{"experimental program","system program","specialized program","organized program"},
				{"operating system of computer","trace program","compiler","all of the above"},
				{"volatile memory","non volatile memory","backup memory","impact memory"},
				{"block","stream","cartridge","gap"},
				{"access time","delay time","processing time","storage time"},
				{"volatile storage","non volatile storage","impact storage","non impact storage"},
				{"saving the data","loading the data","writing the data","reading the data"},
									
			};
			
			radio4 questions[]={
				
				new radio4(
					"Question . Guns of color present in a computer color screen are.",
					answers[0],
					1,this
				),
				new radio4(
					"Question . Semiconductor memory device in which stored data will remain permanently stored as long as power is supplied is ……….. .",
					answers[1],
					1,this
				),
				new radio4(
					"Question . Computer word size is a multiple of. .",
					answers[2],
					0,this
				),
				new radio4(
					"Question . In computer terminology, OCR stands for?",
					answers[3],
					0,this
				),
				new radio4(
					"Question . Type of computer memory in which access time is not constant but varies depending on address location is known as?",
					answers[4],
					3,this
				),
				new radio4(
					"Question .If a computer in a network accesses resources that are shared by other computers it is called a?",
					answers[5],
					1,this
				),
				new radio4(
					"Question . In computer network, short message that travels around communication medium is called?",
					answers[6],
					3,this
				),
				new radio4(
					"Question . Arrangement of computer network nodes and connections between them is called?",
					answers[7],
					2,this
				),
				new radio4(
					"Question .  Network topology in which you connect each node to network along a single piece of network cable is called .",
					answers[8],
					0,this
				),
				new radio4(
						"Question .  Computer network topology which uses routers is .",
						answers[9],
						2,this
					),
				new radio4(
						"Question . Types of software programs are?",
						answers[10],
						3,this
					),
				new radio4(
						"Question . Set of programs which consist of full set of documentations is termed as?",
						answers[11],
						3,this
					),
				new radio4(
						"Question . Specialized program that allows user to utilize in specific application is classified as?",
						answers[12],
						1,this
					),
				new radio4(
						"Question .  Program which is used to control system performance is classified as ?",
						answers[13],
						1,this
					),
				new radio4(
						"Question . Examples of system programs includes",
						answers[14],
						3,this
					),
				new radio4(
						"Question . Secondary storage memory is basically ?",
						answers[15],
						1,this
					),
				new radio4(
						"Question .  A piece of data that can be transferred between CPU and backup storage is called ?",
						answers[16],
						0,this
					),
				new radio4(
						"Question .  In fixed head discs, sum of rotational delay and transfer time is equals to?",
						answers[17],
						0,this
					),
				new radio4(
						"Question . When power is switched OFF, it will lost its data, such type of memory is classified as ",
						answers[18],
						0,this
					),
				new radio4(
						"Question . Process of reading data from permanent store and writing it to computer's main store is called",
						answers[19],
						1,this
					),
			};
			public static void main(String args[]){
				new tech();
			}
			
			public tech(){
				super("Tech Quiz");
				setSize(1250,700);
				setResizable(true);
				//techFrame.setVisible(true);
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
				//setBackground(Color.BLUE);
				
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

