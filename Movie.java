public class Movie extends Product{


    private String director;

    public Movie() {
    }

    public Movie(String name, double price,String director) {
        super(name, price);
        this.director=director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "director= " + director + super.toString() +
                '}';
    }

    @Override
    public double getDiscount() {
     double discountAmount =   getPrice()*5/100;
     return getPrice()-discountAmount;
    }
}
