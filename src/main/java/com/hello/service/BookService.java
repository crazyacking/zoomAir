package com.hello.service;

import com.hello.model.Book;

import java.util.List;

/**
 * Created by Administrator on 2015/10/25.
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
