import java.util.Scanner;
public class ShipCost {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //variables
        double price;
        double SHIPPING_FEE = 0.02;
        double shippingPrice;
        double total;
        //data collection
        System.out.println("What was the price of your item?");
        if (scan.hasNextDouble()) {
            price = scan.nextDouble();
            if (price >= 100) {
                shippingPrice = 0;

            }
            else {
                shippingPrice = price * SHIPPING_FEE;
            }
            //math
            total = price + shippingPrice;
            //outputs
            System.out.println("The price is: $" + total);
            System.out.println("The shipping fee was: $" + shippingPrice);

        }
        else {
            System.out.println("You have entered an invalid value");
            System.exit(0);
        }

    }
}