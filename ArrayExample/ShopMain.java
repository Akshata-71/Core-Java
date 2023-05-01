package ArrayExample;

public class ShopMain {
    public static void main(String[] args) {
        Shop[] shoplist = new Shop[3];
        shoplist[0] = new Shop(1122, "Dmart" , "Groccery");
        shoplist[1] = new Shop(1133, "Pragati Stores" , "Stationary");
        shoplist[2] = new Shop(1144, "Generic" , "Medical");


        for(int i=0 ; i<shoplist.length ; i++)
            shoplist[i].displayDetails();
    }
}
