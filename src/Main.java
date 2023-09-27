
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double price;
        double shipping;
        double shippingInt = 0.02;
        double total;

        System.out.println("What is the price of the item?");
        if (scan.hasNextDouble()) {
            price = scan.nextDouble();
            if (price >= 100)
                System.out.println("Shipping is free, the total is $" + price);
            else {
                shipping = price * shippingInt;
                total = price + shipping;
                System.out.println("Shipping is $" + shipping + " which brings the total to $" + total);
            }
                }
        else
            System.out.println("The value you entered was incorrect");
                }
        }