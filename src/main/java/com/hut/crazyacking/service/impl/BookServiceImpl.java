package com.hut.crazyacking.service.impl;

import com.hut.crazyacking.mapper.BookMapper;
import com.hut.crazyacking.model.Book;
import com.hut.crazyacking.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by crazyacking on 2016/12/17.
 */
@Service
public class BookServiceImpl implements BookService {
    @Resource(name = "bookMapper")
    private BookMapper bookMapper;

    @Autowired
    RedisTemplate redisTemplate;

    @Override
    public Integer addNewBook(Book book) {
        /*redisTemplate.opsForList().rightPop("bookList");*/
        return bookMapper.addNewBook(book);
    }

    @Override
    public Integer delBook(Book book) {
        //redisTemplate.opsForList().rightPop("bookList");
        return bookMapper.delBook(book.getIsbn());
    }

    @Override
    public Integer updateBook(Book book) {
        //redisTemplate.opsForList().rightPop("bookList");
        return bookMapper.updateBook(book);
    }

    @Override
    public List selectAllBook() {
        List bookList = getBookListFromCache();
        if(bookList == null){
            bookList = bookMapper.selectAllBook();
            //redisTemplate.opsForList().rightPush("bookList", bookList);
        } else{
            List list = (ArrayList)bookList.get(0);
            return list;
        }
        return bookList;
    }

    @Override
    public Book selectBookByIsbn(String isbn) {
        return bookMapper.selectBookByIsbn(isbn);
    }

    /**
     * 获取Redis缓存中的bookList内容.
     * @return
     */
    public List getBookListFromCache(){
        //long flag = redisTemplate.opsForList().size("bookList");
        //if(flag > 0){
        //    return redisTemplate.opsForList().range("bookList",0,-1);
        //}
        return null;
    }
}
