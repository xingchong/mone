package run.mone.ai.z.dto;

import java.io.Serializable;
import java.util.Date;

public class ZKnowledgeBaseFileBlockDTO implements Serializable {
    private Long id;
    private Date gmtCreate;
    private Date gmtModified;
    private String creator;

    /*  8 */
    public void setId(Long id) {
        this.id = id;
    }

    private Long fileId;
    private String fileName;
    private String blockId;
    private String blockContent;

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setBlockId(String blockId) {
        this.blockId = blockId;
    }

    public void setBlockContent(String blockContent) {
        this.blockContent = blockContent;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ZKnowledgeBaseFileBlockDTO)) return false;
        ZKnowledgeBaseFileBlockDTO other = (ZKnowledgeBaseFileBlockDTO) o;
        if (!other.canEqual(this)) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$fileId = getFileId(), other$fileId = other.getFileId();
        if ((this$fileId == null) ? (other$fileId != null) : !this$fileId.equals(other$fileId)) return false;
        Object this$gmtCreate = getGmtCreate(), other$gmtCreate = other.getGmtCreate();
        if ((this$gmtCreate == null) ? (other$gmtCreate != null) : !this$gmtCreate.equals(other$gmtCreate))
            return false;
        Object this$gmtModified = getGmtModified(), other$gmtModified = other.getGmtModified();
        if ((this$gmtModified == null) ? (other$gmtModified != null) : !this$gmtModified.equals(other$gmtModified))
            return false;
        Object this$creator = getCreator(), other$creator = other.getCreator();
        if ((this$creator == null) ? (other$creator != null) : !this$creator.equals(other$creator)) return false;
        Object this$fileName = getFileName(), other$fileName = other.getFileName();
        if ((this$fileName == null) ? (other$fileName != null) : !this$fileName.equals(other$fileName)) return false;
        Object this$blockId = getBlockId(), other$blockId = other.getBlockId();
        if ((this$blockId == null) ? (other$blockId != null) : !this$blockId.equals(other$blockId)) return false;
        Object this$blockContent = getBlockContent(), other$blockContent = other.getBlockContent();
        return !((this$blockContent == null) ? (other$blockContent != null) : !this$blockContent.equals(other$blockContent));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ZKnowledgeBaseFileBlockDTO;
    }

    public int hashCode() {
                 int result = 1;
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $fileId = getFileId();
        result = result * 59 + (($fileId == null) ? 43 : $fileId.hashCode());
        Object $gmtCreate = getGmtCreate();
        result = result * 59 + (($gmtCreate == null) ? 43 : $gmtCreate.hashCode());
        Object $gmtModified = getGmtModified();
        result = result * 59 + (($gmtModified == null) ? 43 : $gmtModified.hashCode());
        Object $creator = getCreator();
        result = result * 59 + (($creator == null) ? 43 : $creator.hashCode());
        Object $fileName = getFileName();
        result = result * 59 + (($fileName == null) ? 43 : $fileName.hashCode());
        Object $blockId = getBlockId();
        result = result * 59 + (($blockId == null) ? 43 : $blockId.hashCode());
        Object $blockContent = getBlockContent();
        return result * 59 + (($blockContent == null) ? 43 : $blockContent.hashCode());
    }

    public String toString() {
        return "ZKnowledgeBaseFileBlockDTO(id=" + getId() + ", gmtCreate=" + getGmtCreate() + ", gmtModified=" + getGmtModified() + ", creator=" + getCreator() + ", fileId=" + getFileId() + ", fileName=" + getFileName() + ", blockId=" + getBlockId() + ", blockContent=" + getBlockContent() + ")";
    }

    public Long getId() {
        /* 11 */
        return this.id;
    }

    public Date getGmtCreate() {
        /* 13 */
        return this.gmtCreate;
    }

    public Date getGmtModified() {
        /* 15 */
        return this.gmtModified;
    }

    public String getCreator() {
        /* 17 */
        return this.creator;
    }

    public Long getFileId() {
        /* 19 */
        return this.fileId;
    }

    public String getFileName() {
        /* 21 */
        return this.fileName;
    }

    public String getBlockId() {
        /* 23 */
        return this.blockId;
    }

    public String getBlockContent() {
        /* 25 */
        return this.blockContent;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/ZKnowledgeBaseFileBlockDTO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */