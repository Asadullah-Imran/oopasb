import java.util.ArrayList;
import java.util.Collections;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//        ArrayList <String>fruits= new ArrayList<>();
//        //ArrayList <Integer> num= new ArrayList<>();
//
//
//        fruits.add("Mango");
//        fruits.add("Orange");
//        fruits.add("Banananana");
//        fruits.add("Pear");
//
//       // fruits.add(3,"Jack-fruit");
//
//        fruits.set(2,"Banana");
//
//
//        System.out.println(fruits.get(3));




        ArrayList<Book> books=new ArrayList<>();



        Book book1=new Book(2,200,"rahim");
        books.add(book1);
        books.add(new Book(3,500,"karim"));
        books.add(new Book(4,100,"dal"));
        books.add(new Book(9,700,"salam"));
        books.add(new Book(10,400,"jobbar"));


        Collections.sort(books);

        for(int i =0;i<books.size();i++){
            System.out.println(books.get(i).author+","+books.get(i).price);
        }


    }
}


//comperator ||| Comparable