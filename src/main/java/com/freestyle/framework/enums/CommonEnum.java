package com.freestyle.framework.enums;

/**
 * 通用枚举定义
 * @author huangxiaohui
 *
 */
public enum CommonEnum {

    REQUEST_SUCCESS("请求成功", "000000"),
    NO_HANDLER_EXCEPTIONS("系统未知异常", "999998"),
    SYS_ERROR("系统异常", "999999"),
    ;

    private String code;
    private String message;

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    CommonEnum(String message, String code) {
        this.message = message;
        this.code = code;
    }

    public static String getErrorMsg(String code) {
        for (CommonEnum e : CommonEnum.values()) {
            if (e.getCode().equals(code)) {
                return e.message;
            }
        }
        return null;
    }
}
