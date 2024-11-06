//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Book book=new Book("The 48 Laws of Power",50,"Robert Greene");
Movie movie= new Movie("The Blue Elephant", 20,"Marwan Hamed");
        System.out.println(" Original prices");
        System.out.println(book.toString());
        System.out.println(movie.toString());
        System.out.println("********************************");
        System.out.println( "The price of "+book.getName()+ " After discount: "  +book.getDiscount());
        System.out.println( "The price of "+movie.getName()+ " After discount: "  +movie.getDiscount());


    }
}