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




public class titleMenu extends JPanel {
	public static JButton play, exit;
	public static Scanner input = new Scanner(System.in);
	public static JLabel title;
	
	public titleMenu(){
		this.setSize(getMinimumSize());
		this.setBackground(Color.red.darker());
		this.setSize(900, 900/16*9);
		this.setLayout(getLayout());
		
		title = new JLabel("Colosseum Clash");
		title.setFont(new Font(title.getName(), Font.PLAIN, 100));
		title.setLocation(20, 20);
		title.setVisible(true);
		this.add(title);
	
		play = new JButton("Play");
		this.add(play);
		play.setSize(500, 100);
		play.setLocation(200, 190);
		play.addActionListener(new playListener());
		
		
		exit = new JButton("Exit");
		exit.addActionListener(new exitListener());
		exit.setSize(500,100);
		exit.setLocation(200,300);
		this.add(exit);

	
	}
	private class playListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
		
			
		JFrame CharSelect = new JFrame("Character Selection");
		CharSelect.setSize(200, 200);
		CharSelect.setVisible(true);
		CharSelect.setLocationRelativeTo(null);
		charSelection panel2 = new charSelection();
		CharSelect.getContentPane().add(panel2);
		
		
		
			
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
