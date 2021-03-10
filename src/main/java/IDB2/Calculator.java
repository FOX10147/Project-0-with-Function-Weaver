package IDB2;

import java.lang.Math;

//This class is where all the calculations reside for each numbered integral

public class Calculator {

    public double Integral1(double a, double n1, double n2)
    {   n2 -= n1;
        a *= n1;
        return a;
    }

    public double Integral2(int n, double n1, double n2)
    {   n += 1;
        try
        {   n2 = this.pown(n2, n);
            n2 /= n;
            n1 = this.pown(n1, n);
            n1 /= n;
        } catch (ArithmeticException e)
        {   System.out.println("Error: division by 0 has occurred. result is undefined.");  }
        n2 -= n1;
        return n2;
    }

    public double Integral3(double n1, double n2)
    {   n1 = Math.abs(n1);
        n2 = Math.abs(n2);
        n1 = this.log2(n1);
        n2 = this.log2(n2);
        n2 = n1 - n2;
        return n2;
    }

    public double Integral4(double n1, double n2)
    {   n1 = Math.exp(n1);
        n2 = Math.exp(n2);
        n2 -= n1;
        return n2;
    }

    public double Integral5(double a, int m1, int m2)
    {   double temp1 = this.pown(a, m1);
        double temp2 = this.pown(a, m2);
        a = Math.abs(a);
        a = this.log2(a);
        temp1 /= a;
        temp2 /= a;
        return temp2 - temp1;
    }

    public double Integral6(double n1, double n2)
    {   n1 = this.cos2(n1);
        n2 = this.cos2(n2);
        return n1 - n2;
    }

    public double Integral7(double n1, double n2)
    {   n1 = this.sin2(n1);
        n2 = this.sin2(n2);
        return n2 - n1;
    }

    public double Integral8(double n1, double n2)
    {   n1 = this.tan2(n1);
        n2 = this.tan2(n2);
        return n2 - n1;
    }

    public double Integral9(double n1, double n2)
    {   n1 = this.tan2(n1);
        n2 = this.tan2(n2);
        try
        {   n1 = 1 / n1;
            n2 = 1 / n2;
        }   catch (ArithmeticException e)
        {   System.out.println("Cannot divide by 0");   }
        return n1 - n2;
    }

    public double Integral10(double n1, double n2)
    {   n1 = this.cos2(n1);
        n2 = this.cos2(n2);
        try
        {   n1 = 1 / n1;
            n2 = 1 / n2;
        }   catch (ArithmeticException e)
        {   System.out.println("Cannot divide by 0");  }
        return n2 - n1;
    }

    public double Integral11(double n1, double n2)
    {   n1 = this.sin2(n1);
        n2 = this.sin2(n2);
        try
        {   n1 = 1 / n1;
            n2 = 1 / n2;
        }   catch (ArithmeticException e)
        {   System.out.println("Cannot divide by 0");   }
        return n1 - n2;
    }

    public double Integral12(double n1, double n2)
    {   n1 = this.cos2(n1);
        n2 = this.cos2(n2);
        try
        {   n1 = 1 / n1;
            n2 = 1 / n2;
        }   catch (ArithmeticException e)
        {   System.out.println("Division by zero has occurred");    }
        n1 = Math.abs(n1);
        n2 = Math.abs(n2);
        n1 = this.log2(n1);
        n2 = this.log2(n2);
        return n2 - n1;
    }

    public double Integral13(double n1, double n2)
    {   n1 = this.sin2(n1);
        n2 = this.sin2(n2);
        n1 = Math.abs(n1);
        n2 = Math.abs(n2);
        n1 = this.log2(n1);
        n2 = this.log2(n2);
        return n2 - n1;
    }

    public double Integral14(double n1, double n2)
    {   double temp1 = this.cos2(n1);
        double temp2 = this.tan2(n1);
        double temp3 = this.cos2(n2);
        double temp4 = this.tan2(n2);
        try
        {   temp1 = 1 / temp1;
            temp3 = 1 / temp3;
        }   catch (ArithmeticException e)
        {   System.out.println("Division by 0 has occurred");   }
        n1 = Math.abs(temp1 + temp2);
        n2 = Math.abs(temp3 + temp4);
        n1 = this.log2(n1);
        n2 = this.log2(n2);
        return n2 - n1;
    }

    public double Integral15(double n1, double n2)
    {   double temp1 = this.sin2(n1);
        double temp2 = this.tan2(n1);
        double temp3 = this.sin2(n2);
        double temp4 = this.tan2(n2);
        try
        {   temp1 = 1 / temp1;
            temp2 = 1 / temp2;
            temp3 = 1 / temp3;
            temp4 = 1 / temp4;
        }   catch (ArithmeticException e)
        {   System.out.println("Division by 0 has occurred");   }
        n1 = Math.abs(temp1 - temp2);
        n2 = Math.abs(temp3 - temp4);
        n1 = this.log2(n1);
        n2 = this.log2(n2);
        return n2 - n1;
    }

