package Finalsongselasak;
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    ArrayList<Question> quiz = new ArrayList<Question>();
    int score=0;
    public Quiz() {

    }

    public void addQuestion(){
        Question question = new Question();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a new Question: ");
        question.ques = sc.nextLine();
        System.out.println("Enter a 1st possible answer: ");
        question.ans1 = sc.nextLine();
        System.out.println("Enter a 2nd possible answer: ");
        question.ans1 = sc.nextLine();
        System.out.println("Enter a 3rd possible answer: ");
        question.ans1 = sc.nextLine();
        System.out.println("Enter a 4th possible answer: ");
        question.ans1 = sc.nextLine();
        System.out.println("Which answer is the correct one? (1-4): ");
        question.correctChoice= sc.nextInt();
        quiz.add(question);
    }

    public void displayQuestion(){
        for (int i=0;i<quiz.size();i++){
            System.out.print(i+1);
            System.out.println(quiz[i].ques);
        }
    }

    public void removeQuestion(){
        int i;
        displayQuestion();
        System.out.println("Which question you want to remove?");
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        if (i < quiz.size()) {
            quiz.remove(i);
            System.out.println("Remove successfully.");
        }
        else{
            System.out.println("Cannot Remove.");
        }
    }
}
