package com.hut.crazyacking.service;

import com.hut.crazyacking.model.Book;

import java.util.List;

/**
 * Created by Administrator on 2015/10/25.
 */
public interface BookService {

    public Integer addNewBook(Book book);

    public Integer delBook(Book book);

    public Integer updateBook(Book book);

    public List selectAllBook();

    public Book selectBookByIsbn(String isbn);
}
