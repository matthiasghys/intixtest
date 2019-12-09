package be.kapture.intixtest;

import java.util.Arrays;
import java.util.List;

public class Question {
    private String question;
    private List<String> possibleAnswers;
    private int answer;

    static Question mapLineToQuestion(String line){
        Question question = new Question();
        String[] questionPieces = line.split("\\|");
        question.question = questionPieces[0];
        question.possibleAnswers = Arrays.asList(questionPieces[1].split(","));
        question.answer = Integer.parseInt(questionPieces[2]);

        return question;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Question{");
        sb.append("question='").append(question).append('\'');
        sb.append(", possibleAnswers=").append(possibleAnswers);
        sb.append(", answer=").append(answer);
        sb.append('}');
        return sb.toString();
    }

}
