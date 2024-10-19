package com.intelligentmathtutor.controllers;
import com.intelligentmathtutor.models.questions.Question;
import org.apache.commons.jexl3.*;


/**
 * Handles the logical processing of a mathematical or boolean expression.
 */
public class LogicController {
    JexlEngine jexl = new JexlBuilder().create();
    JexlContext context = new MapContext();
    JexlExpression jexlExpression;

    /**
     * Evaluates a given mathematical expression
     * @param question The expression to be solved.
     * @return The result after solving.
     */
    public LogicController eval(Question question) {
        //System.out.println(expression);
        jexlExpression = jexl.createExpression(question.getQuestEvalExpres());
        return this;
    }

    /**
     * Rounds the answer to nearest integer
     * @return the nearest int.
     */
    public int toNearestInt() {
        return (int) Math.round((double) jexlExpression.evaluate(context));
    }

    /**
     *
     * @return true if the inequality satisfied, otherwise false
     */
    public boolean getBooleanResult() {
        return (boolean) jexlExpression.evaluate(context);
    }

    /**
     * Rounds the answer to 2 decimal points
     * @return nearest 2 decimal points.
     */
    public double to2decimals() {
        return Math.round((double) jexlExpression.evaluate(context)*100.0)/100.0;
    }

    /**
     * Resets the context.
     */
    public void resetContext() {
        context = new MapContext();
    }
}
