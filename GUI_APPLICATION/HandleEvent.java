import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class HandleEvent extends JFrame{
	public HandleEvent() {
		JButton btOK= new JButton("OK");
		JButton btCancel= new JButton("CANCEL");
		Font myfont=new Font("Serif",Font.BOLD, 20);
		btOK.setFont(myfont);
		btCancel.setFont(myfont);
		
		add(btOK);
		add(btCancel);
		JPanel panel= new JPanel();
		panel.add(btOK);
		panel.add(btCancel);
		add(panel);
		
		
		OKListenerClass listener1=new OKListenerClass();
		CancelListenerClass listener2= new CancelListenerClass();
		btOK.addActionListener(listener1);
		btCancel.addActionListener(listener2);
	}
	public static void main(String[] args) {
		JFrame aframe= new HandleEvent();
		aframe.setTitle("Handle Event");
		aframe.setSize(200,150);
		aframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aframe.setVisible(true);
		aframe.setLocationRelativeTo(null); 
	}
}

class OKListenerClass implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		System.out.println("OK button clicked");
	}
}
class CancelListenerClass implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		System.out.println("Cancel button clicked");
	}
}
