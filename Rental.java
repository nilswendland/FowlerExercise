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
    double getCharge() {
        double result = 0;
        switch (getMovie().getPrice()) {
            case Movie.REGULAR:
                result += 2;
                if (getDaysRented() > 2)
                    result += (getDaysRented() - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                result += getDaysRented() * 3;
                break;
            case Movie.CHILDRENS:
                result += 1.5;
                if (getDaysRented() > 3)
                    result += (getDaysRented() - 3) * 1.5;
                break;
        }
        return result;
    }
}