package com.hut.crazyacking.mapper;

import com.hut.crazyacking.model.Book;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by crazyacking on 2016/12/17.
 */
public interface BookMapper {
    List selectAllBook();

    Integer addNewBook(Book book);

    Integer delBook(@Param(value = "isbn") String isbn);

    Integer updateBook(@Param(value = "book") Book book);

    Book selectBookByIsbn(@Param(value = "isbn") String isbn);
}
