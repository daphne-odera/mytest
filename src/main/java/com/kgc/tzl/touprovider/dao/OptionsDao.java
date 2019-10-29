package com.kgc.tzl.touprovider.dao;


import com.kgc.tzl.bean.Options;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OptionsDao {

    /**
     * 根据主题ID查询对应选项信息
     * @param id
     * @return
     */
    public List<Options> queryBySubID(Integer id);

    /**
     * 根据选项ID修改投票人数
     * @param oid
     *
     * @return
     */
    public int updateByVote(Integer oid);
}
