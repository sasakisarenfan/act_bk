package form;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class act_book extends JFrame{
	act_book() {
		String a[] = {"일 자","항 목","수 입","지 출","잔 액"};
		String b[][] = {
				{"1","10","100","11","12"},
				{"2","20","110","123","1221"}
		};
		JLabel la1 = new JLabel("일자");
		JTable table = new JTable(b,a);
		JScrollPane scrollpane = new JScrollPane(table);
		setTitle("account_book");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		la1.setHorizontalAlignment(JLabel.LEFT);
		
		scrollpane.setPreferredSize(new Dimension(680,100));
		c.add(scrollpane);
		c.add(la1);
		c.add(new JTextField(20));
		
		setSize(700,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new act_book();
	}

}
