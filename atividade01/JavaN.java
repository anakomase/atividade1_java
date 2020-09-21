package atividade01;

import javax.swing.JOptionPane;

public class JavaN {
	public static void main(String[] args) {
		int idade = Integer.parseInt(JOptionPane.showInputDialog("digite sua idade"));
		
		if(idade >= 0 && idade <=10) {
			System.out.println("infantil");
		}if(idade >= 11 && idade <=14) {
			System.out.println("junior");
		}if(idade >= 15 && idade <= 20) {
			System.out.println("Adolescente");
			
		}if(idade >=21 && idade <= 35) {
			System.out.println("jovem");
		}else if(idade >= 35) {
			System.out.println("master");
		}
	}

}
