public class ChatBot {

    private NLPProcessor nlpProcessor;
    private ResponseEngine responseEngine;

    public ChatBot() {

        nlpProcessor = new NLPProcessor();
        responseEngine = new ResponseEngine();
    }

    public String getResponse(String userInput) {

        String keyword = nlpProcessor.extractKeyword(userInput);

        return responseEngine.generateResponse(keyword, userInput);
    }
}