import Buyers.User;
import Shop.ShoppingCart;

public class Main {

    public static void main(String[] args) {

        User user = new User("1", "1", "1");
        ShoppingCart cart = new ShoppingCart(user);
    }
}