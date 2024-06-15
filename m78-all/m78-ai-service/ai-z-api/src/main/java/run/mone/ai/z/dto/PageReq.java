package run.mone.ai.z.dto;

import com.xiaomi.mone.http.docs.annotations.HttpApiDocClassDefine;

import java.io.Serializable;

public class PageReq implements Serializable {
    @HttpApiDocClassDefine(value = "pageNum", required = true, description = "分页", defaultValue = "")
    private Integer pageNum;

    /*  8 */
    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    @HttpApiDocClassDefine(value = "pageSize", required = true, description = "分页", defaultValue = "")
    private Integer pageSize;

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof PageReq)) return false;
        PageReq other = (PageReq) o;
        if (!other.canEqual(this)) return false;
        Object this$pageNum = getPageNum(), other$pageNum = other.getPageNum();
        if ((this$pageNum == null) ? (other$pageNum != null) : !this$pageNum.equals(other$pageNum)) return false;
        Object this$pageSize = getPageSize(), other$pageSize = other.getPageSize();
        return !((this$pageSize == null) ? (other$pageSize != null) : !this$pageSize.equals(other$pageSize));
    }

    protected boolean canEqual(Object other) {
        return other instanceof PageReq;
    }

    public int hashCode() {
                 int result = 1;
        Object $pageNum = getPageNum();
        result = result * 59 + (($pageNum == null) ? 43 : $pageNum.hashCode());
        Object $pageSize = getPageSize();
        return result * 59 + (($pageSize == null) ? 43 : $pageSize.hashCode());
    }

    public String toString() {
        return "PageReq(pageNum=" + getPageNum() + ", pageSize=" + getPageSize() + ")";
    }

    public Integer getPageNum() {
        /* 11 */
        return this.pageNum;
    }

    public Integer getPageSize() {
        /* 13 */
        return this.pageSize;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/PageReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */