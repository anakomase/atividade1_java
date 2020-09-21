package atividade01;

import javax.swing.JOptionPane;

public class JavaF {
	public static void main(String[] args) {
		double num1 = Double.parseDouble(JOptionPane.showInputDialog("digite um numero"));
		double num2 = Double.parseDouble(JOptionPane.showInputDialog("digite um numero"));
		double num3 = Double.parseDouble(JOptionPane.showInputDialog("digite um numero"));
		
		if(num1 <= num2 && num1 <= num3) {
		}if(num2 >= num1 && num2 <= num3) {
			System.out.println("a ordem crescente é " +num1+ " - " +num2+ " - " +num3);
		}
	}

}
