import java.util.Scanner;

public class InputOrderService {
    static Scanner sc = new Scanner(System.in);

    public static int idCustomer() {
        while (true) {
            try {
                System.out.println("Nhập chứng minh thư người đặt hàng");
                int idCustomer = Integer.parseInt(sc.nextLine());
                boolean check = true;
                for (int i = 0; i < OrderService.listOrder.size(); i++) {
                    if (OrderService.listOrder.get(i).getIdCustomer() == idCustomer) {
                        System.out.println("Nhập trùng sản phẩm");
                        check = false;
                        break;

                    } else if (check) {
                        return idCustomer;
                    }
                }
                return idCustomer;
            } catch (Exception e) {
                System.out.println("Nhập sai chứng minh thư");
            }
        }
    }

    public static String nameCustomer() {
        while (true) {
            try {
                System.out.println("Nhập tên khách hàng");
                String nameCustomer = sc.nextLine();
                if (!nameCustomer.trim().equals("")) {
                    return nameCustomer;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Nhập sai tên khách hàng");
            }
        }
    }

    public static int phoneCustomer() {
        while (true) {
            try {
                System.out.println("Nhập số điện thoại khách hàng");
                int phoneCustomer = Integer.parseInt(sc.nextLine());
                return phoneCustomer;
            } catch (Exception e) {
                System.out.println("Nhập sai số điện thoại");
            }
        }
    }

    public static int idOrders() {
        while (true) {
            try {
                System.out.println("Nhập mã đơn hàng");
                int idOrders = Integer.parseInt(sc.nextLine());
                return idOrders;
            } catch (Exception e) {
                System.out.println("Nhập mã sản phẩm");
            }
        }
    }

//    public static String nameProductOrder() {
//        while (true) {
//            try {
//                System.out.println("Nhập tên sản phẩm của đơn hàng");
//                String nameProductOrder = sc.nextLine();
//                if (!nameProductOrder.trim().equals("")) {
//                    return nameProductOrder;
//                } else {
//                    throw new Exception();
//                }
//            } catch (Exception e) {
//                System.out.println("Nhập sai tên sản phẩm đơn hàng");
//            }
//        }
//    }

    public static int quanityOrder() {
        while (true) {
            try {
                Store store = new Store();
                System.out.println("Nhập số lượng đơn hàng");
                int quanityOrder = Integer.parseInt(sc.nextLine());
                System.out.println("Kiểm tra số lượng hàng của mã sản phẩm");
                String idProduct = IdProduct();
                int quanityProduct = OrderService.findByIdProduct(idProduct).getQuanityProduct();
                double priceProduct = OrderService.findByIdProduct(idProduct).getPriceProduct();
                if (quanityProduct >= quanityOrder && quanityProduct != 0) {
                    OrderService.findByIdProduct(idProduct).setQuanityProduct(quanityProduct - quanityOrder);
                    double salesStore = priceProduct*(quanityProduct - quanityOrder);
                    OrderService.listStore.add(new Store(salesStore));
                    System.out.println("Nhập thành công");
                    return  quanityOrder;
                } else {
                    System.out.println("Trong kho không đủ sản phẩm");
                }
            } catch (Exception e) {
                System.out.println("Nhập sai số lượng đơn hàng");
            }
        }
    }

    static boolean checkIdProduct() {
        for (int i = 0; i < ProductManager.listProduct.size(); i++) {
            if (ProductManager.listProduct.get(i).equals(IdProduct())) {
                return true;
            }
        }
        return false;
    }

    public static String IdProduct() {
        while (true) {
            try {
                System.out.println("Nhập mã sản phẩm ");
                String idProduct = sc.nextLine();
                for (int i = 0; i < ProductManager.listProduct.size(); i++) {
                    if (ProductManager.listProduct.get(i).getIdProduct().equals(idProduct)) {
                        return idProduct;
                    }
                }throw new Exception();
            } catch (Exception e) {
                System.out.println("Nhập lại mã sản phẩm (mã sản phẩm sai hoặc không có mã sản phẩm này)");
            }
        }
    }


//    public static Product findByIdProduct(String iD) {
//        Product product = null;
//        for (Product p: ProductManager.listProduct) {
//            if (p.getIdProduct().equals(iD)) {
//               product = p;
//            }
//        }
//        return product;
//    }
//


    public static Order addOrder() {
        return new Order(idOrders(), idCustomer(), nameCustomer(), phoneCustomer(), IdProduct(), quanityOrder());
    }
}
