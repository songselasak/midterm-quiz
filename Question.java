package Finalsongselasak;

public class Question {
    String ques, ans1, ans2, ans3, ans4;
    int correctChoice;

    public Question (String ques, String ans1, String ans2, String ans3, String ans4, int correctChoice) {
        this.ques = ques;
        this.ans1 = ans1;
        this.ans2 = ans2;
        this.ans3 = ans3;
        this.ans4 = ans4;
        this.correctChoice = correctChoice;
    }
}
