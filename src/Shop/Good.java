package Shop;

public class Good {

    private int id;
    private String name;
    private double price;
    private String category;
    private String description;
    private Rating rating;
    private int quantity;

    public Good(int id, String name, double price, String category, String description, Rating rating, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
        this.rating = rating;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Good{" +
                "id=" + id +
                ", Наименование Товара = '" + name + '\'' +
                ", Цена = '" + price + '\'' +
                ", Категория товара = '" + category + '\'' +
                ", Описание товара = '" + description + '\'' +
                ", Рейтинг = '" + rating + '\'' +
                ", Количество = '" + quantity + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
