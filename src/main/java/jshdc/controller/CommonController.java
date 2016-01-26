package jshdc.controller;

import jshdc.bean.User;
import jshdc.bean.response.common.*;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.boot.json.JsonParser;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by yinghuihong on 16/1/11.
 */
@RestController
public class CommonController {


    private JsonParser jsonParser = new JacksonJsonParser();


    /**
     * 短信验证码获取
     */
    @RequestMapping(value = "/getLoginSmsCaptcha")
    public GetLoginSmsCaptchaResp getLoginSmsCaptcha(@RequestBody(required = false) String json) {
        GetLoginSmsCaptchaResp resp = new GetLoginSmsCaptchaResp();
        try {
            Map<String, Object> map = jsonParser.parseMap(json);
            String phone = (String) map.get("phone");
            //TODO 生成captcha并通过短信下发
        } catch (Exception e) {
            resp.result = 1;
            resp.message = "leak parameters: {phone}";
            return resp;
        }
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    /**
     * 短信验证码登陆
     */
    @RequestMapping(value = "/loginBySmsCaptcha")
    public LoginBySmsCaptchaResp loginBySmsCaptcha(@RequestBody(required = false) String json) {
        LoginBySmsCaptchaResp resp = new LoginBySmsCaptchaResp();
        try {
            Map<String, Object> map = jsonParser.parseMap(json);
            String phone = (String) map.get("phone");
            String captcha = (String) map.get("captcha");
            // TODO 1证有效性 2查询用户信息 3生成userToken返回

        } catch (Exception e) {
            resp.result = 1;
            resp.message = "leak parameters: {phone, captcha}";
            return resp;
        }

        User user = new User();
        user.userId = "userId_1";
        user.userName = "userName_1";
        user.portrait = Pic.PIC1;
        user.userToken = "user_token_1";

        resp.data = resp.new Data();
        resp.data.user = user;
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    /**
     * 全网统一认证Token登陆
     */
    @RequestMapping(value = "/loginByUnityToken")
    public LoginByUnifyTokenResp loginByUnityToken(@RequestBody(required = false) String json) {
        LoginByUnifyTokenResp resp = new LoginByUnifyTokenResp();
        try {
            Map<String, Object> map = jsonParser.parseMap(json);
            String unifyToken = (String) map.get("unifyToken");
            //TODO verify unifyToken through Unity platform and return what info? phone?
            //TODO 通过统一认证平台认证后返回的phone到家开平台数据库中查询该用户信息,得到userId
        } catch (Exception e) {
            resp.result = 1;
            resp.message = "leak parameters: {unifyToken}";
            return resp;
        }
        User user = new User();
        user.userId = "userId_2";
        user.userName = "userName_2";
        user.portrait = Pic.PIC2;
        user.userToken = "user_token_2";

        resp.data = resp.new Data();
        resp.data.user = user;
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    /**
     * 单点登录认证（供华为EPG/CDN平台调用）
     */
    @RequestMapping(value = "/sso")
    public SsoResp sso(@RequestBody(required = false) String json) {
        SsoResp resp = new SsoResp();
        try {
            Map<String, Object> map = new GsonJsonParser().parseMap(json);
            String userToken = (String) map.get("userToken");
            //TODO verify userToken
        } catch (Exception e) {
            resp.result = 1;
            resp.message = "leak parameters: {userToken}";
            return resp;
        }
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    /**
     * 密码修改(暂不需要)
     */
    @RequestMapping(value = "/modifyPassword")
    public ModifyPasswordResp modifyPassword(@RequestBody(required = false) String json) {
        ModifyPasswordResp resp = new ModifyPasswordResp();
        try {
            Map<String, Object> map = new GsonJsonParser().parseMap(json);
            String phone = (String) map.get("phone");
            String captcha = (String) map.get("captcha");
            String password = (String) map.get("password");
            //TODO verify and modify
        } catch (Exception e) {
            resp.result = 1;
            resp.message = "leak parameters: {phone, captcha, password}";
            return resp;
        }
        resp.result = 0;
        resp.message = "success";
        return resp;
    }
}
