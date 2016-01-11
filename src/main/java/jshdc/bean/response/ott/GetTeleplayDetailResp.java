package jshdc.bean.response.ott;

import jshdc.bean.Teleplay;

/**
 * Created by yinghuihong on 16/1/11.
 */
public class GetTeleplayDetailResp {
  public int result;
  public String message;
  public Data data;

  public class Data {
    public Teleplay teleplay;

    @Override public String toString() {
      return "Data{" +
          "teleplay=" + teleplay +
          '}';
    }
  }

  @Override public String toString() {
    return "GetTeleplayDetailResp{" +
        "result=" + result +
        ", message='" + message + '\'' +
        '}';
  }
}
