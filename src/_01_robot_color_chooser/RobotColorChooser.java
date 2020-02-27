//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		String color;
		//1. Create a new Robot
	 Robot bob= new Robot("mini");
		//3. Ask the user what color they would like the robot to draw
		      color= JOptionPane.showInputDialog(null, "Wut color do you you want");
		//5. Use an if/else statement to set the pen color that the user requested
           if (color.equalsIgnoreCase("red") ) {
           bob.penDown();
           
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		for(int i=0;i<100;i++) {
		//4. Set the pen width to 10
		   bob.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		   bob.setPenColor(1000000000,0,0);
           bob.setSpeed(1000);
           bob.move(100);
           bob.turn(165);
           bob.move(100);
           bob.turn(185);
		}
	}
	}
}
