package IDB2.FunctionWeaver.Format;

import java.util.Scanner;

public class Format {
    public Format (StringBuilder equation) {
        super();
        this.equation = equation;
    }

    static StringBuilder equation;
    private static boolean flag = false;
    private static String substitute = "";
    private static int max = 0;

    public static void check(Scanner sc) {
        do
        {   flag = false;
            max = equation.length();
            for (int i = 0; i < max; i++)
            {   if (equation.charAt(i) == 'A' || equation.charAt(i) == 'B' || equation.charAt(i) == 'C' ||
                    equation.charAt(i) == 'X' || equation.charAt(i) == 'Y' || equation.charAt(i) == 'Z')
                {   work(sc, equation.charAt(i));
                    flag = true;
                    break;
                }
                else if (equation.charAt(i) == 'n')
                {   if (equation.charAt(i-1) == '(')
                    {   work(sc, equation.charAt(i));
                        flag = true;
                        break;
                    }
                }
            }
        } while (flag);
    }

    public static void checkx(double n, Scanner sc) {
        do
        {   flag = false;
            max = equation.length();
            for (int i = 0; i < max; i++)
            {   if (equation.charAt(i) == 'x')
                {   equation.delete(i, i + 1);
                    equation.insert(i, n);
                    flag = true;
                    break;
                }
            }
        } while (flag);
    }

    private static void work(Scanner sc, char variable) {
        boolean flag2 = false;
        do
        {   flag2 = false;
            try
            {   
                System.out.println("Please select value for \'" + variable + "\'");
                substitute = sc.nextLine();
                double number = Double.parseDouble(substitute);
            }
            catch (NumberFormatException invalid)
            {   System.out.println("Invalid entry for substitution. Please try again.");
                flag2 = true;   
            }
        } while (flag2);

        do
        {   flag2 = false;
            for (int j = 0; j < equation.length(); j++)
            {   if (equation.charAt(j) == variable)
                {   equation.delete(j, j + 1);
                    equation.insert(j, substitute);
                    flag2 = true;
                    break;
                }
            }
        } while (flag2);
    }
}