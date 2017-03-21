package br.univel;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

public class Ex01Principal extends JFrame {

	private static final String RA = "169456";

	public Ex01Principal() {
		
		super();
		this.setSize(800, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		JTable table = new JTable(); 
		JScrollPane js = new JScrollPane(table); 
		this.setContentPane(js);
		
		Ex01 ex = new Ex01(RA);
		table.setModel((TableModel) new Ex01(RA)); 
		
	}

	public static void main(String[] args) {
		
		Ex01Principal e = new Ex01Principal();
		e.setVisible(true);
		
	}
}


