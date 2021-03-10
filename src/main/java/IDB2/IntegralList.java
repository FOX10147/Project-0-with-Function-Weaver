package IDB2;

import java.util.Scanner;
import IDB2.FunctionWeaver.Start;
import IDB2.FunctionWeaver.Format.Format;

//Summons calculator for specific integral

public class IntegralList 
{   public void display(Scanner sc)
    {   System.out.println("Select Integral to calculate Integrands");
        System.out.println("Please enter Integral id number");
        int c = sc.nextInt();
        GrabAll calcRequest = new GrabAll();
        String Equation = calcRequest.getOne(c);
        StringBuilder equation = new StringBuilder().append(Equation);

        System.out.println("Please enter lower value");
        double n1 = sc.nextDouble();
        System.out.println("Please enter upper value");
        double n2 = sc.nextDouble();

        Format format = new Format(equation);
        format.check(sc);
        Equation = equation.toString();

        double lower = Start.startCalculating(Equation, n1, sc);
        System.out.println("lower value: " + lower);
        double upper = Start.startCalculating(Equation, n2, sc);
        System.out.println("upper value: " + upper);

        System.out.println("\r\n\n= " + (upper - lower));

        return;
    }
}