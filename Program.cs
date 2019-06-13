using System;
using System.Collections;

namespace PRATICAL
{
    class Program {
    public  static void Main(string[] args)
        {
            bool running = true;
            int choosed ;
            mainAction aciton = new mainAction();
            while (running)
            {
                Console.WriteLine("Enter Number 1-4: ");
                Console.WriteLine("1: Add New Contact");
                Console.WriteLine("2: Find A Contact By Name");
                Console.WriteLine("3: Display All Contact");
                Console.WriteLine("4: Exit Program \n");
                try {
                    String choosedS = Console.ReadLine();
                    choosed = Int32.Parse(choosedS); 
                } catch(FormatException){
                    Console.WriteLine("only number in beetwen 1 and 4!");
                    continue;
                }
                

                switch(choosed){
                    case 1 :
                        aciton.AddContact();
                        break;
                    case 2 :
                        aciton.findByName();
                        break;
                    case 3 :
                        aciton.displayContact();
                        break;
                    case 4 :
                        running = false;
                        break;
                    default :
                        Console.WriteLine("Unaccpeted input ");
                        break;
                }
            }

        }
    }

    class mainAction
    {
        Hashtable contactTable= new Hashtable();
        public mainAction()
        {
        }

        public void AddContact(){
            Console.WriteLine("enter name: ");
            String conTactName = Console.ReadLine();
            Console.WriteLine("enter phoneNumber: ");
            String phoneNumber = Console.ReadLine();
            this.contactTable.Add(conTactName,phoneNumber);
        }
        public void findByName(){
            Console.Write("Enter the name you want to find:  ");
            String conTactName = Console.ReadLine();
            if (this.contactTable.ContainsKey(conTactName))
            {
                Console.WriteLine(conTactName + ": "+this.contactTable[conTactName]);
            }
            else
            {
                Console.WriteLine("not found this user");
            }
        }
        public void displayContact(){
            ICollection key = this.contactTable.Keys;

            foreach (string k in key)
            {
                Console.WriteLine(k + ": " + this.contactTable[k]);
            }

        }
    }
}
