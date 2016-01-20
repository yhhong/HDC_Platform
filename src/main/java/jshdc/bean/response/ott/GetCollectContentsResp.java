package jshdc.bean.response.ott;

import jshdc.bean.Content;

import java.util.List;

/**
 * 获取收藏列表
 * Created by yinghuihong on 16/1/11.
 */
public class GetCollectContentsResp {
    public int result;
    public String message;
    public Data data;

    public class Data {
        public List<Content> contents;

        @Override
        public String toString() {
            return "Data{" +
                    "contents=" + contents +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "GetCollectContentsResp{" +
                "result=" + result +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
