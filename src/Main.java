import Buyers.User;
import Shop.ShoppingCart;
import Shop.WareHouse;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        WareHouse wareHouse = new WareHouse();
        wareHouse.addGoods(1, "PlayStation5", 49999.99, "Game Consoles", "NextGen Game Console", 1);
        wareHouse.addGoods(2, "XBox One X", 46999.99, "Game Consoles", "NextGen Game Console from Microsoft", 9);
        wareHouse.addGoods(3, "Xiaomi Mi 9T", 12499, "Mobile Phones", "Кetractable Front Camera", 11);
        wareHouse.addGoods(4, "Apple Iphone 13", 87999.99, "Mobile Phones", "New Phone from Apple", 7);
        wareHouse.addGoods(5, "MSI GL75 9SDK", 113999.99, "Notebooks", "IPS, 16GB Ram, SSD", 6);
        wareHouse.addGoods(6, "ASUS X555L", 28999.99, "Notebooks", "TN, 12Gb Ram, SSD", 12);
        wareHouse.addGoods(7, "Samsung UE50TU7002U", 46999.99, "TV", "50 inches, Smart Tizen", 4);
        wareHouse.addGoods(8, "LG 43NANO766PA", 37999.99, "TV", "43 inches, Smart", 7);

        User Ivan = new User("Ivanov Ivan", "SPB, Dvorcovaya nab, 34", "+79119111111");
        ShoppingCart cart = new ShoppingCart(Ivan);

        System.out.println("Товар, доступный для заказа:");
        wareHouse.print(wareHouse.getWareHouse());

        Scanner sc = new Scanner(System.in);
        System.out.println('\n' + "Введите цифру, соответствующую действию, которое нужно совершить:\n" +
                "1. Вывести список товаров, доступных для покупки\n" +
                "2. Отфильтровать доступные товары по категории\n" +
                "3. Отфильтровать доступные товары по цене\n" +
                "4. Показать содержимое корзины\n" +
                "4. Добавить товар в корзину\n" +
                "5. Удалить товар из коризны\n" +
                "6. Очистить корзину\n" +
                "7. Подтвердить заказ\n" +
                "8. Завершить покупки");
    }
}
