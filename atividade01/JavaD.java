package atividade01;

import javax.swing.JOptionPane;

public class JavaD {
	public static void main(String[] args) {
		double n = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
		double nn = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero"));
		
		if(n < nn) {
			JOptionPane.showMessageDialog(null, "menor numero é " + n);
		}else {
			JOptionPane.showMessageDialog(null, "menor numero é " + nn);
		}
	}
}
