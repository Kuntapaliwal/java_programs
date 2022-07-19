package java_programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Books implements Comparable<Books> {
    int id;
    String name;
    String author;
    String publisher;
    int quantity;

    // parameterised constructor
    public Books(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    // override toString()
    @Override
    public String toString() {
        return "Book [author=" + author + ", id=" + id + ", name=" + name + ", publisher=" + publisher + ", quantity="
                + quantity + "]";
    }

    // override hashCode()
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
        result = prime * result + quantity;
        return result;
    }

    // override equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Books other = (Books) obj;
        if (author == null) {
            if (other.author != null)
                return false;
        } else if (!author.equals(other.author))
            return false;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (publisher == null) {
            if (other.publisher != null)
                return false;
        } else if (!publisher.equals(other.publisher))
            return false;
        if (quantity != other.quantity)
            return false;
        return true;
    }

    @Override
    public int compareTo(Books o) {
        // TODO Auto-generated method stub

        return this.id = o.id;
    }

}

public class StreamsDemo {
    public static void main(String[] args) {
        Books b1 = new Books(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Books b2 = new Books(233, "Operating System", "Galvin", "Wiley", 6);
        Books b3 = new Books(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Books b4 = new Books(121, "Let us C", "Yashwant Kanetkar", "Mc Graw Hill", 11);

        List<Books> list = Arrays.asList(b1, b2, b3, b4);

        // Print the details of each book in the given list of books.

        list.forEach(System.out::println);
        // Create a Set of books from the List by using a collector method, and then
        // print the set.

        Set<Books> set = new HashSet<>();
        list.stream().forEach(set::add);
        System.out.println(set);

        // Sort the List of books using the intermediate operation sorted(). Display the
        // sorted results.

        list.stream().sorted(Books::compareTo).forEach(System.out::println);
        // Double the quantity of each book in the List using the intermediate operation
        // map(), and then display the updated books.
        list.stream().map(e -> new Books(e.id, e.author, e.name, e.publisher, e.quantity = 2 * e.quantity))
                .forEach(System.out::println);
        ;

        // Use the intermediate operation filter() to keep only those books that
        // quantity > 10 and collect them in a list, and print them.

        list.stream().filter(e -> e.quantity > 10).forEach(System.out::println);

        // Use the terminal operation reduce() to obtain the sum of quantity sold of
        // books that have id < 200, and then print the sum obtained.

        long sumData = list.stream().filter(e -> e.id < 200).map(q -> q.quantity).reduce(0,
                (sum, quantity) -> sum + quantity);
        System.out.println("Sum=" + sumData);

    }

}
