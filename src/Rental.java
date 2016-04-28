class Rental {
    Movie movie;
    private int daysRented;
    public Rental(Movie newmovie, int newdaysRented) {
        movie = newmovie;
        daysRented = newdaysRented;
    }
    public int getDaysRented() {
        return daysRented;
    }
    public Movie getMovie() {
        return movie;
    }


    int getFrequentRenterPoints(int daysRented) {
        if ((movie.getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1)
            return 2;
        else
            return 1;
    }
    double getCharge(){
        return this.movie.price.getCharge(this.daysRented);
    }
}