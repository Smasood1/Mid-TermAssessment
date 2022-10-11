public class Battery extends Product implements Consumable{


    public Battery(String name, double price, Size size) {
        super(name, price, size);

    }


    @Override
    public void consume() {
        System.out.println("The battery is Dead");
    }


    @Override
    public int compareTo(Product o) {
        return 0;
    }
}
