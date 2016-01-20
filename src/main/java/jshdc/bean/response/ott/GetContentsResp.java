package jshdc.bean.response.ott;

import jshdc.bean.Content;

import java.util.List;

/**
 * 获取(楼层下的更多)内容列表
 * Created by yinghuihong on 16/1/20.
 */
public class GetContentsResp {
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
        return "GetContentsResp{" +
                "result=" + result +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
