package demo;
import javax.swing.JFrame;
import java.awt.Color;

import java.awt.Font;
import java.awt.TextField;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


import demo.demo;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JOptionPane;



public class demo extends  JFrame {
	int numQs;
	int wrongs=0;
	int total=0;
	private Object demo;
	
	public demo() {
		setResizable(true);
		//setLayout(null);
		
		JLabel label = new JLabel("Hi ! Welcome to the Quiz ..");
		//JLabel l1 = new JLabel("There will be 20 questions for each quiz you can choose any of the quiz given below");
		//label.setHorizontalAlignment(JLabel.RIGHT);
		label.setBounds(30, 10, 350, 30);
		//l1.setBounds(30, 50, 350, 30);
		add(label);
		
		Font font = new Font("Courier",Font.BOLD,20);
		label.setFont(font);
		//l1.setFont(font);
		setSize(400,400);
		setTitle("Quiz");
		
		//setBackground(Color.BLACK);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		setLocation(size.width/2 - getWidth()/2,
		size.height/2 - getHeight()/2);
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		//getContentPane().setBackground(Color.BLUE);
		panel.setLayout(null);
		panel.setBackground(Color.BLUE);
		
		panel.setToolTipText("Quiz Board");
		JButton q1 = new JButton("Math");
		q1.setBounds(50, 150, 80, 30);
		q1.setToolTipText("Maths Quiz");
		q1.setBackground(Color.GREEN);
		/*math math1 = new math();
		q1.addActionListener(math1);*/
		q1.addActionListener(new ActionListener () {
		public void actionPerformed(ActionEvent e) {
			dispose();
			math mc = new math();
			rules();
		}
		});
		JButton q2 = new JButton("Science");
		q2.setBounds(150, 150, 80, 30);
		q2.setToolTipText("Science Quiz");
		q2.setBackground(Color.GREEN);
		q2.addActionListener(new ActionListener () {
		public void actionPerformed(ActionEvent e) {
			dispose();
			science n = new science();
			rules();
		}
		});
		JButton q3 = new JButton("History");
		q3.setBounds(250, 150, 80, 30);
		q3.setToolTipText("History Quiz");
		q3.setBackground(Color.GREEN);
		q3.addActionListener(new ActionListener () {
		public void actionPerformed(ActionEvent e) {
			dispose();
			history nc = new history();
			rules();
		}
		});
		JButton q4 = new JButton("Technology");
		q4.setBounds(50, 250, 120, 30);
		q4.setBackground(Color.GREEN);
		q4.setToolTipText("Technology Quiz");
		q4.addActionListener(new ActionListener () {
		public void actionPerformed(ActionEvent e) {
			dispose();
			tech n = new tech();
			rules();
		}
		});
		JButton q5 = new JButton("Sports");
		q5.setBounds(200, 250, 110, 30);
		q5.setBackground(Color.GREEN);
		q5.setToolTipText("Sports Quiz");
		q5.addActionListener(new ActionListener () {
		public void actionPerformed(ActionEvent e) {
			dispose();
			sports n = new sports();
			rules();
		}
			
		});
				
		panel.add(q1);
		panel.add (q2);
		panel.add (q3);
		panel.add(q4);
		panel.add(q5);
		panel.add(label);
		//panel.add(j1);

	}
	
	public static void main(String[] args) {
		demo s  = new demo();
		s.setVisible(true);

	}

	public void rules() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null," There will be 20 questions for each quiz you can choose any of the quiz given below .There is no time limit and only after answering all the questions you can submit:)");
	}
	
	
}