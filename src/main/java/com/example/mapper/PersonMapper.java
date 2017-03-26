package com.example.mapper;

/**
 * Created by tom on 2016/12/20.
 */
import com.example.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

@Mapper
public interface PersonMapper {
    @Select("SELECT * FROM PERSON WHERE id = #{id}")
    Person getById(@Param("id") int id);
}