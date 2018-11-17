package demo;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;

import demo.science;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.JOptionPane;

public class science extends JFrame{
	ButtonGroup G = new ButtonGroup();
	//public void actionPerformed(ActionEvent e) 
		JPanel p =new JPanel();
		CardLayout cards=new CardLayout();
		int numQs;
		int c=0;
		int wrongs=0;
		int total=1;
		String[][] answers={
				
				{"erect","invented","sometimes erect,sometimes invented","none"},
				{"Concave","Convex","Cylinder","None"},
				{"Excretion","Circulation","Reproduction","Pollution"},
				{"meter","cm","watt","no unit"},
				{"Bismuth","Magnesium","Mercury","Sodium"},
				{"Red","Blue","Green","Yellow"},
				{"Heat is evolved","Heat is absorbed","Temperature increases","Light is produced"},
				{"Red", "Blue","Violet","Green"},
				{"Hydrochloric Acid","Citric Acid","Sulphuric Acid","Acetic Acid"},
				{"WBC","Platelets","RBC","All of the above"},
				{"Decrease","Increase","Remain same","Becomes zero"},
				{"Neutrophillia","Nephrosis","Necrosis","Nepolasis"},
				{"Pseudomonas sp.","Staphyoeoccus","Bacillus","Salmonella typhi"},
				{"Vitamin-B","Caffeine","Nicotine","Morphine"},
				{"Aspergillus","Saccharomyces","Mucus","Penicillium"},
				{"Koch","Hansen","Fleming","Harvey"},
				{"Xylem","Phloem","Parenchyma","Selerides"},
				{"Cytoplasm","Mitochondria","Both A and B","Nucleus"},
				{"Tuberculosis","Leprosy","Diptheria","Polio"},
				{"Lung disease","Typhoid","Cancer","Malaria"},
			};
			
			radio2 questions[]={
				
				new radio2(
					"Question .The image formed in a compound microscope is.. ",
					answers[0],
					1,this
				),
				new radio2(
					"Question . The lens used in a simple microscope is",
					answers[1],
					1,this
				),
				new radio2(
					"Question . The elimination of toxic nitrogenous waste and excess water in man is by",
					answers[2],
					0,this
				),
				new radio2(
					"Question . The S. I. unit of refractive index is",
					answers[3],
					3,this
				),
				new radio2(
					"Question . The liquid metal is",
					answers[4],
					2,this
				),
				new radio2(
					"Question .  Which of the following is not a primary colour",
					answers[5],
					3,this
				),
				new radio2(
					"Question .Endothermic reactions are those in which .. ",
					answers[6],
					1,this
				),
				new radio2(
					"Question .  Which colour of light is deviated least",
					answers[7],
					0,this
				),
				new radio2(
					"Question . Acid present in gastric juice is",
					answers[8],
					0,this
				),
				new radio2(
						"Question .  Which blood cells are called 'Soldiers' of the body",
						answers[9],
						0,this
					),
				new radio2(
						"Question .If the radius of blood vessels of a person decreases his/her blood pressure will ",
						answers[10],
						1,this
					),
				new radio2(
						"Question .Cell or tissue death within a living body is called as : ",
						answers[11],
						2,this
					),
				new radio2(
						"Question . Typhoid is caused by :",
						answers[12],
						3,this
					),
				new radio2(
						"Question .Fresh Yeast cells are good source of :?",
						answers[13],
						0,this
					),
				new radio2(
						"Question . Which fungus is known as 'Green Mold' ??",
						answers[14],
						3,this
					),
				new radio2(
						"Question .Leprosy bacillus was invented by :?",
						answers[15],
						1,this
					),
				new radio2(
						"Question . Which tissue of plants conducts food to its body?",
						answers[16],
						1,this
					),
				new radio2(
						"Question .Fermentation takes place in which componenet of a cell ?",
						answers[17],
						0,this
					),
				new radio2(
						"Question .	MDT is used for disease :?",
						answers[18],
						1,this
					),
				new radio2(
						"Question . Oncogene is responsible for?",
						answers[19],
						2,this
					),
			};
			public static void main(String args[]){
				new science();
			}
			
			public science(){
				super("sciences Quiz");
				setSize(1250,700);
				setResizable(true);
				//scienceFrame.setVisible(true);
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

