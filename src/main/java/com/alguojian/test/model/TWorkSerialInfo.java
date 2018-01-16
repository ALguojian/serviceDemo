package com.alguojian.test.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class TWorkSerialInfo implements Serializable {
    private static final long serialVersionUID = 8843252309028964407L;
    public static final String TABLE_NAME = "t_work_serial_info";
    private Long workId;

    private String userId;

    private String workName;

    private Integer workType;

    private Integer topChannelId;

    private Integer channelId;

    private String workKeyWord;

    private String cover;

    private String workProfile;

    private Integer wordCount;

    private Integer chargeType;

    private Integer grantLevel;

    private Integer signStatus;

    private String recommendWord;

    private Integer price;

    private Integer discountPrice;

    private Integer workStatus;

    private Integer subscribe;

    private String workSource;

    private Integer workFinish;

    private Long lastChapterId;

    private Date createTime;

    private Date lastUpdateTime;
}