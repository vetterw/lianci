package org.chnjkfp.lianci.controller;

import org.chnjkfp.lianci.dao.TestDao;
import org.chnjkfp.lianci.dao.entity.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    private TestDao testDao;

    @GetMapping("/hello")
    public String hello() {
        Test test = testDao.get();
        testDao.update();
        return "Hello Worl1111d!!!!!" + test.getUserName();
    }
}
