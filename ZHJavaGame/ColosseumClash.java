package ZHJavaGame;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class ColosseumClash {
	public static JButton play, exit;
	public static Scanner input = new Scanner(System.in);
	public static JLabel title;
	public static JFrame frame; 
	public static titleMenu panel = new titleMenu();
	public static int winX, winY;
	
	public static void main (String[] args){
		
		winX=900;
		winY=900/16*9;
		
		frame = new JFrame("ColosseumClash");
		frame.getContentPane().setBackground(Color.red.darker().darker().darker().darker().darker());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setSize(winX, winY);
		frame.setResizable(false);
		
	
		frame.setLocationRelativeTo(null);
		frame.getContentPane().add(panel);
		frame.setVisible(true);
		
		CharVariables.Variables();
		
	

	}

		
	}

