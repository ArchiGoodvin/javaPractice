/**
 * Created by User on 01.07.2015.
 */
public class FotoProduct extends Product {
    private double mp;
    private boolean digital;
    FotoProduct(String title, double quantity, double price,double mp, boolean digital) {
        super(title, quantity, price);
        this.mp = mp;
        this.digital = digital;
    }
    public double calcDiscount(){
        return super.calcDiscount() + 30;

    }

}
