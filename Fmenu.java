package cn.edu.usst.freedom;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;

import recharge.ReCharge;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import luckydraw.*;

public class Fmenu extends JFrame {

	private JPanel contentPane;
	static  ArrayList<User> user=new  ArrayList<User>();
	static Function f=new Function();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fmenu frame = new Fmenu();
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
	public Fmenu() {
		setTitle("\u83DC\u5355");
		setBounds(100, 100, 450, 454);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 0, 0, 0));
		
		JButton btnNewButton = new JButton("\u67E5\u8BE2\u8D26\u6237\u4FE1\u606F");
		btnNewButton.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Finfo frame = new Finfo();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u7535\u5F71\u8D2D\u7968");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Ffilm frame = new Ffilm();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
				
			}
		});
		btnNewButton_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u8D26\u6237\u5145\u503C");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							ReCharge frame = new ReCharge();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnNewButton_2.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("留下影评");
		btnNewButton_3.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\u652F\u4ED8\u5341\u5143\u62BD\u7CBE\u7F8E\u5956\u54C1");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Fhint3 frame = new Fhint3();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnNewButton_4.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("\u8054\u7CFB\u5BA2\u670D");
		btnNewButton_5.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		contentPane.add(btnNewButton_5);
	}
	

}
