package jshdc.bean.response.common;

/**
 * 全网统一认证登陆
 * Created by yinghuihong on 16/1/26.
 */
public class LoginByUnifyTokenResp {

    public int result;
    public String message;
    public Data data;

    public class Data {
        public String userId;
        public String portrait;
        public String userName;

        public String userToken;

        @Override
        public String toString() {
            return "Data{" +
                    "userId='" + userId + '\'' +
                    ", portrait='" + portrait + '\'' +
                    ", userName='" + userName + '\'' +
                    ", userToken='" + userToken + '\'' +
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
