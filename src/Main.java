import Book.AllBooks;
import User.Admin;
import User.NormalUser;
import User.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AllBooks books = new AllBooks();
        User user = login();
        System.out.println("亲爱的" + user.getName() + "您好，欢迎使用图书馆管理系统！");

        while (true) {
            int choice = user.menu();
            if (choice < 0 || choice >= user.size()) {
                System.out.println("输入不合法，请重新输入！");
                continue;
            }
            user.doOperation(choice, books);
        }
    }

    private static User login() {
        System.out.println("请选择用户类型（1. 普通用户；2. 管理员。)：");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        System.out.println("请输入用户名：");
        String name = scanner.next();
        if (choice == 1) {
            return new NormalUser(name);
        }
        return new Admin(name);
    }
}
