package jshdc.bean.response.ott;

import java.util.List;
import jshdc.bean.VodTag;

/**
 * Created by yinghuihong on 16/1/11.
 */
public class GetVodTagsResp {

  public int result;
  public String message;
  public Data data;

  public class Data {
    public List<VodTag> tags;

    @Override public String toString() {
      return "Data{" +
          "tags=" + tags +
          '}';
    }
  }

  @Override public String toString() {
    return "GetVodTagsResp{" +
        "result=" + result +
        ", message='" + message + '\'' +
        ", data=" + data +
        '}';
  }
}
