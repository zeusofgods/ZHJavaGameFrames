package ZHJavaGame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class titleMenu extends JPanel {
	public static JButton play, exit;
	public static Scanner input = new Scanner(System.in);
	public static JLabel title;
	
	
	public titleMenu(){
	
		this.setBackground(Color.red.darker());
		this.setSize(900, 900/16*9);
		this.setLayout(null);
		
		title = new JLabel();
		title.setText("Colosseum Clash");
		title.setForeground(Color.black.brighter());
		title.setSize(getPreferredSize());
		title.setFont(new Font(title.getName(), Font.PLAIN, 100));
		title.setLocation(20, -150);
		title.setVisible(true);
		this.add(title);
	
		play = new JButton("Play");
		
		this.add(play);
		play.setSize(350, 200);
		play.setLocation(15, 200);
		play.addActionListener(new playListener());
		play.setFont(new Font(play.getName(), Font.PLAIN, 75));
		play.setForeground(Color.blue.darker().darker());
		play.setBackground(Color.blue);
		play.setBorderPainted(false);
		
		
		exit = new JButton("Exit");
		exit.setForeground(Color.blue.darker().darker());
		exit.setFont(new Font(exit.getName(), Font.PLAIN, 75));
		exit.setBackground(Color.RED);
		exit.addActionListener(new exitListener());
		exit.setBorderPainted(false);
	
		exit.setSize(350,200);
		exit.setLocation(535,200);

		
		this.add(exit);

	
	}
	private class playListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
		

		ColosseumClash.frame.setEnabled(false);
		ColosseumClash.frame.setVisible(false);
		ColosseumClash.frame.getContentPane().remove(ColosseumClash.panel);
	
		UserNameInput panel2 = new UserNameInput();
		ColosseumClash.frame.getContentPane().add(panel2);
		panel2.setSize(getMaximumSize());
		
		ColosseumClash.frame.setEnabled(true);
		ColosseumClash.frame.setVisible(true);

		
		
			
		}
		}
	private class exitListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			titleMenu.this.setBackground(Color.black);
			System.exit(0);
	}
	}
	
}
