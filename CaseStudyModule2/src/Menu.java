import java.util.Scanner;

public class Menu {

    public static void MenuSort() {
        System.out.println("1. Sắp xếp theo thứ tự giảm dần");
        System.out.println("2. Sắp xếp theo thứ thự tăng dần");
        System.out.println("0. Thoát");
    }

    public static void MenuChooseProgram() {
        System.out.println("-----------Chọn chương trình quản lý-----------");
        System.out.println("1. Quản lý sản phẩm");
        System.out.println("2. Quản lý đơn hàng ");
        System.out.println("0. Thoát");
    }

    public static void MenuManagerProduct() {
        System.out.println("-----------Chương trình quản lý sản phẩm-----------");
        System.out.println("1. Thêm sản phẩm");
        System.out.println("2. Xóa sản phẩm");
        System.out.println("3. Sửa sản phẩm");
        System.out.println("4. Hiển thị sản phẩm giá cao nhất");
        System.out.println("5. Hiển thị danh sách sản phẩm");
        System.out.println("6. Sắp xếp danh sách sản phẩm");
        System.out.println("0. Thoát");
    }

    public static void MenuOrderService() {
        System.out.println("-----------Chương trình quản lý đơn hàng-----------");
        System.out.println("1. Thêm đơn hàng khách hàng");
        System.out.println("2. Hiện doanh thu cửa hàng");
        System.out.println("3. Hiển thị đơn hàng của khách hàng");
        System.out.println("0. Thoát");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int selection;
        int selection1;
        int selection2;
        int selection3;
        ProductManager productManager = new ProductManager();
        OrderService orderService = new OrderService();

       productManager.ReadCSV();


        do {
            MenuChooseProgram();
            selection = sc.nextInt();
            switch (selection) {
                case 1:
                    do {
                        MenuManagerProduct();
                        selection1 = sc.nextInt();
                        switch (selection1) {
                            case 1:
                                productManager.addProduct();
                                break;
                            case 2:
                                productManager.deleteProduct();
                                break;
                            case 3:
                                productManager.updateProduct();
                                break;
                            case 4:
                                productManager.findMostExpensiveProduct();
                                break;
                            case 5:
                                productManager.displayProduct();
                                break;
                            case 6:
                                do {
                                    MenuSort();
                                    selection3 = sc.nextInt();
                                    switch (selection3) {
                                        case 1:
                                            productManager.sortPricesDecrease();
                                            break;
                                        case 2:
                                            productManager.sortPricesIncrease();
                                            break;
                                    }
                                } while (selection3 != 0);
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Nhập lại");
                        }
                    } while (selection1 != 0);
                    break;
                case 2:
                    do {
                        MenuOrderService();
                        selection2 = sc.nextInt();
                        switch (selection2) {
                            case 1:
                                orderService.addOrder();
                                break;
                            case 2:
                                orderService.displaySalesOrder();
                                break;
                            case 3:
                                orderService.displaylistOrder();
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Nhập lại");
                        }
                    } while (selection2 != 0);
                    break;
                case 0:
                    productManager.WriteCSV();
                    break;
                default:
                    System.out.println("Nhập lại");
            }
        }
        while (selection != 0);
    }
}

