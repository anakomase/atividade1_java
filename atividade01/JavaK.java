package atividade01;

import javax.swing.JOptionPane;

public class JavaK {
	public static void main(String[] args) {
		String data1 = JOptionPane.showInputDialog("DIGITE A PRIMEIRA DATA NO FORMATO DD-YY-MMM");
		String data2 = JOptionPane.showInputDialog("DIGITE A SEGUNDA DATA NO FORMATO DD-YY-MMM");
		
		if(data1.compareTo(data2) > 0) {
			 JOptionPane.showMessageDialog(null, data1);
		}else if(data1.compareTo(data2) < 0) {
			JOptionPane.showMessageDialog(null, data2);
		}else {
			JOptionPane.showMessageDialog(null, "as datas sao iguais");
		}
			
		
	
	}

}
