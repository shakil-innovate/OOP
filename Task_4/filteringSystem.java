package Task_4;

class product
{
    String category;
    double price;
    String brand;

    product(String category,double price,String brand)
    {
        this.category=category;
        this.price=price;
        this.brand=brand;
    }
}

class productFilter
{
    public static void filterProduct(String category)
    {
        System.out.println("Filtering product by category "+ category);
    }
    public static void filterProduct(double minPrice,double maxPrice)
    {
        System.out.println("Filtering product by price RANGE "+ minPrice+" - "+maxPrice);
    }
    public static void filterProducts(String category, double minPrice, double maxPrice)
    {
        System.out.println("Filtering products by category: " + category + " and price range: $" + minPrice + " - $" + maxPrice);
    }
    public static void  filterProducts(String category, double minPrice, double maxPrice, String brand) {
        System.out.println("Filtering products by category: " + category + ", price range: $" + minPrice + " - $" + maxPrice + ", and brand: " + brand);
    }

}


public class filteringSystem {
    public static void main(String[] arg)
    {
        product product1=new product("Electronics",300,"Apple");
        product product2 = new product("Fashion", 129.99, "Nike");
        product product3 = new product("Electronics", 450.00, "Samsung");

        productFilter.filterProduct("Electronics");
        productFilter.filterProduct(200,300);

    }
}
