package IDB2.FunctionWeaver.Interfaces;

import IDB2.FunctionWeaver.Calculators.*;
import IDB2.FunctionWeaver.*;

public interface PartialStrings {
    public default int weaveAnotherString (StringBuilder equation, int substringStart, int substringEnd, int i, char code) {
        int sl;
        int cl;
        StringBuilder sub = new StringBuilder(equation.substring(substringStart, substringEnd));
        sl = sub.length();
        
        if (code == '^')
        {   Powers powers = new Powers();
            powers.powerTest(sub);
        }
        else if (code == '*')
        {   MDCalculator md_calculator = new MDCalculator();
            md_calculator.multiply(sub);
        }
        else if (code == '/')
        {   MDCalculator md_calculator = new MDCalculator();
            md_calculator.divide(sub);
        }
        else if (code == '+')
        {   ASCalculator as_calculator = new ASCalculator();
            as_calculator.add(sub);
        }
        else if (code == '-')
        {   ASCalculator as_calculator = new ASCalculator();
            as_calculator.subtract(sub);
        }
        else if (code == 'E')
        {   Powers expPower = new Powers();
            expPower.exponentTest(sub);
        }
        else if (code == 'L')
        {   Logarithm logarithm = new Logarithm();
            logarithm.LogTest(sub);
        }
        else if (code == 'P')
        {   ParenthesisEvaluator evaluator = new ParenthesisEvaluator();
            evaluator.ParenthesisRecurse(sub);
        }
        else if (code == 'R')
        {   Roots roots = new Roots();
            roots.SquareRootTest(sub);
        }
        else if (code == 'T')
        {   Trigonometry trig = new Trigonometry();
            trig.sinTest(sub);
        }
        else if (code == 'U')
        {   Trigonometry trig = new Trigonometry();
            trig.cosTest(sub);
        }
        else if (code == 'V')
        {   Trigonometry trig = new Trigonometry();
            trig.tanTest(sub);
        }
        else if (code == 't')
        {   Trigonometry trig = new Trigonometry();
            trig.secTest(sub);
        }
        else if (code == 'u')
        {   Trigonometry trig = new Trigonometry();
            trig.cscTest(sub);
        }
        else if (code == 'v')
        {   Trigonometry trig = new Trigonometry();
            trig.cotTest(sub);
        }
        else if (code == 'w')
        {   Trigonometry trig = new Trigonometry();
            trig.acosTest(sub);
        }
        else if (code == 'W')
        {   Trigonometry trig = new Trigonometry();
            trig.asecTest(sub);
        }
        else if (code == 'y')
        {   Trigonometry trig = new Trigonometry();
            trig.asinTest(sub);
        }
        else if (code == 'Y')
        {   Trigonometry trig = new Trigonometry();
            trig.acscTest(sub);
        }
        else if (code == 'z')
        {   Trigonometry trig = new Trigonometry();
            trig.atanTest(sub);
        }
        else if (code == 'Z')
        {   Trigonometry trig = new Trigonometry();
            trig.acotTest(sub);
        }   
        
        cl = sub.length();
        equation.delete(substringStart, substringEnd);
        equation.insert(substringStart, sub);
        i -= sl - cl;

        return i;
    }
}