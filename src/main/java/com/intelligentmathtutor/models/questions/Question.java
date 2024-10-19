package com.intelligentmathtutor.models.questions;

import java.util.HashMap;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Defines basic features of a particular question.
 */
public abstract class Question {

    // Question type
    public static enum QuestionType {
        NUMBER_QUESTION,
        ALGEBRA_QUESTION,
        PROBABILITY_QUESTION;
    }



    private final int level;
    private final int maxTime;
    private String questEvalExpres;
    private String questTextExpres;
    private final char[] operators;
    private final String[] boolOperators;
    private final String questionTitle;
    private final HashMap<Integer,Integer> levelMarks;
    private String answer;
    private QuestionType questionType;

    Random random ;

    /**
     * Creates a question
     * @param level Defines question level
     * @param maxTime Defines maximum recommended time
     * @param questionTitle Defines question title
     * @param questionType Defines question type
     */
    public Question(int level, int maxTime, String questionTitle,QuestionType questionType) {
        this.level = level;
        this.maxTime = maxTime;
        this.questionTitle = questionTitle;
        operators = new char[]{'*','-','+','/'};
        boolOperators = new String[]{"<",">","<=",">=","=="};
        random = new Random();
        levelMarks = new HashMap<>();
        levelMarks.put(1,5);
        levelMarks.put(2,10);
        levelMarks.put(3,15);
        this.questionType = questionType;
    }

    /**
     *
     * @return the maximum time recommended for a question
     */
    public int getMaxTime() {
        return maxTime;
    }

    public int getLevel() {
        return level;
    }

    /**
     *
     * @return the question
     */
    public String getQuestEvalExpres() {
        return questEvalExpres;
    }

    /**
     * Saves the question
     * @param questEvalExpres :  Question to be set
     */
    public void setQuestEvalExpres(String questEvalExpres) {
        this.questEvalExpres = questEvalExpres;
        this.questTextExpres = convertToText(questEvalExpres);
    }

    /**
     *
     * @return an operator from operator list ['*','-','+','/']
     */
    public char getOperator() {
        return operators[random.nextInt(operators.length)];
    }


    /**
     *
     * @return
     */
    public String getBoolOperator() {
        return boolOperators[random.nextInt(boolOperators.length)];
    }

    /**
     * Return a random number between min and max.
     * @param min to be given
     * @param max to be give
     * @return A random integer between min and max,
     */
    public double getRandomInteger(int min, int max) {
        return random.nextInt(1+max-min)+min;
    }

    /**
     * Returns a random double between min and max.
     * @param min Minimum to be produced
     * @param max Maximum number to be produced.
     * @return A random double between min and max.
     */
    public double getRandomDouble(int min, int max) {
        return (random.nextInt(1+max-min)+min-random.nextDouble())*100/100;
    }

    /**
     *
     * @return Returns the title of the question
     */
    public String getQuestionTitle() {
        return questionTitle;
    }

    /**
     * Returns the reward marks associated with a particular method.
     * @return The reward mark for the question.
     */
    public int getLevelMark() {
        return levelMarks.get(level);
    }

    @Override
    public String toString() {
        return convertToText(questEvalExpres);
    }

    /**
     * Sets the answer to an unevaluated question.
     * @param answer The evaluated answer.
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    /**
     * Returns the answer to a question.
     * @return The particular answer of a question.
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * Gives the type of the question
     * @return Question type.
     */
    public QuestionType getQuestionType() {
        return questionType;
    }
    private String convertToText(String expression) {
        Pattern pattern = Pattern.compile("\\d+\\.\\d+|\\d+");
        Matcher matcher = pattern.matcher(expression);

        // StringBuilder to build the new expression
        StringBuilder modifiedExpression = new StringBuilder();

        // Start position for appending parts of the expression
        int lastPos = 0;

        // Process each number found by the regex
        while (matcher.find()) {
            // Get the matched number as a string
            String numberStr = matcher.group();
            double number = Double.parseDouble(numberStr);

            // Append the part of the expression before the current number
            modifiedExpression.append(expression, lastPos, matcher.start());

            // Check if it's effectively an integer
            if (number == (int) number) {
                // Replace with integer version
                modifiedExpression.append((int) number);
            } else {
                // Leave it as is
                modifiedExpression.append(numberStr);
            }

            // Update lastPos to the end of the current number
            lastPos = matcher.end();
        }

        // Append the remaining part of the expression after the last number
        modifiedExpression.append(expression.substring(lastPos));

        return modifiedExpression.toString();
    }

}
