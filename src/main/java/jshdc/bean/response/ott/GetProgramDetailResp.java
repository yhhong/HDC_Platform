package jshdc.bean.response.ott;

import jshdc.bean.Program;

/**
 * Created by yinghuihong on 16/1/11.
 */
public class GetProgramDetailResp {

  public int result;
  public String message;
  public Data data;

  public class Data {
    public Program program;

    @Override public String toString() {
      return "Data{" +
          "program=" + program +
          '}';
    }
  }

  @Override public String toString() {
    return "GetProgramDetailResp{" +
        "result=" + result +
        ", message='" + message + '\'' +
        ", data=" + data +
        '}';
  }
}
