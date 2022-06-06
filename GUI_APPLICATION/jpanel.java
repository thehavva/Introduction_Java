import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class jpanel extends JFrame{
	public jpanel() {
		JPanel p1= new JPanel();
		p1.setLayout(new GridLayout(4,3));
		
		for(int i=1; i<=9; i++) {
			p1.add(new JButton(""+i));
		}
		p1.add(new JButton("START"));
		p1.add(new JButton("" + 0));
		p1.add(new JButton("STOP"));
		
		JPanel p2=new JPanel(new BorderLayout());
		p2.add(new JTextField("Time to sleep"), BorderLayout.NORTH);
		p2.add(p1,BorderLayout.CENTER);
		
		add(p2, BorderLayout.EAST);
		add(new JButton("Havva was here!"), BorderLayout.CENTER);
	}
	public static void main(String[] args) {
		jpanel frame=new jpanel();
		frame.setTitle("JPanel is loading...");
		frame.setSize(400, 250);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
