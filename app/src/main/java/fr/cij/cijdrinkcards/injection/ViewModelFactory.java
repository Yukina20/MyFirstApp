package fr.cij.cijdrinkcards.injection;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import org.jetbrains.annotations.NotNull;

import fr.cij.cijdrinkcards.ui.quiz.QuizViewModel;
import fr.cij.cijdrinkcards.data.QuestionList;
import fr.cij.cijdrinkcards.data.QuestionRepository;

public class ViewModelFactory implements ViewModelProvider.Factory {
    private final QuestionRepository questionRepository;
    private static ViewModelFactory factory;

    public static ViewModelFactory getInstance() {
        if (factory == null) {
            synchronized (ViewModelFactory.class) {
                if (factory == null) {
                    factory = new ViewModelFactory();
                }
            }
        }
        return factory;
    }

    private ViewModelFactory() {
        QuestionList questionList = QuestionList.getInstance();
        this.questionRepository = new QuestionRepository(questionList);
    }

    @Override
    @NotNull
    public <T extends ViewModel>  T create(Class<T> modelClass) {
        if (modelClass.isAssignableFrom(QuizViewModel.class)) {
            return (T) new QuizViewModel(questionRepository);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}