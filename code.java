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

public class Main {   // ✅ ONLY ONE public class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Question q1 = new Question(
                "What is Java?",
                "Programming Language",
                "Operating System",
                "Browser",
                "Hardware",
                1
        );

        int score = 0;

        q1.display();
        System.out.print("Enter answer: ");
        int ans = sc.nextInt();

        if (ans == q1.correctAnswer) {
            score++;
        }

        System.out.println("Score: " + score);

        sc.close();
    }
}
