package IDB2.Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import IDB2.DBConnect;
import IDB2.GrabAll;
import IDB2.FunctionWeaver.ParenthesisEvaluator;

@WebServlet(name = "callcalculator", urlPatterns = { "/callcalculator" })
public class calculatorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        String integralId = request.getParameter("integralId");
        String lowerIntegrand = request.getParameter("lowerIntegrand");
        String upperIntegrand = request.getParameter("upperIntegrand");
        String power = request.getParameter("power");
        String constantA= request.getParameter("constantA");
        String constantB = request.getParameter("constantB");
        String constantC = request.getParameter("constantC");
        String constantX = request.getParameter("constantX");
        String constantY = request.getParameter("constantY");
        String constantZ = request.getParameter("constantZ");
        String Equation;
        StringBuilder equationLower = new StringBuilder("");
        StringBuilder equationUpper = new StringBuilder("");
        ParenthesisEvaluator p_evaluator = new ParenthesisEvaluator();
        GrabAll getEquation = new GrabAll();
        int max;
        double lower;
        double upper;
        boolean flag = false;

        if (integralId == "")
        {   response.sendRedirect("/IDB2-1.0-SNAPSHOT/integralIderror");    }
        else if (lowerIntegrand == "")
        {   response.sendRedirect("/IDB2-1.0-SNAPSHOT/lowerintegranderror"); }
        else if (upperIntegrand == "")
        {   response.sendRedirect("/IDB2-1.0-SNAPSHOT/upperintegranderror"); }
        else if (constantA == "")
        {   response.sendRedirect("/IDB2-1.0-SNAPSHOT/constantAerror");  }
        else {

            DBConnect test = new DBConnect();
            Connection c = test.getConnect();
            equationLower.append(getEquation.getOne(Integer.parseInt(integralId)));

            do
            {   flag = false;
                max = equationLower.length();
                for (int i = 0; i < max; i++)
                {   if (equationLower.charAt(i) == 'A')
                    {   equationLower.delete(i, i + 1);
                        equationLower.insert(i, constantA);
                        flag = true;
                        break;
                    }
                    else if (equationLower.charAt(i) == 'B')
                    {   try
                        {   if (constantB == null) throw new ArithmeticException();
                            equationLower.delete(i, i + 1);
                            equationLower.insert(i, constantB);
                            flag = true;
                            break;
                        }   catch (ArithmeticException missingValue)
                        {   out.println("It seems the solution you are requesting needs a B constant");
                            out.println("Please type a B constant and try again");
                        }
                    }   
                    else if (equationLower.charAt(i) == 'C')
                    {   try
                        {   if (constantC == null) throw new ArithmeticException();
                            equationLower.delete(i, i + 1);
                            equationLower.insert(i, constantC);
                            flag = true;
                            break;
                        }   catch (ArithmeticException missingValue)
                        {   out.println("It seems the solution you are requesting needs a C constant");
                            out.println("Please type a C constant and try again");
                        }       
                    }
                    else if (equationLower.charAt(i) == 'X')
                    {   try
                        {   if (constantX == null) throw new ArithmeticException();
                            equationLower.delete(i, i + 1);
                            equationLower.insert(i, constantX);
                            flag = true;
                            break;
                        }   catch (ArithmeticException missingValue)
                        {   out.println("It seems the solution you are requesting needs an X constant");
                            out.println("Please type an X constant and try again");
                        }
                    }
                    else if (equationLower.charAt(i) == 'Y')
                    {   try
                        {   if (constantY == null) throw new ArithmeticException();
                            equationLower.delete(i, i + 1);
                            equationLower.insert(i, constantY);
                            flag = true;
                            break;
                        }   catch (ArithmeticException missingValue)
                        {   out.println("It seems the solution you are requesting needs a Y constant");
                            out.println("Please type a Y constant and try again");
                        }
                    }
                    else if (equationLower.charAt(i) == 'Z')
                    {   try
                        {   if (constantZ == null) throw new ArithmeticException();
                            equationLower.delete(i, i + 1);
                            equationLower.insert(i,constantZ);
                            flag = true;
                            break;
                        }   catch (ArithmeticException missingValue)
                        {   out.println("It seems the solution you are requesting needs a Z constant");
                            out.println("Please type a Z constant and try again");
                        }
                    }
                    else if (equationLower.charAt(i) == 'n')
                    {   if (equationLower.charAt(i - 1) == '(')
                        {   try
                            {   if (power == null) throw new ArithmeticException();
                                equationLower.delete(i, i + 1);
                                equationLower.insert(i, power);
                                flag = true;
                                break;
                            }   catch (ArithmeticException missingValue)
                            {   out.println("It seems the solution you are requesting needs a power value");
                                out.println("Please type a power value and try again");
                            }   
                        }
                    }
                }
            } while (flag);

            Equation = equationLower.toString();
            equationUpper.append(Equation);

            do
            {   flag = false;
                max = equationLower.length();
                for (int i = 0; i < max; i++)
                {   if (equationLower.charAt(i) == 'x')
                    {   try
                        {   if (lowerIntegrand == null) throw new ArithmeticException();
                            equationLower.delete(i, i + 1);
                            equationLower.insert(i, lowerIntegrand);
                            flag = true;
                            break;
                        }   catch (ArithmeticException missingValue)
                        {   out.println("Missing a lower integrand. Please provide one and try again.");    }
                    }
                }
            } while (flag);

            do
            {   flag = false;
                max = equationUpper.length();
                for (int i = 0; i < max; i++)
                {   if (equationUpper.charAt(i) == 'x')
                    {   try
                        {   if (upperIntegrand == null) throw new ArithmeticException();
                            equationUpper.delete(i, i + 1);
                            equationUpper.insert(i, upperIntegrand);
                            flag = true;
                            break;
                        }   catch (ArithmeticException missingValue)
                        {   out.println("Missing an upper integrand. Please provide one and try again.");    }
                    }
                }
            } while (flag);

            lower = Double.parseDouble((p_evaluator.ParenthesisRecurse(equationLower)).toString());
            out.println("lower value: " + lower);
            upper = Double.parseDouble((p_evaluator.ParenthesisRecurse(equationUpper)).toString());
            out.println("upper value: " + upper);

            out.println("\r\n\n= " + (upper - lower));
        
            out.flush();
        }
    }
}