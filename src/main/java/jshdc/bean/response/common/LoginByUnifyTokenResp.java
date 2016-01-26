package jshdc.bean.response.common;

import jshdc.bean.User;

/**
 * 全网统一认证登陆
 * Created by yinghuihong on 16/1/26.
 */
public class LoginByUnifyTokenResp {

    public int result;
    public String message;
    public Data data;

    public class Data {
        public User user;

        @Override
        public String toString() {
            return "Data{" +
                    "user=" + user +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "LoginByUnifyTokenResp{" +
                "result=" + result +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
