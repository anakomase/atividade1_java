package atividade01;

import javax.swing.JOptionPane;

public class JavaG {
	public static void main(String[] args) {
		String operacoes = JOptionPane.showInputDialog("ESCOLHA AS OPERAÇÕES, M - MULTIPLICAÇÃO, "
				+ "A - ADIÇÃO, S - SUBTRAÇÃO, D- DIVISAO");
		if(operacoes.equalsIgnoreCase("M")) {
			double num1, num2;
			num1 = Double.parseDouble(JOptionPane.showInputDialog("DIGITE UM NUMERO"));
			num2 = Double.parseDouble(JOptionPane.showInputDialog("DIGITE UM NUMERO"));
			
			System.out.println("o resultado é " + (num1 * num2));
		}if(operacoes.equalsIgnoreCase("A")) {
			double num1, num2;
			num1 = Double.parseDouble(JOptionPane.showInputDialog("DIGITE UM NUMERO"));
			num2 = Double.parseDouble(JOptionPane.showInputDialog("DIGITE UM NUMERO"));
			
			System.out.println("o resultado é " + (num1 + num2));	
		}if(operacoes.equalsIgnoreCase("S")) {
			double num1, num2;
			num1 = Double.parseDouble(JOptionPane.showInputDialog("DIGITE UM NUMERO"));
			num2 = Double.parseDouble(JOptionPane.showInputDialog("DIGITE UM NUMERO"));
			
			System.out.println("o resultado é " + (num1 - num2));	
			
		}if(operacoes.equalsIgnoreCase("D")) {
			double num1, num2;
			num1 = Double.parseDouble(JOptionPane.showInputDialog("DIGITE UM NUMERO"));
			num2 = Double.parseDouble(JOptionPane.showInputDialog("DIGITE UM NUMERO"));
			
			System.out.println("o resultado é " + (num1 / num2));	
		}
	}

}
