package nl.hu.zrb.diarieswithfirebase;

/**
 * Created by JZuurbier on 23-11-2016.
 */

public class DiaryEntry {

    private String title;
    private String content;
    private long date;
    String key;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

}
