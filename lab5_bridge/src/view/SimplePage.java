package view;

import java.util.Map;

public class SimplePage implements Page {

    private final String title;
    private final String content;

    public SimplePage(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public Map<String, Object> getContent() {
        return Map.of(CONTENT,content);
    }

}
