package run.mone.ai.z.dto;


import java.io.Serializable;
import java.util.List;

public class ZPageList<T> implements Serializable {
    private int pageNum;
    private int pageSize;

    /*  8 */
    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    private long sum;
    private List<T> data;

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ZPageList)) return false;
        ZPageList<?> other = (ZPageList) o;
        if (!other.canEqual(this)) return false;
        if (getPageNum() != other.getPageNum()) return false;
        if (getPageSize() != other.getPageSize()) return false;
        if (getSum() != other.getSum()) return false;
        Object this$data = (Object) getData();
        Object other$data = (Object) other.getData();
        return !((this$data == null) ? (other$data != null) : !this$data.equals(other$data));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ZPageList;
    }

    public int hashCode() {
                 int result = 1;
        result = result * 59 + getPageNum();
        result = result * 59 + getPageSize();
        long $sum = getSum();
        result = result * 59 + (int) ($sum >>> 32L ^ $sum);
        Object $data = (Object) getData();
        return result * 59 + (($data == null) ? 43 : $data.hashCode());
    }

    public String toString() {
        return "ZPageList(pageNum=" + getPageNum() + ", pageSize=" + getPageSize() + ", sum=" + getSum() + ", data=" + getData() + ")";
    }

    /* 10 */
    public int getPageNum() {
        return this.pageNum;
    }

    /* 11 */
    public int getPageSize() {
        return this.pageSize;
    }

    /* 12 */
    public long getSum() {
        return this.sum;
    }

    public List<T> getData() {
        /* 13 */
        return this.data;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/ZPageList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */