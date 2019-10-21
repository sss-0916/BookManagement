package Operation;

import Book.AllBooks;

public class ExitOperation implements IOperation {
    @Override
    public void operation(AllBooks books) {
        System.out.println("再见，期待您的再次使用！");
        System.exit(0);
    }
}
