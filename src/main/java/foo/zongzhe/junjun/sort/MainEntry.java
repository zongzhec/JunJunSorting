package foo.zongzhe.junjun.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainEntry {

    private static List<Product> productList;

    public static void main(String[] args) {
        System.out.println("Starting..");
        MainEntry entry = new MainEntry();
        initialize();
        loadData();
        sortDataByKey(SortKey.GTNR, SortKey.ASC);
        sortDataByKey(SortKey.GTNR, SortKey.DESC);

        sortDataByKey(SortKey.STK, SortKey.ASC);
        sortDataByKey(SortKey.STK, SortKey.DESC);

        sortDataByKey(SortKey.EOL, SortKey.ASC);
        sortDataByKey(SortKey.EOL, SortKey.DESC);

        sortDataByKey(SortKey.DATUM, SortKey.ASC);
        sortDataByKey(SortKey.DATUM, SortKey.DESC);

        sortDataByKey(SortKey.ID, SortKey.ASC);
        sortDataByKey(SortKey.ID, SortKey.DESC);
    }

    private static void sortDataByKey(SortKey keyName, SortKey order) {
        System.out.println("Sorting by " + keyName + " in " + order + " order");
        for (Product product : productList) {
            product.setSortKey(keyName);
        }
        productList.sort(Product::compareTo);
        if (order.equals(SortKey.DESC)) {
            Collections.reverse(productList);
        }
        for (Product product : productList) {
            System.out.println(product);
        }
        System.out.println();
    }

    private static void initialize() {
        System.out.println("Initialing..");
        productList = new ArrayList<>();
    }

    /**
     * Hard code the data since the IO process is out of interest.
     */
    private static void loadData() {
        System.out.println("Loading data..");
        Product product1 = new Product(10048, "1107020017", 6810, "19-03-2020 07:28", 58214);
        Product product2 = new Product(10049, "1107020018", 6811, "19-03-2020 08:28", 58215);
        Product product3 = new Product(10050, "1107020019", 6812, "19-03-2020 09:28", 58216);
        Product product4 = new Product(10051, "1107020020", 6813, "19-03-2020 10:28", 58217);
        Product product5 = new Product(10052, "1107020021", 6814, "19-03-2020 11:28", 58218);
        Product product6 = new Product(10053, "1107020022", 6815, "19-03-2020 12:28", 58219);
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        productList.add(product6);
    }
}
