package renderer;

import view.Page;

import static view.Page.*;
import static view.Page.ID;

public class JsonRenderer implements Renderer {

    @Override
    public String render(Page page) {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("'title':").append(page.getTitle()).append(",");
        if (page.getContent().containsKey(NAME)) {
            sb.append("'name':").append(page.getContent().get(NAME)).append(",");
        }
        if (page.getContent().containsKey(DESCRIPTION)) {
            sb.append("'desc':").append(page.getContent().get(DESCRIPTION)).append(",");
        }
        if (page.getContent().containsKey(CONTENT)) {
            sb.append("'content':").append(page.getContent().get(CONTENT)).append(",");
        }
        if (page.getContent().containsKey(PHOTO)) {
            sb.append("'photo':").append(page.getContent().get(PHOTO)).append(",");
        }
        if (page.getContent().containsKey(ID)) {
            sb.append("'id':").append(page.getContent().get(ID));
        }
        sb.append("}");
        return sb.toString();
    }

}
