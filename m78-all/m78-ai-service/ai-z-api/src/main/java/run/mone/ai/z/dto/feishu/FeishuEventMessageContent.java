package run.mone.ai.z.dto.feishu;

import java.util.List;

public class FeishuEventMessageContent {
    private String title;
    private List<List<FeishuEventMessageContentBody>> content;
    private String text;

    /* 10 */
    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(List<List<FeishuEventMessageContentBody>> content) {
        this.content = content;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof FeishuEventMessageContent)) return false;
        FeishuEventMessageContent other = (FeishuEventMessageContent) o;
        if (!other.canEqual(this)) return false;
        Object this$title = getTitle(), other$title = other.getTitle();
        if ((this$title == null) ? (other$title != null) : !this$title.equals(other$title)) return false;
        Object this$content = (Object) getContent(), other$content = (Object) other.getContent();
        if ((this$content == null) ? (other$content != null) : !this$content.equals(other$content)) return false;
        Object this$text = getText(), other$text = other.getText();
        return !((this$text == null) ? (other$text != null) : !this$text.equals(other$text));
    }

    protected boolean canEqual(Object other) {
        return other instanceof FeishuEventMessageContent;
    }

    public int hashCode() {
        int result = 1;
        Object $title = getTitle();
        result = result * 59 + (($title == null) ? 43 : $title.hashCode());
        Object $content = (Object) getContent();
        result = result * 59 + (($content == null) ? 43 : $content.hashCode());
        Object $text = getText();
        return result * 59 + (($text == null) ? 43 : $text.hashCode());
    }

    public String toString() {
        return "FeishuEventMessageContent(title=" + getTitle() + ", content=" + getContent() + ", text=" + getText() + ")";
    }

    /* 12 */
    public String getTitle() {
        return this.title;
    }

    /* 13 */
    public List<List<FeishuEventMessageContentBody>> getContent() {
        return this.content;
    }

    public String getText() {
        /* 14 */
        return this.text;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/feishu/FeishuEventMessageContent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */