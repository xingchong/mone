package run.mone.m78.api.bo.document;

import com.xiaomi.mone.http.docs.annotations.HttpApiDocClassDefine;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class ChatInfo implements Serializable {
    @HttpApiDocClassDefine(value = "id", required = true, description = "chatInfoId", defaultValue = "")
    private Long id;
    @HttpApiDocClassDefine(value = "content", required = true, description = "chat内容", defaultValue = "")
    private String content;
    @HttpApiDocClassDefine(value = "mappingContent", required = true, description = "chat映射内容，如sql", defaultValue = "")
    private String mappingContent;
    @HttpApiDocClassDefine(value = "conditions", required = true, description = "解析后的查询条件", defaultValue = "")
    public List<Map<String, Object>> conditions;

    /* 17 */
    public void setId(Long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setMappingContent(String mappingContent) {
        this.mappingContent = mappingContent;
    }

    public void setConditions(List<Map<String, Object>> conditions) {
        this.conditions = conditions;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ChatInfo)) return false;
        ChatInfo other = (ChatInfo) o;
        if (!other.canEqual(this)) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$content = getContent(), other$content = other.getContent();
        if ((this$content == null) ? (other$content != null) : !this$content.equals(other$content)) return false;
        Object this$mappingContent = getMappingContent(), other$mappingContent = other.getMappingContent();
        if ((this$mappingContent == null) ? (other$mappingContent != null) : !this$mappingContent.equals(other$mappingContent))
            return false;
        Object this$conditions = (Object) getConditions(), other$conditions = (Object) other.getConditions();
        return !((this$conditions == null) ? (other$conditions != null) : !this$conditions.equals(other$conditions));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ChatInfo;
    }

    public int hashCode() {
        int result = 1;
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $content = getContent();
        result = result * 59 + (($content == null) ? 43 : $content.hashCode());
        Object $mappingContent = getMappingContent();
        result = result * 59 + (($mappingContent == null) ? 43 : $mappingContent.hashCode());
        Object $conditions = (Object) getConditions();
        return result * 59 + (($conditions == null) ? 43 : $conditions.hashCode());
    }

    public String toString() {
        return "ChatInfo(id=" + getId() + ", content=" + getContent() + ", mappingContent=" + getMappingContent() + ", conditions=" + getConditions() + ")";
    }

    public ChatInfo() {
    }

    /* 19 */
    public ChatInfo(Long id, String content, String mappingContent, List<Map<String, Object>> conditions) {
        this.id = id;
        this.content = content;
        this.mappingContent = mappingContent;
        this.conditions = conditions;
    }

    /* 20 */
    public static ChatInfoBuilder builder() {
        return new ChatInfoBuilder();
    }

    public static class ChatInfoBuilder {
        private Long id;
        private String content;

        public ChatInfoBuilder id(Long id) {
            this.id = id;
            return this;
        }

        private String mappingContent;
        private List<Map<String, Object>> conditions;

        public ChatInfoBuilder content(String content) {
            this.content = content;
            return this;
        }

        public ChatInfoBuilder mappingContent(String mappingContent) {
            this.mappingContent = mappingContent;
            return this;
        }

        public ChatInfoBuilder conditions(List<Map<String, Object>> conditions) {
            this.conditions = conditions;
            return this;
        }

        public ChatInfo build() {
            return new ChatInfo(this.id, this.content, this.mappingContent, this.conditions);
        }

        public String toString() {
            return "ChatInfo.ChatInfoBuilder(id=" + this.id + ", content=" + this.content + ", mappingContent=" + this.mappingContent + ", conditions=" + this.conditions + ")";
        }
    }

    public Long getId() {
        /* 24 */
        return this.id;
    }

    public String getContent() {
        /* 27 */
        return this.content;
    }

    public String getMappingContent() {
        /* 30 */
        return this.mappingContent;
    }

    public List<Map<String, Object>> getConditions() {
        /* 33 */
        return this.conditions;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/document/ChatInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */