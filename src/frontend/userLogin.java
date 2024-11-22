package frontend;
import oop.*;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class userLogin extends JFrame {

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
                    userLogin frame = new userLogin();
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
    public userLogin() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 499, 500);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("LOGIN");
        lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 30));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(161, 77, 137, 37);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("username:");
        lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
        lblNewLabel_1.setBounds(89, 157, 100, 19);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_1_1 = new JLabel("password:");
        lblNewLabel_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
        lblNewLabel_1_1.setBounds(89, 216, 100, 27);
        contentPane.add(lblNewLabel_1_1);

        textField = new JTextField();
        textField.setBounds(196, 161, 158, 20);
        contentPane.add(textField);
        textField.setColumns(10);

        JLabel lblNewLabel_2 = new JLabel("don't have an account?");
        lblNewLabel_2.setBounds(178, 331, 137, 14);
        contentPane.add(lblNewLabel_2);

        passwordField = new JPasswordField();
        passwordField.setBounds(199, 224, 155, 20);
        contentPane.add(passwordField);

        // Register link
        JLabel lblRegisterLink = new JLabel("<html><a href=''>register here</a></html>");
        lblRegisterLink.setBounds(203, 347, 82, 19);
        lblRegisterLink.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        lblRegisterLink.setForeground(java.awt.Color.BLUE);
        lblRegisterLink.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        contentPane.add(lblRegisterLink);
        
        JButton btnNewButton = new JButton("login");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = textField.getText();
                String password = new String(passwordField.getPassword());

                // Use GuideAndSeek's login method to authenticate
                GuideAndSeek app = GuideAndSeek.getInstance();
                if (app.login(username, password)) {
                	User u = app.getUserByUsername(username);
                	UserSession us = UserSession.getInstance();
                	us.setUser(u);
                    dispose(); // Close the login frame
                    homepage h1 = new homepage(); // Navigate to the homepage
                    h1.setVisible(true);
                } else {
                    // Show error if login fails
                    JOptionPane.showMessageDialog(null, "Invalid username or password.", "Login Failed", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btnNewButton.setFont(new Font("Segoe UI Semibold", Font.BOLD, 17));
        btnNewButton.setBounds(196, 279, 89, 23);
        contentPane.add(btnNewButton);

        // Add click event for the register link
        lblRegisterLink.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Open the register page
                dispose(); // Close the current login frame
                registerUser registerFrame = new registerUser(); // Assuming you have this class
                registerFrame.setVisible(true);
            }
        });
    }
}
