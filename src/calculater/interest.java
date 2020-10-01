package calculater;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Color;

import javax.swing.ImageIcon;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class interest extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					interest frame = new interest();
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
	public interest() {
		setBackground(Color.WHITE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\dell\\eclipse-workspace\\calculater\\src\\calculater\\banking_bank_interest-512.png"));
		setTitle("Interest Calculater");
		setBounds(100, 100, 634, 409);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 128));
		contentPane.setBackground(new Color(0, 0, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSimpleInterestCalculater = new JLabel("SIMPLE INTEREST CALCULATER");
		lblSimpleInterestCalculater.setForeground(new Color(255, 255, 255));
		lblSimpleInterestCalculater.setBackground(new Color(255, 255, 255));
		lblSimpleInterestCalculater.setHorizontalAlignment(SwingConstants.CENTER);
		lblSimpleInterestCalculater.setFont(new Font("Calibri", Font.BOLD, 22));
		lblSimpleInterestCalculater.setBounds(10, 11, 598, 40);
		contentPane.add(lblSimpleInterestCalculater);
		
		JLabel lblNewLabel = new JLabel("Principal Amount $");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Calibri Light", Font.BOLD, 18));
		lblNewLabel.setBounds(84, 79, 197, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Rate %");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Calibri Light", Font.BOLD, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(84, 123, 197, 33);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Time (month)");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Calibri Light", Font.BOLD, 18));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(84, 171, 197, 33);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Total Interest $");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Calibri Light", Font.BOLD, 18));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setBounds(84, 302, 197, 33);
		contentPane.add(lblNewLabel_3);
		
		JButton btncalculater = new JButton();
		btncalculater.addMouseListener(new MouseAdapter() {
			ImageIcon II = new ImageIcon(getClass().getResource("C:\\Users\\dell\\Desktop\\hi.png"));
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		btncalculater.setVerticalAlignment(SwingConstants.BOTTOM);
		btncalculater.setIcon(new ImageIcon("C:\\Users\\dell\\Desktop\\hi.png"));
		btncalculater.setForeground(null);
		btncalculater.setLayout(null);
		btncalculater.setBackground(null);
		btncalculater.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double principal, rate_of_interest, time, simple_interest;
				try {
					principal=Double.parseDouble(textField_1.getText());
					rate_of_interest=Double.parseDouble(textField_2.getText());
					time=Double.parseDouble(textField_3.getText());
					simple_interest = (principal*rate_of_interest*time)/100
					textField_ans.setText("The simple interest is "+simple_interest);
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null,"this is invalid value");
				}
			}
		});
		btncalculater.setFont(new Font("Cambria", Font.BOLD, 21));
		btncalculater.setBounds(155, 206, 126, 49);
		contentPane.add(btncalculater);
		
		JButton btnreset = new JButton("Reset");
		btnreset.setForeground(new Color(255, 255, 255));
		btnreset.setBackground(new Color(255, 140, 0));
		btnreset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_ans.setText(null);
			}
		});
		btnreset.setFont(new Font("Cambria", Font.BOLD, 21));
		btnreset.setBounds(350, 222, 147, 33);
		contentPane.add(btnreset);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 49, 598, 2);
		contentPane.add(separator);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Calibri", Font.BOLD, 18));
		textField_1.setHorizontalAlignment(SwingConstants.LEFT);
		textField_1.setBounds(312, 79, 147, 33);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.LEFT);
		textField_2.setFont(new Font("Calibri", Font.BOLD, 18));
		textField_2.setBounds(312, 127, 147, 33);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.LEFT);
		textField_3.setFont(new Font("Calibri", Font.BOLD, 18));
		textField_3.setBounds(312, 171, 147, 33);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_ans = new JTextField();
		textField_ans.setFont(new Font("Calibri", Font.BOLD, 18));
		textField_ans.setHorizontalAlignment(SwingConstants.LEFT);
		textField_ans.setBounds(312, 302, 147, 33);
		contentPane.add(textField_ans);
		textField_ans.setColumns(10);
	}

	private void seticon() {
		// TODO Auto-generated method stub
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("banking_bank_interest-512.png")));
	}
}
