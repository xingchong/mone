package run.mone.ai.z.dto.feishu;

import java.util.List;

public class FeishuEventMessage {
    private String message_id;
    private String root_id;
    private String parent_id;
    private String create_time;

    /* 11 */
    public void setMessage_id(String message_id) {
        this.message_id = message_id;
    }

    private String chat_id;
    private String chat_type;
    private String message_type;
    private String content;
    private List<FeishuEventMention> mentions;

    public void setRoot_id(String root_id) {
        this.root_id = root_id;
    }

    public void setParent_id(String parent_id) {
        this.parent_id = parent_id;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public void setChat_id(String chat_id) {
        this.chat_id = chat_id;
    }

    public void setChat_type(String chat_type) {
        this.chat_type = chat_type;
    }

    public void setMessage_type(String message_type) {
        this.message_type = message_type;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setMentions(List<FeishuEventMention> mentions) {
        this.mentions = mentions;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof FeishuEventMessage)) return false;
        FeishuEventMessage other = (FeishuEventMessage) o;
        if (!other.canEqual(this)) return false;
        Object this$message_id = getMessage_id(), other$message_id = other.getMessage_id();
        if ((this$message_id == null) ? (other$message_id != null) : !this$message_id.equals(other$message_id))
            return false;
        Object this$root_id = getRoot_id(), other$root_id = other.getRoot_id();
        if ((this$root_id == null) ? (other$root_id != null) : !this$root_id.equals(other$root_id)) return false;
        Object this$parent_id = getParent_id(), other$parent_id = other.getParent_id();
        if ((this$parent_id == null) ? (other$parent_id != null) : !this$parent_id.equals(other$parent_id))
            return false;
        Object this$create_time = getCreate_time(), other$create_time = other.getCreate_time();
        if ((this$create_time == null) ? (other$create_time != null) : !this$create_time.equals(other$create_time))
            return false;
        Object this$chat_id = getChat_id(), other$chat_id = other.getChat_id();
        if ((this$chat_id == null) ? (other$chat_id != null) : !this$chat_id.equals(other$chat_id)) return false;
        Object this$chat_type = getChat_type(), other$chat_type = other.getChat_type();
        if ((this$chat_type == null) ? (other$chat_type != null) : !this$chat_type.equals(other$chat_type))
            return false;
        Object this$message_type = getMessage_type(), other$message_type = other.getMessage_type();
        if ((this$message_type == null) ? (other$message_type != null) : !this$message_type.equals(other$message_type))
            return false;
        Object this$content = getContent(), other$content = other.getContent();
        if ((this$content == null) ? (other$content != null) : !this$content.equals(other$content)) return false;
        Object this$mentions = (Object) getMentions(), other$mentions = (Object) other.getMentions();
        return !((this$mentions == null) ? (other$mentions != null) : !this$mentions.equals(other$mentions));
    }

    protected boolean canEqual(Object other) {
        return other instanceof FeishuEventMessage;
    }

    public int hashCode() {
        int result = 1;
        Object $message_id = getMessage_id();
        result = result * 59 + (($message_id == null) ? 43 : $message_id.hashCode());
        Object $root_id = getRoot_id();
        result = result * 59 + (($root_id == null) ? 43 : $root_id.hashCode());
        Object $parent_id = getParent_id();
        result = result * 59 + (($parent_id == null) ? 43 : $parent_id.hashCode());
        Object $create_time = getCreate_time();
        result = result * 59 + (($create_time == null) ? 43 : $create_time.hashCode());
        Object $chat_id = getChat_id();
        result = result * 59 + (($chat_id == null) ? 43 : $chat_id.hashCode());
        Object $chat_type = getChat_type();
        result = result * 59 + (($chat_type == null) ? 43 : $chat_type.hashCode());
        Object $message_type = getMessage_type();
        result = result * 59 + (($message_type == null) ? 43 : $message_type.hashCode());
        Object $content = getContent();
        result = result * 59 + (($content == null) ? 43 : $content.hashCode());
        Object $mentions = (Object) getMentions();
        return result * 59 + (($mentions == null) ? 43 : $mentions.hashCode());
    }

    public String toString() {
        return "FeishuEventMessage(message_id=" + getMessage_id() + ", root_id=" + getRoot_id() + ", parent_id=" + getParent_id() + ", create_time=" + getCreate_time() + ", chat_id=" + getChat_id() + ", chat_type=" + getChat_type() + ", message_type=" + getMessage_type() + ", content=" + getContent() + ", mentions=" + getMentions() + ")";
    }

    /* 13 */
    public String getMessage_id() {
        return this.message_id;
    }

    /* 14 */
    public String getRoot_id() {
        return this.root_id;
    }

    /* 15 */
    public String getParent_id() {
        return this.parent_id;
    }

    /* 16 */
    public String getCreate_time() {
        return this.create_time;
    }

    /* 17 */
    public String getChat_id() {
        return this.chat_id;
    }

    /* 18 */
    public String getChat_type() {
        return this.chat_type;
    }

    /* 19 */
    public String getMessage_type() {
        return this.message_type;
    }

    /* 20 */
    public String getContent() {
        return this.content;
    }

    public List<FeishuEventMention> getMentions() {
        /* 21 */
        return this.mentions;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/feishu/FeishuEventMessage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */