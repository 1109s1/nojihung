using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ci3
{
    class Program
    {
        static void Main(string[] args)
        {
            int num = 5;
            for (int i = 0; i < num; i++)
            {
                for (int j = num - 1; j > i; j--)
                {
                    Console.WriteLine(""); 
                }

                for (int j = 0; j < 2 * i + 1; j++)
                {
                    Console.WriteLine("*");
                }
                Console.WriteLine("\n");             }
        }
    }
}
