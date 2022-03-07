package book.ch11_상속;

class Book {
    private String title;
    private int page;
    private String writer;

    public Book(String title, int page, String writer) {
        this.title = title;
        this.page = page;
        this.writer = writer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String toString() {
        return "책이름: " + title + "\t페이지 수: " + page + "\t작가: " + writer;
    }
}

class Magazine extends Book {
    private String date;

    public Magazine(String title, int page, String writer, String date) {
        super(title, page, writer);
        this.date = date;
    }

    public String toString() {
        return super.toString() + "\t발매일: " + date;
    }
}

public class inheritance_상속_242_Programming4 {
    public static void main(String[] args) {
        Magazine m1 = new Magazine("가", 1, "나", "다");
        Magazine m2 = new Magazine("가", 2, "나", "다");
        Magazine m3 = new Magazine("가", 3, "나", "다");
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
    }
}
