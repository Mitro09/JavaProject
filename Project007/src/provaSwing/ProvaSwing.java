package provaSwing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ProvaSwing {

	public static void main(String[] args) {

		JFrame f = new JFrame();// creating instance of JFrame

		JButton b = new JButton("click");// creating instance of JButton
		b.setBounds(200, 200, 100, 100);// x axis, y axis, width, height

		f.add(b);// adding button in JFrame

		f.setSize(500, 500);// 400 width and 500 height
		f.setLayout(null);// using no layout managers
		f.setVisible(true);// making the frame visible

		JFrame f2 = new JFrame("Button Example");
		final JTextField tf = new JTextField();
		tf.setBounds(50, 50, 150, 20);
		JButton b2 = new JButton("Click Here");
		b2.setBounds(50, 100, 95, 30);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("Welcome to Javatpoint.");
			}
		});
		f2.add(b2);
		f2.add(tf);
		f2.setSize(400, 400);
		f2.setLayout(null);
		f2.setVisible(true);

	}
}
