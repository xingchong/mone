package run.mone.m78.api.bo.document;

import java.util.List;
import java.util.Map;


public class ChatInfoBuilder {
    private Long id;
    private String content;
    private String mappingContent;
    private List<Map<String, Object>> conditions;

    public ChatInfoBuilder id(Long id) {
        /* 20 */
        this.id = id;
        return this;
    }

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


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/document/ChatInfo$ChatInfoBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */