package com.hut.crazyacking.mapper.impl;

import com.hut.crazyacking.mapper.BookMapper;
import com.hut.crazyacking.model.Book;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by crazyacking on 2016/12/18.
 */
@Component("bookMapper")
public class BookMapperImpl implements BookMapper {
    @Override
    public List selectAllBook() {
        return null;
    }

    @Override
    public Integer addNewBook(Book book) {
        return null;
    }

    @Override
    public Integer delBook(@Param(value = "isbn") String isbn) {
        return null;
    }

    @Override
    public Integer updateBook(@Param(value = "book") Book book) {
        return null;
    }

    @Override
    public Book selectBookByIsbn(@Param(value = "isbn") String isbn) {
        return null;
    }
}
