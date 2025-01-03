package com.example.mathquiz;  // שמור על שם החבילה כפי שהוא
public class Question {

    private String questionText;
    private String answer1, answer2, answer3, answer4;
    private String correctAnswer;

    public Question(String questionText, String answer1, String answer2, String answer3, String answer4, String correctAnswer) {
        this.questionText = questionText;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getAnswer1() {
        return answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
}