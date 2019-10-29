package com.kgc.tzl.touprovider.service;

import com.kgc.tzl.bean.Subjects;

import java.util.List;

public interface SubjectsService {

    public List<Subjects> queryAllSubjects();

    /**
     * 根据id单查主题表
     * @param id
     * @return
     */
    public Subjects queryBySubID(Integer id);

    /**
     * 根据主题ID修改对应主题投票总数
     * @param id
     * @return
     */
    public int updateBytotal(Integer id);

    /**
     * 根据主题ID修改对应主题查看次数
     * @param id
     * @return
     */
    public int updateByviewTime(Integer id);
}
