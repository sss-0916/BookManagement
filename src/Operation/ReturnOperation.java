package Operation;

import Book.AllBooks;
import Book.Book;

import java.util.Scanner;

public class ReturnOperation implements IOperation {
    @Override
    public void operation(AllBooks books) {
        Book[] bookList = books.getBookList();
        int size = books.getSize();

        System.out.println("请输入您要归还书籍的编号：");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.next();
        for (int i = 0; i < size; i++) {
            if (id.equals(bookList[i].getId())) {
                if (bookList[i].isBorrowed()) {
                    bookList[i].setBorrowed(false);
                    System.out.println("书籍归还成功！");
                    return;
                } else {
                    System.out.println("书籍编号为" + id + "的书籍已经被归还，归还失败！");
                    return;
                }
            }
        }
        System.out.println("书籍编号为" + id + "的书籍不存在，归还失败！");
    }
}
