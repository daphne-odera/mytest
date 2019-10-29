package com.kgc.tzl.touprovider.service.impl;

import com.kgc.tzl.bean.Subjects;
import com.kgc.tzl.touprovider.dao.SubjectsDao;
import com.kgc.tzl.touprovider.service.SubjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectsServiceImpl implements SubjectsService {

    @Autowired
    SubjectsDao subjectsDao;

    //全查subjects表的实现方法
    public List<Subjects> queryAllSubjects() {
        return subjectsDao.queryAllSubjects();
    }

    @Override
    public Subjects queryBySubID(Integer id) {
        return subjectsDao.queryBySubID(id);
    }

    @Override
    public int updateBytotal(Integer id) {
        return subjectsDao.updateBytotal(id);
    }

    @Override
    public int updateByviewTime(Integer id) {
        return subjectsDao.updateByviewTime(id);
    }
}
