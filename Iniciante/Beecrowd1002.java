/* https://www.beecrowd.com.br/judge/en/problems/view/1002
Area of a Circle

The formula to calculate the area of a circumference is defined as A = π . R2. Considering to this problem that π = 3.14159:
Calculate the area using the formula given in the problem description.

Input
The input contains a value of floating point (double precision), that is the variable R.

Output
Present the message "A=" followed by the value of the variable, as in the example bellow, with four places after the decimal point.
Use all double precision variables.

Input:
2.00

Output:
A=12.5664

*/

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1002 {

public static void main(String[] args) throws IOException {

    Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);

       double r = sc.nextDouble();
       r = Math.pow(r,2);
       double a = 3.14159 * r;

       System.out.printf("A=%.4f%n",a);
       sc.close();
    }
}