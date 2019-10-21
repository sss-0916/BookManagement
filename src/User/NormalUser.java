package User;

import Book.AllBooks;
import Operation.*;

import java.util.Scanner;

public class NormalUser extends User {
    public NormalUser(String name) {
        super(name);
        this.operations = new IOperation[]{
                new ExitOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation()
        };
    }

    @Override
    public int menu() {
        System.out.println("===============");
        System.out.println("1. 查找书籍。");
        System.out.println("2. 借阅书籍。");
        System.out.println("3. 归还书籍。");
        System.out.println("0. 退出。");
        System.out.println("===============");

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的选择：");
        return scanner.nextInt();
    }

    @Override
    public void doOperation(int choice, AllBooks books) {
        this.operations[choice].operation(books);
    }
}
