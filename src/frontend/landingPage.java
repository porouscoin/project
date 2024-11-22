package frontend;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class landingPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					landingPage frame = new landingPage();
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
	public landingPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("GUIDE & SEEK");
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 30));
		lblNewLabel_1.setBounds(151, 110, 217, 33);
		contentPane.add(lblNewLabel_1);
		
		JButton btnLoginAsUser = new JButton("login as user");
		btnLoginAsUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				userLogin u1 = new userLogin();
				u1.setVisible(true);
			}
		});
		btnLoginAsUser.setFont(new Font("Segoe UI Semibold", Font.BOLD, 17));
		btnLoginAsUser.setBounds(168, 191, 158, 27);
		contentPane.add(btnLoginAsUser);
		
		JButton btnLoginAsAdmin = new JButton("login as admin");
		btnLoginAsAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				adminLogin a1 = new adminLogin();
				a1.setVisible(true);
			}
		});
		btnLoginAsAdmin.setFont(new Font("Segoe UI Semibold", Font.BOLD, 17));
		btnLoginAsAdmin.setBounds(168, 257, 158, 27);
		contentPane.add(btnLoginAsAdmin);
	}

}
