import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class GUI_BASICS {

	public static void main(String[] args) {
		Font myfont=new Font("Dialog",Font.BOLD, 20);
		JFrame aframe= new JFrame("MY FRAME IS ONLINE");
		
		JButton jbtn = new JButton("OK");
		JLabel jlbl=new JLabel("First Name");
		ImageIcon icon= new ImageIcon("image/tes12.jpeg");
		jbtn.setIcon(icon);
		jbtn.setFont(myfont);
		//JTextField txtfield =new JTextField(8);
		//txtfield.setBackground(Color.red);
		//txtfield.setSize(20, 40);
		aframe.add(jbtn);
		aframe.add(jlbl);
		//aframe.add(txtfield);
		aframe.setSize(400,400);
		aframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aframe.setVisible(true);
		aframe.setLocationRelativeTo(null); //Center the frame
	}

}
