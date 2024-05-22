package dto;

import java.io.Serializable;

public class  Book implements Serializable {
	
	private static final long serialVersionUID = -4274700572038677000L;
	
	private String bookId;
	private String name;
	private int unitPrice;
	private String author;
	private String description;
	private String publisher;
	private String category;
	private long unitsInsStock;
	private String releaseDate;
	private String condition;
	private String filename; 
	private int quantity;
	
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public long getUnitsInsStock() {
		return unitsInsStock;
	}
	public void setUnitsInsStock(long unitsInsStock) {
		this.unitsInsStock = unitsInsStock;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	
	public Book(String bookId, String name, int unitPrice) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.unitPrice = unitPrice;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}
}