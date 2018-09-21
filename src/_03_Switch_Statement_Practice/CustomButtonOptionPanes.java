package _03_Switch_Statement_Practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		
		switch(choice) {
		case "Sunday": 
			System.out.println("Dimanche");
			break;
		case "Monday": 
			System.out.println("Lundi");
			break;
		case "Tuesday": 
			System.out.println("Mardi");
			break;
		case "Wednesday": 
			System.out.println("Mercredi");
			break;
		case "Friday": 
			System.out.println("Vendredi");
			break;
		case "Saturday": 
			System.out.println("Samedi");
			break;
		default: 
			System.out.println("What day is it?");
			break;
		}
	}
}
