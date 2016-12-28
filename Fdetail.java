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
		slider.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 20));
		slider.setBorder(new TitledBorder(new CompoundBorder(UIManager.getBorder("Button.border"), new CompoundBorder(null, UIManager.getBorder("CheckBoxMenuItem.border"))), "\u8BC4\u5206  "+test.mark, TitledBorder.CENTER, TitledBorder.TOP, null, new Color(64, 64, 64)));
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		
		JScrollPane scrollPane = new JScrollPane();
		panel_3.add(scrollPane);
		scrollPane.setBounds(0, 59, 257, 191);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(SystemColor.info);
		textArea.setText("\u300A\u4F60\u7684\u540D\u5B57\u300B\u662F\u7531\u65B0\u6D77\u8BDA\u6267\u5BFC\u7684\u4E00\u90E8\u65E5\u672C\u52A8\u753B\u7535\u5F71\uFF0C\u7531\u795E\u6728\u9686\u4E4B\u4ECB\u3001\u4E0A\u767D\u77F3\u840C\u97F3\u62C5\u4EFB\u4E3B\u8981\u914D\u97F3\u6F14\u5458\uFF0C\u4EBA\u8BBE\u662F\u7531\u53C2\u4E0E\u8FC7\u300A\u6211\u4EEC\u4ECD\u672A\u77E5\u9053\u90A3\u5929\u6240\u770B\u89C1\u7684\u82B1\u7684\u540D\u5B57\u3002\u300B\u7684\u7530\u4E2D\u5C06\u8D3A\u62C5\u5F53\uFF0C\u4F5C\u753B\u5BFC\u6F14\u7531\u66FE\u521B\u4F5C\u8FC7\u300A\u5343\u4E0E\u5343\u5BFB\u300B\u3001\u300A\u5E7D\u7075\u516C\u4E3B\u300B\u7684\u5B89\u85E4\u96C5\u53F8\u6267\u7B14\u3002\u4F5C\u54C1\u4E8E2016\u5E748\u670826\u65E5\u5728\u65E5\u672C\u4E0A\u6620\u3002\u4E2D\u56FD\u5185\u5730\u4E8E2016\u5E7412\u67082\u65E5\u4E0A\u6620\uFF0C\u5206\u4E3A\u65E5\u8BED\u539F\u58F0\u4E2D\u6587\u5B57\u5E55\u7248\u548C\u4E2D\u6587\u914D\u97F3\u72482\u79CD\u7248\u672C\u3002\u4F5C\u54C1\u8BB2\u8FF0\u4E86\u7537\u5973\u9AD8\u4E2D\u751F\u5728\u68A6\u4E2D\u76F8\u9047\u7684\u5E7B\u60F3\u6545\u4E8B\u3002\u300A\u4F60\u7684\u540D\u5B57\u300B\u662F\u7531\u65B0\u6D77\u8BDA\u6267\u5BFC\u7684\u4E00\u90E8\u65E5\u672C\u52A8\u753B\u7535\u5F71\uFF0C\u7531\u795E\u6728\u9686\u4E4B\u4ECB\u3001\u4E0A\u767D\u77F3\u840C\u97F3\u62C5\u4EFB\u4E3B\u8981\u914D\u97F3\u6F14\u5458\uFF0C\u4EBA\u8BBE\u662F\u7531\u53C2\u4E0E\u8FC7\u300A\u6211\u4EEC\u4ECD\u672A\u77E5\u9053\u90A3\u5929\u6240\u770B\u89C1\u7684\u82B1\u7684\u540D\u5B57\u3002\u300B\u7684\u7530\u4E2D\u5C06\u8D3A\u62C5\u5F53\uFF0C\u4F5C\u753B\u5BFC\u6F14\u7531\u66FE\u521B\u4F5C\u8FC7\u300A\u5343\u4E0E\u5343\u5BFB\u300B\u3001\u300A\u5E7D\u7075\u516C\u4E3B\u300B\u7684\u5B89\u85E4\u96C5\u53F8\u6267\u7B14\u3002\u4F5C\u54C1\u4E8E2016\u5E748\u670826\u65E5\u5728\u65E5\u672C\u4E0A\u6620\u3002\u4E2D\u56FD\u5185\u5730\u4E8E2016\u5E7412\u67082\u65E5\u4E0A\u6620\uFF0C\u5206\u4E3A\u65E5\u8BED\u539F\u58F0\u4E2D\u6587\u5B57\u5E55\u7248\u548C\u4E2D\u6587\u914D\u97F3\u72482\u79CD\u7248\u672C\u3002\u4F5C\u54C1\u8BB2\u8FF0\u4E86\u7537\u5973\u9AD8\u4E2D\u751F\u5728\u68A6\u4E2D\u76F8\u9047\u7684\u5E7B\u60F3\u6545\u4E8B\u3002");
		textArea.setLineWrap(true);
		textArea.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		textArea.setEditable(false);
		textArea.setBounds(0, 59, 257, 191);
		panel_3.add(textArea);
		//scrollPane.setViewportView(textArea);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(3, 2, 0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.inactiveCaptionBorder);
		FlowLayout flowLayout = (FlowLayout) panel_4.getLayout();
		flowLayout.setVgap(25);
		panel_1.add(panel_4);
		
		JLabel label_1 = new JLabel("10:00 \u5F00\u59CB");
		label_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 20));
		panel_4.add(label_1);
		
		JPanel panel_5 = new JPanel();
		panel_1.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("\u7535\u5F71\u9662\u7EBF");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 20));
		panel_5.add(btnNewButton);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(SystemColor.inactiveCaption);
		FlowLayout flowLayout_1 = (FlowLayout) panel_6.getLayout();
		flowLayout_1.setVgap(25);
		panel_1.add(panel_6);
		
		JLabel label_2 = new JLabel("18:00 \u5F00\u59CB");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 20));
		panel_6.add(label_2);
		
		JPanel panel_7 = new JPanel();
		panel_1.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton_1 = new JButton("\u5C31\u8FD1\u5206\u914D");
		btnNewButton_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 20));
		panel_7.add(btnNewButton_1);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(SystemColor.activeCaption);
		FlowLayout flowLayout_2 = (FlowLayout) panel_8.getLayout();
		flowLayout_2.setVgap(25);
		panel_1.add(panel_8);
		
		JLabel label_3 = new JLabel("22:00 \u5F00\u59CB");
		label_3.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 20));
		panel_8.add(label_3);
		
		JPanel panel_9 = new JPanel();
		panel_1.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton_2 = new JButton("\u70B9\u51FB\u9009\u5EA7");
		btnNewButton_2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 20));
		panel_9.add(btnNewButton_2);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(3, 2, 0, 0));
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(255, 228, 196));
		FlowLayout flowLayout_3 = (FlowLayout) panel_10.getLayout();
		flowLayout_3.setVgap(25);
		panel_2.add(panel_10);
		
		JLabel lblNewLabel_1 = new JLabel("\u7535\u5F71\u8BC4\u8BBA\u533A");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_10.add(lblNewLabel_1);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(255, 228, 196));
		panel_2.add(panel_11);
		
		JLabel lblNewLabel_2 = new JLabel("");
		panel_11.add(lblNewLabel_2);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setWrapStyleWord(true);
		textArea_1.setLineWrap(true);
		textArea_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		textArea_1.setBackground(new Color(255, 228, 181));
		panel_2.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setWrapStyleWord(true);
		textArea_2.setLineWrap(true);
		textArea_2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		textArea_2.setBackground(new Color(255, 228, 181));
		panel_2.add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setWrapStyleWord(true);
		textArea_3.setLineWrap(true);
		textArea_3.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		textArea_3.setBackground(new Color(255, 222, 173));
		panel_2.add(textArea_3);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setWrapStyleWord(true);
		textArea_4.setLineWrap(true);
		textArea_4.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		textArea_4.setBackground(new Color(255, 222, 173));
		panel_2.add(textArea_4);
		
	}
}
