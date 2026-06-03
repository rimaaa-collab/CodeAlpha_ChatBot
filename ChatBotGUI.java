import javax.swing.*;
import java.awt.*;

public class ChatBotGUI extends JFrame {

    private JTextArea chatArea;
    private JTextField inputField;
    private JButton sendButton;

    private ChatBot bot;

    public ChatBotGUI() {

        bot = new ChatBot();

        setTitle("EduBot AI Chatbot");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Chat Area
        chatArea = new JTextArea();
        chatArea.setEditable(false);
        chatArea.setFont(new Font("Arial", Font.PLAIN, 15));
        chatArea.setLineWrap(true);
        chatArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(chatArea);

        // Input Field
        inputField = new JTextField();
        inputField.setFont(new Font("Arial", Font.PLAIN, 15));

        // Send Button
        sendButton = new JButton("Send");

        // Bottom Panel
        JPanel bottomPanel = new JPanel(new BorderLayout(10, 10));
        bottomPanel.setBorder(
                BorderFactory.createEmptyBorder(10, 10, 10, 10));

        bottomPanel.add(inputField, BorderLayout.CENTER);
        bottomPanel.add(sendButton, BorderLayout.EAST);

        // Layout
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        // Welcome Message
        chatArea.append(
                "EduBot AI: Hello! How can I help you today?\n\n");

        // Button Click
        sendButton.addActionListener(e -> sendMessage());

        // Enter Key Support
        inputField.addActionListener(e -> sendMessage());

        setVisible(true);

        // Cursor automatically textbox mein aa jayega
        inputField.requestFocusInWindow();
    }

    private void sendMessage() {

        String userInput = inputField.getText().trim();

        if (userInput.isEmpty()) {
            return;
        }

        chatArea.append("You: " + userInput + "\n");

        String response = bot.getResponse(userInput);

        chatArea.append("EduBot AI: " + response + "\n\n");

        inputField.setText("");

        // Auto Scroll
        chatArea.setCaretPosition(
                chatArea.getDocument().getLength());
    }
}