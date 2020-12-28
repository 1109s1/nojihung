using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace C_sooup
{
    class Program
    {
        private static int[] numbers;

        private static void Main()
        {
            int min = int.MaxValue;
            int max = int.MinValue;

            numbers = new int[int.Parse(Console.ReadLine())];

            string[] args = Console.ReadLine().Split(' ');
            for (int i = 0; i < numbers.Length; i++)
            {
                int arg = int.Parse(args[i]);

                if (arg < min) min = arg;
                if (max < arg) max = arg;
            }

            Console.Write(min.ToString() + " " + max.ToString());
        }
    }
}