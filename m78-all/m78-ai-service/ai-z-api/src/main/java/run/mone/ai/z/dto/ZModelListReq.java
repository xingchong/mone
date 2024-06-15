package run.mone.ai.z.dto;


import java.io.Serializable;

public class ZModelListReq extends ZPageReq implements Serializable {
    private String name;
    private String cname;

    /*  8 */
    public void setName(String name) {
        this.name = name;
    }

    private String ownership;
    private Long type;

    public void setCname(String cname) {
        this.cname = cname;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ZModelListReq)) return false;
        ZModelListReq other = (ZModelListReq) o;
        if (!other.canEqual(this)) return false;
        Object this$type = getType(), other$type = other.getType();
        if ((this$type == null) ? (other$type != null) : !this$type.equals(other$type)) return false;
        Object this$name = getName(), other$name = other.getName();
        if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;
        Object this$cname = getCname(), other$cname = other.getCname();
        if ((this$cname == null) ? (other$cname != null) : !this$cname.equals(other$cname)) return false;
        Object this$ownership = getOwnership(), other$ownership = other.getOwnership();
        return !((this$ownership == null) ? (other$ownership != null) : !this$ownership.equals(other$ownership));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ZModelListReq;
    }

    public int hashCode() {
                 int result = 1;
        Object $type = getType();
        result = result * 59 + (($type == null) ? 43 : $type.hashCode());
        Object $name = getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        Object $cname = getCname();
        result = result * 59 + (($cname == null) ? 43 : $cname.hashCode());
        Object $ownership = getOwnership();
        return result * 59 + (($ownership == null) ? 43 : $ownership.hashCode());
    }

    public String toString() {
        return "ZModelListReq(name=" + getName() + ", cname=" + getCname() + ", ownership=" + getOwnership() + ", type=" + getType() + ")";
    }

    public String getName() {
        /* 10 */
        return this.name;
    }

    public String getCname() {
        /* 12 */
        return this.cname;
    }

    public String getOwnership() {
        /* 14 */
        return this.ownership;
    }

    public Long getType() {
        /* 16 */
        return this.type;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/ZModelListReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */