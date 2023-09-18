package com.test.mapper;

import com.test.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface BookMapper {

    @Select("select * from db_book where bid = #{bid}")
    Book getBookById(int bid);

    @Select("select count from db_book  where bid = #{bid}")
    int getRemain(int bid);

    @Update("update db_book set count = #{count}  where bid = #{bid}")
    int setRemain(int bid, int count);
}
