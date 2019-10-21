package User;

import Book.AllBooks;
import Operation.IOperation;

abstract public class User {
    protected String name;
    protected IOperation[] operations;

    public User(String name) {
        this.name = name;
    }

    abstract public int menu();

    abstract public void doOperation(int choice, AllBooks books);

    public int size() {
        return this.operations.length;
    }

    public String getName() {
        return name;
    }
}