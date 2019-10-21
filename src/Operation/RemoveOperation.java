package Operation;

import Book.AllBooks;
import Book.Book;

import java.util.Scanner;

public class RemoveOperation implements IOperation {
    @Override
    public void operation(AllBooks books) {
        Book[] bookList = books.getBookList();
        int size = books.getSize();

        System.out.println("请输入要删除书籍的编号：");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.next();

        for (int i = 0; i < size; i++) {
            if (id.equals(bookList[i].getId())) {
                bookList[i] = bookList[size - 1];
                books.setSize(size - 1);
                System.out.println("书籍删除成功！");
                return;
            }
        }
        System.out.println("未找到书籍编号为" + id + "的书籍！");
    }
}
