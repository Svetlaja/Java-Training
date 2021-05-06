package by.epam.learn.entityBooks;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class BookArray extends Book {
    public BookArray() {
        Book[] books = new Book[5];
        for (int i = 0; i < books.length; i++)
            books[i] = new Book();

        books[0].id = 1;
        books[0].bookTitle = "'A Short History of nearly Everything'";
        books[0].author = "Bill Bryson";
        books[0].publisher = "Black Swan";
        books[0].yearOfPublishing = 2004;
        books[0].numberOfPages = 688;
        books[0].price = 11.99;
        books[0].bindingTypes = "Paperback";

        books[1].id = 2;
        books[1].bookTitle = "'Japan Profile of A Nation'";
        books[1].author = "Steve Gardner";
        books[1].publisher = "'Kodansha International'";
        books[1].yearOfPublishing = 1994;
        books[1].numberOfPages = 360;
        books[1].price = 5.99;
        books[1].bindingTypes = "Paperback";

        books[2].id = 3;
        books[2].bookTitle = "'The Importance of Being Earnest'";
        books[2].author = "Oscar Wilde";
        books[2].publisher = "'Macmillan Collector's'";
        books[2].yearOfPublishing = 2017;
        books[2].numberOfPages = 472;
        books[2].price = 7.54;
        books[2].bindingTypes = "Hardcover";

        books[3].id = 4;
        books[3].bookTitle = "'Love of Life'";
        books[3].author = "Jack London";
        books[3].publisher = "'CreateSpace Independent Publishing Platform'";
        books[3].yearOfPublishing = 2016;
        books[3].numberOfPages = 114;
        books[3].price = 5.5;
        books[3].bindingTypes = "Paperback";

        books[4].id = 5;
        books[4].bookTitle = "'Islands In The Stream'";
        books[4].author = "Ernest Hemingway";
        books[4].publisher = "'Scribner'";
        books[4].yearOfPublishing = 1997;
        books[4].numberOfPages = 448;
        books[4].price = 17.98;
        books[4].bindingTypes = "Paperback";
        try {
            Scanner input = new Scanner(in);
            out.println("Enter 1 -- "+ "Список из 5 книг:" +  "\n\t ");
            out.println("Enter 2 -- "+ "a) Список книг заданного автора: Bill Bryson" + "\n\t ");
            out.println("Enter 3 -- "+ "b) Список книг, выпущенных заданным издательством:'Macmillan Collector's" + "\n\t ");
            out.println("Enter 4 -- "+ "c) Список книг, выпущенных после заданного года: after 1997" + "\n\t ");
            out.println("Enter 5 -- "+ "Список замененных книг:" + "\n\t ");
            int number = input.nextInt();
            switch (number) {
                case 1:
                    for (Book b : books) {
                        System.out.println("Book#" + b.getId() + " " + b.getBookTitle() + "\n\t " + "  Author: " + b.getAuthor() + "\n\t " + "  Publisher: " + b.getPublisher() + "\n\t" + "   Published:" + b.getYearOfPublishing() + "\n\t " + "  Pages: " +
                                b.getNumberOfPages() + "\n\t " + "  Price$: " + b.getPrice() + "\n\t " +
                                "  BindingTypes: " + b.getBindingTypes() + "\n\t ");
                    }
                    break;
                case 2:
                    for (Book b : books)
                        if (b.author.equals("Bill Bryson")) {                       System.out.println("Book#" + b.getId() + " " + b.getBookTitle() + "\n\t " +
                                "  Author: " + b.getAuthor() + "\n\t " + "  Publisher: " + b.getPublisher() +
                                "\n\t" + "   Published:" + b.getYearOfPublishing() + "\n\t " + "  Pages: " +
                                b.getNumberOfPages() + "\n\t " + "  Price$: " + b.getPrice() + "\n\t " +
                                "  BindingTypes: " + b.getBindingTypes() + "\n\t ");
                        }
                    break;
                case 3:
                    for (Book b : books)
                        if (b.publisher.equals("'Macmillan Collector's'")) {
                            System.out.println("Book#" + b.getId() + " " + b.getBookTitle() + "\n\t " + "  Author: " + b.getAuthor() + "\n\t " + "  Publisher: " + b.getPublisher() + "\n\t" + "   Published:" + b.getYearOfPublishing() + "\n\t " + "  Pages: " + b.getNumberOfPages() + "\n\t " + "  Price$: " + b.getPrice() + "\n\t " +
                                    "  BindingTypes: " + b.getBindingTypes() + "\n\t ");
                        }
                    break;
                case 4:
                    for (Book b : books)
                        if (b.yearOfPublishing > 1997) {
                            System.out.println("Book#" + b.getId() + " " + b.getBookTitle() + "\n\t " +
                                    "  Author: " + b.getAuthor() + "\n\t " + "  Publisher: " + b.getPublisher() +
                                    "\n\t" + "   Published:" + b.getYearOfPublishing() + "\n\t " + "  Pages: " +
                                    b.getNumberOfPages() + "\n\t " + "  Price$: " + b.getPrice() + "\n\t " +
                                    "  BindingTypes: " + b.getBindingTypes() + "\n\t ");
                        }
                    break;
                case 5:{
                    System.out.println("Book#" + books[4].getId() + " is exchanged by:" + "\n\t");
                    books[4].setId(7);
                    books[4].setBookTitle("'Три товарища'");
                    books[4].setAuthor("Эрих Мария Ремарк");
                    books[4].setPublisher("Астрель");
                    books[4].setYearOfPublishing(2011);
                    books[4].setNumberOfPages(380);
                    books[4].setPrice(3);
                    books[4].setBindingTypes("Твердый переплет");
                    System.out.println("Book#" + books[4].getId() + books[4].getBookTitle() + "\n\t " +
                            "  Author: " + books[4].getAuthor() + "\n\t " + "  Publisher: " + books[4].getPublisher() + "\n\t" + "   Published:" + books[4].getYearOfPublishing() + "\n\t " + "  Pages: " + books[4].getNumberOfPages() + "\n\t " + "  Price$: " + books[4].getPrice() + "\n\t "+"  BindingTypes: " + books[4].getBindingTypes()+"\n\t ");
                }
                break;
                default:
                    out.println("The incorrect input. Please, try again:");
                    BookList.main(new String[0]);
            }
        }
        catch (InputMismatchException e) {
            out.println("The incorrect input. Please, try again:");
            BookList.main(new String[0]);
        }
    }
}