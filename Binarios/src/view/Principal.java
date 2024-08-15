 package view;

import javax.swing.JOptionPane;

import controller.Binarios;

public class Principal {

	public static void main(String[] args) {
		int num;
		do {
		num = Integer.parseInt(JOptionPane.showInputDialog("insira numero ate 2000"));
		}while (num<0||num>2000);
		
		String vazio = "";
		Binarios bin= new Binarios();
		
		String resp = bin.transformaBinario(num, vazio);
		System.out.println(  resp);
	}
	
}
