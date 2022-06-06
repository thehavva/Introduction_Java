import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

public class FontClass {
	public static void main(String[] args) {
		Font myFont= new Font("SansSerif",Font.ITALIC,30);
		JFrame aframe= new JFrame("MY FRAME IS ONLINE");
		GridLayout grid1= new GridLayout();
		GridLayout grid2= new GridLayout();
		JButton button1= new JButton("YES");
		JButton button2= new JButton("NO");
		button1.setBackground(Color.blue);
		button2.setBackground(Color.blue);
		button1.setForeground(Color.red);
		button2.setForeground(Color.red);
		button1.setFont(myFont);
		button2.setFont(myFont);
		aframe.add(button1);
		aframe.add(button2);
		aframe.setLayout(grid1);
		aframe.setLayout(grid2);
		aframe.setSize(400,400);
		aframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aframe.setVisible(true);
		aframe.setLocationRelativeTo(null); //Center the frame
	}
}
