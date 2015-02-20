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
	
	public static void main (String[] args){
		

		
	
	JFrame frame = new JFrame("Colosseum Clash");
		frame.getContentPane().setBackground(Color.red.darker().darker());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setSize(900, 900/16*9);
	titleMenu panel = new titleMenu();
		frame.setLocationRelativeTo(null);
		frame.getContentPane().add(panel);
		frame.setVisible(true);

	}

		
	}

