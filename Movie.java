public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String title;
    private int price;
    public Movie(String movieTitle, int moviePrice) {
        title = movieTitle;
        price = moviePrice;
    }
    public int getPrice() {
        return price;
    }
    public void setPriceCode(int moviePrice) {
        price = moviePrice;
    }
    public String getTitle (){
        return title;
    };
}