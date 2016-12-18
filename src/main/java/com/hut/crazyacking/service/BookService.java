package com.hut.crazyacking.service;

import com.hut.crazyacking.model.Book;

import java.util.List;

/**
 * Created by crazyacking on 2016/12/17.
 */
public interface BookService {

    /**
     * 新增一本书籍信息
     *
     * @param book 书籍信息对象
     * @return
     */
    Integer addNewBook(Book book);

    Integer delBook(Book book);

    Integer updateBook(Book book);

    List selectAllBook();

    Book selectBookByIsbn(String isbn);
}
