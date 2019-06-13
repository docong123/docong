using System;
namespace PRATICAL
{
    internal class ConTactManager
    {
        private String Name;
        private String PhoneNumber;

        public ConTactManager()
        {
        }

        public ConTactManager(string name, string phoneNumber)
        {
            Name = name;
            PhoneNumber = phoneNumber;
        }

        public string Name1
        {
            get { return Name; }
            set { Name = value; }
        }

        public string PhoneNumber1
        {
            get { return PhoneNumber; }
            set { PhoneNumber = value; }
        }
    }
}