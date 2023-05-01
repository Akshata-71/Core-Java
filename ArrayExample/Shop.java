package ArrayExample;

public class Shop {
    int shopID;
    String shopName;
    String shopType;
    public Shop(int shopID, String shopName, String shopType) {
        this.shopID = shopID;
        this.shopName = shopName;
        this.shopType = shopType;
    }


    public void displayDetails()
    {
        System.out.println("--------------------------------");
        System.out.println("Shop ID : " + this.shopID);
        System.out.println("Shop name :" + this.shopName);
        System.out.println("Shop type :" + this.shopType);

    }

}
