package dao;

import java.util.ArrayList;
import dto.Book;

public class BookRepository {
	private ArrayList<Book> listOfBooks = new ArrayList<Book>();
	private static BookRepository instance = new BookRepository();
	
	public static BookRepository getInstance() {
		return instance;
	}
	
	public BookRepository() {
		Book book1 = new Book("ISBN1000", "모던 리액트", 48000);
		book1.setAuthor("김용찬");
		book1.setDescription("리액트의 핵심 개념과동작 원리부터 Next.js까지, 리액트의 모든 것");
		book1.setPublisher("위키북스");
		book1.setCategory("IT모바일");
		book1.setUnitsInsStock(1000);
		book1.setReleaseDate("2023/11/07");
		book1.setFilename("ISBN1000.jpg");
		
		Book book2 = new Book("ISBN1001", "Node.js 교과서", 42000);
		book2.setAuthor("조현영");
		book2.setDescription("노드의 기본부터 실무까지, 전 과정을 한 권에 담았다! 다양한 서비스를  직접 만드는, 실무에 가장 가까운 강의!");
		book2.setPublisher("길벗");
		book2.setCategory("IT모바일");
		book2.setUnitsInsStock(1000);
		book2.setReleaseDate("2023/04/30");
		book2.setFilename("ISBN1001.jpg");
		
		Book book3 = new Book("ISBN1002", "얄코의 Too Much 친절한 깃&깃허브", 22000);
		book3.setAuthor("고현민");
		book3.setDescription("프로그래밍을 해 본 적이 없어도! 깃과 깃허브가  처음이어도! 깃과 깃허브를  잘 쓰고 싶어도!");
		book3.setPublisher("Re:commend");
		book3.setCategory("IT모바일");
		book3.setUnitsInsStock(1000);
		book3.setReleaseDate("2023/08/01");
		book3.setFilename("ISBN1002.jpg");
		
		listOfBooks.add(book1);
		listOfBooks.add(book2);
		listOfBooks.add(book3);
		

		}
		public ArrayList<Book> getAllBooks() {
			return listOfBooks;
		}
			
		public Book getBookById(String bookId) {
			Book bookById = null;
				
			for (int i = 0; i < listOfBooks.size(); i++) {
				Book book = listOfBooks.get(i);
				if (book != null &&  book.getBookId() != null && 
						book.getBookId().equals(bookId)) {
					bookById = book;
					break;
				}
			}
			return bookById;
	}
	public void addBook(Book book) {
		listOfBooks.add(book);
	}
}
