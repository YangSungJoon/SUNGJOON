package connection;

import java.util.Date;

public class Book {
	int no;
	String title;
	String author;
	String isRent;
	Date regdate; 
	Date edidate;
	
	
	
	
	public Book(int no, String title, String author, String isRent, Date regdate, Date edidate) {
		
		this.no = no;
		this.title = title;
		this.author = author;
		this.isRent = isRent;
		this.regdate = regdate;
		this.edidate = edidate;
	}



	@Override
	public String toString() {
		
		return getNo()+" "+getTitle()+" "+getAuthor()+" "+getIsRent()+" "+getRegdate()+" "+getEdidate();
	}
	
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
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
	public String getIsRent() {
		return isRent;
	}
	public void setIsRent(String isRent) {
		this.isRent = isRent;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public Date getEdidate() {
		return edidate;
	}
	public void setEdidate(Date edidate) {
		this.edidate = edidate;
	} 
	
	
}
