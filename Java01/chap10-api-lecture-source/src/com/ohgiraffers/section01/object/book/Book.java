package com.ohgiraffers.section01.object.book;

public class Book {

    private int num;
    private String title;
    private String author;
    private int price;

    public Book(){}

    public Book(int num, String title, String author, int price) {
        this.num = num;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "num=" + num +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
    // Object 클래스의 equals메소드는 두 클래스의 주소값을 비교해 동일하면 true
    // 두 클래스의 필드값을 비교하려면 새로 메소드를 오버라이드 해야 한다.
    // String 클래스에서의 equals메소드는 두 string 배열의 값을 비교하는 함수다.
    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }

        if(obj == null){
            return false;
        }

        Book other = (Book) obj;
        if(this.num != other.num){
            return false;
        }

        if(this.title == null){
            if(other.title!=null){
                return false;
            }
        } else if(!this.title.equals(other.title)){
            return false;
        }

        if(this.author == null){
            if(other.author!=null){
                return false;
            }
        } else if(!this.author.equals(other.author)){
            return false;
        }

        if(this.price != other.price){
            return false;
        }

        return true;
    }

    // toString을 이용한 동등비교
    public boolean compare(Object obj) {
        if (this.toString().equals(obj.toString())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = 1;
        final int PRIME = 31;

        result = PRIME * result + this.num;

        result = PRIME * result + this.title.hashCode();
        result = PRIME * result + this.author.hashCode();
        result = PRIME * result + this.price;

        return result;
    }
}
