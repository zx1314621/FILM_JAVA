package recharge;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;

import cn.edu.usst.freedom.User;

import java.awt.Font;

public class Fhint6 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	static User test=new User();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fhint6 frame = new Fhint6();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Fhint6() {
		ReCharge re=new ReCharge();
		test=re.getUser();
		String str;
		str=" "+test.balance;
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel label = new JLabel("\u5145\u503C\u6210\u529F\uFF01");
		label.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label);
		
		textField = new JTextField();
		textField.setText("余额为:"+str);
		textField.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new BorderLayout(0, 0));
	}

}
