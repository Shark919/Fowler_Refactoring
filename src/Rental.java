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


    int getFrequentRenterPoints(){
       return this.movie.getFrequentRenterPoints(this.daysRented);
    }

    double getCharge(){
        return this.movie.getCharge(this.daysRented);
    }
}