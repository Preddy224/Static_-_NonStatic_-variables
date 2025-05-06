public class Product {

    static String category = "electronics";
    String productName;

    public static void main(String[] args) {

        Product product1 = new Product();
        product1.productName = "Laptop";

        Product product2 = new Product();
        product2.productName = "Smartphone";

        System.out.println("product catogory is:" + Product.category);

        System.out.println("product2 name is :" + product1.productName);
        System.out.println("product2 name is :" + product2.productName);
    }
}