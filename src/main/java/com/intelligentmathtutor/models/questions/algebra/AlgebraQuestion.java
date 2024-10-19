package com.intelligentmathtutor.models.questions.algebra;

import com.intelligentmathtutor.models.questions.Question;

public abstract class AlgebraQuestion extends Question {
    /**
     * @param level          defines the level of the question
     * @param maxTime        defines the recommended maximum time
     * @param questionTitle1
     */
    public AlgebraQuestion(int level, int maxTime, String questionTitle1, QuestionType questionType) {
        super(level, maxTime, questionTitle1,questionType);
    }

    @Override
    public String toString() {
        return super.getQuestEvalExpres();
    }
}
