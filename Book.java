public class Book extends Product{

    private String author;

     Book() {

    }

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author= " + author + super.toString()+
                '}';
    }

    @Override
    public double getDiscount() {
        double discountAmount= getPrice()*10/100;
        return getPrice()-discountAmount;
    }
}
