package cn.edu.usst.freedom;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JInternalFrame;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JSplitPane;

public class F extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					F frame = new F();
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
	public F() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setText("\u300A\u4F60\u7684\u540D\u5B57\u300B\u662F\u7531\u65B0\u6D77\u8BDA\u6267\u5BFC\u7684\u4E00\u90E8\u65E5\u672C\u52A8\u753B\u7535\u5F71\uFF0C\u7531\u795E\u6728\u9686\u4E4B\u4ECB\u3001\u4E0A\u767D\u77F3\u840C\u97F3\u62C5\u4EFB\u4E3B\u8981\u914D\u97F3\u6F14\u5458\uFF0C\u4EBA\u8BBE\u662F\u7531\u53C2\u4E0E\u8FC7\u300A\u6211\u4EEC\u4ECD\u672A\u77E5\u9053\u90A3\u5929\u6240\u770B\u89C1\u7684\u82B1\u7684\u540D\u5B57\u3002\u300B\u7684\u7530\u4E2D\u5C06\u8D3A\u62C5\u5F53\uFF0C\u4F5C\u753B\u5BFC\u6F14\u7531\u66FE\u521B\u4F5C\u8FC7\u300A\u5343\u4E0E\u5343\u5BFB\u300B\u3001\u300A\u5E7D\u7075\u516C\u4E3B\u300B\u7684\u5B89\u85E4\u96C5\u53F8\u6267\u7B14\u3002\u4F5C\u54C1\u4E8E2016\u5E748\u670826\u65E5\u5728\u65E5\u672C\u4E0A\u6620\u3002\u4E2D\u56FD\u5185\u5730\u4E8E2016\u5E7412\u67082\u65E5\u4E0A\u6620\uFF0C\u5206\u4E3A\u65E5\u8BED\u539F\u58F0\u4E2D\u6587\u5B57\u5E55\u7248\u548C\u4E2D\u6587\u914D\u97F3\u72482\u79CD\u7248\u672C\u3002\u4F5C\u54C1\u8BB2\u8FF0\u4E86\u7537\u5973\u9AD8\u4E2D\u751F\u5728\u68A6\u4E2D\u76F8\u9047\u7684\u5E7B\u60F3\u6545\u4E8B\u3002");
		contentPane.add(textArea);
	}

}
