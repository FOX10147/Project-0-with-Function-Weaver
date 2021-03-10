package IDB2.FunctionWeaver.Calculators;

public class Trigonometry extends IntermediateOperations {  
    public Trigonometry() {
        super();
    } 

    public Trigonometry (StringBuilder equation) {
        this.equation = equation;
    }

    public StringBuilder sinTest(StringBuilder equation) 
    {   this.equation = equation;
        this.operator = "Trigonometry";

        // announce();
        partString();
        result = Math.sin(value);
        changeString();

        return equation;
    }

    public StringBuilder cosTest(StringBuilder equation) 
    {   this.equation = equation;
        this.operator = "Trigonometry";

        // announce();
        partString();
        result = Math.cos(value);
        changeString();

        return equation;
    }

    public StringBuilder tanTest(StringBuilder equation) 
    {   this.equation = equation;
        this.operator = "Trigonometry";

        // announce();
        partString();
        try
        {   result = Math.tan(value);   }
        catch (Exception undefined)
        {   System.out.println("Error: tangent reached undefined value");
            System.out.println("Please check the domain of your equation");
        }
            changeString();

        return equation;
    }

    public StringBuilder secTest(StringBuilder equation) {
        this.equation = equation;
        this.operator = "Trigonometry";

        // announce();
        partString();
        try
        {   result = Math.cos(value);
            value = 1 / value;   
        }
        catch (ArithmeticException undefined)
        {   System.out.println("Error: secant reached undefined value");
            System.out.println("Please check the domain of your equation");
        }
            changeString();

        return equation;
    }

    public StringBuilder cscTest(StringBuilder equation) {
        this.equation = equation;
        this.operator = "Trigonometry";

        // announce();
        partString();
        try
        {   result = Math.sin(value);
            result = 1 / result;   
        }
        catch (ArithmeticException undefined)
        {   System.out.println("Error: cosecant reached undefined value");
            System.out.println("Please check the domain of your equation");
        }
            changeString();

        return equation;
    }

    public StringBuilder cotTest(StringBuilder equation) {
        this.equation = equation;
        this.operator = "Trigonometry";

        // announce();
        partString();
        try
        {   result = Math.tan(value);
            result = 1 / result;   
        }
        catch (ArithmeticException undefined)
        {   System.out.println("Error: cotangent reached undefined value");
            System.out.println("Please check the domain of your equation");
        }
            changeString();

        return equation;
    }

    public StringBuilder acosTest(StringBuilder equation) {
        this.equation = equation;
        this.operator = "Trigonometry";

        // announce();
        partString();
        try
        {   result = Math.acos(value);  }
        catch (ArithmeticException undefined)
        {   System.out.println("Error: arc cosine reached undefined value");
            System.out.println("Please check the domain of your equation");
        }
            changeString();

        return equation;
    }

    public StringBuilder asinTest(StringBuilder equation) {
        this.equation = equation;
        this.operator = "Trigonometry";

        // announce();
        partString();
        try
        {   result = Math.asin(value);  }
        catch (ArithmeticException undefined)
        {   System.out.println("Error: arc sine reached undefined value");
            System.out.println("Please check the domain of your equation");
        }
            changeString();

        return equation;
    }

    public StringBuilder atanTest(StringBuilder equation) {
        this.equation = equation;
        this.operator = "Trigonometry";

        // announce();
        partString();
        try
        {   result = Math.atan(value);  }
        catch (ArithmeticException undefined)
        {   System.out.println("Error: arc tangent reached undefined value");
            System.out.println("Please check the domain of your equation");
        }
            changeString();

        return equation;
    }

    public StringBuilder asecTest(StringBuilder equation) {
        this.equation = equation;
        this.operator = "Trigonometry";

        // announce();
        partString();
        try
        {   if (value == 0) throw new ArithmeticException();
            result = 1 / value;
            result = Math.acos(result);  }
        catch (ArithmeticException undefined)
        {   System.out.println("Error: arc secant reached undefined value");
            System.out.println("Please check the domain of your equation");
        }
            changeString();

        return equation;
    }

    public StringBuilder acscTest(StringBuilder equation) {
        this.equation = equation;
        this.operator = "Trigonometry";

        // announce();
        partString();
        try
        {   if (value == 0) throw new ArithmeticException();
            result = 1 / value;
            result = Math.asin(result);  }
        catch (ArithmeticException undefined)
        {   System.out.println("Error: arc cosecant reached undefined value");
            System.out.println("Please check the domain of your equation");
        }
            changeString();

        return equation;
    }

    public StringBuilder acotTest(StringBuilder equation) {
        this.equation = equation;
        this.operator = "Trigonometry";

        // announce();
        partString();
        try
        {   if (value == 0) throw new ArithmeticException();
            result = 1 / value;
            result = Math.atan(result);  }
        catch (ArithmeticException undefined)
        {   System.out.println("Error: arc cotangent reached undefined value");
            System.out.println("Please check the domain of your equation");
        }
            changeString();

        return equation;
    }
}