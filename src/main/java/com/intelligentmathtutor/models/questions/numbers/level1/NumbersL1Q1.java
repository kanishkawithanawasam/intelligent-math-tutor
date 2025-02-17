package com.intelligentmathtutor.models.questions.numbers.level1;

import com.intelligentmathtutor.models.questions.Question;

/**
 * Questions with 2 terms and a single operator
 */
public class NumbersL1Q1 extends Question {


    public NumbersL1Q1() {
        super(1, 15,"Solve the expression and provide the answer to 2 decimal places."); // Set base settings

        // Generate question
        String question = String.valueOf(this.getRandomInteger(1, 10)) +
                this.getOperator() +
                this.getRandomInteger(1, 10);

        // Set question
        this.setQuestEvalExpres(question);
    }




}
