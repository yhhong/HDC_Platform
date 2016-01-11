package jshdc.bean;

/**
 * 包括连续剧、视频
 * Created by yinghuihong on 16/1/11.
 */
public class VodContent {
  public String id;
  public String playId;
  public String name;
  public String poster;
  public String director;
  public String actors;
  public String description;
  public String score;
  public String showTime;
  public String total;
  public String updateCount;
  public String playCount;
  public String time;
  public String superId;
  public String contentType;
  public String tags;

  @Override public String toString() {
    return "VodContent{" +
        "id='" + id + '\'' +
        ", playId='" + playId + '\'' +
        ", name='" + name + '\'' +
        ", poster='" + poster + '\'' +
        ", director='" + director + '\'' +
        ", actors='" + actors + '\'' +
        ", description='" + description + '\'' +
        ", score='" + score + '\'' +
        ", showTime='" + showTime + '\'' +
        ", total='" + total + '\'' +
        ", updateCount='" + updateCount + '\'' +
        ", playCount='" + playCount + '\'' +
        ", time='" + time + '\'' +
        ", superId='" + superId + '\'' +
        ", contentType='" + contentType + '\'' +
        ", tags='" + tags + '\'' +
        '}';
  }
}
