package jshdc.bean.response.ott;

import java.util.List;
import jshdc.bean.Video;

/**
 * 电视剧的子剧集列表
 * Created by yinghuihong on 16/1/11.
 */
public class GetTeleplayVideosResp {
  public int result;
  public String message;
  public Data data;

  public class Data {
    public List<Video> videos;

    @Override public String toString() {
      return "Data{" +
          "videos=" + videos +
          '}';
    }
  }

  @Override public String toString() {
    return "GetTeleplayVideosResp{" +
        "result=" + result +
        ", message='" + message + '\'' +
        ", data=" + data +
        '}';
  }
}
