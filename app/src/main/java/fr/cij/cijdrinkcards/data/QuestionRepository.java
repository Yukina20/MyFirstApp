package fr.cij.cijdrinkcards.data;

import java.util.List;

public class QuestionRepository {

    private final QuestionList questionList;

    public QuestionRepository(QuestionList questionList) {
        this.questionList = questionList;
    }

    public List<Question> getQuestions(){
        return questionList.getQuestions();
    }
}
