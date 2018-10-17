package algorithms;

import javax.swing.JOptionPane;

public class Fibonacci {
	public static void main(String[] args) {
		int lastNum = 1;
		int thisNum = 0;
		for (int i = 0; i < 12; i++) {
			System.out.println(thisNum);
			lastNum += thisNum;
			thisNum += lastNum;
		}
	}
}
