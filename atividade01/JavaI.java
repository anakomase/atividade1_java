package atividade01;

import javax.swing.JOptionPane;

public class JavaI {
	public static void main(String[] args) {
		int aresta1, aresta2,aresta3;
		
		aresta1 = Integer.parseInt(JOptionPane.showInputDialog("digite o valor da aresta 1"));
		aresta2 = Integer.parseInt(JOptionPane.showInputDialog("digite o valor da aresta 2"));
		aresta3 = Integer.parseInt(JOptionPane.showInputDialog("digite o valor da aresta 3"));
		
		if(aresta1 < aresta2 && aresta1 < aresta3) {
			JOptionPane.showMessageDialog(null, "pode formar um triangulo");
		}if(aresta2 == aresta3 && aresta1 != aresta2) {
			System.out.println("triangulo isoleceles");
		}else if(aresta1 != aresta2 && aresta1 != aresta3 || aresta2 != aresta3) {
			System.out.println("triangulo escaleno");
		}else {
			
			System.out.println("nao forma triangulo");
		}
		
	}
}
