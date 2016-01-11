package jshdc.bean.response.ott;

import java.util.List;
import jshdc.bean.Program;

/**
 * Created by yinghuihong on 16/1/11.
 */
public class GetChannelProgramsResp {
  public int result;
  public String message;
  public Data data;

  public class Data {
    public List<Program> programs;

    @Override public String toString() {
      return "Data{" +
          "programs=" + programs +
          '}';
    }
  }

  @Override public String toString() {
    return "GetChannelProgramsResp{" +
        "result=" + result +
        ", message='" + message + '\'' +
        ", data=" + data +
        '}';
  }
}
