package jshdc.bean.response.ott;

import java.util.List;
import jshdc.bean.VodContent;

/**
 * Created by yinghuihong on 16/1/11.
 */
public class GetVodContentsResp {

  public int result;
  public String message;
  public Data data;

  public class Data {
    public List<VodContent> contents;

    @Override public String toString() {
      return "Data{" +
          "contents=" + contents +
          '}';
    }
  }

  @Override public String toString() {
    return "GetVodContentsResp{" +
        "result=" + result +
        ", message='" + message + '\'' +
        ", data=" + data +
        '}';
  }
}
