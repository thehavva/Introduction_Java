import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ListenerDemo extends JFrame implements ActionListener{
	private JButton b1= new JButton("New");
	private JButton b2= new JButton("Open");
	private JButton b3= new JButton("Save");
	private JButton b4= new JButton("Print");
	
	public ListenerDemo() {
		JPanel panel= new JPanel();
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		add(panel);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			System.out.println("Processing a new page...");
		}
		else if(e.getSource()==b2) {
			System.out.println("Processing a open page...");
		}
		else if(e.getSource()==b3) {
			System.out.println("Process save file...");
		}
		if(e.getSource()==b4) {
			System.out.println("Processing print file...");
		}
	}
	public static void main(String[] args) {
		JFrame aframe= new ListenerDemo();
		aframe.setTitle("Listener Event");
		aframe.setSize(200,150);
		aframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aframe.setVisible(true);
		aframe.setLocationRelativeTo(null); 
	}
}
