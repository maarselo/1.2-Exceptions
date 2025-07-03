package Level1.view;
import Level1.exception.VoidSaleException;
import Level1.model.*;

public class App {
    public void run() {
        Sale sale = new Sale();
        try {
            sale.calculateTotal();
        } catch (VoidSaleException e) {
            System.out.println(e.getMessage()); }
        sale.getProducts().add(new Product("Spoon", 2.5));
        sale.getProducts().add(new Product("Knife", 3.10));
        sale.getProducts().add(new Product("Fork", 2.0));
        sale.getProducts().add(new Product("Spatula", 5.0));
        try {
            sale.calculateTotal();
        } catch (VoidSaleException e) {
            System.out.println(e.getMessage());}
        try {
            Product p = sale.getProducts().get(4);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
