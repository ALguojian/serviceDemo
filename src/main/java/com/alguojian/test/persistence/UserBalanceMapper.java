package com.alguojian.test.persistence;

import com.alguojian.test.model.PackBalance;
import com.alguojian.test.model.TWorkSerialInfo;
import com.alguojian.test.model.UserVerificationModel;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserBalanceMapper {

    @Select("select * from t_user_balance where `user_id` =#{userId} limit 1")
    PackBalance getBalanceByUserId(@Param("userId") String userId);

    @Select("select * from t_user_verification ")
    List<UserVerificationModel> getUserVerficationModel();

    @Select("select * from t_work_serial_info where work_id =#{workId}")
    TWorkSerialInfo getBookInfo(@Param("workId") Long workId);


}
