import java.util.HashMap;

public class FAQDatabase {

    private HashMap<String, String> faqMap;

    public FAQDatabase() {

        faqMap = new HashMap<>();

        // Greetings
        faqMap.put("greeting",
                "Hello! Welcome to EduBot AI. How can I assist you today?");

        // Academic FAQs
        faqMap.put("attendance",
                "Students should maintain at least 75% attendance.");

        faqMap.put("marks",
                "Marks are calculated based on internal and external assessments.");

        faqMap.put("exam",
                "Exams are conducted according to the academic calendar.");

        faqMap.put("scholarship",
                "Students scoring above 85% may qualify for scholarships.");

        faqMap.put("course",
                "Courses include theory, practicals, projects and assessments.");

        faqMap.put("fees",
                "Fee details can be obtained from the accounts department.");

        faqMap.put("hostel",
                "Hostel facilities include Wi-Fi, mess services and security.");

        // Sentiment Responses
        faqMap.put("happy",
                "That's great to hear! Keep up the positive spirit.");

        faqMap.put("sad",
                "I'm sorry to hear that. Stay positive and keep moving forward.");

        faqMap.put("angry",
                "Take a deep breath and try to stay calm. I'm here to help.");

        faqMap.put("confused",
                "No worries. Please explain your question in detail and I'll try to help.");

        // Exit
        faqMap.put("bye",
                "Goodbye! Have a great day and keep learning.");

        // Default
        faqMap.put("unknown",
                "Sorry, I don't have information about that yet.");
    }

    public String getAnswer(String keyword) {

        return faqMap.getOrDefault(
                keyword,
                "Sorry, I don't have information about that yet.");
    }
}