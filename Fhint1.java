package luckydraw;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.DropMode;
import java.awt.Font;
import javax.swing.SwingConstants;

import cn.edu.usst.freedom.User;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fhint1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	static User user=new User();
	static Fhint3 f3=new Fhint3();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fhint1 frame = new Fhint1();
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
	public Fhint1() {
		user=f3.getUser();
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		user.luckDraw();
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("\u60A8\u5C06\u6D88\u8D39\u5341\u5143\uFF01\u8D26\u6237\u4F59\u989D\u4E3A\uFF1A"+user.balance);
		textField.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		textField.setEditable(false);
		panel.add(textField, BorderLayout.CENTER);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u786E\u8BA4");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
		            public void run() {
		                try {
		                    Demo frame = new Demo();
		                    frame.setVisible(true);
		                } catch (Exception e) {
		                    e.printStackTrace();
		                }
		            }
		        });
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
	}

}
