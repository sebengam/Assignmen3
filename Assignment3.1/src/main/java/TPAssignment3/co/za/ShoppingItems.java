package TPAssignment3.co.za;

/**
 * Created by thabomoopa on 2017/03/21.
 */
public class ShoppingItems {

    private String itemName;
    private double itemPrice;
    private String description;


    public ShoppingItems(String name, double price, String descript)
    {
        this.itemName = name;
        this.itemPrice = price;
        this.description = descript;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public String getDescription() {
        return description;
    }

    public String getItemName() {
        return this.itemName;

    }

}
