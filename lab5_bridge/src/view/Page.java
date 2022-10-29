package view;

import java.util.Map;

public interface Page {

    String NAME = "name";
    String CONTENT = "content";
    String DESCRIPTION = "desc";
    String PHOTO = "photo";
    String ID = "id";

    String getTitle();
    Map<String, Object> getContent();

}
