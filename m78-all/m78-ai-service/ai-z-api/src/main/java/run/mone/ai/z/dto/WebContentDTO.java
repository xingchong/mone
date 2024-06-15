package run.mone.ai.z.dto;

import java.io.Serializable;


public class WebContentDTO
        implements Serializable {
    private String title;
    private String author;
    private String bodyContent;

    public void setTitle(String title) {
        /* 27 */
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBodyContent(String bodyContent) {
        this.bodyContent = bodyContent;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof WebContentDTO)) return false;
        WebContentDTO other = (WebContentDTO) o;
        if (!other.canEqual(this)) return false;
        Object this$title = getTitle(), other$title = other.getTitle();
        if ((this$title == null) ? (other$title != null) : !this$title.equals(other$title)) return false;
        Object this$author = getAuthor(), other$author = other.getAuthor();
        if ((this$author == null) ? (other$author != null) : !this$author.equals(other$author)) return false;
        Object this$bodyContent = getBodyContent(), other$bodyContent = other.getBodyContent();
        return !((this$bodyContent == null) ? (other$bodyContent != null) : !this$bodyContent.equals(other$bodyContent));
    }

    protected boolean canEqual(Object other) {
        return other instanceof WebContentDTO;
    }

    public int hashCode() {
                 int result = 1;
        Object $title = getTitle();
        result = result * 59 + (($title == null) ? 43 : $title.hashCode());
        Object $author = getAuthor();
        result = result * 59 + (($author == null) ? 43 : $author.hashCode());
        Object $bodyContent = getBodyContent();
        return result * 59 + (($bodyContent == null) ? 43 : $bodyContent.hashCode());
    }

    public String toString() {
        return "WebContentDTO(title=" + getTitle() + ", author=" + getAuthor() + ", bodyContent=" + getBodyContent() + ")";
    }

    public String getTitle() {
        /* 30 */
        return this.title;
    }

    public String getAuthor() {
        /* 32 */
        return this.author;
    }

    public String getBodyContent() {
        /* 34 */
        return this.bodyContent;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/WebContentDTO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */