package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by Anne on 2018/7/11.
 */
@Mapper
@Repository
public interface InfMapper {
    List<Map<String,Object>> search();
}
