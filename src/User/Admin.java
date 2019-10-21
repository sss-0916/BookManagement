package User;

import Book.AllBooks;
import Operation.*;

import java.util.Scanner;

public class Admin extends User {
    public Admin(String name) {
        super(name);
        this.operations = new IOperation[]{
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new RemoveOperation(),
                new DisplayOperation()
        };
    }

    @Override
    public int menu() {
        System.out.println("===============");
        System.out.println("1. 查找书籍。");
        System.out.println("2. 增加书籍。");
        System.out.println("3. 删除书籍。");
        System.out.println("4. 打印所有书籍。");
        System.out.println("0. 退出。");
        System.out.println("===============");

        System.out.println("请输入您的选择：");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    @Override
    public void doOperation(int choice, AllBooks books) {
        this.operations[choice].operation(books);
    }
}
