using System;
using System.Threading;

namespace DemoCsharp.DemoThread
{
    public class Happy
    {
        public static void Main(string[] args)
        {
            Thread t2 = new Thread(countDown);

            countDown(3);
            DemoThread("---------CHUC MUNG----------");
        }

        public static void DemoThread(Object msg)    
        {
            string s = (string) msg;

            while (true)
            {
                for (int i = 10; i >= 0; i--)
                {
                    Console.WriteLine(""+i);
                    Thread.Sleep(1000);
                }
            
                Console.WriteLine(s);    
            }

        }

        public static void countDown(Object phut)
        {
            int p = (int) phut;
            int giay = 25;
            int i;
            int j;

            for (i = p; i >= 0; i--)
            {
                for (j = giay; j >= 0; j--)
                {
                    if (j == 0)
                    {
                        if (i == 0 )
                        {
                            Console.WriteLine(i+" : "+j);
                            Console.WriteLine("YOU DIE");
                            break;
                        }
                    }
                    Console.WriteLine(i+" : "+j);
                    Thread.Sleep(1000);
                }

                giay = 60;
            }
        }
    }
}