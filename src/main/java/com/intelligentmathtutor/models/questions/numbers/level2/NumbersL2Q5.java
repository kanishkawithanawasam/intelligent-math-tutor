package com.intelligentmathtutor.models.questions.numbers.level2;

import com.intelligentmathtutor.models.questions.Question;

/**
 * Questions with square roots
 * Level = 2
 * Info: Roots may not be whole numbers.
 */
public class NumbersL2Q5 extends Question {

    public NumbersL2Q5() {
        super(1, 15,"Calculate the value"); // Set base settings

        // Generate question
        String question = String.valueOf(this.getRandomInteger(4,100))+"^(1/2)";

        // Set question
        this.setQuestEvalExpres(question);
    }
}
