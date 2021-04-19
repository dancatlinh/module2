import java.util.Scanner;

public class InputAndOutput {
    static Scanner sc = new Scanner(System.in);

    public static String inputNameProduct() {
        while (true) {
            try {
                System.out.println("Nhập tên sản phẩm");
                String nameProduct = sc.nextLine();
                if (!nameProduct.trim().equals("")) {
                    return nameProduct;
                }
                // String thì phải throw
                else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Nhập tên sản phẩm chưa hợp lệ");
            }
        }
    }

    public static String inputIdProduct() {
        while (true) {
            try {

                System.out.println("Nhập mã sản phẩm");
                while (true) {
                    String idProduct = sc.nextLine();
                    if (!idProduct.trim().equals("")) {
                        boolean check = true;
                        for (int i = 0; i < ProductManager.listProduct.size(); i++) {
                            if (ProductManager.listProduct.get(i).getIdProduct().equals(idProduct)) {
                                System.out.println("Nhập trùng mã sản phẩm mời nhập lại");
                                check = false;
                                break;
                            }
                        }
                        if (check) return idProduct;

                    } else {
                        throw new Exception();
                    }
                }
            } catch (Exception e) {
                System.out.println("Nhập lại mã sản phẩm");
            }
        }
    }

    public static String inputIdProduct1() {
        while (true) {
            try {
                System.out.println("Nhập mã sản phẩm muốn sửa");
                String idProduct1 = sc.nextLine();
                if (!idProduct1.trim().equals("")) {
                    return idProduct1;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Nhập lại mã sản phẩm");
            }
        }
    }

    public static int inputQuanityProduct() {
        while (true) {
            try {
                System.out.println("Nhập số lượng sản phẩm");
                int quanityProduct = Integer.parseInt(sc.nextLine());
                return quanityProduct;
            } catch (Exception e) {
                System.out.println("Nhập lại số lượng sản phẩm");
            }
        }
    }

    public static double inputPriceProduct() {
        while (true) {
            try {
                System.out.println("Nhập giá sản phẩm");
                double priceProduct = Double.parseDouble(sc.nextLine());
                return priceProduct;
            } catch (Exception e) {
                System.out.println("Nhập lại giá sản phẩm");
            }
        }
    }

    public static String inputDescriptionProduct() {
        while (true) {
            try {
                System.out.println("Nhập mô tả sản phẩm");
                String descriptionProduct = sc.nextLine();
                    return descriptionProduct;
                }
             catch (Exception e) {
                System.out.println("Nhập lại mã sản phẩm");
            }
        }
    }


    public static Product inputAddProduct() {
        return new Product(inputNameProduct(), inputIdProduct(), inputQuanityProduct(), inputPriceProduct(), inputDescriptionProduct());
    }
//
//    public static Product inputAddUpdateProduct() {
//        return new Product(inputNameProduct(), inputIdProduct1(), inputQuanityProduct(), inputPriceProduct(), inputDescriptionProduct());
//    }
}
