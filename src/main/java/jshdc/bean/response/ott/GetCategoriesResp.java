package jshdc.bean.response.ott;

import java.util.List;
import jshdc.bean.Category;

/**
 * Created by yinghuihong on 16/1/11.
 */
public class GetCategoriesResp {

  public int result;
  public String message;
  public Data data;

  public class Data {
    public long lastModifyTime;
    public List<Category> categories;

    @Override public String toString() {
      return "Data{" +
          "lastModifyTime=" + lastModifyTime +
          ", categories=" + categories +
          '}';
    }
  }

  @Override public String toString() {
    return "GetCategoriesResp{" +
        "result=" + result +
        ", message='" + message + '\'' +
        ", data=" + data +
        '}';
  }
}
