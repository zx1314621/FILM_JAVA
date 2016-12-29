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

public class Fseat extends JFrame {

	static int number=0;
	private JPanel contentPane;
	public static JTextArea textArea = new JTextArea();
	private String str="ÄúÑ¡µÄ×ùÎ»Îª£º";
	static Film test;
	static Function f=new Function();
	static boolean[][] seats;
	
	
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
	public Fseat() {
		number=0;
		test=f.getFilm();
		seats=new boolean[5][5];
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				seats[i][j]=true;
			}
		}
		setTitle("\u8BF7\u9009\u62E9\u60A8\u7684\u5EA7\u4F4D");
		setBounds(100, 100, 500, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Freedom\\Documents\\JavaWorkSpace\\testStatic\\bar.png"));
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(5, 5, 0, 0));
		
		final JButton btn11 = new JButton("1\u63921\u5EA7");
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn11);
				number++;
				test.changeSeats(0,0);
			}
		});
		panel.add(btn11);
		
		final JButton btn12 = new JButton("1\u63922\u5EA7");
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn12);
				number++;
				test.changeSeats(0,1);
			}
		});
		panel.add(btn12);
		
		final JButton btn13 = new JButton("1\u63923\u5EA7");
		btn13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn13);
				number++;
				test.changeSeats(0,2);
			}
		});
		panel.add(btn13);
		
		final JButton btn14 = new JButton("1\u63924\u5EA7");
		btn14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn14);
				number++;
				test.changeSeats(0,3);
			}
		});
		panel.add(btn14);
		
		final JButton btn15 = new JButton("1\u63925\u5EA7");
		btn15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn15);
				number++;
				test.changeSeats(0,4);
			}
		});
		panel.add(btn15);
		
		final JButton btn21 = new JButton("2\u63921\u5EA7");
		btn21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn21);
				number++;
				test.changeSeats(1,0);
			}
		});
		panel.add(btn21);
		
		final JButton btn22 = new JButton("2\u63922\u5EA7");
		btn22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn22);
				number++;
				test.changeSeats(1,1);
			}
		});
		panel.add(btn22);
		
		final JButton btn23 = new JButton("2\u63923\u5EA7");
		btn23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn23);
				number++;
				test.changeSeats(1,2);
			}
		});
		panel.add(btn23);
		
		final JButton btn24 = new JButton("2\u63924\u5EA7");
		btn24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn24);
				number++;
				test.changeSeats(1,3);
			}
		});
		panel.add(btn24);
		
		final JButton btn25 = new JButton("2\u63925\u5EA7");
		btn25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn25);
				number++;
				test.changeSeats(1,4);
			}
		});
		panel.add(btn25);
		
		final JButton btn31 = new JButton("3\u63921\u5EA7");
		btn31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn31);
				number++;
				test.changeSeats(2,0);
			}
		});
		panel.add(btn31);
		
		final JButton btn32 = new JButton("3\u63922\u5EA7");
		btn32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn32);
				number++;
				test.changeSeats(2,1);
			}
		});
		panel.add(btn32);
		
		final JButton btn33 = new JButton("3\u63923\u5EA7");
		btn33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn33);
				number++;
				test.changeSeats(2,2);
			}
		});
		panel.add(btn33);
		
		final JButton btn34 = new JButton("3\u63924\u5EA7");
		btn34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn34);
				number++;
				test.changeSeats(2,3);
			}
		});
		panel.add(btn34);
		
		final JButton btn35 = new JButton("3\u63925\u5EA7");
		btn35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn35);
				number++;
				test.changeSeats(2,4);
			}
		});
		panel.add(btn35);
		
		final JButton btn41 = new JButton("4\u63921\u5EA7");
		btn41.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn41);
				number++;
				test.changeSeats(3,0);
			}
		});
		panel.add(btn41);
		
		final JButton btn42 = new JButton("4\u63922\u5EA7");
		btn42.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn42);
				number++;
				test.changeSeats(3,1);
			}
		});
		panel.add(btn42);
		
		final JButton btn43 = new JButton("4\u63923\u5EA7");
		btn43.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn43);
				number++;
				test.changeSeats(3,2);
			}
		});
		panel.add(btn43);
		
		final JButton btn44 = new JButton("4\u63924\u5EA7");
		btn44.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn44);
				number++;
				test.changeSeats(3,3);
			}
		});
		panel.add(btn44);
		
		final JButton btn45 = new JButton("4\u63925\u5EA7");
		btn45.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn45);
				number++;
				test.changeSeats(3,4);
			}
		});
		panel.add(btn45);
		
		final JButton btn51 = new JButton("5\u63921\u5EA7");
		btn51.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn51);
				number++;
				test.changeSeats(4,0);
			}
		});
		panel.add(btn51);
		
		final JButton btn52 = new JButton("5\u63922\u5EA7");
		btn52.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn52);
				number++;
				test.changeSeats(4,1);
			}
		});
		panel.add(btn52);
		
		final JButton btn53 = new JButton("5\u63923\u5EA7");
		btn53.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn53);
				number++;
				test.changeSeats(4,2);
			}
		});
		panel.add(btn53);
		
		final JButton btn54 = new JButton("5\u63924\u5EA7");
		btn54.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn54);
				number++;
				test.changeSeats(4,3);
			}
		});
		panel.add(btn54);
		
		final JButton btn55 = new JButton("5\u63925\u5EA7");
		btn55.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(btn55);
				number++;
				test.changeSeats(4,4);
			}
		});
		panel.add(btn55);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Freedom\\Documents\\JavaWorkSpace\\testStatic\\bar1.png"));
		contentPane.add(lblNewLabel_1, BorderLayout.WEST);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Freedom\\Documents\\JavaWorkSpace\\testStatic\\bar1.png"));
		contentPane.add(lblNewLabel_2, BorderLayout.EAST);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.NORTH);
		panel_2.setLayout(new BorderLayout(0, 0));
		textArea.setRows(3);
		textArea.setLineWrap(true);
		textArea.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 13));
		
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
							Flist frame = new Flist();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnNewButton.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 20));
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
				str="ÄúÑ¡µÄ×ùÎ»Îª£º";
				for(int i=0;i<5;i++)
				{
					for(int j=0;j<5;j++){
						test.resetSeats(i, j);
					}
				}
			}
		});
		btnNewButton_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 20));
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
