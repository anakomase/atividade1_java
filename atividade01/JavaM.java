package atividade01;

import javax.swing.JOptionPane;

public class JavaM {
	public static void main(String[] args) {
		int qtndCc = Integer.parseInt(JOptionPane.showInputDialog("DIGITE A QUANTIDADE DE CILINDRADA DO VEICULO"));
		
		if(qtndCc >= 0 && qtndCc <=120) {
			System.out.println("Sub Production" + qtndCc);
		}if(qtndCc == 121 && qtndCc <= 240) {
			System.out.println("Production" + qtndCc);
		} else if(qtndCc >= 240) {
			System.out.println("super production" + qtndCc);
		}
		
	
	}

}
