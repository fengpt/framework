package com.freestyle.framework.enums;

/**
 * 用户相关的错误码定义
 * @author huangxiaohui
 *
 */
public enum UserErrorEnum {

    USER_NAME_EMPTY("用户名不能为空", "000001"),
    USER_ID_NULL("用户id不能为空", "000002"),
    NO_RIGHT("权限不足，请联系管理员", "000003"),
    USER_NOT_EXISTS("用户不存在", "000004"),
    BAD_USER_NAME_OR_PWD("用户名或密码输入错误，登录失败", "000005"),
    USER_DISABLED("账户被禁用，登录失败，请联系管理员", "000006"),
    LOGIN_FAIL("登录失败", "000007"),
    NEED_LOGIN("未登录", "000008"),
    OLD_PASSWORD_NULL("旧密码不能为空", "000009"),
    NEW_PASSWORD_NULL("新密码不能为空", "000010"),
    USER_NULL("用户信息不能为空", "000011"),
    USER_PASSWORD_EMPTY("用户密码不能为空", "000012"),
    USER_NAME_EXISTS("用户名已存在", "000013"),
    ;

    private String code;
    private String message;

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    UserErrorEnum(String message, String code) {
        this.message = message;
        this.code = code;
    }

    public static String getErrorMsg(String code) {
        for (UserErrorEnum e : UserErrorEnum.values()) {
            if (e.getCode().equals(code)) {
                return e.message;
            }
        }
        return null;
    }
}
