package jshdc.bean.response.ott;

import jshdc.bean.Program;

import java.util.List;

/**
 * 获取节目列表
 * Created by yinghuihong on 16/1/11.
 */
public class GetProgramsResp {
    public int result;
    public String message;
    public Data data;

    public class Data {
        public List<Program> programs;

        @Override
        public String toString() {
            return "Data{" +
                    "programs=" + programs +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "GetProgramsResp{" +
                "result=" + result +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
