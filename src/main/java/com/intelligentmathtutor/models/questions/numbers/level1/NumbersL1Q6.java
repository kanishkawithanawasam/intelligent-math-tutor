package com.intelligentmathtutor.models.questions.numbers.level1;

import com.intelligentmathtutor.models.questions.Question;

/**
 * Questions with powers
 */
public class NumbersL1Q6 extends Question {

    public NumbersL1Q6() {
        super(1, 15,"Calculate the value",QuestionType.NUMBER_QUESTION); // Set base settings

        // Generate question
        int num= (int) this.getRandomInteger(1, 10);
        String question = String.valueOf(num*num)+"^2";

        // Set question
        this.setQuestEvalExpres(question);
    }




}
