import java.util.*;

public class App {
    public static void main(String[] args) {

    //instance of adming

        Admin ad2 = new Admin("Smasood","1234ABCD");

        Battery duracell = new Battery("Duracell",10.00,Size.S);
        IceCream icecream = new IceCream("Chocalate",5.00,Size.L);
        PostalStamp stamp = new PostalStamp("USA Stamps",1.25,Size.X,50);


        ArrayList<String> addresses = new ArrayList<>();
        addresses.add(0,"2120 bush road");
        addresses.add(1,"41 Yes ct");

        Product[] products = {duracell,icecream,stamp};

        Customer customer1 = new Customer("Custom1","c123",25,45.00,addresses,Size.L,products);
        Customer customer2 = new Customer("Custom2","cus49058",145,450.00,new ArrayList<>(Arrays.asList("2120 bush road","41 Yes ct")),Size.L,new Product[] {duracell,icecream,stamp});
        Customer customer3 = new Customer("Custom3","uh398",100,200.55,new ArrayList<>(Arrays.asList("2120 bush road","41 Yes ct")),Size.L,new Product[] {duracell,icecream,stamp});


        //setting balance

        customer1.setAccountBalance(-150.0);
        //getting and printing updated balance
        System.out.println("getting and printing updated balance");
        System.out.println(customer1.getAccountBalance());

        customer1.setRewardPoints(1000);
        System.out.println(" ");
        System.out.println("Using 100 points from Customer 1");
        System.out.println(customer1.getRewardPoints() - 100);
        customer1.setRewardPoints(900);
        System.out.println(" ");
        System.out.println("Print secondary address of customer 1");
        System.out.println(customer1.getAddresses(1));

        System.out.println(" ");

        System.out.println("Setting customer1's size to Medium");
        customer1.setSize(Size.M);
        System.out.println(customer1.getSize());

        System.out.println(" ");

        System.out.println("Printing out customers information");
        customer1.print();

        IPrint[] printables = {stamp,customer1,customer2,customer3,ad2};
        System.out.println("Printing all objects that are printable");
        printAllPrintableObjects(printables);

        System.out.println(" ");


        Consumable[] consumables = {duracell,icecream};
        System.out.println("Consuming all Consumables");
        consumeConsumables(consumables);

        System.out.println("Getting total price of customers products");
        getTotalPriceOfCustomerProducts(customer1);


        System.out.println(" ");
        System.out.println("Reverse sorting and printing all products by price");
        ArrayList<Product> cart = new ArrayList<>();
        cart.add(0,icecream);
        cart.add(1,stamp);

        cart.add(2,duracell);


        reverseSortAndPrintAllProductsByPrice(cart);

    }






    public static void printAllPrintableObjects(IPrint[] printables){
        for(int i = 0; i < printables.length; i++){
            System.out.println(printables[i]);

        }
    }

    public static void consumeConsumables(Consumable[] consumables){
        for(int i = 0; i < consumables.length; i++){
            consumables[i].consume();

        }
    }

    public static void getTotalPriceOfCustomerProducts(Customer customer){





    }

//    public static String getSecondaryAddressOfCustomer(Customer customer){
//
//    }
//
    public static void reverseSortAndPrintAllProductsByPrice(ArrayList<Product> products){

        Comparator jc = new ProductPriceCompare();
        Collections.sort(products,jc);

        for (Product x: products) {
            System.out.println(x.getName() + " " + "$" +x.getPrice());

        }

    }
//
//    public static ArrayList<Double> getListOfProductPricesGreaterThanThePriceOfProductGiven(ArrayList<Product> products){
//
//    }
//
//    public static void addASingleProductToDirectoryTiedToCustomerByNameThenPrint(Map<String, Product> map1, Customer customerm, Product product){
//
//
//    }
}
