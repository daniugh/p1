package br.univel;

import javax.swing.JFrame;

public class Ex02Principal {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame("Ex02");
		jf.setSize(400, 400); 
		jf.setLocationRelativeTo(null);
	
		Ex02 ex = new Ex02();
		
		jf.setContentPane(ex);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true); 
	}
}


