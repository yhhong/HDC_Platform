package jshdc.controller;

import java.util.Map;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yinghuihong on 16/1/11.
 */
@RestController public class CommonController {

  /**
   * 全网统一认证Token验证登陆
   */
  @RequestMapping(value = "/loginByVerifyUnityToken", method = RequestMethod.POST)
  public Boolean loginByVerifyUnityToken(@RequestBody String json) {
    Map<String, Object> map = new GsonJsonParser().parseMap(json);
    String token = (String) map.get("token");
    //TODO verify token through Unity platform
    // {"rst":"","message":"","data":""}
    return true;
  }

  /**
   * 单点登录认证（供华为EPG/CDN平台调用）
   */
  @RequestMapping(value = "/ssoByVerifyToken", method = RequestMethod.POST)
  public Boolean ssoByVerifyToken(@RequestBody String json) {
    Map<String, Object> map = new GsonJsonParser().parseMap(json);
    String token = (String) map.get("token");
    //TODO verify token
    // {"rst":"","message":"","data":""}
    return true;
  }

  /**
   * 动态验证码获取
   */
  @RequestMapping(value = "/getDynamicLoginSms", method = RequestMethod.POST)
  public Boolean getDynamicLoginSms(@RequestBody String json) {
    Map<String, Object> map = new GsonJsonParser().parseMap(json);
    String phone = (String) map.get("phone");
    //TODO verify token
    // {"rst":"","message":"","data":""}
    return true;
  }

  /**
   * 密码修改
   */
  @RequestMapping(value = "/modifyPassword", method = RequestMethod.POST)
  public Boolean modifyPassword(@RequestBody String json) {
    Map<String, Object> map = new GsonJsonParser().parseMap(json);
    String phone = (String) map.get("phone");
    String captcha = (String) map.get("captcha");
    String password = (String) map.get("password");
    //TODO verify
    // {"rst":"","message":"","data":""}
    return true;
  }
}
