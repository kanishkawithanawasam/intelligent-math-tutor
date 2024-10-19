package com.intelligentmathtutor.controllers;

import com.intelligentmathtutor.models.questions.Question;

public interface ILogicController {

    /**
     * Evaluate a mathematical expression.
     * @param question Question to be evaluated.
     */
    public ILogicController eval(Question question);
}
