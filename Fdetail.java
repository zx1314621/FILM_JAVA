package cn.edu.usst.freedom;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSlider;
import javax.swing.UIManager;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import java.awt.Font;
import javax.swing.border.CompoundBorder;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import javax.swing.DropMode;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fdetail extends JFrame {

	private JPanel contentPane;
    static Film test;
    static Function f=new Function();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fdetail frame = new Fdetail();
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
	public Fdetail() {
		test=f.getFilm();
		setBounds(500, 25, 540, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 1, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(test.pic));
		panel.add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JSlider slider = new JSlider();
		slider.setEnabled(false);
		slider.setValue(test.mark);
		slider.setBounds(0, 0, 257, 59);
		panel_3.add(slider);
		slider.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		slider.setBorder(new TitledBorder(new CompoundBorder(UIManager.getBorder("Button.border"), new CompoundBorder(null, UIManager.getBorder("CheckBoxMenuItem.border"))), "\u8BC4\u5206  "+test.mark, TitledBorder.CENTER, TitledBorder.TOP, null, new Color(64, 64, 64)));
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		
		JScrollPane scrollPane = new JScrollPane();
		panel_3.add(scrollPane);
		scrollPane.setBounds(0, 59, 257, 191);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(SystemColor.info);
		textArea.setText(test.brief);
		textArea.setLineWrap(true);
		textArea.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		textArea.setEditable(false);
		textArea.setBounds(0, 59, 257, 191);
		panel_3.add(textArea);
		scrollPane.setViewportView(textArea);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(3, 2, 0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.inactiveCaptionBorder);
		FlowLayout flowLayout = (FlowLayout) panel_4.getLayout();
		flowLayout.setVgap(25);
		panel_1.add(panel_4);
		
		JLabel label_1 = new JLabel("电影院线");
		label_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		panel_4.add(label_1);
		
		JPanel panel_5 = new JPanel();
		panel_1.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("10:00开始");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		panel_5.add(btnNewButton);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(SystemColor.inactiveCaption);
		FlowLayout flowLayout_1 = (FlowLayout) panel_6.getLayout();
		flowLayout_1.setVgap(25);
		panel_1.add(panel_6);
		
		JLabel label_2 = new JLabel("就近分配");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		panel_6.add(label_2);
		
		JPanel panel_7 = new JPanel();
		panel_1.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton_1 = new JButton("18:00开始");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							
							Fseat1 frame = new Fseat1();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnNewButton_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		panel_7.add(btnNewButton_1);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(SystemColor.activeCaption);
		FlowLayout flowLayout_2 = (FlowLayout) panel_8.getLayout();
		flowLayout_2.setVgap(25);
		panel_1.add(panel_8);
		
		JLabel label_3 = new JLabel("点击选座");
		label_3.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		panel_8.add(label_3);
		
		JPanel panel_9 = new JPanel();
		panel_1.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton_2 = new JButton("22:00开始");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Fseat2 frame = new Fseat2();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnNewButton_2.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		panel_9.add(btnNewButton_2);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(255, 228, 196));
		panel_2.add(panel_10, BorderLayout.NORTH);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("\u7535\u5F71\u8BC4\u8BBA\u533A");
		panel_10.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_11 = new JPanel();
		panel_2.add(panel_11);
		panel_11.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 514, 221);
		panel_11.add(scrollPane_1);
		
		JTextArea textArea_1 = new JTextArea();
		try {
			textArea_1.setText(f.getComments());
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		textArea_1.setWrapStyleWord(true);
		textArea_1.setBounds(0, 0, 514, 221);
		panel_11.add(textArea_1);
		textArea_1.setBackground(new Color(255, 222, 173));
		textArea_1.setEditable(false);
		textArea_1.setLineWrap(true);
		scrollPane_1.setViewportView(textArea_1);
		
		try {
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
}
