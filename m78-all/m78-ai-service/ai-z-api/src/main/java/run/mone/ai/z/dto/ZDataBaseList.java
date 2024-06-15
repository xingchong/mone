package run.mone.ai.z.dto;

import com.xiaomi.mone.http.docs.annotations.HttpApiDocClassDefine;

import java.io.Serializable;
import java.util.List;

public class ZDataBaseList implements Serializable {
    @HttpApiDocClassDefine(value = "pageNum", description = "pageNum", defaultValue = "")
    private Integer pageNum;
    @HttpApiDocClassDefine(value = "pageSize", description = "pageSize", defaultValue = "")
    private Integer pageSize;

    /*  9 */
    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    @HttpApiDocClassDefine(value = "total", description = "total", defaultValue = "")
    private Long total;
    @HttpApiDocClassDefine(value = "list", description = "list", defaultValue = "")
    private List<ZDataBaseSimple> list;

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public void setList(List<ZDataBaseSimple> list) {
        this.list = list;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ZDataBaseList)) return false;
        ZDataBaseList other = (ZDataBaseList) o;
        if (!other.canEqual(this)) return false;
        Object this$pageNum = getPageNum(), other$pageNum = other.getPageNum();
        if ((this$pageNum == null) ? (other$pageNum != null) : !this$pageNum.equals(other$pageNum)) return false;
        Object this$pageSize = getPageSize(), other$pageSize = other.getPageSize();
        if ((this$pageSize == null) ? (other$pageSize != null) : !this$pageSize.equals(other$pageSize)) return false;
        Object this$total = getTotal(), other$total = other.getTotal();
        if ((this$total == null) ? (other$total != null) : !this$total.equals(other$total)) return false;
        Object this$list = (Object) getList(), other$list = (Object) other.getList();
        return !((this$list == null) ? (other$list != null) : !this$list.equals(other$list));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ZDataBaseList;
    }

    public int hashCode() {
                 int result = 1;
        Object $pageNum = getPageNum();
        result = result * 59 + (($pageNum == null) ? 43 : $pageNum.hashCode());
        Object $pageSize = getPageSize();
        result = result * 59 + (($pageSize == null) ? 43 : $pageSize.hashCode());
        Object $total = getTotal();
        result = result * 59 + (($total == null) ? 43 : $total.hashCode());
        Object $list = (Object) getList();
        return result * 59 + (($list == null) ? 43 : $list.hashCode());
    }

    public String toString() {
        return "ZDataBaseList(pageNum=" + getPageNum() + ", pageSize=" + getPageSize() + ", total=" + getTotal() + ", list=" + getList() + ")";
    }

    public Integer getPageNum() {
        /* 12 */
        return this.pageNum;
    }

    public Integer getPageSize() {
        /* 14 */
        return this.pageSize;
    }

    public Long getTotal() {
        /* 16 */
        return this.total;
    }

    public List<ZDataBaseSimple> getList() {
        /* 18 */
        return this.list;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/ZDataBaseList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */