package renderer;

import view.Page;

import static view.Page.*;
import static view.Page.ID;

public class XmlRenderer implements Renderer {

    @Override
    public String render(Page page) {
        StringBuilder sb = new StringBuilder();
        sb.append("<root>");
        sb.append("<title>").append(page.getTitle()).append("<title>");
        if (page.getContent().containsKey(NAME)) {
            sb.append("<name>").append(page.getContent().get(NAME)).append("</name>");
        }
        if (page.getContent().containsKey(DESCRIPTION)) {
            sb.append("<desc>").append(page.getContent().get(DESCRIPTION)).append("</desc>");
        }
        if (page.getContent().containsKey(CONTENT)) {
            sb.append("<content>").append(page.getContent().get(CONTENT)).append("</content>");
        }
        if (page.getContent().containsKey(PHOTO)) {
            sb.append("<photo>").append(page.getContent().get(PHOTO)).append("</photo>");
        }
        if (page.getContent().containsKey(ID)) {
            sb.append("<id>").append(page.getContent().get(ID)).append("</id>");
        }
        sb.append("</root>");

        return sb.toString();
    }

}
