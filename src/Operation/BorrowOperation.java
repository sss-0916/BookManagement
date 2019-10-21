package Operation;

import Book.AllBooks;
import Book.Book;

import java.util.Scanner;

public class BorrowOperation implements IOperation {
    @Override
    public void operation(AllBooks books) {
        Book[] bookList = books.getBookList();
        int size = books.getSize();

        System.out.println("请输入您要借阅书籍的编号：");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.next();
        for (int i = 0; i < size; i++) {
            if (id.equals(bookList[i].getId())) {
                if (bookList[i].isBorrowed()) {
                    System.out.println("很抱歉，书籍编号为" + id + "的书籍已借出！");
                    return;
                } else {
                    System.out.println("借书成功！");
                    bookList[i].setBorrowed(true);
                    return;
                }
            }
        }
        System.out.println("书籍编号为" + id + "的书籍不存在！");
    }
}
