package lt.sdaacademy.fundamentalscoding.practicalexercisestogether.bookAndAuthor.book;

import java.util.List;

public class Book{

private String title;
private List<Author> authors;
private String price;
private String qnt;



    public Book(String title, List<Author> author, String price, String qnt) {
        this.title = title;
        this.authors =  author;
        this.price = price;
        this.qnt = qnt;

  /*  public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public List<Authors> getAuthors() {
        return authors;
    }
    public void setAuthors(List<Authors> authors) {
        this.authors = authors;
    }
  public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQnt() {
        return qnt;
    }
    public void setQnt(int qnt) {
        this.qnt = qnt;*/
    }
public String toString() {
        return String.format("knygos pavadinimas: %s, %s", title, authors.get(0).toString());
}

    }
