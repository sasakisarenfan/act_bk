package form;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;
import java.security.PublicKey;
import java.util.Iterator;

import javax.management.modelmbean.ModelMBean;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

class act_book extends JFrame{
	
	act_book() {
		
		Font f1;
		
		String a[] = {"일 자","항 목","수 입","지 출","잔 액"};
		String b[][] = {};
		
		DefaultTableModel model = new DefaultTableModel(b,a);
		JTable table = new JTable(model);
		JScrollPane scrollpane = new JScrollPane(table);
		
		JLabel date_label = new JLabel("일자");
		JLabel category_label = new JLabel("항목");
		JLabel income_label = new JLabel("수입");
		JLabel spending_label = new JLabel("지출");

		JTextField date_field = new JTextField(20);
		JTextField category_field = new JTextField(20);
		JTextField income_field = new JTextField(20);
		JTextField spending_field = new JTextField(20);

		JButton new_btn = new JButton("새항목");
		JButton save_btn = new JButton("저장");
		
		JTextField balance_field = new JTextField(20);
		
		this.setBackground(Color.WHITE);
		
		f1 = new Font("굴림",Font.PLAIN,30);
		
		scrollpane.setBounds(10,10,670,200);

		date_label.setBounds(70,240,50,50);
		category_label.setBounds(320,240,50,50);
		income_label.setBounds(70,300,50,50);
		spending_label.setBounds(320,300,50,50);

		date_field.setBounds(100,255,150,20);
		category_field.setBounds(350,255,150,20);
		income_field.setBounds(100,315,150,20);
		spending_field.setBounds(350,315,150,20);
		
		new_btn.setBounds(600,380,75,75);
		save_btn.setBounds(600,300,75,75);
		
		balance_field.setBounds(20,370,565,75);
		
		balance_field.setHorizontalAlignment(JTextField.CENTER);
		
		balance_field.setFont(f1);
		
		setTitle("account_book");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		scrollpane.setPreferredSize(new Dimension(680,200));
		
		setSize(700,500);
		
		setVisible(true);
		
		setResizable(false);
		
		setLocationRelativeTo(null);
		
		setLayout(null);
		
		table.setEnabled(false);
		
		getContentPane().add(scrollpane);

		getContentPane().add(date_label);
		getContentPane().add(category_label);
		getContentPane().add(income_label);
		getContentPane().add(spending_label);

		getContentPane().add(date_field);
		getContentPane().add(category_field);	
		getContentPane().add(income_field);
		getContentPane().add(spending_field);
		
		getContentPane().add(new_btn);
		getContentPane().add(save_btn);
		
		getContentPane().add(balance_field);
		
		new_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String str_count[] = new String[5];
				
				str_count[0] = date_field.getText();
				str_count[1] = category_field.getText();
				str_count[2] = income_field.getText();
				str_count[3] = spending_field.getText();
				str_count[4] = balance_field.getText();
				
				model.addRow(str_count);
				
				date_field.setText("");
				category_field.setText("");
				income_field.setText("");
				spending_field.setText("");
				balance_field.setText("");
			}
			
		});
		
	}
	
	public static void main(String[] args) {
		new act_book();
	}

}
