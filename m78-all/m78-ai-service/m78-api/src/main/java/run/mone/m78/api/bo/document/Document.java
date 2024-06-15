package run.mone.m78.api.bo.document;

import java.util.List;

public class Document {
    private String id;
    private String name;
    private String originalFileName;
    private String metaContent;
    private List<ChatInfo> chatInfoList;
    private Integer status;
    private Integer favorite;

    /* 12 */   Document(String id, String name, String originalFileName, String metaContent, List<ChatInfo> chatInfoList, Integer status, Integer favorite) {
        this.id = id;
        this.name = name;
        this.originalFileName = originalFileName;
        this.metaContent = metaContent;
        this.chatInfoList = chatInfoList;
        this.status = status;
        this.favorite = favorite;
    }

    public static DocumentBuilder builder() {
        return new DocumentBuilder();
    }

    public static class DocumentBuilder {
        private String id;
        private String name;
        private String originalFileName;

        public DocumentBuilder id(String id) {
            this.id = id;
            return this;
        }

        private String metaContent;
        private List<ChatInfo> chatInfoList;
        private Integer status;
        private Integer favorite;

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

    /* 13 */
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOriginalFileName(String originalFileName) {
        this.originalFileName = originalFileName;
    }

    public void setMetaContent(String metaContent) {
        this.metaContent = metaContent;
    }

    public void setChatInfoList(List<ChatInfo> chatInfoList) {
        this.chatInfoList = chatInfoList;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setFavorite(Integer favorite) {
        this.favorite = favorite;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Document)) return false;
        Document other = (Document) o;
        if (!other.canEqual(this)) return false;
        Object this$status = getStatus(), other$status = other.getStatus();
        if ((this$status == null) ? (other$status != null) : !this$status.equals(other$status)) return false;
        Object this$favorite = getFavorite(), other$favorite = other.getFavorite();
        if ((this$favorite == null) ? (other$favorite != null) : !this$favorite.equals(other$favorite)) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$name = getName(), other$name = other.getName();
        if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;
        Object this$originalFileName = getOriginalFileName(), other$originalFileName = other.getOriginalFileName();
        if ((this$originalFileName == null) ? (other$originalFileName != null) : !this$originalFileName.equals(other$originalFileName))
            return false;
        Object this$metaContent = getMetaContent(), other$metaContent = other.getMetaContent();
        if ((this$metaContent == null) ? (other$metaContent != null) : !this$metaContent.equals(other$metaContent))
            return false;
        Object this$chatInfoList = (Object) getChatInfoList(), other$chatInfoList = (Object) other.getChatInfoList();
        return !((this$chatInfoList == null) ? (other$chatInfoList != null) : !this$chatInfoList.equals(other$chatInfoList));
    }

    protected boolean canEqual(Object other) {
        return other instanceof Document;
    }

    public int hashCode() {
        int result = 1;
        Object $status = getStatus();
        result = result * 59 + (($status == null) ? 43 : $status.hashCode());
        Object $favorite = getFavorite();
        result = result * 59 + (($favorite == null) ? 43 : $favorite.hashCode());
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $name = getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        Object $originalFileName = getOriginalFileName();
        result = result * 59 + (($originalFileName == null) ? 43 : $originalFileName.hashCode());
        Object $metaContent = getMetaContent();
        result = result * 59 + (($metaContent == null) ? 43 : $metaContent.hashCode());
        Object $chatInfoList = (Object) getChatInfoList();
        return result * 59 + (($chatInfoList == null) ? 43 : $chatInfoList.hashCode());
    }

    public String toString() {
        return "Document(id=" + getId() + ", name=" + getName() + ", originalFileName=" + getOriginalFileName() + ", metaContent=" + getMetaContent() + ", chatInfoList=" + getChatInfoList() + ", status=" + getStatus() + ", favorite=" + getFavorite() + ")";
    }

    public String getId() {
        /* 16 */
        return this.id;
    }

    public String getName() {
        /* 18 */
        return this.name;
    }

    public String getOriginalFileName() {
        /* 20 */
        return this.originalFileName;
    }

    public String getMetaContent() {
        /* 22 */
        return this.metaContent;
    }

    public List<ChatInfo> getChatInfoList() {
        /* 24 */
        return this.chatInfoList;
    }

    public Integer getStatus() {
        /* 26 */
        return this.status;
    }

    public Integer getFavorite() {
        /* 28 */
        return this.favorite;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/document/Document.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */