import java.io.FileWriter;
import java.io.IOException;

public class LearningManager {

    public void saveUnknownQuestion(String question) {

        try {

            FileWriter writer =
                    new FileWriter("unknown_questions.txt", true);

            writer.write(question + "\n");

            writer.close();

        } catch (IOException e) {

            System.out.println("Error saving unknown question.");
        }
    }
}