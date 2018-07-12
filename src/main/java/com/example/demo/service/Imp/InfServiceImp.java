package com.example.demo.service.Imp;

import com.example.demo.dao.InfMapper;
import com.example.demo.service.InfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Anne on 2018/7/11.
 */
@Service
public class InfServiceImp implements InfService{
    @Autowired
    private InfMapper infMapper;
    @Override
    public List<Map<String, Object>> search() {
        return infMapper.search();
    }
}
