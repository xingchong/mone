package run.mone.m78.api.bo.code;

import java.io.Serializable;

public class ReqCodeListDto implements Serializable {
    private String name;
    private Integer type;

    /*  7 */
    public void setName(String name) {
        this.name = name;
    }

    private Integer pageNum;
    private Integer pageSize;

    public void setType(Integer type) {
        this.type = type;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ReqCodeListDto)) return false;
        ReqCodeListDto other = (ReqCodeListDto) o;
        if (!other.canEqual(this)) return false;
        Object this$type = getType(), other$type = other.getType();
        if ((this$type == null) ? (other$type != null) : !this$type.equals(other$type)) return false;
        Object this$pageNum = getPageNum(), other$pageNum = other.getPageNum();
        if ((this$pageNum == null) ? (other$pageNum != null) : !this$pageNum.equals(other$pageNum)) return false;
        Object this$pageSize = getPageSize(), other$pageSize = other.getPageSize();
        if ((this$pageSize == null) ? (other$pageSize != null) : !this$pageSize.equals(other$pageSize)) return false;
        Object this$name = getName(), other$name = other.getName();
        return !((this$name == null) ? (other$name != null) : !this$name.equals(other$name));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ReqCodeListDto;
    }

    public int hashCode() {
        int result = 1;
        Object $type = getType();
        result = result * 59 + (($type == null) ? 43 : $type.hashCode());
        Object $pageNum = getPageNum();
        result = result * 59 + (($pageNum == null) ? 43 : $pageNum.hashCode());
        Object $pageSize = getPageSize();
        result = result * 59 + (($pageSize == null) ? 43 : $pageSize.hashCode());
        Object $name = getName();
        return result * 59 + (($name == null) ? 43 : $name.hashCode());
    }

    public String toString() {
        return "ReqCodeListDto(name=" + getName() + ", type=" + getType() + ", pageNum=" + getPageNum() + ", pageSize=" + getPageSize() + ")";
    }

    public String getName() {
        /* 10 */
        return this.name;
    }

    public Integer getType() {
        /* 12 */
        return this.type;
    }

    public Integer getPageNum() {
        /* 14 */
        return this.pageNum;
    }

    public Integer getPageSize() {
        /* 16 */
        return this.pageSize;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/code/ReqCodeListDto.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */