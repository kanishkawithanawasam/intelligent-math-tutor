package com.intelligentmathtutor.models.questions.numbers;

import com.intelligentmathtutor.models.questions.Question;

public class NumbersL1Q2 extends Question {


    public NumbersL1Q2() {
        super(1, 15); // Set base settings
        StringBuilder builder = new StringBuilder();
        builder.append(this.getRandomNumber(1,10));
        builder.append(this.getOperator());
        builder.append(this.getRandomNumber(1,10));
        builder.append(this.getOperator());
        builder.append(this.getRandomNumber(1,10));
        this.setQuestion(builder.toString());
    }




}
