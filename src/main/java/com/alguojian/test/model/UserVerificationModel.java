package com.alguojian.test.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * 获得用户账号信息
 *
 * @author ALguojian
 * @date 2018/1/16
 */
@Data
@ToString
public class UserVerificationModel implements Serializable {

    private String userId;
    private String mobile;
    private String passWord;
    private String qqUniqueId;
    private String weChatUniqueId;

}
