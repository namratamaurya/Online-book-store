/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinebookstore;

/**
 *
 * @author Namrata
 */
public class Books {
     int bookid,copies;
    String bookname,bookauthor,genre;
    public Books(int bookid, String bookname,String bookauthor,String genre,int copies){
        this.bookid=bookid;
        this.bookname=bookname;
        this.bookauthor=bookauthor;
        this.genre=genre;
        this.copies=copies;
        
    }
    public int getBookId(){
        return bookid;
    }
    public String getBookName(){
        return bookname;
    }
    public String getBookAuthor(){
        return bookauthor;
    }
    public String getBookGenre(){
        return genre;
    }
    public int getCopies(){
        return copies;
    }
}
