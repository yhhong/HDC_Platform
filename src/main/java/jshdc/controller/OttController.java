package jshdc.controller;

import jshdc.bean.*;
import jshdc.bean.response.ott.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * OTT视频
 * Created by yinghuihong on 16/1/8.
 */
@RestController
public class OttController {

    @RequestMapping(value = "/getColumns")
    public GetColumnsResp getColumns(@RequestParam String userToken) {
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
    public GetFloorsResp getFloors(@RequestParam String userToken, @RequestParam String columnId) {
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
    public GetContentsResp getContents(@RequestParam String userToken, @RequestParam String floorId,
                                       @RequestParam(required = false, defaultValue = "0") int start,
                                       @RequestParam(required = false, defaultValue = "20") int limit) {
        GetContentsResp resp = new GetContentsResp();
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
    public GetChannelDetailResp getChannelDetail(@RequestParam String userToken, @RequestParam String channelId) {
        GetChannelDetailResp resp = new GetChannelDetailResp();

        Channel channel = new Channel();
        channel.id = "" + channelId;
        channel.name = "name" + channelId;
        channel.url = "www.baidu.com";
        channel.description = "description " + channelId;
        resp.channel = channel;
        return resp;
    }

    @RequestMapping(value = "/getProgramDetail")
    public GetProgramDetailResp getProgramDetail(@RequestParam String userToken, @RequestParam String programId) {
        GetProgramDetailResp resp = new GetProgramDetailResp();

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
    public GetVideoDetailResp getVideoDetail(@RequestParam String userToken, @RequestParam String videoId) {
        GetVideoDetailResp resp = new GetVideoDetailResp();

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
    public GetTeleplayDetailResp getTeleplayDetail(@RequestParam String userToken, @RequestParam String teleplayId) {

        GetTeleplayDetailResp resp = new GetTeleplayDetailResp();

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
    public GetTeleplayVideosResp getTeleplayVideos(@RequestParam String userToken, @RequestParam String teleplayId) {
        GetTeleplayVideosResp resp = new GetTeleplayVideosResp();

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
    public GetChannelTagsResp getChannelTags(@RequestParam String userToken) {

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
    public GetChannelsResp getChannels(@RequestParam String userToken) {
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
    public GetProgramsResp getChannelPrograms(@RequestParam String userToken) {
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
    public GetVodTagsResp getVodTags(@RequestParam String userToken) {
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
    public GetRelevantRecommendResp getRelevantRecommend(@RequestParam String userToken) {
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
    public SearchResp search(@RequestParam String userToken, @RequestParam String text,
                             @RequestParam(required = false, defaultValue = "0") int start,
                             @RequestParam(required = false, defaultValue = "20") int limit) {
        SearchResp resp = new SearchResp();

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

    @RequestMapping(value = "/postCollectVideo")
    public PostCollectContentResp postCollectContent(@RequestParam String userToken, @RequestParam String videoId) {
        PostCollectContentResp resp = new PostCollectContentResp();
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    @RequestMapping(value = "/deleteCollectVideo")
    public DeleteCollectContentResp deleteCollectContent(@RequestParam String userToken, @RequestParam String videoId) {
        DeleteCollectContentResp resp = new DeleteCollectContentResp();
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    @RequestMapping(value = "/getCollectVideos")
    public GetCollectContentsResp getCollectContents(@RequestParam String userToken,
                                                     @RequestParam(required = false, defaultValue = "0") int start,
                                                     @RequestParam(required = false, defaultValue = "20") int limit) {
        GetCollectContentsResp resp = new GetCollectContentsResp();

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

    @RequestMapping(value = "/postVideoPlayRecord")
    public PostPlayRecordResp postVideoPlayRecord(@RequestParam String userToken, @RequestParam String videoId, @RequestParam long breakpoint) {
        PostPlayRecordResp resp = new PostPlayRecordResp();
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    @RequestMapping(value = "/getVideoPlayRecords")
    public GetPlayRecordsResp getVideoPlayRecords(@RequestParam String userToken,
                                                  @RequestParam(required = false, defaultValue = "0") int start,
                                                  @RequestParam(required = false, defaultValue = "20") int limit) {
        GetPlayRecordsResp resp = new GetPlayRecordsResp();

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
