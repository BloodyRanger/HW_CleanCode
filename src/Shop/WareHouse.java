package Shop;

import java.util.HashMap;

public class WareHouse implements Printable, FilterByTag, FilterByPrice{

    private HashMap<Integer, Good> wareHouse;

    public WareHouse() {
        this.wareHouse = new HashMap<>();
    }

    public void addGoods(int id, String name, double price, String category, String description, int quantity){
        if (wareHouse.containsKey(id)) {
            System.out.println("Данная позиция уже есть на складе.");
        }
        wareHouse.put(id, new Good(id, name, price, category, description, quantity));
    }

    public void deleteGoods(int id){
        if (wareHouse.containsKey(id)){
            wareHouse.remove(id);
        } else {
            System.out.println("Данная позиция отсутствует на складе.");
        }
    }

    public HashMap<Integer, Good> getWareHouse() {
        return wareHouse;
    }

    public void setWareHouse(HashMap<Integer, Good> wareHouse) {
        this.wareHouse = wareHouse;
    }

}
