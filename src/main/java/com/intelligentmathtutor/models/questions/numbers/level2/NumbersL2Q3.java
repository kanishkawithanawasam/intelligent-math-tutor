package com.intelligentmathtutor.models.questions.numbers.level2;

import com.intelligentmathtutor.models.questions.Question;

/**
 * Questions with inequalities.
 */
public class NumbersL2Q3 extends Question {

    public NumbersL2Q3() {
        super(1, 15,"Determine whether the boolean expression is true or false.",QuestionType.NUMBER_QUESTION); // Set base settings

        // Generate question
        String question = String.valueOf(this.getRandomDouble(1, 10)) +
                this.getBoolOperator()+
                this.getRandomDouble(1,10);

        // Set question
        this.setQuestEvalExpres(question);
    }




}
