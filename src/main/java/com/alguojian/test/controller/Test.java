package com.alguojian.test.controller;

import com.alguojian.test.model.TWorkSerialInfo;
import com.alguojian.test.service.UserBalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 *
 * @author ALguojian
 * @date 2018/1/16
 */
@RestController
@RequestMapping("test/")
public class Test {

    @Autowired
    private UserBalanceService userBalanceService;

    @RequestMapping("getBookInfo")
    public TWorkSerialInfo getBookInfo() {

        return userBalanceService.getBookInfo();

    }

}
