package com.intelligentmathtutor.models.questions.numbers.level2;

import com.intelligentmathtutor.models.questions.Question;

/**
 * Questions with three terms and 2 operator
 */
public class NumbersL2Q2 extends Question {

    public NumbersL2Q2() {
        super(1, 20, "Solve the expression and provide the answer to two" +
                "decimal places.", QuestionType.NUMBER_QUESTION); // Set base settings

        // Generate question
        String question = String.valueOf(this.getRandomDouble(1, 10)) +
                this.getOperator() +
                this.getRandomDouble(1, 10) +
                this.getOperator() +
                this.getRandomDouble(1, 10);

        // Set question
        this.setQuestEvalExpres(question);
    }




}
