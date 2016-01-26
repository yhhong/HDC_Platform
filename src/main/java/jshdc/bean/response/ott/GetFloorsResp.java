package jshdc.bean.response.ott;

import jshdc.bean.Floor;

import java.util.List;

/**
 * Created by yinghuihong on 16/1/11.
 */
public class GetFloorsResp {

    public int result;
    public String message;
    public Data data;

    public class Data {
        public long lastModifyTime;
        public List<Floor> floors;

        @Override
        public String toString() {
            return "Data{" +
                    "lastModifyTime=" + lastModifyTime +
                    ", floors=" + floors +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "GetFloorsResp{" +
                "result=" + result +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
