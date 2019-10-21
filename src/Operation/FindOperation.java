package Operation;

import Book.AllBooks;
import Book.Book;

import java.util.Scanner;

public class FindOperation implements IOperation {
    @Override
    public void operation(AllBooks books) {
        Book[] bookList = books.getBookList();

        System.out.println("请输入要查找书籍的书名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        int cnt = 0;
        for (int i = 0; i < books.getSize(); i++) {
            if (name.equals(bookList[i].getName())) {
                System.out.println(bookList[i]);
                ++cnt;
            }
        }
        if (cnt == 0) {
            System.out.println("未找到书籍名为" + name + "的书籍！");
            return;
        }
        System.out.println("共找到" + cnt + "本！");
    }
}
