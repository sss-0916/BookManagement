package Operation;

import Book.AllBooks;
import Book.Book;

import java.util.Scanner;

public class AddOperation implements IOperation {
    @Override
    public void operation(AllBooks books) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入新增书籍的编号：");
        String id = scanner.next();
        System.out.println("请输入新增书籍的书名：");
        String name = scanner.next();
        System.out.println("请输入新增书籍的作者：");
        String author = scanner.next();

        Book newBook = new Book(id, name, author, false);
        books.getBookList()[books.getSize()] = newBook;
        books.setSize(books.getSize() + 1);

        System.out.println("书籍新增成功！");
    }
}
