package com.example.demo.web;

import com.example.demo.service.InfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Created by Anne on 2018/7/11.
 */
@Controller
public class InfController {
    @Autowired
    private InfService infService;
    @RequestMapping(value = "cs")
    @ResponseBody
    public List<Map<String,Object>>  cs(){
        return  infService.search();
    }
}
