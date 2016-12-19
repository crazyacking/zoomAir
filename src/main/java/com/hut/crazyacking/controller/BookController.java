package com.hut.crazyacking.controller;

import com.hut.crazyacking.model.Book;
import com.hut.crazyacking.service.BookService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2015/10/25.
 */
@Controller
@RequestMapping("/book")
public class BookController {

    private static Logger logger = Logger.getLogger(BookController.class);

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/addBook", method = RequestMethod.POST)
    public String addBook(@RequestParam("name") String name,
                          @RequestParam("price") String price,
                          @RequestParam("isbn") String isbn,
                          @RequestParam("author") String author) {

        Book book = new Book();
        book.setName(name);
        book.setPrice((price == null ? 0.00d : Double.valueOf(price)));
        book.setIsbn(isbn);
        book.setAuthor(author);
        book.setExpired(1);
        book.setCreatedTime(new Date());

        bookService.addNewBook(book);

        return "redirect:/book/list";
    }

    @RequestMapping(value = "/del", method = RequestMethod.GET)
    public String delBook(@RequestParam("isbn") String isbn) {
        Book book = new Book();
        book.setIsbn(isbn);
        bookService.delBook(book);

        return "redirect:/book/list";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateBook(@RequestParam("isbn") String isbn,
                             @RequestParam("price") String price,
                             @RequestParam("expired") String expired) {
        Book book = new Book();
        book.setIsbn(isbn);
        book.setPrice((price == null ? 0.00d : Double.valueOf(price)));
        book.setExpired((expired == null ? 0 : Integer.valueOf(expired)));

        bookService.updateBook(book);
        return "redirect:/book/list";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        List bookList = bookService.selectAllBook();
        model.addAttribute("bookList", bookList);
        return "book/list";
    }

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String getBookInfo() {
        return "book/info";
    }

    @RequestMapping(value = "/addInput", method = RequestMethod.GET)
    public String addInput() {
        return "book/addNewBook";
    }

    @RequestMapping(value = "/updateInput", method = RequestMethod.GET)
    public String updateInput(@RequestParam("isbn") String isbn, Model model) {
        Book book = bookService.selectBookByIsbn(isbn);

        model.addAttribute("book", book);
        return "book/updateBook";
    }
}
