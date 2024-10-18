package com.intelligentmathtutor.models.questions.numbers;

import com.intelligentmathtutor.models.questions.Question;

/**
 * Questions with inequalities.
 */
public class NumbersL1Q3 extends Question {

    public NumbersL1Q3() {
        super(1, 15); // Set base settings

        // Generate question
        String question = String.valueOf(this.getRandomNumber(1, 10)) +
                this.getBoolOperator()+
                this.getRandomNumber(1,10);

        // Set question
        this.setQuestion(question);
    }




}
