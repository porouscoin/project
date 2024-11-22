package frontend;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.io.File;
import java.awt.Font;

public class homepage extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    homepage frame = new homepage();
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
    public homepage() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 600);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Add a JTabbedPane
        JTabbedPane mainTabbedPane = new JTabbedPane();
        mainTabbedPane.setBounds(0, 0, 586, 560); // Set bounds for the main tabbed pane
        contentPane.add(mainTabbedPane);

        // Homepage Tab with Subtabs
        JTabbedPane homepageTabbedPane = new JTabbedPane();
        mainTabbedPane.add("Homepage", homepageTabbedPane);

        // Questions Subtab
        JPanel questionsPanel = new JPanel();
        questionsPanel.setLayout(null);



        homepageTabbedPane.add("Questions", questionsPanel);

     // Announcements Subtab for Homepage
        JPanel announcementsPanel = new JPanel();
        announcementsPanel.setLayout(null);


        homepageTabbedPane.add("Announcements", announcementsPanel);  // Add to Homepage tab

        // Learning Resources Subtab
        JPanel learningResourcePanel = new JPanel();
        learningResourcePanel.setLayout(null);

      //  JButton postButton = new JButton("Add PDF");
       // postButton.setBounds(200, 50, 100, 25);
        //learningResourcePanel.add(postButton);

        // Add ActionListener to the "Add PDF" button
   /*     postButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Select a PDF File");
                fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("PDF Documents", "pdf"));

                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    JOptionPane.showMessageDialog(null, "Selected File: " + selectedFile.getAbsolutePath());
                }
            }
        });*/

        homepageTabbedPane.add("Learning Resources", learningResourcePanel);

        // Post Tab with Subtabs
        JTabbedPane postTabbedPane = new JTabbedPane();
        mainTabbedPane.add("Post", postTabbedPane);

        // Learning Resource Subtab (Existing)
        JPanel learningResourcePostPanel = new JPanel();
        learningResourcePostPanel.setLayout(null);
        JLabel uploadLabelPost = new JLabel("Upload PDF:");
        uploadLabelPost.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
        uploadLabelPost.setBounds(50, 50, 100, 25);
        learningResourcePostPanel.add(uploadLabelPost);

        JButton postButtonPost = new JButton("Add PDF");
        postButtonPost.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
        postButtonPost.setBounds(141, 51, 100, 25);
        learningResourcePostPanel.add(postButtonPost);

        postButtonPost.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Select a PDF File");
                fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("PDF Documents", "pdf"));

                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    JOptionPane.showMessageDialog(null, "Selected File: " + selectedFile.getAbsolutePath());
                }
            }
        });

        postTabbedPane.add("Learning Resource", learningResourcePostPanel);

        // Question Subtab (Existing)
        JPanel questionPostPanel = new JPanel();
        questionPostPanel.setLayout(null);

    
        postTabbedPane.add("Ask Question", questionPostPanel);
        
        JLabel lblEnterQuestion = new JLabel("enter question :");
        lblEnterQuestion.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
        lblEnterQuestion.setBounds(45, 51, 150, 25);
        questionPostPanel.add(lblEnterQuestion);
        
        textField = new JTextField();
        textField.setBounds(156, 53, 200, 25);
        questionPostPanel.add(textField);
        
        JButton enterButton2_1 = new JButton("Enter");
        enterButton2_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
        enterButton2_1.setBounds(108, 101, 100, 25);
        questionPostPanel.add(enterButton2_1);
        
     // Announcements Subtab for Post
        JPanel announcementsPanel2 = new JPanel();
        announcementsPanel2.setLayout(null);
        JLabel announcementLabel2 = new JLabel("enter announcement:");
        announcementLabel2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
        announcementLabel2.setBounds(50, 50, 150, 25);
        announcementsPanel2.add(announcementLabel2);

        JTextField announcementField2 = new JTextField();
        announcementField2.setBounds(195, 52, 200, 25);
        announcementsPanel2.add(announcementField2);

        JButton enterButton2 = new JButton("Enter");
        enterButton2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
        enterButton2.setBounds(113, 100, 100, 25);
        announcementsPanel2.add(enterButton2);
        postTabbedPane.add("Announcements", announcementsPanel2);  // Add to Post tab


        // Profile Tab
        JPanel profilePanel = new JPanel();
        mainTabbedPane.add("Profile", profilePanel);

        // Timetable Tab
        JPanel timetablePanel = new JPanel();
        mainTabbedPane.add("Timetable", timetablePanel);

        // Feedback Tab with Subtabs
        JTabbedPane feedbackTabbedPane = new JTabbedPane();
        mainTabbedPane.add("Feedback", feedbackTabbedPane);

        // Add Instructor Feedback Subtab
        JPanel instructorFeedbackPanel = createFeedbackPanel("Instructor");
        feedbackTabbedPane.add("Instructor", instructorFeedbackPanel);

        // Add Course Feedback Subtab
        JPanel courseFeedbackPanel = createFeedbackPanel("Course");
        feedbackTabbedPane.add("Course", courseFeedbackPanel);

        // Discussion Rooms Tab
        JTabbedPane discussionRoomsTabbedPane = new JTabbedPane();
        mainTabbedPane.add("Discussion Rooms", discussionRoomsTabbedPane);

        JPanel createPanel = new JPanel();
        createPanel.setLayout(null); // Empty panel
        discussionRoomsTabbedPane.add("Create", createPanel);

        JPanel joinPanel = new JPanel();
        joinPanel.setLayout(null); // Empty panel
        discussionRoomsTabbedPane.add("Join", joinPanel);
    }

    /**
     * Creates a feedback panel for either "Instructor" or "Course".
     *
     * @param type The type of feedback (Instructor or Course)
     * @return The JPanel with the feedback form.
     */
    private JPanel createFeedbackPanel(String type) {
        JPanel feedbackPanel = new JPanel();
        feedbackPanel.setLayout(null);

        // Add "Rate Us:" label
        JLabel rateUsLabel = new JLabel("Rate Us:");
        rateUsLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
        rateUsLabel.setBounds(50, 10, 100, 25);
        feedbackPanel.add(rateUsLabel);

        // Add stars for rating
        JLabel[] stars = new JLabel[5];
        for (int i = 0; i < 5; i++) {
            stars[i] = new JLabel("★");
            stars[i].setBounds(50 + i * 40, 40, 30, 30);
            stars[i].setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 30));
            stars[i].setForeground(Color.GRAY);

            int starIndex = i + 1; // Capture the current star index
            stars[i].addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent e) {
                    for (int j = 0; j < 5; j++) {
                        stars[j].setForeground(j < starIndex ? Color.YELLOW : Color.GRAY);
                    }
                    JOptionPane.showMessageDialog(null, starIndex + " stars selected");
                }
            });
            feedbackPanel.add(stars[i]);
        }

        // Add Name field (Instructor Name or Course Name)
        JLabel nameLabel = new JLabel(type + " Name:");
        nameLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
        nameLabel.setBounds(50, 80, 112, 25);
        feedbackPanel.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(172, 82, 200, 25);
        feedbackPanel.add(nameField);

        // Add Comments field
        JLabel commentsLabel = new JLabel("Comments:");
        commentsLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
        commentsLabel.setBounds(50, 120, 100, 25);
        feedbackPanel.add(commentsLabel);

        JTextArea commentsArea = new JTextArea();
        commentsArea.setBounds(172, 118, 200, 100);
        feedbackPanel.add(commentsArea);

        // Add Submit button
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        	}
        });
        submitButton.setBounds(217, 240, 100, 30);
        feedbackPanel.add(submitButton);

        return feedbackPanel;
    }
}