import java.util.ArrayList;
import java.util.Arrays;

public class Customer extends User implements IPrint{

   private int rewardPoints;
   private double accountBalance;
   private ArrayList<String> addresses;
   private Size size;
   private Product [] product;

   public Customer(String username, String password, int rewardPoints, double accountBalance, ArrayList<String> addresses, Size size, Product[] product) {
      super(username, password);
      this.rewardPoints = rewardPoints;
      this.accountBalance = accountBalance;
      this.addresses = addresses;
      this.size = size;
      this.product = product;
   }

   public int getRewardPoints() {
      return rewardPoints;
   }

   public void setRewardPoints(int rewardPoints) {
      this.rewardPoints = rewardPoints;
   }

   public double getAccountBalance() {
      return accountBalance;
   }

   public void setAccountBalance(double accountBalance) {
    if(accountBalance > 0){
       this.accountBalance = accountBalance;
    }
   }

   public ArrayList<String> getAddresses(int index) {

      if(index == 0){
         System.out.println(addresses.get(0));
      }else if (index == 1){
         System.out.println(addresses.get(1));
      }
      return null;
   }

   public void setAddresses(ArrayList<String> addresses) {
      this.addresses = addresses;
   }



   public Size getSize() {
      return size;
   }

   public void setSize(Size size) {
      this.size = size;
   }

   public Product[] getProduct() {
      return product;
   }

   public void setProduct(Product[] product) {
      this.product = product;
   }


   @Override
   public String toString() {
      return "Customer: " + getUsername() + "\nRewardPoints: " + rewardPoints + "\nAccount Balance: " + accountBalance + "\nAddresses=" + addresses + "\nSize: " + size + "\nProduct:" + "\n"+ Arrays.toString(product);
   }

   public static void useRewardPoints(int i){

    }


   @Override
   public void print() {
      System.out.println("Customer: " + getUsername() + "\nRewardPoints: " + rewardPoints + "\nAccount Balance: " + accountBalance + "\nAddresses=" + addresses + "\nSize: " + size + "\nProduct:" + "\n"+ Arrays.toString(product));
   }
}
