using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Answer
{
    class Program
    {
        static void Main(string[] args)
        {//복습
         //java : system.out.println("Hello");
         //c# : Console.WriteLine("Hollo");

            //java : system.out.pring("Hello");
            //c# : Console.Write();

            int example = 100;
            //단 string 변수는 String 이랑 string둘다 동일하게 쓸수있음.
            //c#에서는 보통 s를 소문자로 적는다.
            string ex1 = "하이";
            string ex2 = "헬로";
            string 한글도변수됨 = "근데안쓰는게좋다네";

            //문자열과 숫자 혼합하기
            string ex3 = example + "더하기" + example + "온" + (example + example) + "이다";
            string ex4 = $"{example}더하기{example}은{example + example}이다.";
            string ex5 = string.Format("{0}더하기{1}은{2}이다.", example, example, example, example + example);

            Console.WriteLine(ex5);
            Console.WriteLine(ex4);
            Console.WriteLine(ex3);

            //조건문
            //java와 동일함
            if (example > 50)
            {
                Console.WriteLine("example은 50이상);;
}
            {
                if(example>30)
                    Console.WriteLine("30이상");

            }
            else
            {
                Console.WriteLine("30미만");
            }
            if (example == 10) ;
            {
                Console.WriteLine("10");

            }
            else if (exampl == 20) ;
            {
                Console.WriteLine("20");
            }
           else
            { Console.WriteLine("10이랑 20은 아님");}
                    
                    // 끝에 꼭 else 안 붙여도 됨


           //switch도 java와 동일
           switch(example)
            {
                case 10:
                    Console.WriteLine("10");
                    break;
                case 20:
                    Console.WriteLine("20");
                    break;
                default:
                    Console.WriteLine("10이랑 20은 아니다.");
                    break;
            }
            //반복문도 java와동일
            //단 foreach라는 특수 문법이 있는데 이건 나중에
            for (int i=0;i<10,i++)
            {
                Console.WriteLine("같은 말 10번 반복하기");
            }
            int temp = 10;
            while (temp>10)
            {
                temp--;
            }
            do
            {
                temp++;
            } while (temp < 10);


            //값을 입력받는 경우
            //java
            /*
             * Scanner s + New Scanner(system.in);
             * String testt = s.nextLine();
             * int test2 = s.nextLine();
             */
            //c#
            //String test = Console.ReadLine();
            //int test2 = int.Parse(Console.ReadLine());
            //Console.ReadLine는 단축키 x
            string test = Console.ReadLine();
            int test2 = int.Parse(Console.ReadLine());
    {

            }
            {

            }
        }
    }
}
