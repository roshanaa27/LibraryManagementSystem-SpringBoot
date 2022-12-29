
package com.example.demo;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
@Entity
@Table
public class Mainlibrary {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private int bookId;
private int quantity;
private String bookName;
private String genre;
Mainlibrary()  {}
Mainlibrary(int bookId,int quantity,String bookName,String genre)
{
	this.setBookId(bookId);
	this.setQuantity(quantity);
	this.setBookName(bookName);
	this.setGenre(genre);
}
public int getBookId()
{
	return bookId;
}
public void setBookId(int bookId)
{
	this.bookId=bookId;
}
public int getQuantity()
{
	return quantity;
}
public void setQuantity(int quantity)
{
	this.quantity=quantity;
}
public String getBookName()
{
	return bookName;
}
public void setBookName(String bookName)
{
	this.bookName=bookName;
}
public String getGenre()
{
	return genre;
}
public void setGenre(String genre)
{
	this.genre=genre;
}
}
