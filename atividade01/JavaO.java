package atividade01;

import javax.swing.JOptionPane;

public class JavaO {
	public static void main(String[] args) {
		int nota1 = Integer.parseInt(JOptionPane.showInputDialog("digite a primeira nota da prova"));
		int nota2 = Integer.parseInt(JOptionPane.showInputDialog("digite a segunda nota da prova"));
		int trab1 = Integer.parseInt(JOptionPane.showInputDialog("digite a primeira nota do trabalho"));
		int trab2 = Integer.parseInt(JOptionPane.showInputDialog("digite a segunda nota do trabalho"));
		int trab3 = Integer.parseInt(JOptionPane.showInputDialog("digite a terceira nota do trabalho"));
		
		int mediaFinal = (nota1 + nota2 + trab1 + trab2 + trab3)/5;
		
		if(mediaFinal >= 6 || mediaFinal <= 10) {
			System.out.println("Aprovado");
		}if(mediaFinal <= 4 || mediaFinal < 6) {
			System.out.println("exame");
		}else if(mediaFinal <= 0 || mediaFinal < 4 ) {
			System.out.println("reprovado");
		}
			
	}
}
