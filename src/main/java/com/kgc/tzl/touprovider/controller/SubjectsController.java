package com.kgc.tzl.touprovider.controller;

import com.alibaba.fastjson.JSONObject;
import com.kgc.tzl.bean.Subjects;
import com.kgc.tzl.touprovider.service.SubjectsService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SubjectsController {

    @Autowired
    SubjectsService ss;

    @RequestMapping("showSubjects")
    public String showSubjects(){

        return JSONObject.toJSON(ss.queryAllSubjects()).toString();
    }

    @RequestMapping("showSubByID")
    public Subjects showSubByID(Integer id){
        return ss.queryBySubID(id);
    }


    @RequestMapping("updateTotalvotes")
    public int updateTotalvotes(Integer id){
        return ss.updateBytotal(id);
    }

    @RequestMapping("updateViewTimes")
    public int updateViewTimes(Integer id){
        return ss.updateByviewTime(id);
    }


    @RequestMapping("showMe")
    public String showMe(){
        return "我叫田梓良";
    }

}
