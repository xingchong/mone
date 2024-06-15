package run.mone.m78.api.bo.document;

import java.util.List;

public class DocumentBuilder {
    private String id;
    private String name;
    private String originalFileName;
    private String metaContent;
    private List<ChatInfo> chatInfoList;
    private Integer status;
    private Integer favorite;

    /* 12 */
    public DocumentBuilder id(String id) {
        this.id = id;
        return this;
    }

    public DocumentBuilder name(String name) {
        this.name = name;
        return this;
    }

    public DocumentBuilder originalFileName(String originalFileName) {
        this.originalFileName = originalFileName;
        return this;
    }

    public DocumentBuilder metaContent(String metaContent) {
        this.metaContent = metaContent;
        return this;
    }

    public DocumentBuilder chatInfoList(List<ChatInfo> chatInfoList) {
        this.chatInfoList = chatInfoList;
        return this;
    }

    public DocumentBuilder status(Integer status) {
        this.status = status;
        return this;
    }

    public DocumentBuilder favorite(Integer favorite) {
        this.favorite = favorite;
        return this;
    }

    public Document build() {
        return new Document(this.id, this.name, this.originalFileName, this.metaContent, this.chatInfoList, this.status, this.favorite);
    }

    public String toString() {
        return "Document.DocumentBuilder(id=" + this.id + ", name=" + this.name + ", originalFileName=" + this.originalFileName + ", metaContent=" + this.metaContent + ", chatInfoList=" + this.chatInfoList + ", status=" + this.status + ", favorite=" + this.favorite + ")";
    }

}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/document/Document$DocumentBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */