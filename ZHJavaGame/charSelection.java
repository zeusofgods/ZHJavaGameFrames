package ZHJavaGame;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;



@SuppressWarnings("serial")
public class charSelection extends JPanel{
		public static JButton Archer, Warrior, Mage, cont;
		public static JTextArea classIntro, classStats;
		
	public charSelection(){
		charChoice charChoiceBut = new charChoice();
		Continue contBut = new Continue();
		this.setLayout(null);
		
		this.setBackground(Color.green.darker().darker().darker());
		

	
	Archer= new JButton("Archer");
		Archer.setFont(new Font(Archer.getName(), Font.PLAIN, 35));
		Archer.setBorderPainted(false);
		Archer.setSize(200, 100);
		Archer.setLocation(ColosseumClash.winX/18*3, ColosseumClash.winY/2);
		Archer.setToolTipText("Archers are quick characters. Years of archery and sleight of hand has given archers speed and dexterity.");
		
	Warrior= new JButton("Warrior");
		Warrior.setFont(new Font(Warrior.getName(), Font.PLAIN, 35));
		Warrior.setBorderPainted(false);
		Warrior.setSize(200, 100);
		Warrior.setLocation(ColosseumClash.winX/18*7, ColosseumClash.winY/2);
		Warrior.setToolTipText("Warriors are bruty characters. From their lack of speed, warriors take down enemies with heavy force.");
		
	Mage = new JButton("Mage");
		Mage.setFont(new Font(Mage.getName(), Font.PLAIN, 35));
		Mage.setBorderPainted(false);
		Mage.setSize(200, 100);
		Mage.setLocation(ColosseumClash.winX/18*11, ColosseumClash.winY/2);
		Mage.setToolTipText("Mages are a powerful characters. Equipped with the knowledge of the vast unknown, mages can take down their enemies with ease and finesse.");
	cont = new JButton("Continue");
		
		cont.setSize(150, 100);
		cont.setLocation(ColosseumClash.winX/18*7 + 20, ColosseumClash.winY/10*7);
		cont.setFont(new Font(cont.getName(), Font.PLAIN, 15));
		cont.setBorderPainted(false);
		cont.setEnabled(false);
		
	classIntro= new JTextArea();
		classIntro.setLocation(ColosseumClash.winX/4, ColosseumClash.winY/5);
		classIntro.setText("   What are you?");
		classIntro.setFont(new Font(classIntro.getName(), Font.ROMAN_BASELINE, 50));
		classIntro.setSize(475, 75);
		classIntro.setBackground(Color.green.darker().darker().darker());
		classIntro.setEditable(false);
		this.add(classIntro);
		
	classStats = new JTextArea();
		classStats.setLocation(5, 5);
		classStats.setForeground(Color.blue.darker());
		classStats.setText("Stats:");
		classStats.setFont(new Font(classIntro.getName(), Font.ROMAN_BASELINE, 14));
		classStats.setSize(300, 100);
		classStats.setBackground(Color.green.darker().darker().darker());
		classStats.setEditable(false);
	
		this.add(classStats);
		
		this.add(Archer);
		this.add(Warrior);
		this.add(Mage);
		this.add(cont);
		Archer.addActionListener(charChoiceBut);
		Warrior.addActionListener(charChoiceBut);
		Mage.addActionListener(charChoiceBut);
		cont.addActionListener(contBut);
		
		
		

	}
		public static class charChoice implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
		
				
				if(e.getSource().toString().contains("Archer")){
					
	//[0] = health
	//[1] = speed
	//[2] = attack
	//[3] = balance 
					charSelection.classIntro.setText("You are an Archer");
				
					CharVariables.charClass = "Archer";
					CharVariables.userStats[0] = CharVariables.archClass[0];
					CharVariables.userStats[1] = CharVariables.archClass[1];
					CharVariables.userStats[2] = CharVariables.archClass[2];
					CharVariables.userStats[3] = CharVariables.archClass[3];
					
					charSelection.classStats.setText(
							"Stats:" + "\n"+
							CharVariables.charClass + "	" + CharVariables.Name + "\n" + 
							"Health: 	" + CharVariables.userStats[0] +  "\n" +
							"Speed: 	" + CharVariables.userStats[1] + "\n" +
							"Attack: 	" + CharVariables.userStats[2] + "\n" + 
							"Balance:	" + CharVariables.userStats[3]+ "\n");
								
					charSelection.Archer.setForeground(Color.red.darker());
					charSelection.Warrior.setForeground(Color.black);
					charSelection.Mage.setForeground(Color.black);
					
					
					charSelection.cont.setEnabled(true);
					

					
				}else if (e.getSource().toString().contains("Warrior")){
					charSelection.classIntro.setText("You are a Warrior");	
					
					CharVariables.charClass = "Warrior";
					CharVariables.userStats[0] = CharVariables.warClass[0];
					CharVariables.userStats[1] = CharVariables.warClass[1];
					CharVariables.userStats[2] = CharVariables.warClass[2]; 
					CharVariables.userStats[3] = CharVariables.warClass[3]; 
					
					
						charSelection.classStats.setText(
								"Stats:" + "\n"+
								CharVariables.charClass + "	" + CharVariables.Name + "\n" + 
								"Health: 	" + CharVariables.userStats[0] +  "\n" +
								"Speed: 	" + CharVariables.userStats[1] + "\n" +
								"Attack: 	" + CharVariables.userStats[2] + "\n" + 
								"Balance:	" + CharVariables.userStats[3]+ "\n");
									
						charSelection.Archer.setForeground(Color.black);
						charSelection.Warrior.setForeground(Color.red.darker());
						charSelection.Mage.setForeground(Color.black);
						charSelection.cont.setEnabled(true);
						
						
						
				}else if (e.getSource().toString().contains("Mage")){
					
					charSelection.classIntro.setText("You are a Mage");	
				
					CharVariables.charClass = "Mage";
					CharVariables.userStats[0] = CharVariables.mageClass[0];
					CharVariables.userStats[1] = CharVariables.mageClass[1];
					CharVariables.userStats[2] = CharVariables.mageClass[2];
					CharVariables.userStats[3] = CharVariables.mageClass[3];
					
					charSelection.classStats.setText(
							"Stats:" + "\n"+
							CharVariables.charClass + "	" + CharVariables.Name + "\n" + 
							"Health: 	" + CharVariables.userStats[0] +  "\n" +
							"Speed: 	" + CharVariables.userStats[1] + "\n" +
							"Attack: 	" + CharVariables.userStats[2] + "\n" + 
							"Balance:	" + CharVariables.userStats[3]+ "\n");
					
					charSelection.Archer.setForeground(Color.black);
					charSelection.Warrior.setForeground(Color.black);
					charSelection.Mage.setForeground(Color.red.darker());
					charSelection.cont.setEnabled(true);
					
				}
				}}
		public static class Continue implements ActionListener{

					@Override
					public void actionPerformed(ActionEvent e) {
						ColosseumClash.frame.setEnabled(false);
						ColosseumClash.frame.setVisible(false);
						ColosseumClash.frame.getContentPane().removeAll();
					
						Center panel4 = new Center();
						ColosseumClash.frame.getContentPane().add(panel4);
					
						
						ColosseumClash.frame.setEnabled(true);
						ColosseumClash.frame.setVisible(true);
				
				}
				
			
			
		}
	
}