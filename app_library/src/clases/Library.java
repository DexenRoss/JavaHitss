package clases;

import java.util.Arrays;

import clasefinal.ISBN;

public class Library {
    private Book[] books;

    public Library() {
        books = new Book[0];
    }

    public void addBook(Book book){
        // forma manual de copiar un arreglo
        /*Book[] temp = new Book[books.length + 1];
        for (int i = 0; i < books.length; i++) {
            temp[i]= books[i];
        }

        temp[books.length] = book;
        books = temp;*/

        //utilizando Arrays.copyOf()
        books = Arrays.copyOf(books, books.length+1);
        books[books.length-1] = book;
    }

    public Book findBook(ISBN isbn){
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public boolean deleteBook(ISBN isbn){
        boolean flag = false;
        int delete = -1;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                delete = i;
                flag =true;
            }

        }
        Book[] temp = new Book[books.length -1];
        int j =0;
        for (int i = 0; i < books.length; i++) {
            if (i != delete) {
                temp[j] = books[i];
                j++;
            }
        }
        books = temp;
        return flag;
    }

    public Book longestBook(){
        if (books.length ==0) {
            return null;
        }
        Book book = books[0];
        for (Book b : books) {
            if (b.getTitle().length()>book.getTitle().length()) {
                book=b;
            }
        }
        return book;
    }

    public int countAuthors(){
        String[] authors = new String[0];

        for (Book b : books) {
            boolean exists = false;
            for (String string : authors) {
                if (string.equals(b.getAuthor())) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                authors = Arrays.copyOf(authors, authors.length+1);
                authors[authors.length-1] = b.getAuthor();
            }
        }
        return authors.length;
    }

    public ISBN[] uniqueIsbn(){
        ISBN[] unique = new ISBN[0];
        for (Book book : books) {
            boolean found = false;
            for (ISBN isbn : unique) {
                if (isbn.equals(book.getIsbn())) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                unique = Arrays.copyOf(unique,unique.length+1 );
                unique[unique.length-1] = book.getIsbn();
            }
        }
        return unique;
    }

    public void showBooks(){
        for (Book book : books) {
            System.out.println(book);
        }
    }

}
