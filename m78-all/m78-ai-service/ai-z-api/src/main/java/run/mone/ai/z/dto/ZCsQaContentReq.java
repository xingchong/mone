package run.mone.ai.z.dto;


import com.xiaomi.mone.http.docs.annotations.HttpApiDocClassDefine;

import java.io.Serializable;

public class ZCsQaContentReq implements Serializable {
    @HttpApiDocClassDefine(value = "categoryId", description = "类目id,不能与fileId同时为空，如果搜索该类目下的问题，需要将fileId置为null")
    private Long categoryId;
    @HttpApiDocClassDefine(value = "fileId", description = "文件id,不能与categoryId同时为空,优先级大于categoryId")
    private Long fileId;
    @HttpApiDocClassDefine(value = "content", description = "文本内容", required = true)
    private String content;

    /* 13 */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ZCsQaContentReq)) return false;
        ZCsQaContentReq other = (ZCsQaContentReq) o;
        if (!other.canEqual(this)) return false;
        Object this$categoryId = getCategoryId(), other$categoryId = other.getCategoryId();
        if ((this$categoryId == null) ? (other$categoryId != null) : !this$categoryId.equals(other$categoryId))
            return false;
        Object this$fileId = getFileId(), other$fileId = other.getFileId();
        if ((this$fileId == null) ? (other$fileId != null) : !this$fileId.equals(other$fileId)) return false;
        Object this$size = getSize(), other$size = other.getSize();
        if ((this$size == null) ? (other$size != null) : !this$size.equals(other$size)) return false;
        Object this$content = getContent(), other$content = other.getContent();
        return !((this$content == null) ? (other$content != null) : !this$content.equals(other$content));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ZCsQaContentReq;
    }

    public int hashCode() {
                 int result = 1;
        Object $categoryId = getCategoryId();
        result = result * 59 + (($categoryId == null) ? 43 : $categoryId.hashCode());
        Object $fileId = getFileId();
        result = result * 59 + (($fileId == null) ? 43 : $fileId.hashCode());
        Object $size = getSize();
        result = result * 59 + (($size == null) ? 43 : $size.hashCode());
        Object $content = getContent();
        return result * 59 + (($content == null) ? 43 : $content.hashCode());
    }

    public String toString() {
        return "ZCsQaContentReq(categoryId=" + getCategoryId() + ", fileId=" + getFileId() + ", content=" + getContent() + ", size=" + getSize() + ")";
    }


    public Long getCategoryId() {
        /* 17 */
        return this.categoryId;
    }

    public Long getFileId() {
        /* 20 */
        return this.fileId;
    }

    public String getContent() {
        /* 23 */
        return this.content;
    }

    @HttpApiDocClassDefine(value = "size", description = "回复长度，默认为1", required = true)
    /* 26 */ private Integer size = Integer.valueOf(1);

    public Integer getSize() {
        return this.size;
    }

}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/ZCsQaContentReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */