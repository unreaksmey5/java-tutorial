package ArrayList;

import java.util.ArrayList;

public class Product {

    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product("Phone", 500.0));
        products.add(new Product("Camera", 1000.0));
        products.add(new Product("Laptop", 2000.0));
        products.add(new Product("Keyboard", 50.0));
        products.add(new Product("Headphone", 80.0));

        Product mostExpensiveProduct = products.get(0);
        Product cheapestProduct = products.get(0);

        double totalPrice = 0;

        // Find most expensive, cheapest, and total price
        for (Product product : products) {

            if (product.price > mostExpensiveProduct.price) {
                mostExpensiveProduct = product;
            }

            if (product.price < cheapestProduct.price) {
                cheapestProduct = product;
            }

            totalPrice += product.price;
        }

        double averagePrice = totalPrice / products.size();

        System.out.println("=== Product Report ===");

        System.out.println(
                "Most Expensive Product: "
                        + mostExpensiveProduct.name
                        + " "
                        + mostExpensiveProduct.price);

        System.out.println(
                "Cheapest Product: "
                        + cheapestProduct.name
                        + " "
                        + cheapestProduct.price);

        System.out.println("Average Price: " + averagePrice);

        System.out.println("\nProducts Above Average Price:");

        for (Product product : products) {
            if (product.price > averagePrice) {
                System.out.println(product.name + " " + product.price);
            }
        }
    }
}
