package atividade01;

import javax.swing.JOptionPane;

public class JavaL {
	public static void main(String[] args) {
		String data1 = JOptionPane.showInputDialog("DIGITE  A DATA DE NASCIMENTO NO FORMATO DD-YY-MMM");
		String data2 = JOptionPane.showInputDialog("DIGITE  A DATA DE NASCIMENTO NO FORMATO DD-YY-MMM");
		String nome1 = JOptionPane.showInputDialog("DIGITE SEU NOME ");
		String nome2 = JOptionPane.showInputDialog("DIGITE SEU NOME ");
		
		if(data1.compareTo(data2) > 0) {
			 JOptionPane.showMessageDialog(null, nome1);
		}else if(data1.compareTo(data2) < 0) {
			JOptionPane.showMessageDialog(null, nome2);
		}else {
			JOptionPane.showMessageDialog(null, "nasceram no mesmo dia " + nome1, nome2, 0);
		}
	}
}
