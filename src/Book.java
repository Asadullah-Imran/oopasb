public class Book implements Comparable<Book> {
    int id;
    int price;
    String author;
    Book(int id,int price, String author){
        this.id=id;
        this.price=price;
        this.author=author;
    }

    public int compareTo(Book b){
            if(this.price>b.price){
                return -1;
            } else if (this.price<b.price) {
                return 1;

            }
            return 0;
    }
}
