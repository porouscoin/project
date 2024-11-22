package frontend;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class adminLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminLogin frame = new adminLogin();
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
	public adminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(262, 40, 98, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("LOGIN");
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 30));
		lblNewLabel_1.setBounds(198, 40, 104, 33);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblEmail = new JLabel("username:");
		lblEmail.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblEmail.setBounds(82, 127, 109, 27);
		contentPane.add(lblEmail);
		
		JLabel lblPassword = new JLabel("password:");
		lblPassword.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblPassword.setBounds(82, 195, 109, 27);
		contentPane.add(lblPassword);
		
		JButton btnNewButton = new JButton("login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.BOLD, 17));
		btnNewButton.setBounds(198, 272, 98, 27);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(198, 135, 158, 20);
		contentPane.add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(198, 203, 158, 20);
		contentPane.add(passwordField);
		
		
	}
}