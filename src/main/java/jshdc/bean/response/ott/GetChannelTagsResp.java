package jshdc.bean.response.ott;

import jshdc.bean.ChannelTag;

import java.util.List;

/**
 * 获取频道标签列表
 * Created by yinghuihong on 16/1/11.
 */
public class GetChannelTagsResp {

    public int result;
    public String message;
    public Data data;

    public class Data {
        public List<ChannelTag> channelTags;

        @Override
        public String toString() {
            return "Data{" +
                    "channelTags=" + channelTags +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "GetChannelTagsResp{" +
                "result=" + result +
                ", message='" + message + '\'' +
                '}';
    }
}
