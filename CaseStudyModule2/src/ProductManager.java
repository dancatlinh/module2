import java.io.*;
import java.util.*;

public class ProductManager {
    Scanner sc = new Scanner(System.in);
    static List<Product> listProduct = new ArrayList();
//    Product product1 = new Product("coca", "1", 1, 1, "abc");
//    Product product2 = new Product("coca1", "2", 9, 11, "abc");
//    Product product3 = new Product("coca2", "6", 11, 12, "abc");
//    Product product4 = new Product("coca3", "5", 22, 9, "abc");
//    Product product5 = new Product("coca4", "0", 12, 111, "abc");
//    Product product6 = new Product("coca5", "11", 99, 88, "abc");

    public void addProduct() {
//        listProduct.add(product1);
//        listProduct.add(product2);
//        listProduct.add(product3);
//        listProduct.add(product4);
//        listProduct.add(product5);
//        listProduct.add(product6);

        listProduct.add(InputAndOutput.inputAddProduct());
        System.out.println("Nhập thành công");
    }

    public void updateProduct() {

        boolean check = true;
        while (check) {
            String idProduct = InputAndOutput.inputIdProduct1();
            check = false;
            for (int i = 0; i < listProduct.size(); i++) {
                if (listProduct.get(i).getIdProduct().equals(idProduct)) {
                    listProduct.remove(listProduct.get(i));
                    listProduct.set(i, InputAndOutput.inputAddProduct());
                    return;
                }
            }
            System.out.println("Nhập sai mã sản phẩm");
            check = true;
        }
    }

    public void deleteProduct() {
        System.out.println("Nhập mã sản phẩm muốn xóa");
        String idProduct = sc.nextLine();

        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getIdProduct().equals(idProduct)) {
                listProduct.remove(listProduct.get(i));
                System.out.println("Đã xóa thành công");
                return;
            }
        } System.out.println("Nhập sai mã sản phẩm");
    }

    public void displayProduct() {
        System.out.println("Tên sản phẩm, Mã sản phẩm, Số lượng, Giá, Mô tả");
        for (int i = 0; i < listProduct.size(); i++) {
            System.out.println(listProduct.get(i).toString());
            if (i % 5 == 4 && i != listProduct.size() - 1) {
                System.out.println("Ấn enter để xem tiếp");
                sc.nextLine();
            }
        }
    }

    public void findMostExpensiveProduct() {
        System.out.println("Tên sản phẩm, Mã sản phẩm, Số lượng, Giá, Mô tả");
        Product expensiveProduct = listProduct.get(0);
        List<Product> returnList = new ArrayList();
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getPriceProduct() > expensiveProduct.getPriceProduct()) {
                expensiveProduct = listProduct.get(i);
                returnList.clear();
                returnList.add(expensiveProduct);
            } else if (listProduct.get(i).getPriceProduct() == expensiveProduct.getPriceProduct()) {
                returnList.add(expensiveProduct);
            }
        }
        for (int i = 0; i < returnList.size(); i++) {
            System.out.println(returnList.get(i).toString());
        }
    }

    public void WriteCSV() {
        try {
            File file = new File("caseProduct.csv");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < listProduct.size(); i++) {
                bufferedWriter.write(listProduct.get(i).toString() + "\n");
            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void ReadCSV() {
        try {
            File file = new File("caseProduct.csv");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String read;
            while ((read = bufferedReader.readLine()) != null) {
                if (read.equals("")) {
                    continue;
                }
                String[] arr = read.split(",");
                String name = arr[0];
                String id = arr[1];
                int quanity = Integer.parseInt(arr[2]);
                double price = Double.parseDouble(arr[3]);
                String description = arr[4];
                listProduct.add(new Product(name, id, quanity, price, description));
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sortPricesIncrease() {
        System.out.println(" Sắp xếp sản phẩm theo giá tăng dần");
        Collections.sort(listProduct, new Comparator<Product>() {

            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPriceProduct() > o2.getPriceProduct()) {
                    return 1;
                }
                return -1;
            }
        });
    }

    public void sortPricesDecrease() {
        System.out.println(" Sắp xếp sản phẩm theo giá giảm dần");
        Collections.sort(listProduct, new Comparator<Product>() {

            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPriceProduct() < o2.getPriceProduct()) {
                    return 1;
                }
                return -1;
            }
        });
    }


}





