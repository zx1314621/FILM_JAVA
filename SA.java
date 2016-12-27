package cn.edu.usst.freedom;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.DropMode;
import javax.swing.JPasswordField;

public class SA {

	private JFrame frmyu;
	private JTextField textField;
	static Function f=new Function();
	private JTextField textField_1;
	
	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SA window = new SA();
					window.frmyu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		
		
		
		
		
	}

	/**
	 * Create the application.
	 */
	public SA() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmyu = new JFrame();
		frmyu.setTitle("\u6B22\u8FCE\u4F7F\u7528YU\u7535\u5F71\u8D2D\u7968\u7CFB\u7EDF");
		frmyu.setBounds(100, 100, 406, 755);
		frmyu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmyu.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		frmyu.getContentPane().add(panel, "name_10307380595423");
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("");
		panel_1.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("E:\\JaveDev\\workspace\\testStatic\\icon.png"));
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_2.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(240, 248, 255));
		panel_3.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("\u7528\u6237\u540D\uFF1A");
		lblNewLabel_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 20));
		lblNewLabel_1.setIcon(new ImageIcon("E:\\JaveDev\\workspace\\testStatic\\icon01.jpg"));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBackground(new Color(240, 255, 240));
		textField.setText("\u8BF7\u8F93\u5165\u60A8\u7684\u7528\u6237\u540D");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 20));
		panel_3.add(textField);
		textField.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_2.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(240, 248, 255));
		panel_4.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("\u5BC6\u7801\uFF1A");
		lblNewLabel_2.setBackground(new Color(173, 216, 230));
		lblNewLabel_2.setIcon(new ImageIcon("E:\\JaveDev\\workspace\\testStatic\\icon02.png"));
		lblNewLabel_2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		panel_4.add(textField_1);
		textField_1.setText("\u8BF7\u8F93\u5165\u60A8\u7684\u7528\u6237\u540D");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(240, 255, 240));
		
		JPanel panel_5 = new JPanel();
		panel_2.add(panel_5);
		panel_5.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton btnNewButton = new JButton("\u767B\u5F55");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (f.signin(textField.getText(), textField_1.getText())==true) {
					
					EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Fhint4 frame = new Fhint4();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
					
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
				
				
				else 
					EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Fhint2 frame = new Fhint2();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
			}
		});
		btnNewButton.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 20));
		panel_5.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u6CE8\u518C");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Fregister frame = new Fregister();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 20));
		panel_5.add(btnNewButton_1);
	}
}
