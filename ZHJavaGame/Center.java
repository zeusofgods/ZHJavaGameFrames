package ZHJavaGame;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Center extends JPanel {
	public static JButton Fight, Shop, Exit; 
	public static JLabel center; 
	
	public Center(){
		this.setLayout(null);
		this.setSize(getMaximumSize());
		this.setBackground(Color.green);
		
	JButton Fight = new JButton("Fight");
		Fight.setSize(150, 300);
		Fight.setLocation(ColosseumClash.winX/18*4, ColosseumClash.winY/5);
		Fight.setFont(new Font(Fight.getName(), Font.PLAIN, 35));
		Fight.setBorderPainted(false);
		
		
	JButton Shop = new JButton("Shop");
		Shop.setSize(150,300);
		Shop.setLocation(ColosseumClash.winX/18*8, ColosseumClash.winY/5);
		Shop.setFont(new Font(Shop.getName(), Font.PLAIN, 35));
		Shop.setBorderPainted(false);
		
		
	JButton Exit = new JButton("Exit");
		Exit.setSize(150, 300);
		Exit.setLocation(ColosseumClash.winX/18*12, ColosseumClash.winY/5);
		Exit.setFont(new Font(Exit.getName(), Font.PLAIN, 35));
		Exit.setBorderPainted(false);
		
		
		this.add(Exit);
		this.add(Shop);
		this.add(Fight);
	}

}
