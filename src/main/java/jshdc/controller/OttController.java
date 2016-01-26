package jshdc.controller;

import jshdc.bean.*;
import jshdc.bean.response.ott.*;
import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.boot.json.JsonParser;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * OTT视频
 * Created by yinghuihong on 16/1/8.
 */
@RestController
public class OttController {

    private JsonParser jsonParser = new JacksonJsonParser();

    @RequestMapping(value = "/getColumns")
    public GetColumnsResp getColumns(@RequestBody(required = false) String json) {
        List<Column> columns = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Column column = new Column();
            column.id = String.valueOf(i);
            column.name = "column" + i;
            column.status = "0";
            columns.add(column);
        }
        GetColumnsResp resp = new GetColumnsResp();
        resp.data = resp.new Data();
        resp.data.columns = columns;
        resp.data.lastModifyTime = System.currentTimeMillis();
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    @RequestMapping(value = "/getFloors")
    public GetFloorsResp getFloors(@RequestBody(required = false) String json) {
        GetFloorsResp resp = new GetFloorsResp();
        List<Floor> categories = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Floor category = new Floor();
            category.id = "id" + i;
            category.name = "category " + i;
            category.order = "order " + i;
            category.displayType = "displayType " + i;
            category.view = "view " + i;
            category.argument = "argument " + i;
            category.element1 = "element1";
            category.element2 = "element2";
            List<Content> contents = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                Content content = new Content();
                content.id = "id" + j;
                content.name = "name " + j;
                content.poster = "poster" + j;
                content.type = "type " + j;
                content.tableId = "tableId " + j;
                content.view = "view " + j;
                content.argument = "argument " + j;
                content.element1 = "element1";
                content.element2 = "element2";
                contents.add(content);
            }
            category.contents = contents;
            List<Message> messages = new ArrayList<>();
            for (int k = 0; k < 5; k++) {
                Message message = new Message();
                message.id = "id" + k;
                message.userId = "userId " + k;
                message.avatar = "avatar " + k;
                message.name = "name " + k;
                message.content = "content" + k;
                messages.add(message);
            }
            category.messages = messages;
            categories.add(category);
        }
        resp.data = resp.new Data();
        resp.data.lastModifyTime = System.currentTimeMillis();
        resp.data.floors = categories;
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    @RequestMapping(value = "/getContents")
    public GetContentsResp getContents(@RequestBody(required = false) String json) {
        GetContentsResp resp = new GetContentsResp();
        String floorId;
        String start;
        int limit;
        try {
            Map<String, Object> map = jsonParser.parseMap(json);
            floorId = (String) map.get("floorId");
            start = (String) map.get("start");
            limit = (int) map.get("limit");
        } catch (Exception e) {
            resp.result = 1;
            resp.message = "lack parameter: {floorId, start, limit}";
            return resp;
        }

        List<Content> contents = new ArrayList<>();
        for (int i = 0; i < limit; i++) {
            Content content = new Content();
            content.id = "id" + i;
            content.name = "name " + i;
            content.poster = "poster" + i;
            content.type = "type " + i;
            content.tableId = "tableId " + i;
            content.view = "view " + i;
            content.argument = "argument " + i;
            content.element1 = "element1";
            content.element2 = "element2";
            contents.add(content);
        }
        resp.data = resp.new Data();
        resp.data.contents = contents;
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    @RequestMapping(value = "/getChannelDetail")
    public GetChannelDetailResp getChannelDetail(@RequestBody(required = false) String json) {
        GetChannelDetailResp resp = new GetChannelDetailResp();
        String channelId;
        try {
            Map<String, Object> map = jsonParser.parseMap(json);
            channelId = (String) map.get("channelId");
        } catch (Exception e) {
            resp.result = 1;
            resp.message = "lack parameter: {channelId}";
            return resp;
        }

        Channel channel = new Channel();
        channel.id = "" + channelId;
        channel.name = "name" + channelId;
        channel.url = "www.baidu.com";
        channel.description = "description " + channelId;
        resp.channel = channel;
        return resp;
    }

    @RequestMapping(value = "/getProgramDetail")
    public GetProgramDetailResp getProgramDetail(@RequestBody(required = false) String json) {
        GetProgramDetailResp resp = new GetProgramDetailResp();
        String programId;
        try {
            Map<String, Object> map = jsonParser.parseMap(json);
            programId = (String) map.get("programId");
        } catch (Exception e) {
            resp.result = 1;
            resp.message = "leak parameters: {programId}";
            return resp;
        }

        Program program = new Program();
        program.id = "" + programId;
        program.name = "name" + programId;
        program.showTime = "12:00";
        program.playType = "";
        program.description = "channel " + programId;
        resp.data = resp.new Data();
        resp.data.program = program;
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    @RequestMapping(value = "/getVideoDetail")
    public GetVideoDetailResp getVideoDetail(@RequestBody(required = false) String json) {
        GetVideoDetailResp resp = new GetVideoDetailResp();
        String videoId;
        try {
            Map<String, Object> map = jsonParser.parseMap(json);
            videoId = (String) map.get("videoId");
        } catch (Exception e) {
            resp.result = 1;
            resp.message = "leak parameters: {videoId}";
            return resp;
        }

        Video video = new Video();
        video.id = "" + videoId;
        video.playId = "";
        video.name = "name" + videoId;
        video.poster = "";
        video.director = "";
        video.actors = "";
        video.description = "description " + videoId;
        video.score = "";
        video.showTime = "";
        video.playCount = "";
        video.time = "";
        resp.data = resp.new Data();
        resp.data.video = video;
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    @RequestMapping(value = "/getTeleplayDetail")
    public GetTeleplayDetailResp getTeleplayDetail(@RequestBody(required = false) String json) {

        GetTeleplayDetailResp resp = new GetTeleplayDetailResp();
        String teleplayId;
        try {
            Map<String, Object> map = jsonParser.parseMap(json);
            teleplayId = (String) map.get("teleplayId");
        } catch (Exception e) {
            resp.result = 1;
            resp.message = "leak parameters: {teleplayId}";
            return resp;
        }

        Teleplay teleplay = new Teleplay();
        teleplay.id = "" + teleplayId;
        teleplay.name = "name" + teleplayId;
        teleplay.poster = "";
        teleplay.director = "";
        teleplay.actors = "";
        teleplay.description = "description " + teleplayId;
        teleplay.score = "";
        teleplay.showTime = "";
        teleplay.playCount = "";
        teleplay.total = "";
        teleplay.updateCount = "";
        resp.data = resp.new Data();
        resp.data.teleplay = teleplay;
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    @RequestMapping(value = "/getTeleplayVideos")
    public GetTeleplayVideosResp getTeleplayVideos(@RequestBody(required = false) String json) {
        GetTeleplayVideosResp resp = new GetTeleplayVideosResp();
        try {

            Map<String, Object> map = jsonParser.parseMap(json);
            String teleplayId = (String) map.get("teleplayId");
        } catch (Exception e) {
            resp.result = 1;
            resp.message = "leak parameters: {teleplayId}";
            return resp;
        }

        List<Video> videos = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Video video = new Video();
            video.id = "" + i;
            video.playId = "";
            video.name = "name" + i;
            video.poster = "";
            video.director = "";
            video.actors = "";
            video.description = "description " + i;
            video.score = "";
            video.showTime = "";
            video.playCount = "";
            video.time = "";
            videos.add(video);
        }
        resp.data = resp.new Data();
        resp.data.videos = videos;
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    @RequestMapping(value = "/getChannelTags")
    public GetChannelTagsResp getChannelTags(@RequestBody(required = false) String json) {

        GetChannelTagsResp resp = new GetChannelTagsResp();
        List<ChannelTag> tags = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ChannelTag channelTag = new ChannelTag();
            channelTag.id = "" + i;
            channelTag.name = "channel tag " + i;
            tags.add(channelTag);
        }
        resp.data = resp.new Data();
        resp.data.channelTags = tags;
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    @RequestMapping(value = "/getChannels")
    public GetChannelsResp getChannels(@RequestBody(required = false) String json) {
        GetChannelsResp resp = new GetChannelsResp();
        List<Channel> channels = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Channel channel = new Channel();
            channel.id = "" + i;
            channel.name = "channel " + i;
            channel.url = "";
            channel.description = "";
            channels.add(channel);
        }
        resp.data = resp.new Data();
        resp.data.channels = channels;
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    @RequestMapping(value = "/getChannelPrograms")
    public GetProgramsResp getChannelPrograms(@RequestBody(required = false) String json) {
        GetProgramsResp resp = new GetProgramsResp();
        List<Program> programs = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Program program = new Program();
            program.id = "" + i;
            program.name = "program " + i;
            program.showTime = "";
            program.playType = "";
            program.description = "";
            programs.add(program);
        }
        resp.data = resp.new Data();
        resp.data.programs = programs;
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    @RequestMapping(value = "/getVodTags")
    public GetVodTagsResp getVodTags(@RequestBody(required = false) String json) {
        GetVodTagsResp resp = new GetVodTagsResp();
        List<VodTag> vodTags = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            VodTag vodTag = new VodTag();
            vodTag.id = "" + i;
            vodTag.name = "vod tag " + i;
            vodTags.add(vodTag);
        }
        resp.data = resp.new Data();
        resp.data.tags = vodTags;
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

//  @RequestMapping(value = "/getVodContents")
//  public GetVodContentsResp getVodContents(@RequestBody(required = false) String json) {
//    GetVodContentsResp resp = new GetVodContentsResp();
//    List<VodContent> vodContents = new ArrayList<>();
//    for (int i = 0; i < 10; i++) {
//      VodContent vodContent = new VodContent();
//      vodContent.id = "" + i;
//      vodContent.playId = "";
//      vodContent.name = "vod content " + i;
//      vodContent.poster = "";
//      vodContent.director = "";
//      vodContent.actors = "";
//      vodContent.description = "";
//      vodContent.score = "";
//      vodContent.showTime = "";
//      vodContent.total = "";
//      vodContent.updateCount = "";
//      vodContent.playCount = "";
//      vodContent.time = "";
//      vodContent.superId = "";
//      vodContent.contentType = "";
//      vodContent.tags = "";
//      vodContents.add(vodContent);
//    }
//    resp.data = resp.new Data();
//    resp.data.contents = vodContents;
//    resp.result = 0;
//    resp.message = "success";
//    return resp;
//  }

    @RequestMapping(value = "/getRelevantRecommend")
    public GetRelevantRecommendResp getRelevantRecommend(@RequestBody(required = false) String json) {
        GetRelevantRecommendResp resp = new GetRelevantRecommendResp();

        List<Content> contents = new ArrayList<>();
        for (int j = 0; j < 5; j++) {
            Content content = new Content();
            content.id = "id" + j;
            content.name = "name " + j;
            content.poster = "poster" + j;
            content.type = "type " + j;
            content.tableId = "tableId " + j;
            content.view = "view " + j;
            content.argument = "argument " + j;
            content.element1 = "element1";
            content.element2 = "element2";
            contents.add(content);
        }
        resp.data = resp.new Data();
        resp.data.contents = contents;
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    @RequestMapping(value = "/search")
    public SearchResp search(@RequestBody(required = false) String json) {
        SearchResp resp = new SearchResp();
        try {
            Map<String, Object> map = jsonParser.parseMap(json);
            String text = (String) map.get("text");
        } catch (Exception e) {
            resp.result = 0;
            resp.message = "leak parameters: {text}";
            return resp;
        }

        List<Content> contents = new ArrayList<>();
        for (int j = 0; j < 5; j++) {
            Content content = new Content();
            content.id = "id" + j;
            content.name = "name " + j;
            content.poster = "poster" + j;
            content.type = "type " + j;
            content.tableId = "tableId " + j;
            content.view = "view " + j;
            content.argument = "argument " + j;
            content.element1 = "element1";
            content.element2 = "element2";
            contents.add(content);
        }
        resp.data = resp.new Data();
        resp.data.contents = contents;
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    @RequestMapping(value = "/postCollectContent")
    public PostCollectContentResp postCollectContent(@RequestBody(required = false) String json) {
        PostCollectContentResp resp = new PostCollectContentResp();
        try {
            Map<String, Object> map = jsonParser.parseMap(json);
            Content content = (Content) map.get("content");
            // save content
        } catch (Exception e) {
            resp.result = 1;
            resp.message = "leak parameters: {content}";
            return resp;
        }
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    @RequestMapping(value = "/deleteCollectContent")
    public DeleteCollectContentResp deleteCollectContent(@RequestBody(required = false) String json) {
        DeleteCollectContentResp resp = new DeleteCollectContentResp();
        try {
            Map<String, Object> map = jsonParser.parseMap(json);
            String tableId = (String) map.get("tableId");
            String contentType = (String) map.get("contentType");
        } catch (Exception e) {
            resp.result = 1;
            resp.message = "leak parameters: {tableId, contentType}";
            return resp;
        }
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    @RequestMapping(value = "/getCollectContents")
    public GetCollectContentsResp getCollectContents(@RequestBody(required = false) String json) {
        GetCollectContentsResp resp = new GetCollectContentsResp();
        try {
            Map<String, Object> map = jsonParser.parseMap(json);
            String start = (String) map.get("start");
            String limit = (String) map.get("limit");
            String contentType = (String) map.get("contentType");
        } catch (Exception e) {
            resp.result = 1;
            resp.message = "leak parameters: {start, limit, contentType}";
            return resp;
        }

        List<Content> contents = new ArrayList<>();
        for (int j = 0; j < 5; j++) {
            Content content = new Content();
            content.id = "id" + j;
            content.name = "name " + j;
            content.poster = "poster" + j;
            content.type = "type " + j;
            content.tableId = "tableId " + j;
            content.view = "view " + j;
            content.argument = "argument " + j;
            content.element1 = "element1";
            content.element2 = "element2";
            contents.add(content);
        }
        resp.data = resp.new Data();
        resp.data.contents = contents;
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    @RequestMapping(value = "/postPlayRecord")
    public PostPlayRecordResp postPlayRecord(@RequestBody(required = false) String json) {
        PostPlayRecordResp resp = new PostPlayRecordResp();
        try {
            Map<String, Object> map = jsonParser.parseMap(json);
            String id = (String) map.get("id");
            String time = (String) map.get("time");
        } catch (Exception e) {
            resp.result = 1;
            resp.message = "leak parameters: {id, time}";
            return resp;
        }
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    @RequestMapping(value = "/getPlayRecords")
    public GetPlayRecordsResp getPlayRecords(@RequestBody(required = false) String json) {
        GetPlayRecordsResp resp = new GetPlayRecordsResp();
        try {
            Map<String, Object> map = jsonParser.parseMap(json);
            String start = (String) map.get("start");
            String limit = (String) map.get("limit");
        } catch (Exception e) {
            resp.result = 1;
            resp.message = "leak parameters: {start, limit}";
            return resp;
        }

        List<Content> contents = new ArrayList<>();
        for (int j = 0; j < 5; j++) {
            Content content = new Content();
            content.id = "id" + j;
            content.name = "name " + j;
            content.poster = "poster" + j;
            content.type = "type " + j;
            content.tableId = "tableId " + j;
            content.view = "view " + j;
            content.argument = "argument " + j;
            content.element1 = "element1";
            content.element2 = "element2";
            contents.add(content);
        }
        resp.data = resp.new Data();
        resp.data.contents = contents;
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    //@RequestMapping(value = "/columns2", method = RequestMethod.POST) public GetColumnsResp columns(
    //    @RequestParam(value = "lastModifyTime", required = true) Long lastModifyTime) {
    //  List<Column> columns = new ArrayList<>();
    //  for (int i = 0; i < 10; i++) {
    //    Column column = new Column();
    //    column.id = String.valueOf(i);
    //    column.name = "column" + i;
    //    column.status = "0";
    //    columns.add(column);
    //  }
    //  GetColumnsResp resp = new GetColumnsResp();
    //  resp.columns = columns;
    //  resp.lastModifyTime = System.currentTimeMillis();
    //  return resp;
    //}
}
