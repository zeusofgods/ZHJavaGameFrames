package ZHJavaGame;

import javax.swing.JTextArea;

public class CharVariables {
	public static String charClass, Name, mobName[] = new String[1];
	public static int archClass[] = new int[4], warClass[] = new int[4], mageClass[] = new int[4], userStats[] = new int[4];
	public static int mob1Stats[] = new int[3];
	
	
	public static void Variables(){
		
		mobName[0]	 = "Wounded Gladiator";
		mob1Stats[0] = 30;
		mob1Stats[1] = 17;
		mob1Stats[2] = 12;
		
		
		archClass[0] = 30;
		archClass[1] = 23;
		archClass[2] = 12;
		archClass[3] = 15;
		
		
		warClass[0] = 45;
		warClass[1] = 12;
		warClass[2] = 20;
		warClass[3] = 8;
		
		
		mageClass[0] = 25;
		mageClass[1] = 18;
		mageClass[2] = 17;
		mageClass[3] = 3;
		
		charClass = "Player:";
		
	}

	
	

}
