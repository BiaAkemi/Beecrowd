/*
    Simple Sum
    https://www.beecrowd.com.br/judge/en/problems/view/1003

Read two integer values, in this case, the variables A and B. After this, calculate the sum between them and assign it to the variable SOMA. Write the value of this variable.

Input
The input file contains 2 integer numbers.

Output
Print the message "SOMA" with all the capital letters, with a blank space before and after the equal signal followed by the corresponding value to the sum of A and B.

Input:
30
10

Output:
SOMA = 40

 */

import java.util.Scanner;
public class Beecrowd1003 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int soma = A + B;
        System.out.print("SOMA = " + soma);

        sc.close();
    }
}