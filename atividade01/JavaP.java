package atividade01;

import javax.swing.JOptionPane;

public class JavaP {
	public static void main(String[] args) {
		String sexo = JOptionPane.showInputDialog("digite seu sexo sendo f - feminino e m - masculino");
		int tempoCasa = Integer.parseInt(JOptionPane.showInputDialog("quanto tempo esta na casa?"));
		double salario = Double.parseDouble(JOptionPane.showInputDialog("qual seu salario?"));
		
		
		if(sexo.equalsIgnoreCase("m") && tempoCasa >= 15) {
			System.out.println("seu bonus é de " + salario * 0.2);
		}if(sexo.equalsIgnoreCase("f") && tempoCasa >= 10) {
			System.out.println("seu bonus é de " + salario * 0.25 );
		}else {
			System.out.println("voce recebe apenas 200");
		}
	}
}
