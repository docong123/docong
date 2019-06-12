using System;
using System.Collections.Generic;

namespace DemoCsharp.Lab_session3
{
    public class Cart
    {
        private int id;
        private string customer;
        private decimal grand_total;
        private List<Product> productList;
        private string city;
        private string country;

        public int Id
        {
            get { return id; }
            set { id = value; }
        }

        public string Customer
        {
            get { return customer; }
            set { customer = value; }
        }

        public decimal GrandTotal
        {
            get { return grand_total; }
            set { grand_total = value; }
        }

        public string City
        {
            get { return city; }
            set { city = value; }
        }

        public string Country
        {
            get { return country; }
            set { country = value; }
        }

        public void AddProduct(Product p)
        {
            if (productList == null)
            {
                productList = new List<Product>();
            }

            if (p.CheckStock())
            {
                productList.Add(p);
                GrandTotal += p.Price;
                p.Qty--;
                Console.WriteLine("Add to product success...");
                return;
            }
            Console.WriteLine("het hang...");

        }

        public void RemoveProduct(Product p)
        {
            productList.Remove(p);
            Console.WriteLine("Remove product success..");
            GrandTotal -= p.Price;
            p.Qty++;
        }

        public void getTotal()
        {
            if (Country == "VN")
            {
                if (City == "HN" || City == "HCM")
                {
                    GrandTotal += (GrandTotal * 1 / 100);
                }
                else
                {
                    GrandTotal += (GrandTotal * 2 / 100);
                }
            }
            else
            {
                GrandTotal += (GrandTotal * 5 / 100);
            }

            Console.WriteLine("Tong tien: " + GrandTotal);
        }

        public static void Main(string[] args)
        {
            Product p1 = new Product(21,"01uygyuguyu",25000,2,"hahahah","description");
            Product p2 = new Product(22,"ahihidongoc", 30000,4,"ahihihi","description");
            
            Cart c1 = new Cart();
            c1.AddProduct(p1);
            c1.AddProduct(p2);
            c1.getTotal();
            
            Cart c2 = new Cart();
            c2.AddProduct(p1);
            c2.AddProduct(p2);
            c2.getTotal();
        }
    }
    
}