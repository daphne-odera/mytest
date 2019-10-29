package com.kgc.tzl.touprovider.service.impl;

import com.kgc.tzl.bean.Options;
import com.kgc.tzl.bean.Subjects;
import com.kgc.tzl.touprovider.dao.OptionsDao;
import com.kgc.tzl.touprovider.dao.SubjectsDao;
import com.kgc.tzl.touprovider.service.OptionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class OptionsServiceImpl implements OptionsService {

    @Autowired
    OptionsDao optionsDao;

    @Autowired
    SubjectsDao subjectsDao;


    //根据id单查选项表信息
    public List<Options> queryBySubID(Integer id) {
        return optionsDao.queryBySubID(id);
    }

    @Override
    public int updateByVote(Integer oid) {
        return optionsDao.updateByVote(oid);
    }

    //查询选项的比例
    public List queryRatio(Integer id) {

        List<Options> list1=optionsDao.queryBySubID(id);
        Subjects subjects=subjectsDao.queryBySubID(id);


        List list=new ArrayList();
        for(Options options:list1){
            double a=options.getVote();
            double b=subjects.getTotalVotes();
            double c=(a/b)*100;
            NumberFormat format=NumberFormat.getNumberInstance();
            format.setMaximumFractionDigits(2);
           String d= format.format(c);
            list.add(d);
        }


        return list;
    }
}
