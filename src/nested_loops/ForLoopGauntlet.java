package nested_loops;

import java.util.Calendar;

import javax.swing.JOptionPane;

public class ForLoopGauntlet {
	public static void main(String[] args) {
		/*
		for (int i = 0; i < 101; i++) {
			System.out.println(i);
		}
		for (int i = 100; i > -1; i--) {
			System.out.println(i);
		}
		for (int i = 2; i < 101; i+= 2) {
			System.out.println(i);
		}
		for (int i = 1; i < 100; i+= 2) {
			System.out.println(i);
		}
		for (int i = 1; i < 501; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " is even.");
			} else {
				System.out.println(i + " is odd.");
			}
		}
		for (int i = 0; i < 778; i+= 7) {
			System.out.println(i);
		}
		String your = JOptionPane.showInputDialog("What is your age?");
		int currentfear = Calendar.getInstance().get(Calendar.YEAR);
		for (int i = 0; i < Integer.parseInt(your) + 1; i++) {
			System.out.println("In " + ((currentfear - Integer.parseInt(your)) + i) + " you were " + i + ".");
		}*/
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(i + " " + j);
			}
		}
		for (int i = 1; i < 10; i+= 3) {	
			for (int j = 0; j < 3; j++) {
				System.out.print(i + j + " ");
			}
			System.out.println();
		}
		String blank;
		for (int i = 1; i < 101; i+= 10) {	
			for (int j = 0; j < 10; j++) {
				if (i == 1) {
					blank = "  ";
				} else {
					blank = " ";
				}
				System.out.print(i + j + blank);
			}
			System.out.println();
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
