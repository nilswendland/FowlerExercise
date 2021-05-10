public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String title;
    private int price;
    public Movie(String movieTitle, int movieType) {
        title = movieTitle;
        price = movieType;
    }
    public int getMovieType() {
        return price;
    }
    public void setMovieType(int movieType) {
        price = movieType;
    }
    public String getTitle (){
        return title;
    };
}