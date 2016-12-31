package cn.edu.usst.freedom;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;

import luckydraw.Fhint8;

public class Flist1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	static Film test;
	static int number;
	static int money;
	static Function f=new Function();
	static Fseat fs=new Fseat();   
	private JTextField textField;
	static String seat=" ";
	static User user=new User();
	static String [] cname = new String [10];

	    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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

	/**
	 * Create the frame.
	 */
	public Flist1() {
		
		cname[0] = new String("SFC上海影城");
		cname[1] = new String("大光明电影院");
		cname[2] = new String("大上海电影院");
		cname[3] = new String("海上影城环球港店");
		cname[4] = new String("博纳银兴国际影城");
		cname[5] = new String("长风华谊兄弟影院");
		cname[6] = new String("中影国际影城上海合生汇店");
		cname[7] = new String("中影UL影院隆昌店");
		cname[8] = new String("松江太平洋电影城");
		cname[9] = new String("海艺数字影城");

		
		number=fs.getnumber();
		user=f.getUser();
		System.out.println(number);
		seat=" ";
		String line =" ";
		String row =" ";
		test=f.getFilm();
		money=test.price*number;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(test.seat2s[i][j]==false)
				{
					if(i==0){line="第一排";}
					else if(i==1){line="第二排";}
					else if(i==2){line="第三排";}	
					else if(i==3){line="第四排";}
					else if(i==4){line="第五排";}
					if(j==0){row="第一座";}
					else if(j==1){row="第二座";}
					else if(j==2){row="第三座";}
					else if(j==3){row="第四座";}
					else if(j==4){row="第五座";}
					seat=seat+" "+line+row;
				}
				
			}
		}
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("请确认信息");
		lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("\u7535\u5F71\u540D");
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		textField_1.setEditable(false);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setText(test.name);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("\u5EA7\u4F4D");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		panel_2.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		textField.setEditable(false);
		textField.setText(seat);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\u5DF2\u4E3A\u60A8\u5339\u914D\u6700\u8FD1\u5F71\u9662");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		panel_2.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		textField_2.setEditable(false);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setText(this.getCinema());
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\u603B\u4EF7\u683C");
		lblNewLabel_2.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		textField_3.setEditable(false);
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setText(""+money+"元");
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3, BorderLayout.SOUTH);
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton btnNewButton = new JButton("\u786E\u5B9A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(f.getCinema());
				if(user.balance>=money){EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							user.consume(money);
							user.addTicket(number);
							Consume frame = new Consume();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});setVisible(false);}
				else{EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Fhint8 frame = new Fhint8();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});setVisible(false);}
			}
		});
		btnNewButton.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		panel_3.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u53D6\u6D88");
		btnNewButton_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		panel_3.add(btnNewButton_1);
	}

	User getUser(){
		return user;
	}
	String getCinema(){
		int i;
		String str;
		Random random=new Random();
		i=random.nextInt(10);
		str=cname[i];
		return str;
	}
}
