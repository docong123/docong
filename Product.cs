using System;
using System.Collections.Generic;

namespace DemoCsharp.Lab_session3
{
    public class Product
    {
        private int id;
        private string name;
        private decimal price;
        private int qty;
        private string image;
        private string desc;
        public List<string> gallary;

        public int Id
        {
            get { return id; }
            set { id = value; }
        }

        public string Name
        {
            get { return name; }
            set { name = value; }
        }

        public decimal Price
        {
            get { return price; }
            set { price = value; }
        }

        public int Qty
        {
            get { return qty; }
            set { qty = value; }
        }

        public string Image
        {
            get { return image; }
            set { image = value; }
        }

        public string Desc
        {
            get { return desc; }
            set { desc = value; }
        }

        public Product() {}

        public Product(int id, string name, decimal price, int qty, string image, string desc)
        {
            this.id = id;
            this.name = name;
            this.price = price;
            this.qty = qty;
            this.image = image;
            this.desc = desc;
            this.gallary = new List<string>();
        }
        

        public void GetInfo()
        {
            Console.WriteLine("Id "+id);
            Console.WriteLine("Name "+name);
            Console.WriteLine("Price "+price);
            Console.WriteLine("Qty "+qty);
            Console.WriteLine("Image "+image);
            Console.WriteLine("Desc "+desc);
            Console.WriteLine("Gallary "+gallary);
        }

        public bool CheckStock()
        {
            if (Qty > 0)
            {
                Console.WriteLine("In-Stock");
                return true;
            }

            return false;
        }

        public void CheckStock1()
        {
            if (Qty > 0)
            {
                Console.WriteLine("In-Stock");
                return;
            }
            Console.WriteLine("Out-of-Stock");
        }

        public void AddImage(string image)
        {
            if (gallary.Count >= 10)
            {
                Console.WriteLine("Max 10 image");
                return;
            }
            gallary.Add(image);
            Console.WriteLine("add to image success.");
        }

        public void RemoveImage()
        {
            int i = 0;
            foreach (string s in gallary)
            {
                Console.WriteLine(i+". "+s);
                i++;
            }
            Console.WriteLine("Choose image: ");
            int x = Convert.ToInt16(Console.ReadLine());
            gallary.RemoveAt(x);
            Console.WriteLine("Delete success...");
        }
        
    }
}
