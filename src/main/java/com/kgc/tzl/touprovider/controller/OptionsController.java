package com.kgc.tzl.touprovider.controller;

import com.kgc.tzl.bean.Options;
import com.kgc.tzl.touprovider.service.OptionsService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OptionsController {

    @Autowired
    OptionsService optionsService;

    //单查选项表信息
    @RequestMapping("showOptions")
    public List<Options> showOptions(Integer id){

        return optionsService.queryBySubID(id);
    }

    @RequestMapping("updateVote")
    public int updateVote(Integer id){
        return optionsService.updateByVote(id);
    }

    @RequestMapping("queryRatio")
    public List queryRatio(Integer id){
        return optionsService.queryRatio(id);
    }
}
