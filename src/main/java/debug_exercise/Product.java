package debug_exercise;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
       this.price = price;
    }
    public static void main(String[] args) {
        Product p = new Product("Phone", 299.99);
        System.out.println(p.name + " costs " + p.price);
    }
}



