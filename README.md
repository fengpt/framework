# 一个演示spring-security和spring-session使用的demo工程
## 主要实现的功能包括：
* 集成spring-sesurity,由系统数据库管理角色权限信息（建表语句在/framework_init.sql）;
* 使用spring-session解决session共享的问题，指定redis做共享存储，并将token放在header中的tf-token里传输;
* 集成swagger，无需在controller上做多余的swagger注解配置，直接访问 http://localhost:8080/swagger-ui.html 地址即可看到所有的接口定义（够用了，如果有更高级的需求，可以在这基础上写相应的swagger注解）;
* 对前后端分离做了改造支持，数据交互为json格式。登录地址：http://localhost:8080/login （post方式，参数：username，password）;
* 对前端响应做了统一定制，统一返回形式
{
    "success": true,
    "code": "000000",
    "message": "request successfully",
    "data": {}
}
