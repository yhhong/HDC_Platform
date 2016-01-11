package jshdc.bean.response.ott;

import java.util.List;
import jshdc.bean.Content;

/**
 * 播放记录列表
 * Created by yinghuihong on 16/1/11.
 */
public class GetPlayRecordsResp {
  public int result;
  public String messge;
  public Data data;

  public class Data {
    public List<Content> contents;

    @Override public String toString() {
      return "Data{" +
          "contents=" + contents +
          '}';
    }
  }

  @Override public String toString() {
    return "GetPlayRecordsResp{" +
        "result=" + result +
        ", messge='" + messge + '\'' +
        ", data=" + data +
        '}';
  }
}
