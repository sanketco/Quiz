package demo;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;



public class radio3 extends JPanel implements ActionListener{
	int correctAns;
	history history;	
	boolean selected=false;
	boolean used;
	 int s=0;
	 int c=0;
	//questions
	JPanel qP=new JPanel();
	//answers
	JPanel aP=new JPanel();
	JRadioButton[] responses;
	ButtonGroup group=new ButtonGroup();
	//bottom
	JPanel bP=new JPanel();
	JButton next=new JButton("Next");
	JButton finish=new JButton("Finish");
	
	public radio3(String q, String[] options, int ans ,history history){
		this.history=history;
		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		correctAns=ans;
		//question
		qP.add(new JLabel(q));
		add(qP);
		//answer
		responses=new JRadioButton[options.length];
		for(int i=0;i<options.length;i++){
			
			responses[i]=new JRadioButton(options[i]);
			responses[i].addActionListener(this);
			group.add(responses[i]);
			aP.add(responses[i]);
			System.out.println('\n');
		}
		add(aP);
		//bottom
		next.addActionListener(this);
		finish.addActionListener(this);
		bP.add(next);
		add(bP);
		bP.add(finish);
		add(bP);
		finish.setEnabled(false);
		finish.setBackground(Color.RED);
		next.setBackground(Color.YELLOW);
		
	}
	public void actionPerformed(ActionEvent e){
		Object src=e.getSource();
		
		//next button
		if(src.equals(next)&&selected==false){
			showresult();}
			if(selected==true&&src.equals(next)) {
				used=true;
				history.next();
				history.total++;
			}
		
		//finish button
		if(src.equals(finish)){
			//finish.setVisible(true);
			history.showSummary();
		}
		//radio buttons
		for(int i=0;i<responses.length;i++){
			if(src==responses[i]){
				selected=true;
				s=i;
				check();
			}
		}
		if(history.c==19) {
			finish.setEnabled(true);
			next.setEnabled(false);
		}
	}
	
	public void showresult() {
		JOptionPane.showMessageDialog(null," Please select an option :)");
	}
	public void check() {
		if(s!=correctAns) {
			history.wrongs++;
		}
	}
	
}	
