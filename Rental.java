class Rental {
    private Movie movie;
    private int daysRented;
    public Rental(Movie rentedMovie, int timeRented) {
        movie = rentedMovie;
        daysRented = timeRented;
    }
    public int getDaysRented() {
        return daysRented;
    }
    public Movie getMovie() {
        return movie;
    }
}