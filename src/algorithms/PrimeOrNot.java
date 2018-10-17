package algorithms;

import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		boolean isPrime = true;
		int prime = Integer.parseInt(JOptionPane.showInputDialog("Pick a number, any number!"));
		for (int i = 1; i < prime - 1; i++) {
			if (prime % (i+1) == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			JOptionPane.showMessageDialog(null, "It's prime!");
		} else {
			JOptionPane.showMessageDialog(null, "It's not prime!");
		}
	}
}
