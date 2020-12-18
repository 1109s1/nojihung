using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ci2
{
    class Program
    {
        static void Main(string[] args)
        {
            int num = int.Parse(Console.ReadLine());
            for (int i=1; i<9; i++)
            {
                Console.WriteLine(num+"x" + i + "=" + num*i);
            }
        }
    }
}
