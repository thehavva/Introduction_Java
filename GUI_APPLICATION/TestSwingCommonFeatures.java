import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class TestSwingCommonFeatures extends JFrame{
	public TestSwingCommonFeatures() {
		JPanel p1= new JPanel(new FlowLayout(FlowLayout.LEFT,2,2));
		Font myfont=new Font("Serif",Font.BOLD+Font.ITALIC,20);
		JButton leftbttn=new JButton("LEFT");
		JButton centerbttn=new JButton("CENTER");
		JButton rightbttn=new JButton("RIGHT");
		leftbttn.setForeground(Color.PINK);
		leftbttn.setBackground(Color.BLUE);
		centerbttn.setForeground(Color.GREEN);
		centerbttn.setBackground(Color.BLACK);
		rightbttn.setForeground(Color.GRAY);
		rightbttn.setBackground(Color.MAGENTA);
		rightbttn.setToolTipText("This is the right button");
		p1.add(leftbttn);
		p1.add(centerbttn);
		p1.add(rightbttn);
		p1.setBorder(new TitledBorder("Three Buttons"));
		
		Border lineborder=new LineBorder(Color.DARK_GRAY, 2);
		JPanel p2 =new JPanel(new GridLayout(1,2,5,5));
		JLabel label1= new JLabel("RED");
		JLabel label2=new JLabel("ORANGE");
		label1.setForeground(Color.RED);
		label2.setForeground(Color.ORANGE);
		label1.setFont(myfont);
		label2.setFont(myfont);
		label1.setBorder(lineborder);
		label2.setBorder(lineborder);
		p2.add(label1);
		p2.add(label2);
		p2.setBorder(new TitledBorder("TWO LABELS"));
		
		setLayout(new GridLayout(2,1,5,5));
		add(p1);
		add(p2);
	}
	
	public static void main(String[] args) {
		JFrame frame=new TestSwingCommonFeatures();
		frame.setTitle("Test Swing Common Features");
		frame.setSize(300,150);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
