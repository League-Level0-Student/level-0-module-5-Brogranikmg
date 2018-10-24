package algorithms;

import javax.swing.JOptionPane;

public class Fibonacci {
	public static void main(String[] args) {
		int lastNum = 0;
		int thisNum = 1;
		int thisOldNum;
		for (int i = 0; i < 20; i++) {
			System.out.println(lastNum);
			thisOldNum = lastNum;
			lastNum = thisNum;
			thisNum = thisOldNum + lastNum;
		}
	}
}
