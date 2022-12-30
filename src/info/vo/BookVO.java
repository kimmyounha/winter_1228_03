package info.vo;

public class BookVO {
	private int isbn;
	private String bookName;
	private String publish;
	private String author;
	private int price;
	private String category;
	
	public BookVO() {
	}
	
	public BookVO(int isbn, String bookName, String publish,String author, int price, String category) {
		super();
		this.isbn = isbn;
		this.bookName = bookName;
		this.publish = publish;
		this.author = author;
		this.price = price;
		this.category = category;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getPublish() {
		return publish;
	}

	public void setPublish(String publish) {
		this.publish = publish;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
}
