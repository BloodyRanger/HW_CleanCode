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

    public boolean addGood(Good good, int quant) {
        int quantityBefore = good.getQuantity();
        if (quant > quantityBefore) {
            System.out.println("Недостаточно товара на складе.");
            return false;
        } else if (!cart.containsKey(good.getId())) {
            cart.put(good.getId(), good);
            cart.get(good.getId()).setQuantity(quant);
            totalQuantity += quant;
            totalPrice += good.getPrice() * quant;
            return true;
        } else {
            cart.get(good.getId()).setQuantity(cart.get(good.getId()).getQuantity() + quant);
            totalQuantity += quant;
            totalPrice += good.getPrice() * quant;
            return true;
        }
    }

        public void removeGood (Good good){
            cart.remove(good);
            totalQuantity -= 1;
            totalPrice -= good.getPrice();
        }

        public void clearCart () {
            cart.clear();
        }


        public Map<Integer, Good> getCart () {
            return cart;
        }

        public void setCart (Map < Integer, Good > cart){
            this.cart = cart;
        }

        public int getTotalQuantity () {
            return totalQuantity;
        }

        public void setTotalQuantity ( int totalQuantity){
            this.totalQuantity = totalQuantity;
        }

        public double getTotalPrice () {
            return totalPrice;
        }

        public void setTotalPrice ( double totalPrice){
            this.totalPrice = totalPrice;
        }
    }
