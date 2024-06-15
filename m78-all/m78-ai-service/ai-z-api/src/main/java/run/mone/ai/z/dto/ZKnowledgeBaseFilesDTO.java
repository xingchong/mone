package run.mone.ai.z.dto;

import java.io.Serializable;
import java.util.Date;


public class ZKnowledgeBaseFilesDTO
        implements Serializable {
    private Long id;
    private Date gmtCreate;
    private Date gmtModified;
    private String creator;
    private Long knowledgeBaseId;

    public void setId(Long id) {
        /* 28 */
        this.id = id;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setKnowledgeBaseId(Long knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
    }

    public void setFileClass(String fileClass) {
        this.fileClass = fileClass;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void setUrlPath(String urlPath) {
        this.urlPath = urlPath;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setFileContent(String fileContent) {
        this.fileContent = fileContent;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public void setMd5Change(Boolean md5Change) {
        this.md5Change = md5Change;
    }

    public void setFileStore(String fileStore) {
        this.fileStore = fileStore;
    }

    public void setEmbeddingStatus(Integer embeddingStatus) {
        this.embeddingStatus = embeddingStatus;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public void setSeparator(String separator) {
        this.separator = separator;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ZKnowledgeBaseFilesDTO)) return false;
        ZKnowledgeBaseFilesDTO other = (ZKnowledgeBaseFilesDTO) o;
        if (!other.canEqual(this)) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$knowledgeBaseId = getKnowledgeBaseId(), other$knowledgeBaseId = other.getKnowledgeBaseId();
        if ((this$knowledgeBaseId == null) ? (other$knowledgeBaseId != null) : !this$knowledgeBaseId.equals(other$knowledgeBaseId))
            return false;
        Object this$md5Change = getMd5Change(), other$md5Change = other.getMd5Change();
        if ((this$md5Change == null) ? (other$md5Change != null) : !this$md5Change.equals(other$md5Change))
            return false;
        Object this$embeddingStatus = getEmbeddingStatus(), other$embeddingStatus = other.getEmbeddingStatus();
        if ((this$embeddingStatus == null) ? (other$embeddingStatus != null) : !this$embeddingStatus.equals(other$embeddingStatus))
            return false;
        Object this$deleted = getDeleted(), other$deleted = other.getDeleted();
        if ((this$deleted == null) ? (other$deleted != null) : !this$deleted.equals(other$deleted)) return false;
        Object this$categoryId = getCategoryId(), other$categoryId = other.getCategoryId();
        if ((this$categoryId == null) ? (other$categoryId != null) : !this$categoryId.equals(other$categoryId))
            return false;
        Object this$gmtCreate = getGmtCreate(), other$gmtCreate = other.getGmtCreate();
        if ((this$gmtCreate == null) ? (other$gmtCreate != null) : !this$gmtCreate.equals(other$gmtCreate))
            return false;
        Object this$gmtModified = getGmtModified(), other$gmtModified = other.getGmtModified();
        if ((this$gmtModified == null) ? (other$gmtModified != null) : !this$gmtModified.equals(other$gmtModified))
            return false;
        Object this$creator = getCreator(), other$creator = other.getCreator();
        if ((this$creator == null) ? (other$creator != null) : !this$creator.equals(other$creator)) return false;
        Object this$fileClass = getFileClass(), other$fileClass = other.getFileClass();
        if ((this$fileClass == null) ? (other$fileClass != null) : !this$fileClass.equals(other$fileClass))
            return false;
        Object this$fileType = getFileType(), other$fileType = other.getFileType();
        if ((this$fileType == null) ? (other$fileType != null) : !this$fileType.equals(other$fileType)) return false;
        Object this$filePath = getFilePath(), other$filePath = other.getFilePath();
        if ((this$filePath == null) ? (other$filePath != null) : !this$filePath.equals(other$filePath)) return false;
        Object this$urlPath = getUrlPath(), other$urlPath = other.getUrlPath();
        if ((this$urlPath == null) ? (other$urlPath != null) : !this$urlPath.equals(other$urlPath)) return false;
        Object this$fileName = getFileName(), other$fileName = other.getFileName();
        if ((this$fileName == null) ? (other$fileName != null) : !this$fileName.equals(other$fileName)) return false;
        Object this$fileContent = getFileContent(), other$fileContent = other.getFileContent();
        if ((this$fileContent == null) ? (other$fileContent != null) : !this$fileContent.equals(other$fileContent))
            return false;
        Object this$md5 = getMd5(), other$md5 = other.getMd5();
        if ((this$md5 == null) ? (other$md5 != null) : !this$md5.equals(other$md5)) return false;
        Object this$fileStore = getFileStore(), other$fileStore = other.getFileStore();
        if ((this$fileStore == null) ? (other$fileStore != null) : !this$fileStore.equals(other$fileStore))
            return false;
        Object this$separator = getSeparator(), other$separator = other.getSeparator();
        return !((this$separator == null) ? (other$separator != null) : !this$separator.equals(other$separator));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ZKnowledgeBaseFilesDTO;
    }

    public int hashCode() {
                 int result = 1;
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $knowledgeBaseId = getKnowledgeBaseId();
        result = result * 59 + (($knowledgeBaseId == null) ? 43 : $knowledgeBaseId.hashCode());
        Object $md5Change = getMd5Change();
        result = result * 59 + (($md5Change == null) ? 43 : $md5Change.hashCode());
        Object $embeddingStatus = getEmbeddingStatus();
        result = result * 59 + (($embeddingStatus == null) ? 43 : $embeddingStatus.hashCode());
        Object $deleted = getDeleted();
        result = result * 59 + (($deleted == null) ? 43 : $deleted.hashCode());
        Object $categoryId = getCategoryId();
        result = result * 59 + (($categoryId == null) ? 43 : $categoryId.hashCode());
        Object $gmtCreate = getGmtCreate();
        result = result * 59 + (($gmtCreate == null) ? 43 : $gmtCreate.hashCode());
        Object $gmtModified = getGmtModified();
        result = result * 59 + (($gmtModified == null) ? 43 : $gmtModified.hashCode());
        Object $creator = getCreator();
        result = result * 59 + (($creator == null) ? 43 : $creator.hashCode());
        Object $fileClass = getFileClass();
        result = result * 59 + (($fileClass == null) ? 43 : $fileClass.hashCode());
        Object $fileType = getFileType();
        result = result * 59 + (($fileType == null) ? 43 : $fileType.hashCode());
        Object $filePath = getFilePath();
        result = result * 59 + (($filePath == null) ? 43 : $filePath.hashCode());
        Object $urlPath = getUrlPath();
        result = result * 59 + (($urlPath == null) ? 43 : $urlPath.hashCode());
        Object $fileName = getFileName();
        result = result * 59 + (($fileName == null) ? 43 : $fileName.hashCode());
        Object $fileContent = getFileContent();
        result = result * 59 + (($fileContent == null) ? 43 : $fileContent.hashCode());
        Object $md5 = getMd5();
        result = result * 59 + (($md5 == null) ? 43 : $md5.hashCode());
        Object $fileStore = getFileStore();
        result = result * 59 + (($fileStore == null) ? 43 : $fileStore.hashCode());
        Object $separator = getSeparator();
        return result * 59 + (($separator == null) ? 43 : $separator.hashCode());
    }

    public String toString() {
        return "ZKnowledgeBaseFilesDTO(id=" + getId() + ", gmtCreate=" + getGmtCreate() + ", gmtModified=" + getGmtModified() + ", creator=" + getCreator() + ", knowledgeBaseId=" + getKnowledgeBaseId() + ", fileClass=" + getFileClass() + ", fileType=" + getFileType() + ", filePath=" + getFilePath() + ", urlPath=" + getUrlPath() + ", fileName=" + getFileName() + ", fileContent=" + getFileContent() + ", md5=" + getMd5() + ", md5Change=" + getMd5Change() + ", fileStore=" + getFileStore() + ", embeddingStatus=" + getEmbeddingStatus() + ", deleted=" + getDeleted() + ", categoryId=" + getCategoryId() + ", separator=" + getSeparator() + ")";
    }

    public Long getId() {
        /* 31 */
        return this.id;
    }

    public Date getGmtCreate() {
        /* 33 */
        return this.gmtCreate;
    }

    public Date getGmtModified() {
        /* 35 */
        return this.gmtModified;
    }

    public String getCreator() {
        /* 37 */
        return this.creator;
    }

    public Long getKnowledgeBaseId() {
        /* 39 */
        return this.knowledgeBaseId;
    }

    /* 41 */   private String fileType;
    private String filePath;
    private String urlPath;
    private String fileClass = "files";
    private String fileName;
    private String fileContent;
    private String md5;

    public String getFileClass() {
        return this.fileClass;
    }

    public String getFileType() {
        /* 43 */
        return this.fileType;
    }

    public String getFilePath() {
        /* 45 */
        return this.filePath;
    }

    public String getUrlPath() {
        /* 47 */
        return this.urlPath;
    }

    public String getFileName() {
        /* 49 */
        return this.fileName;
    }

    public String getFileContent() {
        /* 51 */
        return this.fileContent;
    }

    public String getMd5() {
        /* 53 */
        return this.md5;
    }

    /* 55 */   private Boolean md5Change = Boolean.valueOf(true);

    public Boolean getMd5Change() {
        return this.md5Change;
    }


    /* 58 */   private String fileStore = "FileServer";

    public String getFileStore() {
        return this.fileStore;
    }

    /* 60 */   private Integer embeddingStatus = Integer.valueOf(0);

    public Integer getEmbeddingStatus() {
        return this.embeddingStatus;
    }

    /* 62 */   private Integer deleted = Integer.valueOf(0);
    private Long categoryId;
    private String separator;

    public Integer getDeleted() {
        return this.deleted;
    }

    public Long getCategoryId() {
        /* 65 */
        return this.categoryId;
    }

    public String getSeparator() {
        /* 68 */
        return this.separator;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/ZKnowledgeBaseFilesDTO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */