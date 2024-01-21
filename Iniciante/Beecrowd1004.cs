/*
Read two integer values. After this, calculate the product between them and store the result in a variable named PROD. Print the result like the example below. Do not forget to print the end of line after the result, otherwise you will receive “Presentation Error”.

Input
The input file contains 2 integer numbers.

Output
Print the message "PROD" and PROD according to the following example, with a blank space before and after the equal signal.
*/

using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Beecrowd1004
{
    public class 1004 - Simple Product
    {
        public static void Main()
        {
            int n1, n2, prod;

            n1 = Convert.ToInt32(Console.ReadLine());
            n2 = Convert.ToInt32(Console.ReadLine());

            prod = n1 * n2;

            Console.WriteLine("PROD = " + prod);
        }
    }
}