package com.intelligentmathtutor.models.questions.numbers.level1;

import com.intelligentmathtutor.models.questions.Question;

/**
 * Questions with inequalities.
 */
public class NumbersL1Q3 extends Question {

    public NumbersL1Q3() {
        super(1, 15,"Determine whether the boolean expression is true or false.",QuestionType.NUMBER_QUESTION); // Set base settings

        // Generate question
        String question = String.valueOf(this.getRandomInteger(1, 10)) +
                this.getBoolOperator()+
                this.getRandomInteger(1,10);

        // Set question
        this.setQuestEvalExpres(question);
    }




}
