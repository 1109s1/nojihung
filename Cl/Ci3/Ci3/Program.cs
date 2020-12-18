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
			
            Console.WriteLine("숫자를 입력하세요.");
			int num = int.Parse(Console.ReadLine());

			for (int i = 0; i < num; i++)
			{
				for (int j = num - 1; j > i; j--)
				{
                    Console.Write (" ");
				}

				for (int j = 0; j < 2 * i + 1; j++)
				{
                    Console.Write("*");
				}
                Console.WriteLine ();
			}
		}



	}
}

           