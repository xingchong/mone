package run.mone.ai.z.dto;


import java.io.Serializable;

public class ZOrderPageReq implements Serializable {
    private String text;

    /*  7 */
    public void setText(String text) {
        this.text = text;
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
        if (!(o instanceof ZOrderPageReq)) return false;
        ZOrderPageReq other = (ZOrderPageReq) o;
        if (!other.canEqual(this)) return false;
        if (getPageNum() != other.getPageNum()) return false;
        if (getPageSize() != other.getPageSize()) return false;
        Object this$text = getText(), other$text = other.getText();
        return !((this$text == null) ? (other$text != null) : !this$text.equals(other$text));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ZOrderPageReq;
    }

    public int hashCode() {
                 int result = 1;
        result = result * 59 + getPageNum();
        result = result * 59 + getPageSize();
        Object $text = getText();
        return result * 59 + (($text == null) ? 43 : $text.hashCode());
    }

    public String toString() {
        return "ZOrderPageReq(text=" + getText() + ", pageNum=" + getPageNum() + ", pageSize=" + getPageSize() + ")";
    }

    public String getText() {
        /*  9 */
        return this.text;
    }

    public int getPageNum() {
        /* 11 */
        return this.pageNum;
    }

    public int getPageSize() {
        /* 13 */
        return this.pageSize;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/ZOrderPageReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */