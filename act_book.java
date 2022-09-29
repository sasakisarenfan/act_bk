package form;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.security.PublicKey;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

class act_book extends JFrame{
	act_book() {
		String a[] = {"일 자","항 목","수 입","지 출","잔 액"};
		String b[][] = {
				{"1","10","100","11","12"},
				{"2","20","110","123","1221"}
		};
		JTable table = new JTable(b,a);
		JScrollPane scrollpane = new JScrollPane(table);
		JButton btn0 = new JButton("새항목");
		JLabel la1 = new JLabel("일자");
		JTextField txtfield = new JTextField(20);
		
		btn0.setBounds(600,380,75,75);
		scrollpane.setBounds(10,10,670,200);
		la1.setBounds(EXIT_ON_CLOSE, ABORT, WIDTH, HEIGHT);
		
		setTitle("account_book");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		scrollpane.setPreferredSize(new Dimension(680,200));
		setSize(700,500);
		setVisible(true);
		setLayout(null);
		getContentPane().add(btn0);
		getContentPane().add(scrollpane);
	}
	public static void main(String[] args) {
		new act_book();
	}

}
