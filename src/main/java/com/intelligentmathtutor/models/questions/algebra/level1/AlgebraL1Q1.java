package com.intelligentmathtutor.models.questions.algebra.level1;

import com.intelligentmathtutor.models.questions.algebra.AlgebraQuestion;

public class AlgebraL1Q1 extends AlgebraQuestion {


    public AlgebraL1Q1() {
        super(1, 10, "Evaluate the expression.",QuestionType.ALGEBRA_QUESTION);

        char[] letters = new char[]{'x','y','z'};
        int letter = (int) this.getRandomInteger(1,2);

        StringBuilder question = new StringBuilder();
        int numberOfTerms = (int) this.getRandomInteger(3,5);

        // numberOfTerms-1 added as the final term added after the loop
        for(int i = 0; i < numberOfTerms-1; i++) {
            question.append(letters[letter]);
            question.append("+");
        }

        question.append(letters[letter]);
        System.out.println(question);
        this.setQuestEvalExpres(question.toString());
        this.setAnswer(String.valueOf(numberOfTerms)+letters[letter]);
    }

}
