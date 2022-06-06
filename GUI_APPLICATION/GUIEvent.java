import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.LineBorder;

public class GUIEvent extends JFrame{
	private JLabel label1= new JLabel("HAVVA YILMAZ",JLabel.CENTER);
	private JCheckBox box1= new JCheckBox("Bold");
	private JCheckBox box2= new JCheckBox("Italic");
	private JRadioButton b1=new JRadioButton("RED");
	private JRadioButton b2 =new JRadioButton("GREEN");
	private JRadioButton b3 =new JRadioButton("Blue");
	private JTextField text1= new JTextField(10);
	
	public GUIEvent() {
		label1.setBorder(new LineBorder(Color.BLACK, 2));
		add(label1, BorderLayout.CENTER);
		
		JPanel jpCheckBoxes =new JPanel();
		jpCheckBoxes.setLayout(new GridLayout(2,1));
		jpCheckBoxes.add(box1);
		jpCheckBoxes.add(box2);
		add(jpCheckBoxes, BorderLayout.EAST);
		
		JPanel jpRadioButtons =new JPanel();
		jpRadioButtons.setLayout(new GridLayout(3,1));
		jpRadioButtons.add(b1);
		jpRadioButtons.add(b2);
		jpRadioButtons.add(b3);
		add(jpRadioButtons, BorderLayout.WEST);
		
		ButtonGroup group= new ButtonGroup();
		group.add(b1);
		group.add(b2);
		group.add(b3);
		
		b3.setSelected(true);
		text1.setForeground(Color.GREEN);
		
		JPanel jpTextField= new JPanel();
		jpTextField.setLayout(new BorderLayout(5,0));
		jpTextField.add(new JLabel("Enter a new message"), BorderLayout.EAST);
		jpTextField.add(text1, BorderLayout.CENTER);
		text1.setHorizontalAlignment(JTextField.RIGHT);
		add(jpTextField, BorderLayout.NORTH);
		
	}
	public static void main(String[] args) {
		GUIEvent frame=new GUIEvent();
		frame.setTitle("GUI Event Application");
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
