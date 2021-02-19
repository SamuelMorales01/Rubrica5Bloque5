package Bloque5.Rubrica5.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Bloque5.Rubrica5.model.Book;
import Bloque5.Rubrica5.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository repository;

	public void insert(Book book) {
		repository.insert(book);
	}

	public List<Book> searchAll() {
		return repository.searchAll();
	}

	public List<Book> search(Book book) {
		return repository.search(book);
	}
}