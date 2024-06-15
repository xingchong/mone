package run.mone.ai.z.dto;

import com.xiaomi.mone.http.docs.annotations.HttpApiDocClassDefine;

import java.io.Serializable;

public class ZDataBaseUsageListReq implements Serializable {
    @HttpApiDocClassDefine(value = "beginTime", required = false, description = "起始时间", defaultValue = "")
    private Long beginTime;
    @HttpApiDocClassDefine(value = "endTime", required = false, description = "截止时间", defaultValue = "")
    private Long endTime;

    /*  8 */
    public void setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
    }

    @HttpApiDocClassDefine(value = "pageNum", required = true, description = "分页", defaultValue = "")
    private Integer pageNum;
    @HttpApiDocClassDefine(value = "pageSize", required = true, description = "分页", defaultValue = "")
    private Integer pageSize;

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ZDataBaseUsageListReq)) return false;
        ZDataBaseUsageListReq other = (ZDataBaseUsageListReq) o;
        if (!other.canEqual(this)) return false;
        Object this$beginTime = getBeginTime(), other$beginTime = other.getBeginTime();
        if ((this$beginTime == null) ? (other$beginTime != null) : !this$beginTime.equals(other$beginTime))
            return false;
        Object this$endTime = getEndTime(), other$endTime = other.getEndTime();
        if ((this$endTime == null) ? (other$endTime != null) : !this$endTime.equals(other$endTime)) return false;
        Object this$pageNum = getPageNum(), other$pageNum = other.getPageNum();
        if ((this$pageNum == null) ? (other$pageNum != null) : !this$pageNum.equals(other$pageNum)) return false;
        Object this$pageSize = getPageSize(), other$pageSize = other.getPageSize();
        return !((this$pageSize == null) ? (other$pageSize != null) : !this$pageSize.equals(other$pageSize));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ZDataBaseUsageListReq;
    }

    public int hashCode() {
                 int result = 1;
        Object $beginTime = getBeginTime();
        result = result * 59 + (($beginTime == null) ? 43 : $beginTime.hashCode());
        Object $endTime = getEndTime();
        result = result * 59 + (($endTime == null) ? 43 : $endTime.hashCode());
        Object $pageNum = getPageNum();
        result = result * 59 + (($pageNum == null) ? 43 : $pageNum.hashCode());
        Object $pageSize = getPageSize();
        return result * 59 + (($pageSize == null) ? 43 : $pageSize.hashCode());
    }

    public String toString() {
        return "ZDataBaseUsageListReq(beginTime=" + getBeginTime() + ", endTime=" + getEndTime() + ", pageNum=" + getPageNum() + ", pageSize=" + getPageSize() + ")";
    }

    public Long getBeginTime() {
        /* 11 */
        return this.beginTime;
    }

    public Long getEndTime() {
        /* 13 */
        return this.endTime;
    }

    public Integer getPageNum() {
        /* 15 */
        return this.pageNum;
    }

    public Integer getPageSize() {
        /* 17 */
        return this.pageSize;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/ZDataBaseUsageListReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */