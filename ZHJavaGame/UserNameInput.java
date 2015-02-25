package ZHJavaGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UserNameInput extends JPanel {
	public static JTextField textField;
	public static JButton contBut;
	private JLabel nameQ;
	

	public UserNameInput(){
		
		this.setBackground(Color.green.darker().darker().darker());

		this.setLayout(null);
		
		
		
		nameQ = new JLabel();
		nameQ.setText("What's your name, traveler?");
		nameQ.setForeground(Color.black.brighter());
		nameQ.setSize(500, 25);
		nameQ.setFont(new Font(nameQ.getName(), Font.PLAIN, 25));
		
	

		nameQ.setLocation(ColosseumClash.winX/3 -20, ColosseumClash.winY/3 -75);
		nameQ.setVisible(true);
		textField = new JTextField();
		textField.setBackground(Color.blue.darker().darker());
		textField.setFont(new Font(textField.getName(), Font.PLAIN, 20));
		textField.setForeground(Color.red);
		textField.setSize(300,100);
		textField.setLocation(ColosseumClash.winX/3, ColosseumClash.winY/3);
		textField.setVisible(true);
		textField.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				CharVariables.Name = textField.getText();
				
				ColosseumClash.frame.setEnabled(false);
				ColosseumClash.frame.setVisible(false);
				ColosseumClash.frame.getContentPane().removeAll();
				charSelection panel3 = new charSelection();
				ColosseumClash.frame.getContentPane().add(panel3);
				panel3.setSize(getMaximumSize());

				ColosseumClash.frame.setEnabled(true);
				ColosseumClash.frame.setVisible(true);
			}
		});
		
		
		this.add(nameQ);
		this.add(textField);
		
		
//		System.out.println("What's your name, traveler?");
//		Scanner input = new Scanner (System.in);
//		CharVariables.Name = input.nextLine().toString();
		
	}
	
	

}
