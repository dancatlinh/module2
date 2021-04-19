import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderService {
    static Scanner sc = new Scanner(System.in);
    static List<Order> listOrder = new ArrayList();
    static List<Store> listStore = new ArrayList();

    public void addOrder() {
        listOrder.add(InputOrderService.addOrder());
    }

    public void displaylistOrder() {
        for (int i = 0; i < listOrder.size(); i++) {
            System.out.println(listOrder.get(i).toString());
        }
    }

    public static Product findByIdProduct(String iD) {
        Product product = null;
        for (Product p: ProductManager.listProduct) {
            if (p.getIdProduct().equals(iD)) {
                product = p;
            }
        }
        return product;
    }

    public void displaySalesOrder() {
        for (int i = 0; i < listStore.size(); i++) {
            System.out.println(OrderService.listStore.get(i).toString());
        }
    }


}
