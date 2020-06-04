//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _99_extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class DizzyRobot {
	static Robot robot = new Robot();
	public static void main(String[] args) {
		String dizzy ;
		 // 2. Ask the user how dizzy you want the robot from 1-10, then spin that number of times.
         dizzy=JOptionPane.showInputDialog("how dizzy do you want the robot");
         int spins=Integer.parseInt(dizzy);
         
         
 // 1. Use the dance method to make the robot spin.
	      dance(spins);

	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			robot.setSpeed(40);
			robot.turn(360);
			
		}
	}
}

