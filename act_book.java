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
import javax.swing.JTextArea;
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
		JLabel la2 = new JLabel("항목");
		JTextField txtfield2 = new JTextField(20);
		JLabel la3 = new JLabel("수입");
		JTextField txtfield3 = new JTextField(20);
		JLabel la4 = new JLabel("지출");
		JTextField txtfield4 = new JTextField(20);
		JButton btn1 = new JButton("저장");
		JTextArea txtarea = new JTextArea(5,20);
		
		btn1.setBounds(600,380,75,75);
		scrollpane.setBounds(10,10,670,200);
		la1.setBounds(70,240,50,50);
		txtfield.setBounds(100,255,150,20);
		la2.setBounds(320,240,50,50);
		txtfield2.setBounds(350,255,150,20);
		la3.setBounds(70,300,50,50);
		txtfield3.setBounds(100,315,150,20);
		la4.setBounds(320,300,50,50);
		txtfield4.setBounds(350,315,150,20);
		btn0.setBounds(600,300,75,75);
		txtarea.setBounds(20,370,565,75);
		
		setTitle("account_book");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		scrollpane.setPreferredSize(new Dimension(680,200));
		setSize(700,500);
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		scrollpane.setEnabled(false);
		getContentPane().add(btn0);
		getContentPane().add(scrollpane);
		getContentPane().add(la1);
		getContentPane().add(txtfield);
		getContentPane().add(la2);	
		getContentPane().add(txtfield2);
		getContentPane().add(la3);
		getContentPane().add(txtfield3);
		getContentPane().add(la4);
		getContentPane().add(txtfield4);
		getContentPane().add(btn1); 
		getContentPane().add(txtarea);
	}
	public static void main(String[] args) {
		new act_book();
	}

}
