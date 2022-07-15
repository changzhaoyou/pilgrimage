package com.pilgrimage.common.web.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 请求公共实体
 */
@Data
public class RequestParam implements Serializable {
    /**
     * 签名
     */
    private String signature;
    /**
     * 随机数
     */
    private String random;
    /**
     * 请求参数
     */
    private String parameters;
    /**
     * 时间戳
     */
    private long timestamp;
}
