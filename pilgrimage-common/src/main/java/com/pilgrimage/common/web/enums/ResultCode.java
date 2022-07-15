package com.pilgrimage.common.web.enums;

/**
 * result 枚举类
 * 错误类型，表示错误来源，一位字母。
 * 错误编码，表示具体错误，四位数字
 * A错误来源于用户
 * B错误来源于系统
 * 例如：A0001
 */
public enum ResultCode {
    SUCCESS("00000", "操作成功"),
    EXCEPTION("B0000", "系统异常，请稍后重试"),
    FAILURE("B0001", "操作失败"),
    UNKNOWN("B0002", "服务器未知错误"),
    SIGN("B0100", "签名错误"),
    VERIFY_SIGN("B0101", "验签错误"),
    ENCRYPT("B0102", "加密错误"),
    DECRYPT("B0102", "解密错误"),
    INVALID_ARGUMENT("B0200", "非法请求参数");
    /**
     * 编码
     */
    private String code;
    /**
     * 描述
     */
    private String desc;

    ResultCode(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
