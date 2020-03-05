package _04_are_you_happy;

import javax.swing.JOptionPane;

public class HAPPY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String answer;
       String answerTwo;
       answer= JOptionPane.showInputDialog("ARE YOU HAPPY?");
		if (answer.equalsIgnoreCase ("Yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing what you are doing");
		System.exit(0);
		}
		if (answer.equalsIgnoreCase ("No")) {
		answerTwo=JOptionPane.showInputDialog(null, "Do you want to be happy");
		if(answerTwo.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "Keep doing what you are doing");
			System.exit(0);
		}
		if(answerTwo.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Something needs to change");
		    System.exit(0);
		}
		System.exit(0);
		}
	}

}
