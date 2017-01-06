import javax.xml.crypto.Data;
import java.util.Collection;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by User on 29.06.2015.
 */
public class Program {

    Collection<Deal>deals;

    private int MAX_DEALS;
    private int MAX_PRODUCTS = 3;


    public static void main(String... args) {
        new Program().allActions();
    }

    private void allActions() {
        input();
        output();

    }

    // input part
    private void input() {
        MAX_DEALS = Integer.parseInt(stringInput("How many deals have been done?"));
        deals = new Deal[MAX_DEALS];
        for (int i = 0; i < deals.length; i++) {
            System.out.println("Deal " + (i + 1) + " of " + (deals.length));
            System.out.println("_________________________");
            deals[i] = inputDeal();
        }
    }

    private Deal inputDeal() {
        do {
            MAX_PRODUCTS = Integer.parseInt(stringInput("How many products have been bought?"));
            if (MAX_PRODUCTS <= 0)
                inputError();
        } while (MAX_PRODUCTS <= 0);
        Party seller = inputParty("Enter seller's name: ");
        Party buyer = inputParty("Enter buyer's name: ");

        Product[] products = new Product[MAX_PRODUCTS];
        for (int i = 0; i < MAX_PRODUCTS; i++) {
            products[i] = inputProducts(i);
        }
        Deal deal = new Deal(buyer, seller, products);
        return deal;


    }

    private void inputError() {
        System.out.println("    The input number must be over 0");
    }


    private Product inputProducts(int numOfProduct) {

        String name = stringInput("Name of product " + (numOfProduct + 1) + ":");
        double quantity = Double.parseDouble(stringInput("Quantity of product " + (numOfProduct + 1) + ":"));
        double price = Double.parseDouble(stringInput("Price of product " + (numOfProduct + 1) + ":"));
        Product product = new Product(name, quantity, price);
        return product;
    }

    private Party inputParty(String message) {
        String name = stringInput(message);
        Party party = new Party();
        party.setName(name);
        return party;
    }

    private String stringInput(String message) {
        System.out.println(message);
        Scanner scan = new Scanner(System.in);
        return scan.next();

    }

    // output part
    private void output() {
        System.out.println("===================================");
        System.out.println("===================================");
        switch (deals.length) {
            case 0:
                System.out.println("There were no deal");
                break;
            default:
                for (int i = 0; i < deals.length; i++) {
                    System.out.println("Deal #" + (i + 1));
                    System.out.println(deals[i].getData() + "  " + deals[i].getSeller().getName() + " sells to " + deals[i].getBuyer().getName());
                    System.out.println("------------");
                    for (int j = 0; j < deals[i].getProducts().length; j++) {

                        double diskountPercent = deals[i].getProducts()[j].calcDiscount();

                        System.out.println("     " + deals[i].getProducts()[j].getTitle() + outputDiskountInfo(diskountPercent)+ deals[i].getProducts()[j].getPrice()
                                + " x " + deals[i].getProducts()[j].getQuantity() + " = " + deals[i].getProducts()[j].getCost());
                    }
                    System.out.println("     TOTAL COST: " + deals[i].getSum());
                    break;


                }


        }


    }

    private String outputDiskountInfo(double discount) {
        if (discount == 0) {
           return "";


        }
        else
        {
            return (" (-"+discount+" percent discount)");
        }

    }
}


