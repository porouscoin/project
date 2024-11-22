package frontend;
import oop.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class registerUser extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registerUser frame = new registerUser();
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
	public registerUser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegister = new JLabel("REGISTER");
		lblRegister.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegister.setFont(new Font("Segoe UI Semibold", Font.BOLD, 30));
		lblRegister.setBounds(185, 33, 137, 37);
		contentPane.add(lblRegister);
		
		JLabel lblNewLabel_1 = new JLabel("username:");
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(117, 151, 100, 19);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(250, 155, 158, 20);
		contentPane.add(textField);
		
		JLabel lblNewLabel_1_1 = new JLabel("password:");
		lblNewLabel_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(117, 281, 100, 27);
		contentPane.add(lblNewLabel_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(250, 289, 158, 20);
		contentPane.add(passwordField);
		
		JButton btnRegister = new JButton("register");
		btnRegister.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // Read data from text fields
		        String fullName = textField_3.getText();
		        String username = textField.getText();
		        String email = textField_1.getText();
		        String contactInfo = textField_2.getText();
		        String password = new String(passwordField.getPassword());

		        // Validate inputs
		        if (fullName.isEmpty() || username.isEmpty() || email.isEmpty() || password.isEmpty() || contactInfo.isEmpty()) {
		            JOptionPane.showMessageDialog(null, "All fields are required!", "Error", JOptionPane.ERROR_MESSAGE);
		            return;
		        }
		        
		        if (!email.contains("@") || !email.contains(".edu") || email.indexOf(".edu") < email.indexOf("@")) {
		            JOptionPane.showMessageDialog(null, "Invalid email!", "Error", JOptionPane.ERROR_MESSAGE);
		            return;
		        }

		        // Check if username or email is already taken
		        GuideAndSeek g = GuideAndSeek.getInstance();
		        if (g.isUsernameOrEmailTaken(username, email)) {
		            // Show error if duplicate username or email found
		            JOptionPane.showMessageDialog(null, "Username or Email already exists. Please choose a different one.", "Registration Failed", JOptionPane.ERROR_MESSAGE);
		            return; // Exit the registration process
		        }

		        // Generate a unique userID
		        String userID = java.util.UUID.randomUUID().toString();

		        // Create the User object
		        User newUser = new User(userID, username, email, password, fullName, null, null, contactInfo);

		        // Add the new user to the GuideAndSeek instance
		        g.addUser(newUser);

		        // Display success message
		        JOptionPane.showMessageDialog(null, "User registered successfully!\n" + 
		                                        "Name: " + newUser.getName() + "\n" +
		                                        "Email: " + newUser.getEmail(), "Success", JOptionPane.INFORMATION_MESSAGE);

		        // Close the current window and open login screen
		        dispose();
		        userLogin loginFrame = new userLogin();
		        loginFrame.setVisible(true);
		    }
		});


		
		btnRegister.setFont(new Font("Segoe UI Semibold", Font.BOLD, 17));
		btnRegister.setBounds(210, 347, 100, 23);
		contentPane.add(btnRegister);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(250, 200, 158, 20);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("email:");
		lblNewLabel_1_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(117, 196, 100, 19);
		contentPane.add(lblNewLabel_1_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(250, 246, 158, 20);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("contact info:");
		lblNewLabel_1_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblNewLabel_1_3.setBounds(117, 242, 123, 19);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("full name:");
		lblNewLabel_1_4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblNewLabel_1_4.setBounds(117, 103, 100, 19);
		contentPane.add(lblNewLabel_1_4);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(250, 107, 158, 20);
		contentPane.add(textField_3);
	}

}
