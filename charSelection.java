import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class charSelection extends JPanel{
		public static JButton Archer, Warrior, Mage;
		public static String charType;
		
	public charSelection(){
		charChoice charChoiceBut = new charChoice();
		this.setBackground(Color.GREEN.darker());
		this.setSize(200/16*9, 200);
		JButton Archer= new JButton("Archer");
		JButton Warrior= new JButton("Warrior");
		JButton Mage = new JButton("Mage");
		this.add(Archer);
		this.add(Warrior);
		this.add(Mage);
		
		Archer.addActionListener(charChoiceBut);
		Warrior.addActionListener(charChoiceBut);
		Mage.addActionListener(charChoiceBut);
		
		
		

	}
		public static class charChoice implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
		
				
				if(e.getSource().toString().contains("Archer")){
					
					charType = "an archer?";
					JLabel charChoice = new JLabel("You are" + charType);
					
	
//					JLabel arc = new JLabel("You are an Archer, eh?");
//					arc.setFont(new Font(arc.getName(), Font.PLAIN, 20));
					
				}else if (e.getSource().toString().contains("Warrior")){
					JLabel war = new JLabel("You are a Warrior, eh?");
					war.setFont(new Font(war.getName(), Font.PLAIN, 20));
				}else if (e.getSource().toString().contains("Mage")){
					JLabel mag = new JLabel("You are a Mage, eh?");
					mag.setFont(new Font(mag.getName(), Font.PLAIN, 20));
				}
			
				
			}
			
		}
	

	
}
	

	
	
		

	

