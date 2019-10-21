package Book;

public class AllBooks {
    private Book[] bookList = null;
    private int size = 0;

    public AllBooks() {
        this.bookList = new Book[20];

        // 初始化四本书，方便演示
        this.bookList[0] = new Book(
            "001", "三国演义", "罗贯中", false
        );
        this.bookList[1] = new Book(
                "002", "西游记", "吴承恩", false
        );
        this.bookList[2] = new Book(
                "003", "红楼梦", "曹雪芹", false
        );
        this.bookList[3] = new Book(
                "004", "水浒传", "施耐庵", false
        );

        this.size = 4;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Book[] getBookList() {
        return bookList;
    }
}
