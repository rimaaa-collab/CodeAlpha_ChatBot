public class ResponseEngine {

    private FAQDatabase faqDatabase;
    private LearningManager learningManager;
    private ChatHistoryManager historyManager;

    public ResponseEngine() {

        faqDatabase = new FAQDatabase();
        learningManager = new LearningManager();
        historyManager = new ChatHistoryManager();
    }

    public String generateResponse(String keyword, String userInput) {

        String response;

        if (keyword.equals("unknown")) {

            learningManager.saveUnknownQuestion(userInput);

            response = "Sorry, I don't know the answer yet. Your question has been recorded for future learning.";

        } else {

            response = faqDatabase.getAnswer(keyword);
        }

        historyManager.saveChat(userInput, response);

        return response;
    }
}