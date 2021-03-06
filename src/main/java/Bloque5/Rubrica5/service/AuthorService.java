package Bloque5.Rubrica5.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Bloque5.Rubrica5.model.Author;
import Bloque5.Rubrica5.repository.AuthorRepository;

@Service
public class AuthorService {

	@Autowired
	private AuthorRepository repository;

	public void insert(Author author) {
		repository.insert(author);
	}

	public List<Author> searchAll() {
		return repository.searchAll();
	}

	public List<Author> search(Author author) {
		return repository.search(author);
	}
}