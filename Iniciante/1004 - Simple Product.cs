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