package assignment2;
// item class representing objects that can be found in rooms
public class Item implements CloneableGameEntity{
    private String itemName;
    private String itemDescription;

    public Item(String itemName, String itemDescription) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
    }
    public String getItemName() {
        return itemName;
    }
    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public Item cloneEntity() {
        // Returns a new instance of Item with the same properties
        return new Item(itemName, itemDescription);
    }

    @Override
    public String toString() {
        return itemName + " (" + itemDescription + ")";
    }
}
