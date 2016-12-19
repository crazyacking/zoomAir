package com.hut.crazyacking.mapper;

import com.hut.crazyacking.model.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by hsjc on 2015/10/26.
 */
public interface BookMapper {
    List selectAllBook();

    Integer addNewBook(Book book);

    Integer delBook(@Param(value = "isbn")String isbn);

    Integer updateBook(@Param(value = "book")Book book);

    Book selectBookByIsbn(@Param(value = "isbn")String isbn);
}
