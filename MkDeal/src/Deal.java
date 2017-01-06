import javax.xml.crypto.Data;
import java.util.Date;

/**
 * Created by User on 29.06.2015.
 */
public class Deal {
    private Date data;
    private Party buyer;
    private Party seller;
    private Product[] products;

    public Deal(Party buyer, Party seller, Product[] products) {
        this.seller = seller;
        this.buyer = buyer;
        this.products = products;
        this.data = new Date();

    }

    public Date getData() {
        return data;
    }

    public Party getBuyer() {
        return buyer;
    }

    public Party getSeller() {
        return seller;
    }

    public Product[] getProducts() {
        return products;
    }

    public double getSum() {
        double rez = 0;
        for (int i = 0; i < products.length;i++) {
            rez += products[i].getCost();
        }
return rez;
    }
}

