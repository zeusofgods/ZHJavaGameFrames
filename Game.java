/*import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.*;

import java.util.Random;
*/
import java.awt.Color;
import java.awt.Choice;
import java.awt.Component;
import java.awt.Dimension;
//import java.applet.*;
import java.awt.ItemSelectable;
import java.awt.event.*;
import java.awt.Panel;
import java.util.Scanner;

import javax.swing.*;
public class Game {
	public static void main(String Args[]){
		
		Scanner input = new Scanner (System.in);
		//Random rn = new Random ();
		
		System.out.println("What's your name, traveler?");
		
		String name = input.nextLine().toString();
		
		JFrame frame = new JFrame("Well, " + name + ", Welcome to the Colosseum.");
		
		frame.setVisible(true);
		frame.setSize(1280, 739);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setVisible(true);
		panel.setPreferredSize(new Dimension(350,350));
		panel.setBounds(frame.getX()/2, frame.getY()/2, frame.getWidth()/2, frame.getHeight()/2);
		panel.setBackground(Color.GREEN);
		frame.add(panel);
		
		JButton button1 = new JButton();
		button1.setText("Pick up the Sword?");
		button1.setPreferredSize(new Dimension(250, 250));
		button1.setLocation(200,200);
		//button1.setToolTipText("Is this your weapon of choice?");
		button1.addActionListener(new ActionSword());
		panel.add(button1);
		
		
	}
	
		
}
	
	 class ActionSword implements ActionListener{
		
		public void actionPerformed (ActionEvent ae){
			System.out.println("You did the thing!");
			JLabel choice = new JLabel("You picked up the sword!");
			JFrame sword = new JFrame("You picked up the sword!"); 
			sword.setVisible(true);
			sword.setSize(200, 200);
			sword.getContentPane().setBackground(Color.red);
		}
		
	 
		
	
	 
	 
}