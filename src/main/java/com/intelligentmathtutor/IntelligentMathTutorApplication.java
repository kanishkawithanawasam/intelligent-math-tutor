package com.intelligentmathtutor;

import com.intelligentmathtutor.controllers.LogicController;
import com.intelligentmathtutor.models.questions.Question;
import com.intelligentmathtutor.models.questions.numbers.level1.NumbersL1Q1;
import com.intelligentmathtutor.models.questions.numbers.level1.NumbersL1Q2;
import com.intelligentmathtutor.models.questions.numbers.level1.NumbersL1Q3;

//@SpringBootApplication
public class IntelligentMathTutorApplication {

    public static void main(String[] args) {

        //SpringApplication.run(IntelligentMathTutorApplication.class, args);
        LogicController controller = new LogicController();

        for (int i = 0; i < 3; i++) {
            Question q= new NumbersL1Q1();
            System.out.println(q + " = "+controller.eval(q).toNearestInt());
            System.out.println(q + " = "+controller.eval(q).to2decimals());
            System.out.println();

        }

        for (int i = 0; i < 5; i++) {
            Question q = new NumbersL1Q2();
            System.out.println(q + " = "+controller.eval(q).toNearestInt());
            System.out.println(q + " = "+controller.eval(q).to2decimals());
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            Question q = new NumbersL1Q3();
            System.out.println(q + " = "+controller.eval(q).getBooleanResult());
            System.out.println();
        }

    }


}
