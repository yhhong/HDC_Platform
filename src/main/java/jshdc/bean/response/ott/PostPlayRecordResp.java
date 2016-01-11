package jshdc.bean.response.ott;

/**
 * 播放记录新增
 * Created by yinghuihong on 16/1/11.
 */
public class PostPlayRecordResp {
  public int result;
  public String message;

  @Override public String toString() {
    return "PostPlayRecordResp{" +
        "result=" + result +
        ", message='" + message + '\'' +
        '}';
  }
}
