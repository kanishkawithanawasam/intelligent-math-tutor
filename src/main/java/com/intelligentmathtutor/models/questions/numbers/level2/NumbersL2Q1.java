package com.intelligentmathtutor.models.questions.numbers.level2;

import com.intelligentmathtutor.models.questions.Question;

/**
 * Questions with 2 terms and a single operator
 */
public class NumbersL2Q1 extends Question {


    public NumbersL2Q1() {
        super(1, 20,"Solve the expression and provide the answer to 2 decimal places.",QuestionType.NUMBER_QUESTION); // Set base settings

        // Generate question
        String question = String.valueOf(this.getRandomDouble(1,15)) +
                this.getOperator() +
                this.getRandomDouble(1, 10);

        // Set question
        this.setQuestEvalExpres(question);
    }




}
