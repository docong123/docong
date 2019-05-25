using System;

namespace demoStudent
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            Student st = new Student();
            st.inputInfo();
            st.ShowInfo();
            st.Scholarship();
        }
    }

    class Student
    {
        private String StudentId;
        private int SumPoint;
        private int age;
        private string Class;

        

        public Student()
        {
        }

        public string Id
        {
            get { return StudentId; }
            set { StudentId = value; }
        }

        public int Avange
        {
            get
            {return SumPoint;
            }
            set  {
            SumPoint = value;
        }
        }

        public int Age
        {
            get
            {
               return age;
            }
            set { age = value; }
        }

        public string ClassId
        {
            get { return Class; }
            set { Class = value; }
        }

        public void inputInfo()
        {
            Console.Write("nhap vao ID: ");
            StudentId = Convert.ToString(Console.ReadLine());
            
            Console.Write("nhap vao diem trung binh: ");
            SumPoint = Convert.ToInt32(Console.ReadLine());
            
            Console.Write("nhap vao tuoi: ");
            age = Convert.ToInt32(Console.ReadLine());
            
            Console.Write("nhap vao lop: ");
            Class = Convert.ToString(Console.ReadLine());

        }

        public void ShowInfo()
        {
            Console.WriteLine("Thong tin hoc sinh: ");
            Console.WriteLine("ID: "+StudentId);
            Console.WriteLine("----------------");
            Console.WriteLine("SumPoint:"+SumPoint);
            Console.WriteLine("----------------");
            Console.WriteLine("age:"+age);
            Console.WriteLine("----------------");
            Console.WriteLine("class:"+Class);
        }

        public void Scholarship()
        {
            if (SumPoint>=8.0)
            {
                Console.WriteLine("hoc sinh ID:"+StudentId+" dat hoc bong");

            }
            else
            {
                Console.WriteLine("hoc sinh khong dat hoc bong");
            }
        }
    }
}