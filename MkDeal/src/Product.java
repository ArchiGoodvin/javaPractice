/**
 * Created by User on 29.06.2015.
 */
public class Product {
private String title;
private double quantity;
private double price;
    private static double DISKOUNT_PERCENT = 10;
    private static double MIN_PIECES_TO_GET_DISCOUNT= 2;


    Product(String title, double quantity, double price){
        this.title=title;
        this.quantity=quantity;
        this.price=price;
    }
    public String getTitle(){
        return title;
    }
    public double getQuantity(){
        return quantity;
    }
    public double getPrice(){
        return price;
    }

    public double getCost(){
        double diskount = calcDiscount();
        double realPrice = calcRealPrice();
        return realPrice - (realPrice*(diskount/100));

    }

    public double calcDiscount(){
        if(quantity >= MIN_PIECES_TO_GET_DISCOUNT){
            return DISKOUNT_PERCENT;
        }
        else
            return 0;

    }
    private double calcRealPrice(){
        return this.quantity*this.price;

    }

}
