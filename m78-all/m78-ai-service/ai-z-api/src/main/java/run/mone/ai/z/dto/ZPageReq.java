package run.mone.ai.z.dto;


import java.io.Serializable;

public class ZPageReq implements Serializable {
    private String zuToken;

    /*  7 */
    public void setZuToken(String zuToken) {
        this.zuToken = zuToken;
    }

    private int pageNum;
    private int pageSize;

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ZPageReq)) return false;
        ZPageReq other = (ZPageReq) o;
        if (!other.canEqual(this)) return false;
        if (getPageNum() != other.getPageNum()) return false;
        if (getPageSize() != other.getPageSize()) return false;
        Object this$zuToken = getZuToken(), other$zuToken = other.getZuToken();
        return !((this$zuToken == null) ? (other$zuToken != null) : !this$zuToken.equals(other$zuToken));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ZPageReq;
    }

    public int hashCode() {
                 int result = 1;
        result = result * 59 + getPageNum();
        result = result * 59 + getPageSize();
        Object $zuToken = getZuToken();
        return result * 59 + (($zuToken == null) ? 43 : $zuToken.hashCode());
    }

    public String toString() {
        return "ZPageReq(zuToken=" + getZuToken() + ", pageNum=" + getPageNum() + ", pageSize=" + getPageSize() + ")";
    }

    /*  9 */
    public String getZuToken() {
        return this.zuToken;
    }

    /* 10 */
    public int getPageNum() {
        return this.pageNum;
    }

    public int getPageSize() {
        /* 11 */
        return this.pageSize;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/ZPageReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */