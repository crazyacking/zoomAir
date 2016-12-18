package com.hut.crazyacking.service;

import com.hut.crazyacking.model.Book;

import java.util.List;

/**
 * Created by crazyacking on 2016/12/17.
 */
public interface BookService {

    /**
     * 新增一条书籍信息
     *
     * @param book 书籍信息对象
     * @return 添加成功返回1，否则返回0
     */
    Integer addNewBook(Book book);

    /**
     * 删除一条书籍信息
     *
     * @param book 书籍信息对象
     * @return 删除成功返回1，否则返回0
     */
    Integer delBook(Book book);

    /**
     * 更新一条书籍信息
     *
     * @param book 书籍信息
     * @return 更新成功返回1，否则返回0
     */
    Integer updateBook(Book book);

    /**
     * 查找所有书籍信息
     *
     * @return 所有书籍信息的列表
     */
    List selectAllBook();

    /**
     * 通过ISBN号查找书籍信息
     *
     * @param isbn ISBN号
     * @return 书籍信息对象
     */
    Book selectBookByIsbn(String isbn);
}
