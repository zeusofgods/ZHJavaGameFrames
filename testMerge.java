import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Canvas;
import java.awt.Choice;
import java.awt.Component;
import java.awt.Dimension;
//import java.applet.*;
import java.awt.ItemSelectable;
import java.awt.event.*;
import java.awt.Panel;

import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.util.Scanner;
public class testMerge {
	public static int winX = 900;
	public static int winY = winX/16*9;
	
	
	public static void main (String Args[]){
	
		
		
		Color frameColor = null; 
		Scanner input = new Scanner (System.in);
		
		System.out.println("What's your name, traveler?");
		String UserName = input.nextLine().toString();
		JFrame frame = new JFrame("Colosseum Clash");
		
	
	//Dimension size = new Dimension(windowWidth*scale, windowHeight*scale);
	frame.setSize(winX, winY);
	frame.setResizable(false);
	frame.setLocationRelativeTo(null);
	frame.getContentPane().setBackground(Color.red.darker().darker());
	//frame.setBorder(BorderFactory.createLineBorder(Color.orange, 20));
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	
	//frame.setBackground(frameColor);
	
	
	JPanel buttonHolder = new JPanel();
	buttonHolder.setBackground(Color.orange.darker());

	buttonHolder.setBounds(frame.getWidth()/4, frame.getHeight()/4, frame.getWidth()/2, frame.getHeight()/2);
	buttonHolder.setBorder(BorderFactory.createTitledBorder(null, "Well, " + UserName + ", Welcome to The Colosseum.", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION));

	frame.getContentPane().add(buttonHolder);
	
	
	JButton colorChange = new JButton();
	colorChange.setVisible(true);
	//colorChange.setBackground(Color.gray.darker());
	colorChange.setBounds(buttonHolder.getWidth()/4, buttonHolder.getHeight()/4, buttonHolder.getWidth()/2, buttonHolder.getHeight()/2);
	colorChange.setText("Begin Your Adventure");
	colorChange.setToolTipText("Enter the Colosseum");
	buttonHolder.add(colorChange);
	colorChange.addActionListener(new Action());
	
	
	
	}
	}

	
	
	class Action implements ActionListener{
		
		public void actionPerformed (ActionEvent ae){
			System.out.println("Whoa, you're in the shop!");	
			JFrame frame2 = new JFrame("~~~Armory and Blacksmith~~~");
			frame2.setVisible(true);
			frame2.setSize(750, 750/16*9);
			frame2.getContentPane().setBackground(Color.orange);
		
		
			
			JPanel panel2 = new JPanel();
			panel2.setVisible(true);
			panel2.setBounds(frame2.getWidth()/4, frame2.getHeight()/4, frame2.getWidth()/2, frame2.getHeight()/2);
			panel2.setBackground(Color.orange);
			panel2.setBorder(BorderFactory.createLineBorder(Color.red.darker(), 10));
			frame2.add(panel2);
			
			
			/*JPanel panel3 = new JPanel();
			panel3.setVisible(true);
			panel2.setBounds(panel2.getWidth(), panel2.getHeight(), panel2.getWidth() - 30, panel2.getHeight() - 30);
			panel3.setBackground(Color.orange);
			panel3.setBorder(BorderFactory.createTitledBorder(null, "This is the Armory, what would you like?", TitledBorder.CENTER,
					TitledBorder.DEFAULT_POSITION, null, Color.YELLOW));
			panel2.add(panel3);*/
			//JLabel armoryLabel = new JLabel("This is the Armory, what would you like?");
			//panel2.add(armoryLabel);
			
			
		}
	}

	
