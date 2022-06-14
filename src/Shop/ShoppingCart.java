package Shop;

import Buyers.User;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart implements Printable {

    private Map<Integer, Good> cart;
    private User user;
    private double totalQuantity;
    private double totalPrice;

    public ShoppingCart(User user) {
        this.user = user;
        cart = new HashMap<>();

    }

    public void addGood(Good good){
        cart.put(good.getId(), good);
        totalQuantity += 1;
        totalPrice += good.getPrice();
    }

    public void removeGood(Good good){
        cart.remove(good);
        totalQuantity -= 1;
        totalPrice -= good.getPrice();
    }

    public void clearCart(){
        cart.clear();
    }

    public void printCart(User user){

    }

    public Map<Integer, Good> getCart() {
        return cart;
    }

    public void setCart(Map<Integer, Good> cart) {
        this.cart = cart;
    }

    public double getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(double totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