    public double Integral16(double a, double n1, double n2)
    {   try
        {   n1 /= a;
            n2 /= a;
        } catch (ArithmeticException e)
        {   System.out.println("Division by 0 has occurred");   }
        n1 = this.asin2(n1);
        n2 = this.asin2(n2);
        return n2 - n1;
    }

    public double Integral17(double a, double n1, double n2)
    {   try
        {   n1 /= a;
            n2 /= a;
        }   catch(ArithmeticException e)
        {   System.out.println("Division by 0 has occurred");   }
        n1 = this.atan2(n1);
        n2 = this.atan2(n2);
        try
        {   n1 /= a;
            n2 /= a;
        }   catch(ArithmeticException e)
        {   System.out.println("Division by 0 has occurred");   }
        return n2 - n1;
    }

    public double Integral18(double a, double n1, double n2)
    {   try
        {   n1 /= a;
            n2 /= a;
        }   catch(ArithmeticException e)
        {   System.out.println("Division by 0 has occurred");   }
        n1 = this.asec2(n1);
        n2 = this.asec2(n2);
        try
        {   n1 /= a;
            n2 /= a;
        }   catch(ArithmeticException e)
        {   System.out.println("Division by 0 has occurred");   }
        return n2 - n1;
    }

    public double Integral19(double a, double n1, double n2)
    {   double temp1 = n1 + a;
        double temp2 = n1 - a;
        double temp3 = n2 + a;
        double temp4 = n2 - a;
        try
        {   n1 = temp1 / temp2;
            n2 = temp3 / temp4;
        }   catch (ArithmeticException e)
        {   System.out.println("Division by 0 has occurred");   }
        n1 = this.log2(Math.abs(n1));
        n2 = this.log2(Math.abs(n2));
        n2 -= n1;
        try
        {   n2 /= a;
            n2 /= 2;
        }   catch (ArithmeticException e)
        {   System.out.println("Division by 0 has occurred");   }
        return n2;
    }

    public double Integral20(double a, double n1, double n2)
    {   double temp1 = n1 + a;
        double temp2 = n1 - a;
        double temp3 = n2 + a;
        double temp4 = n2 - a;
        try
        {   n1 = temp2 / temp1;
            n2 = temp4 / temp3;
        }   catch (ArithmeticException e)
        {   System.out.println("Division by 0 has occurred");   }
        n1 = this.log2(Math.abs(n1));
        n2 = this.log2(Math.abs(n2));
        n2 -= n1;
        try
        {   n2 /= a;
            n2 /= 2;
        }   catch (ArithmeticException e)
        {   System.out.println("Division by 0 has occurred");   }
        return n2;
    }

    public double formRootA2PlusX2(double a, double x)
    {   double temp1 = this.pow2(a);
        double temp2 = this.pow2(x);
        a = temp1 + temp2;
        a = this.sqrt2(a);
        return a;
    }

    public double formRootA2MinusX2(double a, double b)
    {   double temp1 = this.pow2(a); //This function may have x squared
        double temp2 = this.pow2(b); //minus a squared instead.
        a = temp1 - temp2;
        a = this.sqrt2(a);
        return a;
    }

    public double formAPlusBTimesX(double a, double b, double n)
    {   b = b * n;
        a += b;
        return a;
    }
    
    public double invert(double a)
    {   return a * -1;
    }

    public double sqrt2(double a)
    {   try 
        {   return Math.sqrt(a);
        }   catch (ArithmeticException e)
        {   System.out.println("Cannot take the square of a negative number");  }
        return a;
    }

    public double pown(double a, int b)
    {   double temp = a;
        for (int i = 1 ; i < b; i++) 
        {   temp *= a;
        }
        return temp;
    }

    public double pow2(double a)
    {   return a * a;
    }

    public double sin2(double a)
    {   return Math.sin(a);
    }

    public double cos2(double a)
    {   return Math.cos(a);
    }

    public double tan2(double a)
    {   try
        {   return Math.tan(a);
        }   catch (ArithmeticException e)
        {   System.out.println("Result for radian value input is undefined");   }
        return a;
    }

    public double asin2(double a)
    {   try
        {   return Math.asin(a);
        }   catch (ArithmeticException e)
        {   System.out.println("Result for radian value input is undefined");   }
        return a;
    }

    public double acos2(double a)
    {   try
        {   return Math.acos(a);
        }   catch (ArithmeticException e)
        {   System.out.println("Result for radian value input is undefined");   }
        return a;
    }

    public double atan2(double a)
    {   try
        {   return Math.atan(a);
        }   catch (ArithmeticException e)
        {   System.out.println("Result for radian value input is undefined");   }
        return a;
    }

    public double asec2(double a)
    {   try
        {   a = 1 / a;
            return Math.acos(a);
        }   catch (ArithmeticException e)
        {   System.out.println("Result is undefined");   }
        return a;
    }

    public double log2(double a)
    {   try
        {   return Math.log(a);
        }   catch (ArithmeticException e)
        {   System.out.println("Cannot take the logarithm of 0 or a negative number");  }
        return a;
    }
}