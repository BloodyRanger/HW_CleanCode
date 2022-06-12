package Shop;

public class Rating {

    private Good good;
    private int rating;
    private int reviews;

    public Rating(Good good, int rating, int reviews) {
        this.good = good;
        this.rating = rating;
        this.reviews = reviews;
    }

    public Good getGood() {
        return good;
    }

    public void setGood(Good good) {
        this.good = good;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getReviews() {
        return reviews;
    }

    public void setReviews(int reviews) {
        this.reviews = reviews;
    }
}
