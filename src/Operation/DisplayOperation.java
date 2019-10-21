package Operation;

import Book.AllBooks;
import Book.Book;

public class DisplayOperation implements IOperation {
    @Override
    public void operation(AllBooks books) {
        Book[] bookList = books.getBookList();

        for (int i = 0; i < books.getSize(); i++) {
            System.out.println(bookList[i]);
        }
        System.out.println("共计" + books.getSize() + "本书！");
    }
}
