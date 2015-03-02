package ZHJavaGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Fighting extends JPanel{
	public static JButton Attack, Run, Items;
	public static JTextField actionPrompt; 
	public static JTextArea mobStats; 

	public Fighting(){
		
		this.setBackground(Color.orange);
		this.setLayout(null);
		
		
	JTextField actionPrompt = new JTextField();
		
		actionPrompt.setSize(300,75);
		actionPrompt.setLocation(300, 900/16*4);
	
		
		this.add(actionPrompt);
		this.add(charSelection.classStats);
		charSelection.classStats.setBackground(Color.orange);
		
	JTextArea mobStats = new JTextArea();
	
	mobStats.setLocation(600,5);
	mobStats.setForeground(Color.blue.darker());
	mobStats.setFont(new Font(mobStats.getName(), Font.ROMAN_BASELINE, 14));
	mobStats.setSize(300, 100);
	mobStats.setBackground(Color.orange);
	mobStats.setEditable(false);
	mobStats.setText(
				CharVariables.mobName[0] + ":" + "\n" +
				"Health:	" + CharVariables.mob1Stats[0] + "\n" +
				"Speed:	" + CharVariables.mob1Stats[1] + "\n" + 
				"Attack:	" + CharVariables.mob1Stats[2] + "\n");	
	this.add(mobStats);
		
	
	JButton Attack = new JButton("Attack");
	Attack.setSize(150,150);
	Attack.setLocation(300, 900/16*6);
	attackListener atkLis = new attackListener();
	Attack.addActionListener(atkLis);
	this.add(Attack);
		
	}
	public static class attackListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
	
			if (CharVariables.userStats[1] > CharVariables.mob1Stats[1] && CharVariables.userStats[0] > 0 && CharVariables.mob1Stats[0] > 0){
				
					CharVariables.mob1Stats[0] -= CharVariables.userStats[2];
				
					System.out.println("You attacked, dealing " + CharVariables.userStats[2] + " damage!");}
					
			if (CharVariables.mob1Stats[0] > 0 && CharVariables.userStats[0] > 0){
					
					CharVariables.userStats[0] -= CharVariables.mob1Stats[2];
					System.out.println("Your opponent attacked, dealing  " + CharVariables.mob1Stats[2] + " damage!" + "\n");}
			
			System.out.println("Your opponent's health is currently " + CharVariables.mob1Stats[0] );
			System.out.println("Your health is currently " + CharVariables.userStats[0] + "\n" + "\n");
			
			if (CharVariables.mob1Stats[0] <= 0){
				System.out.println("Your opponent died.. Rip.");
			}
			if (CharVariables.userStats[0] <= 0 ){
				System.out.println("You died.. Rip");
				Fighting.Attack.setEnabled(false);;
				}
			
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
//			
//			
//			if (CharVariables.userStats[1] > CharVariables.mob1Stats[1]){
//				
//				
//				CharVariables.mob1Stats[0] -= CharVariables.userStats[2];
//				
//				System.out.println("You attacked first, dealing " + CharVariables.userStats[2] + " damage!");
//				System.out.println("Your opponent's health is now down to " + CharVariables.mob1Stats[0] + "\n");
//				
//				if (CharVariables.userStats[1] > CharVariables.mob1Stats[1]){
//					CharVariables.userStats[0] -= CharVariables.mob1Stats[2];
//					System.out.println(
//						"Your opponent attacked second, dealing  " + CharVariables.mob1Stats[2] + " damage!");}
//				System.out.println("Your health is now down to " +CharVariables.userStats[0] + "\n");
//
//				charSelection.classStats.setText(
//						"Stats:" + "\n"+
//						CharVariables.charClass + "	" + CharVariables.Name + "\n" + 
//						"Health: 	" + CharVariables.userStats[0] +  "\n" +
//						"Speed: 	" + CharVariables.userStats[1] + "\n" +
//						"Attack: 	" + CharVariables.userStats[2] + "\n" + 
//						"Balance:	" + CharVariables.userStats[3]+ "\n");
//				
//				Fighting.mobStats.setText(
//						CharVariables.mobName[0] + ":" + "\n" +
//						"Health:	" + CharVariables.mob1Stats[0] + "\n" +
//						"Speed:	" + CharVariables.mob1Stats[1] + "\n" + 
//						"Attack:	" + CharVariables.mob1Stats[2] + "\n");
//			}
//			
//			else{
//				
//				CharVariables.userStats[0] -= CharVariables.mob1Stats[2];
//			System.out.println(
//					"Your enemy attacked first, dealing " + CharVariables.mob1Stats[2] + " damage!");
//			charSelection.classStats.revalidate();
//			System.out.println("Your health is now down to " +CharVariables.userStats[0] + "\n");
//			
//			System.out.println("You attacked second, dealing " +  CharVariables.userStats[2] + " damage!");
//			
//			System.out.println("Your opponent's health is now down to " + CharVariables.mob1Stats[0] + "\n");
//			
//			charSelection.classStats.setText(
//					"Stats:" + "\n"+
//					CharVariables.charClass + "	" + CharVariables.Name + "\n" + 
//					"Health: 	" + CharVariables.userStats[0] +  "\n" +
//					"Speed: 	" + CharVariables.userStats[1] + "\n" +
//					"Attack: 	" + CharVariables.userStats[2] + "\n" + 
//					"Balance:	" + CharVariables.userStats[3]+ "\n");
//		
//		
//			if(CharVariables.userStats[0] <= 0){
//				System.out.println("You died.. lol");
//			
//			}
//			if(CharVariables.mob1Stats[0] <= 0){
//				System.out.println("Your opponent died.. lol");
//				
//			}
//	
//				
//			
//			
//
//		}
//		
	}
}
}

//public class attackListener2 implements ActionListener{
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		System.out.println("Battle is over!");
//		
//	}
//}
