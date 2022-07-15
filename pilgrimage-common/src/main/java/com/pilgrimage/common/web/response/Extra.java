package com.pilgrimage.common.web.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 扩展信息（开发使用）
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Extra implements Serializable {
    /**
     * 应用名称
     */
    private String appName;
    /**
     * 耗时
     */
    private Long cost;
    /**
     * 异常具体信息（抛异常时返回）
     */
    private String detailMessage;
}
