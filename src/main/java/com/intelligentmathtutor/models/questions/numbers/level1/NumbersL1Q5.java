package com.intelligentmathtutor.models.questions.numbers.level1;

import com.intelligentmathtutor.models.questions.Question;

/**
 * Questions with square roots
 */
public class NumbersL1Q5 extends Question {

    public NumbersL1Q5() {
        super(1, 15,"Calculate the value"); // Set base settings

        // Generate question
        int num= (int) this.getRandomInteger(1, 10);
        String question = String.valueOf(num*num)+"^(1/2)";

        // Set question
        this.setQuestEvalExpres(question);
    }




}
