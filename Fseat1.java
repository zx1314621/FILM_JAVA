package cn.edu.usst.freedom;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fseat1 extends JFrame {

	static int number;
	private JPanel contentPane;
	public static JTextArea textArea = new JTextArea();
	private String str="你已选的座位为:";
	static Film test;
	static Function f=new Function();
	static boolean[][] seat2s;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fseat frame = new Fseat();
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
	public Fseat1() {
		number=0;
		test=f.getFilm();
		seat2s=new boolean[5][5];
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				seat2s[i][j]=true;
			}
		}
		setTitle("\u8BF7\u9009\u62E9\u60A8\u7684\u5EA7\u4F4D");
		setBounds(100, 100, 500, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("bar.png"));
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(5, 5, 0, 0));
		
		final JButton btn11 = new JButton("1\u63921\u5EA7");
		if(test.seat2s[0][0]==false){btn11.setBackground(SystemColor.info);}
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn11);
				number++;
				test.changeSeat2s(0,0);
			}
		});
		panel.add(btn11);
		
		final JButton btn12 = new JButton("1\u63922\u5EA7");
		if(test.seat2s[0][1]==false){btn12.setBackground(SystemColor.info);}
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn12);
				number++;
				test.changeSeat2s(0,1);
			}
		});
		panel.add(btn12);
		
		final JButton btn13 = new JButton("1\u63923\u5EA7");
		if(test.seat2s[0][2]==false){btn13.setBackground(SystemColor.info);}
		btn13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn13);
				number++;
				test.changeSeat2s(0,2);
			}
		});
		panel.add(btn13);
		
		final JButton btn14 = new JButton("1\u63924\u5EA7");
		if(test.seat2s[0][3]==false){btn14.setBackground(SystemColor.info);}
		btn14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn14);
				number++;
				test.changeSeat2s(0,3);
			}
		});
		panel.add(btn14);
		
		final JButton btn15 = new JButton("1\u63925\u5EA7");
		if(test.seat2s[0][4]==false){btn15.setBackground(SystemColor.info);}
		btn15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn15);
				number++;
				test.changeSeat2s(0,4);
			}
		});
		panel.add(btn15);
		
		final JButton btn21 = new JButton("2\u63921\u5EA7");
		if(test.seat2s[1][0]==false){btn21.setBackground(SystemColor.info);}
		btn21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn21);
				number++;
				test.changeSeat2s(1,0);
			}
		});
		panel.add(btn21);
		
		final JButton btn22 = new JButton("2\u63922\u5EA7");
		if(test.seat2s[1][1]==false){btn22.setBackground(SystemColor.info);}
		btn22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn22);
				number++;
				test.changeSeat2s(1,1);
			}
		});
		panel.add(btn22);
		
		final JButton btn23 = new JButton("2\u63923\u5EA7");
		if(test.seat2s[1][2]==false){btn23.setBackground(SystemColor.info);}
		btn23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn23);
				number++;
				test.changeSeat2s(1,2);
			}
		});
		panel.add(btn23);
		
		final JButton btn24 = new JButton("2\u63924\u5EA7");
		if(test.seat2s[1][3]==false){btn24.setBackground(SystemColor.info);}
		btn24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn24);
				number++;
				test.changeSeat2s(1,3);
			}
		});
		panel.add(btn24);
		
		final JButton btn25 = new JButton("2\u63925\u5EA7");
		if(test.seat2s[1][4]==false){btn25.setBackground(SystemColor.info);}
		btn25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn25);
				number++;
				test.changeSeat2s(1,4);
			}
		});
		panel.add(btn25);
		
		final JButton btn31 = new JButton("3\u63921\u5EA7");
		if(test.seat2s[2][0]==false){btn31.setBackground(SystemColor.info);}
		btn31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn31);
				number++;
				test.changeSeat2s(2,0);
			}
		});
		panel.add(btn31);
		
		final JButton btn32 = new JButton("3\u63922\u5EA7");
		if(test.seat2s[2][1]==false){btn32.setBackground(SystemColor.info);}
		btn32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn32);
				number++;
				test.changeSeat2s(2,1);
			}
		});
		panel.add(btn32);
		
		final JButton btn33 = new JButton("3\u63923\u5EA7");
		if(test.seat2s[2][2]==false){btn33.setBackground(SystemColor.info);}
		btn33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn33);
				number++;
				test.changeSeat2s(2,2);
			}
		});
		panel.add(btn33);
		
		final JButton btn34 = new JButton("3\u63924\u5EA7");
		if(test.seat2s[2][3]==false){btn34.setBackground(SystemColor.info);}
		btn34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn34);
				number++;
				test.changeSeat2s(2,3);
			}
		});
		panel.add(btn34);
		
		final JButton btn35 = new JButton("3\u63925\u5EA7");
		if(test.seat2s[2][4]==false){btn35.setBackground(SystemColor.info);}
		btn35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn35);
				number++;
				test.changeSeat2s(2,4);
			}
		});
		panel.add(btn35);
		
		final JButton btn41 = new JButton("4\u63921\u5EA7");
		if(test.seat2s[3][0]==false){btn41.setBackground(SystemColor.info);}
		btn41.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn41);
				number++;
				test.changeSeat2s(3,0);
			}
		});
		panel.add(btn41);
		
		final JButton btn42 = new JButton("4\u63922\u5EA7");
		if(test.seat2s[3][1]==false){btn42.setBackground(SystemColor.info);}
		btn42.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn42);
				number++;
				test.changeSeat2s(3,1);
			}
		});
		panel.add(btn42);
		
		final JButton btn43 = new JButton("4\u63923\u5EA7");
		if(test.seat2s[3][2]==false){btn43.setBackground(SystemColor.info);}
		btn43.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn43);
				number++;
				test.changeSeat2s(3,2);
			}
		});
		panel.add(btn43);
		
		final JButton btn44 = new JButton("4\u63924\u5EA7");
		if(test.seat2s[3][3]==false){btn44.setBackground(SystemColor.info);}
		btn44.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn44);
				number++;
				test.changeSeat2s(3,3);
			}
		});
		panel.add(btn44);
		
		final JButton btn45 = new JButton("4\u63925\u5EA7");
		if(test.seat2s[3][4]==false){btn45.setBackground(SystemColor.info);}
		btn45.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn45);
				number++;
				test.changeSeat2s(3,4);
			}
		});
		panel.add(btn45);
		
		final JButton btn51 = new JButton("5\u63921\u5EA7");
		if(test.seat2s[4][0]==false){btn51.setBackground(SystemColor.info);}
		btn51.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn51);
				number++;
				test.changeSeat2s(4,0);
			}
		});
		panel.add(btn51);
		
		final JButton btn52 = new JButton("5\u63922\u5EA7");
		if(test.seat2s[4][1]==false){btn52.setBackground(SystemColor.info);}
		btn52.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn52);
				number++;
				test.changeSeat2s(4,1);
			}
		});
		panel.add(btn52);
		
		final JButton btn53 = new JButton("5\u63923\u5EA7");
		if(test.seat2s[4][2]==false){btn53.setBackground(SystemColor.info);}
		btn53.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn53);
				number++;
				test.changeSeat2s(4,2);
			}
		});
		panel.add(btn53);
		
		final JButton btn54 = new JButton("5\u63924\u5EA7");
		if(test.seat2s[4][3]==false){btn54.setBackground(SystemColor.info);}
		btn54.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn54);
				number++;
				test.changeSeat2s(4,3);
			}
		});
		panel.add(btn54);
		
		final JButton btn55 = new JButton("5\u63925\u5EA7");
		if(test.seat2s[4][4]==false){btn55.setBackground(SystemColor.info);}
		btn55.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn55);
				number++;
				test.changeSeat2s(4,4);
			}
		});
		panel.add(btn55);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("bar1.png"));
		contentPane.add(lblNewLabel_1, BorderLayout.WEST);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("bar1.png"));
		contentPane.add(lblNewLabel_2, BorderLayout.EAST);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.NORTH);
		panel_2.setLayout(new BorderLayout(0, 0));
		textArea.setRows(3);
		textArea.setLineWrap(true);
		textArea.setFont(new Font("微软雅黑", Font.PLAIN, 13));
		
		//JTextArea textArea = new JTextArea();
		textArea.setBackground(SystemColor.info);
		panel_2.add(textArea);
		//textArea.setText(str);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		
		JButton btnNewButton = new JButton("\u786E\u8BA4");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							System.out.println(number);
							Flist frame = new Flist();
							frame.setVisible(true);
							System.out.println(number);
							str=" ";
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnNewButton.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		panel_3.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u91CD\u7F6E");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str="";
				textArea.setText(str);
				reset(btn11);reset(btn12);reset(btn13);reset(btn14);reset(btn15);
				reset(btn21);reset(btn22);reset(btn23);reset(btn24);reset(btn25);
				reset(btn31);reset(btn32);reset(btn33);reset(btn34);reset(btn35);
				reset(btn41);reset(btn42);reset(btn43);reset(btn44);reset(btn45);
				reset(btn51);reset(btn52);reset(btn53);reset(btn54);reset(btn55);
				str="你已选的座位为:";
				for(int i=0;i<5;i++)
				{
					for(int j=0;j<5;j++){
						test.seat2s[i][j]=true;
					}
				}
				number=0;
			}
		});
		btnNewButton_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		panel_3.add(btnNewButton_1);
	}
	void print(JButton btn){
		str=str+"  "+btn.getText();
		btn.setBackground(SystemColor.info);
		textArea.setText(str);
		
	}
	
	void reset(JButton btn){
		btn.setBackground(null);
	}
	int getnumber()
	{
		return number;
	}

}
