public class PostalStamp extends Product implements LickAble, IPrint{



    private int amount;

    public PostalStamp(String name, double price, Size size, int amount) {
        super(name, price, size);
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "PostalStamp{" +
                "amount=" + amount +
                '}';
    }

    @Override
    public void print() {
        System.out.println("PostalStamp" + "\nAmount: " + amount);
    }


    @Override
    public int compareTo(Product o) {
        return 0;
    }
}
