package renderer;

import view.Page;

import static view.Page.*;

public class HtmlRenderer implements Renderer {

    @Override
    public String render(Page page) {
        StringBuilder sb = new StringBuilder();
        sb.append("<html>");
        sb.append("<head><title>").append(page.getTitle()).append("<title></head>");
        sb.append("<body>");
        if (page.getContent().containsKey(NAME)) {
            sb.append("<div id='name'>").append(page.getContent().get(NAME)).append("</div>");
        }
        if (page.getContent().containsKey(DESCRIPTION)) {
            sb.append("<div id='desc'>").append(page.getContent().get(DESCRIPTION)).append("</div>");
        }
        if (page.getContent().containsKey(CONTENT)) {
            sb.append("<div id='content'>").append(page.getContent().get(CONTENT)).append("</div>");
        }
        if (page.getContent().containsKey(PHOTO)) {
            sb.append("<div id='photo'>").append(page.getContent().get(PHOTO)).append("</div>");
        }
        if (page.getContent().containsKey(ID)) {
            sb.append("<div id='id'>").append(page.getContent().get(ID)).append("</div>");
        }

        sb.append("</body></html>");

        return sb.toString();
    }

}
