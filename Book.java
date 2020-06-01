
import java.util.*;
import java.text.*;
import java.io.*;

public class Book {
    private String title;
    private String publisher;
    private Date publishDate;
    private List<String> authors; 
    
    public Book(String title,String publisher,Date publishDate,List<String> authors){
    	this.title=title;
    	this.publisher=publisher;
    	this.publishDate=publishDate;
    	this.authors=authors;
    }	
    
    public String getTitle(){
        return this.title; 
    }
    public String getPublisher(){
        return this.publisher; 
    }
    public Date getPublishDate(){
        return this.publishDate; 
    }
    public List getAuthors() {
        return this.authors;
    }
 //著者ごとの一覧の出力フォーマット
    public String toStirngAuthor(){
        SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");
        String date = f.format(this.publishDate);
        System.out.println("書籍名     出版社     出版日");
        //以下のフォーマットで出力
        return  String.format("%-10s %-10s %-10s",this.title,this.publisher,date);
    }
    
    //一覧の出力フォーマット
    public String toString(){
        SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");
        String date = f.format(this.publishDate);
        //以下のフォーマットで出力
        return String.format("%-10s %-10s %-10s",this.title,this.publisher,date) + "    " +
        authorsListToString(this.authors);
    }
    
    //著者名のリストを文字列に変換
    public String authorsListToString(List<String> list){
        StringBuilder sb = new StringBuilder();
        for (String s : list){
            sb.append(s);
            sb.append(",");
        }
        sb.deleteCharAt(sb.length()-1);
        //著者のリストを一つの文字列にする。
        String s = sb.toString();
        return s;
    }
    
    //著者のリストを文字列に変換したものを取り出す
    public String getStringAuthors(){
        return authorsListToString(this.authors);
    }
}
