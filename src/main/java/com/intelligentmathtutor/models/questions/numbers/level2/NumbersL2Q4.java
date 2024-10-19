package com.intelligentmathtutor.models.questions.numbers.level2;

import com.intelligentmathtutor.models.questions.Question;

/**
 * Questions with brackets.
 */
public class NumbersL2Q4 extends Question {

    public NumbersL2Q4() {
        super(1, 25,"Solve the expression" +
                "and provide the answer to 2 decimal places."); // Set base settings

        int preBracketTerms = (int) this.getRandomInteger(1,3);
        int postBracketTerms = (int) this.getRandomInteger(1,3);
        int inBracketTerms = (int) this.getRandomInteger(1,4);
        StringBuilder question= new StringBuilder();
        for (int i = 0; i < preBracketTerms; i++) {
            question.append(this.getRandomInteger(1, 10));
            question.append(this.getOperator());

        }

        // Add bracket term
        question.append("(");
        for (int i = 0; i < inBracketTerms; i++) {
            question.append(this.getRandomInteger(1, 10));
            if(i!=inBracketTerms-1){
                question.append(this.getOperator());
            }
        }
        question.append(")");

        // Add an operator after brackets closed
        question.append(this.getOperator());

        // Post bracket terms
        for (int i = 0; i < postBracketTerms; i++) {
            question.append(this.getRandomInteger(1, 10));
            if(i!=postBracketTerms-1){
                question.append(this.getOperator());
            }
        }

        setQuestEvalExpres(question.toString());
    }




}
