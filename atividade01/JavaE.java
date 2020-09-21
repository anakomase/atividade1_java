package atividade01;

import javax.swing.JOptionPane;

public class JavaE {
	
	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("digite um numero?"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("digite um numero?"));
		int total = (numero % numero2);
		
		if(total == 0) {
			System.out.println("esse numero é par");
			
		}else {
			System.out.println("numero impar");
		}
		
	}
	
	
	
	
}
