import java.util.Scanner;

class Question {
    String question;
    String option1, option2, option3, option4;
    int correctAnswer;

    Question(String q, String o1, String o2, String o3, String o4, int ans) {
        question = q;
        option1 = o1;
        option2 = o2;
        option3 = o3;
        option4 = o4;
        correctAnswer = ans;
    }

    void display() {
        System.out.println("\n" + question);
        System.out.println("1. " + option1);
        System.out.println("2. " + option2);
        System.out.println("3. " + option3);
        System.out.println("4. " + option4);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;

        Question q1 = new Question(
                "What is the capital of India?",
                "Mumbai",
                "Delhi",
                "Chennai",
                "Kolkata",
                2
        );

        Question q2 = new Question(
                "Which planet is known as the Red Planet?",
                "Earth",
                "Mars",
                "Jupiter",
                "Venus",
                2
        );

        Question q3 = new Question(
                "Who is known as the Father of Computers?",
                "Albert Einstein",
                "Isaac Newton",
                "Charles Babbage",
                "Nikola Tesla",
                3
        );

        Question q4 = new Question(
                "Which is the largest ocean in the world?",
                "Atlantic Ocean",
                "Indian Ocean",
                "Arctic Ocean",
                "Pacific Ocean",
                4
        );

        Question q5 = new Question(
                "Which country is famous for the Eiffel Tower?",
                "Italy",
                "Germany",
                "France",
                "Spain",
                3
        );


        q1.display();
        System.out.print("Enter answer: ");
        if (sc.nextInt() == q1.correctAnswer) score++;

        q2.display();
        System.out.print("Enter answer: ");
        if (sc.nextInt() == q2.correctAnswer) score++;

        q3.display();
        System.out.print("Enter answer: ");
        if (sc.nextInt() == q3.correctAnswer) score++;

        q4.display();
        System.out.print("Enter answer: ");
        if (sc.nextInt() == q4.correctAnswer) score++;

        q5.display();
        System.out.print("Enter answer: ");
        if (sc.nextInt() == q5.correctAnswer) score++;

        System.out.println("\nYour Final Score: " + score + "/5");

        sc.close();
    }
}
