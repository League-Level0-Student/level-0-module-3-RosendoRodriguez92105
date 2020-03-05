//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _02_crazy_cat_lady;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		String cats;
		// 1. Ask the user how many cats they have
          cats=JOptionPane.showInputDialog("how many cats do you have");
		// 2. Convert their answer into an int
int NumberOfCats= Integer.parseInt(cats);
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
            if (NumberOfCats>=3) {
            JOptionPane.showMessageDialog(null, "YOOOU Crazy LAdy");
            }
		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video
            if (NumberOfCats<=3 && NumberOfCats>0) {
            	playVideo("https://www.youtube.com/watch?v=QH2-TGUlwu4");
            }
		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human
		if(NumberOfCats==0) {
			playVideo("https://www.youtube.com/watch?v=sxAlWUSkACs");
	}}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

