package org.chnjkfp.lianci.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.chnjkfp.lianci.dao.entity.Test;
import org.chnjkfp.lianci.dao.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestDao {

    @Resource
    private TestMapper testMapper;

    public Test get() {
        QueryWrapper<Test> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", 2L);
        return testMapper.selectOne(queryWrapper);
    }

    public void save() {
        Test t = new Test();
        t.setUserName("wangwu");
        testMapper.insert(t);
    }

    public void update() {
        Test t = new Test();
        t.setUserName("wangwu1");
        t.setId(2L);
        testMapper.updateById(t);
    }
}
