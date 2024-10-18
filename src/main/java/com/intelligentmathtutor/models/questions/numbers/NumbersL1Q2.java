package com.intelligentmathtutor.models.questions.numbers;

import com.intelligentmathtutor.models.questions.Question;

/**
 * Questions with three terms and 2 operator
 */
public class NumbersL1Q2 extends Question {

    public NumbersL1Q2() {
        super(1, 15); // Set base settings

        // Generate question
        String question = String.valueOf(this.getRandomNumber(1, 10)) +
                this.getOperator() +
                this.getRandomNumber(1, 10) +
                this.getOperator() +
                this.getRandomNumber(1, 10);

        // Set question
        this.setQuestion(question);
    }




}
