public class NLPProcessor {

    public String extractKeyword(String input) {

        input = input.toLowerCase().trim();

        // Greetings
        if (input.contains("hello") ||
            input.contains("hi") ||
            input.contains("hey")) {

            return "greeting";
        }

        // Attendance
        if (input.contains("attendance")) {
            return "attendance";
        }

        // Marks / Grades / Results
        if (input.contains("marks") ||
            input.contains("grade") ||
            input.contains("result")) {

            return "marks";
        }

        // Exams
        if (input.contains("exam") ||
            input.contains("test")) {

            return "exam";
        }

        // Scholarship
        if (input.contains("scholarship")) {
            return "scholarship";
        }

        // Courses
        if (input.contains("course") ||
            input.contains("subject")) {

            return "course";
        }

        // Fees
        if (input.contains("fee") ||
            input.contains("fees")) {

            return "fees";
        }

        // Hostel
        if (input.contains("hostel")) {

            return "hostel";
        }

        // Sentiment Detection
        if (input.contains("happy") ||
            input.contains("great") ||
            input.contains("excellent")) {

            return "happy";
        }

        if (input.contains("sad") ||
            input.contains("upset") ||
            input.contains("depressed")) {

            return "sad";
        }

        if (input.contains("angry") ||
            input.contains("mad")) {

            return "angry";
        }

        if (input.contains("confused") ||
            input.contains("doubt")) {

            return "confused";
        }

        // Exit
        if (input.contains("bye") ||
            input.contains("goodbye")) {

            return "bye";
        }

        return "unknown";
    }
}