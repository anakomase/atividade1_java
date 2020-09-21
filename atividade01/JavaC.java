package atividade01;

import javax.swing.JOptionPane;

public class JavaC {
	public static void main(String[] args) {
	
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		int nn = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
		
		if(n > nn ) {
			JOptionPane.showMessageDialog(null, "O numero maior é " + n);
		}else {
			JOptionPane.showMessageDialog(null, "O numero maior é" + nn);
		}
		
		
		
}
}
