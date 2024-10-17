package com.intelligentmathtutor.controllers;
import org.apache.commons.jexl3.*;

public class LogicController {
    JexlEngine jexl = new JexlBuilder().create();
    JexlContext context = new MapContext();
    JexlExpression jexlExpression;

    public LogicController eval(String expression) {
        jexlExpression = jexl.createExpression(expression);
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
