package com.alguojian.test.service;

import com.alguojian.test.model.PackBalance;
import com.alguojian.test.model.TWorkSerialInfo;
import com.alguojian.test.model.UserVerificationModel;
import com.alguojian.test.persistence.UserBalanceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ALguojian
 * @date 2018/1/16
 */
@Service
public class UserBalanceService {

    @Autowired
    private UserBalanceMapper userBalanceMapper;


    public PackBalance get(){
        return userBalanceMapper.getBalanceByUserId("111");
    }

    public List<UserVerificationModel> getUserVerficationModel(){
        return userBalanceMapper.getUserVerficationModel();
    }

    public TWorkSerialInfo getBookInfo(){
        return userBalanceMapper.getBookInfo(66L);
    }
}
