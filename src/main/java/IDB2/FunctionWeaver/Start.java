package IDB2.FunctionWeaver;

import java.util.*;

import IDB2.FunctionWeaver.Format.Format;

public class Start {
    public static double startCalculating(String Equation, double n, Scanner sc)
    {   // Introduction
        System.out.println("\n\n\nAccessing Function Weaver prototype.");
        
        // Get equation and read it back.
        StringBuilder equation = new StringBuilder().append(Equation);
        System.out.println();
        System.out.println("I'm reading " + Equation);

        // Look for variables and ask user to fill them in with values.
        Format format = new Format(equation);
        format.checkx(n, sc);

        // Start calculating and breaking down the string.
        ParenthesisEvaluator p_evaluator = new ParenthesisEvaluator();
        equation = p_evaluator.ParenthesisRecurse(equation);

        return Double.parseDouble(equation.toString());
    }
}