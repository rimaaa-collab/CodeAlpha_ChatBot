import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ChatHistoryManager {

    public void saveChat(String userInput, String botResponse) {

        try {

            FileWriter writer =
                    new FileWriter("chat_history.txt", true);

            DateTimeFormatter formatter =
                    DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

            String timestamp =
                    LocalDateTime.now().format(formatter);

            writer.write("[" + timestamp + "]\n");
            writer.write("User: " + userInput + "\n");
            writer.write("Bot: " + botResponse + "\n");
            writer.write("----------------------------------\n");

            writer.close();

        } catch (IOException e) {

            System.out.println("Error saving chat history.");
        }
    }
}