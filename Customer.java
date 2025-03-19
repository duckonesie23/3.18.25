public class Customer {
    private String name;
    private String address;

    public Customer(String n, String a)  //constructor
    {
       name = n;
       address = a;
    }

    public String toString()  //toString
    {
       return "Name: " + name + "\nAddress: " + address;
    }



    public static void main(String[] args)
    {
       Customer c = new Customer("Fran Santiago", "123 Main St., Anytown, USA");
       System.out.println(c);

       // Uncomment these to test OnlineCustomer
        OnlineCustomer c2 = new OnlineCustomer("Jasper Smith", "456 High St., Anytown, USA", "jsmith456@gmail.com");
        System.out.println(c2);  //call the class toString
    }

}
