package Shop;

import Buyers.User;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart implements Printable {

    private Map<Integer, Good> cart;
    private User user;
    private int totalQuantity;
    private double totalPrice;

    public ShoppingCart(User user) {
        this.user = user;
        cart = new HashMap<>();
    }

    public boolean addGood(Map<Integer, Good> map, int goodID, int quant) {
        int quantityBefore = map.get(goodID).getQuantity();
        if (quant > quantityBefore) {
            System.out.println("Недостаточно товара на складе.");
            return false;
        } else if (!cart.containsKey(goodID)) {
            cart.put(goodID, new Good(goodID, map.get(goodID).getName(), map.get(goodID).getPrice(), map.get(goodID).getCategory(), map.get(goodID).getDescription(), quant));
            totalQuantity += quant;
            totalPrice += map.get(goodID).getPrice() * quant;
            map.get(goodID).setQuantity(quantityBefore - quant);
            return true;
        } else {
            cart.get(goodID).setQuantity(cart.get(goodID).getQuantity() + quant);
            totalQuantity += quant;
            totalPrice += map.get(goodID).getPrice() * quant;
            map.get(goodID).setQuantity(quantityBefore - quant);
            return true;
        }
    }

    public void removeGood(Good good) {
        cart.remove(good);
        totalQuantity -= 1;
        totalPrice -= good.getPrice();
    }

    public void clearCart() {
        cart.clear();
    }


    public Map<Integer, Good> getCart() {
        return cart;
    }

    public void setCart(Map<Integer, Good> cart) {
        this.cart = cart;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
