package com.intelligentmathtutor.models.questions.numbers.level2;

import com.intelligentmathtutor.models.questions.Question;

/**
 * Questions with square roots
 */
public class NumbersL2Q5 extends Question {

    public NumbersL2Q5() {
        super(1, 15,"Calculate the value"); // Set base settings

        // Generate question
        int num= (int) this.getRandomNumber(1, 10);
        String question = String.valueOf(num*num)+"^(1/2)";

        // Set question
        this.setQuestion(question);
    }




}
