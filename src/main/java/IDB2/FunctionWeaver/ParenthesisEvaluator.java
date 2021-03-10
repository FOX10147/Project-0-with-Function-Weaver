package IDB2.FunctionWeaver;

import IDB2.FunctionWeaver.Interfaces.*;

public class ParenthesisEvaluator implements Prime, PartialStrings {
    private boolean flag = false;
    protected char code = ' ';

    public StringBuilder ParenthesisRecurse(StringBuilder equation) 
    {   boolean M = true;
        boolean A = true;
        int count = 0;
        int substringStart = 0;
        int substringEnd = 0;
        int j = equation.length();

        // This section will look for chained functions inside parenthesis.
        // Any parenthesis with functions in them will be evaulated first
        // by starting another ParenthesisEvaluator object with chain function.
        for (int i = 0; i < j; i++) 
        {   if (equation.charAt(i) == '(') 
            {   count++;
                if (count == 1) 
                    substringStart = i + 1;
            }
            else if (equation.charAt(i) == ')') 
            {   count--;
                if (count == 0) 
                {   substringEnd = i;
                    code = 'P';
                    i = weaveAnotherString(equation, substringStart, substringEnd, i, code);
                    j = equation.length();
                }
            }
        }
        
        // This large section will look for elementary functions and evaluate them as appropriate.
        do 
        {   flag = false;
            substringStart = 0;
            substringEnd = 0;
            j = equation.length();
            for (int i = 0; i < j; i++) 
            {   if (equation.charAt(i) == 'a')
                {   if (equation.charAt(i+1) == 'c')
                    {   if (equation.charAt(i+2) == 'o')
                        {   if (equation.charAt(i+3) == 's')
                            {   substringStart = i;
                                for (int k = i+5; k < j; k++)
                                if (equation.charAt(k) == ')')
                                {   substringEnd = k + 1; break;    }
                                code = 'w';
                                i = weaveAnotherString(equation,substringStart, substringEnd, i, code);
                                flag = true;
                                break;
                            }
                            else if (equation.charAt(i+3) == 't')
                            {   substringStart = i;
                                for (int k = i+5; k < j; k++)
                                if (equation.charAt(k) == ')')
                                {   substringEnd = k + 1; break;    }
                                code = 'Z';
                                i = weaveAnotherString(equation,substringStart, substringEnd, i, code);
                                flag = true;
                                break;
                            }
                        }
                        else if (equation.charAt(i+2) == 's')
                        {   if (equation.charAt(i+3) == 'c')
                            {   substringStart = i;
                                for (int k = i+5; k < j; k++)
                                if (equation.charAt(k) == ')')
                                {   substringEnd = k + 1; break;    }
                                code = 'Y';
                                i = weaveAnotherString(equation,substringStart, substringEnd, i, code);
                                flag = true;
                                break;
                            }
                        }
                    }
                    else if (equation.charAt(i+1) == 's')
                    {   if (equation.charAt(i+2) == 'e')
                        {   if (equation.charAt(i+3) == 'c')
                            {   substringStart = i;
                                for (int k = i+5; k < j; k++)
                                if (equation.charAt(k) == ')')
                                {   substringEnd = k + 1; break;    }
                                code = 'W';
                                i = weaveAnotherString(equation,substringStart, substringEnd, i, code);
                                flag = true;
                                break;
                            }
                        }
                        else if (equation.charAt(i+2) == 'i')
                        {   if (equation.charAt(i+3) == 'n')
                            {   substringStart = i;
                                for (int k = i+5; k < j; k++)
                                if (equation.charAt(k) == ')')
                                {   substringEnd = k + 1; break;    }
                                code = 'y';
                                i = weaveAnotherString(equation,substringStart, substringEnd, i, code);
                                flag = true;
                                break;
                            }
                        }
                    }
                    else if (equation.charAt(i+1) == 't')
                    {   if (equation.charAt(i+2) == 'a')
                        {   if (equation.charAt(i+3) == 'n')
                            {   substringStart = i;
                                for (int k = i+5; k < j; k++)
                                if (equation.charAt(k) == ')')
                                {   substringEnd = k + 1; break;    }
                                code = 'z';
                                i = weaveAnotherString(equation,substringStart, substringEnd, i, code);
                                flag = true;
                                break;
                            }
                        }
                    }
                }
                
                if (equation.charAt(i) == 'c')
                {   if (equation.charAt(i+1) == 'o')
                    {   if (equation.charAt(i+2) == 's')
                        {   substringStart = i;
                            for (int k = i + 4; k < j; k++)
                                if (equation.charAt(k) == ')')
                                {   substringEnd = k + 1; break;    }
                                code = 'U';
                                i = weaveAnotherString(equation, substringStart, substringEnd, i, code);
                                flag = true;
                                break;
                        }
                        else if (equation.charAt(i+2) == 't')
                        {   {   substringStart = i;
                            for(int k = i + 4; k < j; k++)
                                if (equation.charAt(k) == ')')
                                {   substringEnd = k + 1; break;  }
                            code = 'v';
                            i = weaveAnotherString(equation, substringStart, substringEnd, i, code);
                            flag = true;
                            break;
                        }
                        }
                    }
                    else if (equation.charAt(i+1) == 's') 
                    {   if (equation.charAt(i+2) == 'c') 
                        {   substringStart = i;
                            for(int k = i + 4; k < j; k++)
                                if (equation.charAt(k) == ')')
                                {   substringEnd = k + 1; break;  }
                            code = 'u';
                            i = weaveAnotherString(equation, substringStart, substringEnd, i, code);
                            flag = true;
                            break;
                        }
                    }
                }
                
                if (equation.charAt(i) == 'e') 
                {   if (equation.charAt(i+1) == '^') 
                    {   substringStart = i;
                        substringEnd = i+2;
                        for(int k = i + 2; k < j; k++)
                        {   if (equation.charAt(k) == ')')
                            {   substringEnd++; break;  }
                            else substringEnd++;
                        }
                        code = 'E';
                        i = weaveAnotherString(equation, substringStart, substringEnd, i, code);
                        flag = true;
                        break;
                    }
                }
                
                if (equation.charAt(i) == '^') 
                {   substringStart = putMarker1(equation, i, substringStart);
                    substringEnd = putMarker2(equation, i + 1, substringEnd);
                    code = '^';
                    i = weaveAnotherString(equation, substringStart, substringEnd, i, code);
                    flag = true;
                    break;
                }
            
                if (equation.charAt(i) == 's') 
                {   if (equation.charAt(i+1) == 'e') 
                    {   if (equation.charAt(i+2) == 'c') 
                        {   substringStart = i;
                            for(int k = i + 4; k < j; k++)
                                if (equation.charAt(k) == ')')
                                {   substringEnd = k + 1; break;  }
                            code = 't';
                            i = weaveAnotherString(equation, substringStart, substringEnd, i, code);
                            flag = true;
                            break;
                        }
                    }
                    else if (equation.charAt(i+1) == 'i') 
                    {   if (equation.charAt(i+2) == 'n') 
                        {   substringStart = i;
                            for(int k = i + 4; k < j; k++)
                                if (equation.charAt(k) == ')')
                                {   substringEnd = k + 1; break;  }
                            code = 'T';
                            i = weaveAnotherString(equation, substringStart, substringEnd, i, code);
                            flag = true;
                            break;
                        }
                    }
                    else if (equation.charAt(i+1) == 'q') 
                    {   if (equation.charAt(i+2) == 'r') 
                        {   if (equation.charAt(i+3) == 't') 
                            {   substringStart = i;
                                for(int k = i + 5; k < j; k++)
                                    if (equation.charAt(k) == ')')
                                    {   substringEnd = k + 1; break;  }
                                code = 'R';
                                i = weaveAnotherString(equation, substringStart, substringEnd, i, code);
                                flag = true;
                                break;
                            }
                        }
                    }
                }

                if (equation.charAt(i) == 't') 
                {   if (equation.charAt(i+1) == 'a') 
                    {   if (equation.charAt(i+2) == 'n') 
                        {   substringStart = i;
                            for(int k = i + 4; k < j; k++)
                                if (equation.charAt(k) == ')')
                                {   substringEnd = k + 1; break;  }
                            code = 'V';
                            i = weaveAnotherString(equation, substringStart, substringEnd, i, code);
                            flag = true;
                            break;
                        }
                    }
                }

                if (equation.charAt(i) == 'l') 
                {   if (equation.charAt(i+1) == 'o') 
                    {   if (equation.charAt(i+2) == 'g') 
                        {   substringStart = i;
                            for(int k = i + 3; k < j; k++)
                                if (equation.charAt(k) == ')')
                                {   substringEnd = k + 1; break;  }
                            code = 'L';
                            i = weaveAnotherString(equation, substringStart, substringEnd, i, code);
                            flag = true;
                            break;
                        }
                    }
                }
            }
        }
        while (flag);

        // This section gets rid of parenthesis as they are no longer needed at this point.
        do 
        {   flag = false;
            for (int i = 0; i < equation.length(); i++)
            {   if (equation.charAt(i) == '(' || equation.charAt(i) == ')')
                {   equation.delete(i, i + 1);
                    flag = true;
                    break;
                }
            }
        }   
        while(flag);

        // This section will evaluate from left to right multiplication and division which have same precedence as each other.
        do
        {   flag = false;
            substringStart = 0;
            substringEnd = 0;
            j = equation.length();
            for (int i = 0; i < j; i++)
            {   if (equation.charAt(i) == '*' || equation.charAt(i) == '/')
                {   if (equation.charAt(i) == '*') M = true;
                    else if (equation.charAt(i) == '/') M = false;
                    substringStart = putMarker1(equation, i, substringStart);
                    substringEnd = putMarker2(equation, i, substringEnd) - 1;
                    if (M) code = '*';
                    else if (!M) code = '/';
                    i = weaveAnotherString(equation, substringStart, substringEnd, i, code);
                    flag = true;
                    break;
                }
            }
        }
        while (flag);

        do
        {   boolean flag3;
            flag = false;
            substringStart = 0;
            substringEnd = 0;
            j = equation.length();

            do
            {   flag3 = false;
                if (equation.charAt(0) == '-' && equation.charAt(1) == '-')
                {   equation.delete(0,2);
                    j = equation.length();
                    flag3 = true;
                }
            } while (flag3);

            for (int i = 1; i < j; i++)
            {   if (equation.charAt(i) == '+' || equation.charAt(i) == '-')
                {   if (equation.charAt(i) == '+') A = true;
                    else if (equation.charAt(i) == '-') A = false;
                    substringStart = putMarker1(equation, i, substringStart);
                    substringEnd = putMarker2(equation, i, substringEnd) - 1;
                    try 
                    {   if (equation.charAt(substringStart - 1) == '-')
                        {   substringStart -= 1;    }
                    }   
                    catch (StringIndexOutOfBoundsException oops) {}
                    if (A) code = '+';
                    else if (!A) code = '-';
                    i = weaveAnotherString(equation, substringStart, substringEnd, i, code);
                    flag = true;
                    break;
                }
            }
        }
        while(flag);
        
        if (equation.charAt(0) == '+') equation.delete(0,1);

        return equation;
    }
}