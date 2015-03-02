package ZHJavaGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		Fight.addActionListener(new fightListener());
		
		
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
		
		this.add(charSelection.classStats);
		charSelection.classStats.setBackground(Color.green);
		
		this.add(Exit);
		this.add(Shop);
		this.add(Fight);
	}
	private class fightListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			ColosseumClash.frame.setEnabled(false);
			ColosseumClash.frame.setVisible(false);
			ColosseumClash.frame.getContentPane().removeAll();
			
			
			Fighting fPanel = new Fighting();
			fPanel.setSize(getMaximumSize());
			ColosseumClash.frame.add(fPanel);
			
			
			
			ColosseumClash.frame.setEnabled(true);
			ColosseumClash.frame.setVisible(true);
//			Fighting.actionPrompt.setText(CharVariables.mobName[0] + " has prepared for battle");
		}
		
	}

}
