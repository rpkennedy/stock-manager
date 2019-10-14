import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author Ryan Kennedy 
 * @version 10.13.2019
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;
    private Product test;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<>();
    }

    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        stock.add(item);
    }
    
    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * Product 'test' used as placeholder for tested products while cycling
     * through the Stock ArrayList
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void delivery(int id, int amount)
    {     
        for (int x = 0; x < stock.size(); x++)
             test = stock.get(x);
             if (id == test.getID())
                test.increaseQuantity(amount);
    }
    
    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProduct(int id)
    {
        for (int x = 0; x < stock.size(); x++)
             test = stock.get(x);
             if (id == test.getID())
                return test;
             else
                return null;
    }
    
    /**
     * Try to find a product in the stock with the given name.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProduct(String name)
    {
        for (int x = 0; x < stock.size(); x++)
             test = stock.get(x);
             if (test.getName().equals(name))
                return test;
             else
                return null;
    }
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int id)
    {
        for (int x = 0; x < stock.size(); x++)
             test = stock.get(x);
             if (id == test.getID())
                return test.getQuantity();
             else
             return 0; 
    }

    /**
     * Print details of all the products.
     */
    public void printProductDetails()
    {
        for (int x = 0; x < stock.size(); x++)
             test = stock.get(x);
             System.out.println(test.toString());
    }
    
    /*
     * Prints details of products with quantity lower than param
     * @param cap The exclusive maximum quantity for printed stock
     */
    public void printProDetBelow(int cap)
    {
        for (int x = 0; x < stock.size(); x++)
             test = stock.get(x);
             if (cap > test.getQuantity())
                System.out.println(test.toString());
    }
    
    
}
