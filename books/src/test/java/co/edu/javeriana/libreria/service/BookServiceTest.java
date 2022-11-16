package co.edu.javeriana.libreria.service;

import co.edu.javeriana.libreria.entity.Book;
import co.edu.javeriana.libreria.repository.BookRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class BookServiceTest {
    @Mock
    private BookRepository bookRepository;

    private Book book;

    @InjectMocks
    private BookService bookService;

    @BeforeEach
    void setUp() {

        MockitoAnnotations.initMocks(this);

        book = new Book();
        book.setName("El libro azul");
        book.setAuthor("Desconocido");
        book.setId(new Integer(11));

    }

    @Test
    void findAllBooks() {
        when(bookRepository.findAll()).thenReturn(Arrays.asList(book));
        assertNotNull(bookService.findAllBooks());
    }
}