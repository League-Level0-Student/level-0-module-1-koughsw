package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {
String carl = "You are very nice.";
String james = "You are efficient at working.";
String charles = "You are very good at playing video games.";
		// 1. Save something remarkable about each person in a variable.
	
		// 2. Ask the user to enter a name. Store their answer in a variable.
String name = JOptionPane.showInputDialog("Enter a name."); 
		// 3. In a pop-up, tell the user what is remarkable about that person. 
		if(name.equals("carl")) {
			JOptionPane.showMessageDialog(null, carl);
		}
		if(name.equals("james")) {
		JOptionPane.showMessageDialog(null, james);}
		if(name.equals("charles")) {
		JOptionPane.showMessageDialog(null, charles);
		}else {
		JOptionPane.showMessageDialog(null, "Who are you?");
		
	}
}
}
