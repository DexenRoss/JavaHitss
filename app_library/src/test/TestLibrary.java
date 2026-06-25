package test;

import clasefinal.ISBN;
import clases.Book;
import clases.Library;

public class TestLibrary {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(
            new Book(new ISBN("1234567890123"), "Programacion en Java", "Canek Pelaez")
        );
        library.addBook(
            new Book(new ISBN("1234567890134"), "Maze Runner", "Issac Newells")
        );
        library.addBook(
            new Book(new ISBN("1234567890167"), "OPM", "One")
        );
        library.showBooks();
        System.out.println("===========Buscar=============");
        System.out.println(library.findBook(new ISBN("1234567890123")));
        System.out.println(library.findBook(new ISBN("1234567890168")));
        System.out.println("===========Titulo Mayor ==============");
        System.out.println(library.longestBook());
        System.out.println("===========Contar Autores==============");
        System.out.println("Authors: "+library.countAuthors());
        System.out.println("=============ISBN================");
        ISBN[] isbns = library.uniqueIsbn();
        for (ISBN isbn : isbns) {
            System.out.println(isbn);
        }

        System.out.println("===============Elimniar=============");
        System.out.println("Deleted? "+library.deleteBook(new ISBN("1234567890123")));
        System.out.println("Deleted? "+library.deleteBook(new ISBN("1234567890168")));
    }
}
