package run.mone.ai.z.dto;

import com.xiaomi.mone.http.docs.annotations.HttpApiDocClassDefine;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ZModelDTO implements Serializable {
    private Long id;
    @HttpApiDocClassDefine(value = "name", required = true, description = "名称", defaultValue = "")
    private String name;
    @HttpApiDocClassDefine(value = "cname", required = true, description = "别名", defaultValue = "")
    private String cname;
    private String version;
    @HttpApiDocClassDefine(value = "addr", required = true, description = "地址", defaultValue = "")
    private String addr;

    /* 10 */
    public void setId(Long id) {
        this.id = id;
    }

    private Integer maxToken;
    @HttpApiDocClassDefine(value = "type", required = true, description = "类型", defaultValue = "")
    private Long type;
    @HttpApiDocClassDefine(value = "ownership", required = true, description = "归属", defaultValue = "")
    private List<String> ownership;
    private String token;
    private Map<String, String> info;
    private byte[] data;

    public void setName(String name) {
        this.name = name;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void setMaxToken(Integer maxToken) {
        this.maxToken = maxToken;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public void setOwnership(List<String> ownership) {
        this.ownership = ownership;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setInfo(Map<String, String> info) {
        this.info = info;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ZModelDTO)) return false;
        ZModelDTO other = (ZModelDTO) o;
        if (!other.canEqual(this)) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$maxToken = getMaxToken(), other$maxToken = other.getMaxToken();
        if ((this$maxToken == null) ? (other$maxToken != null) : !this$maxToken.equals(other$maxToken)) return false;
        Object this$type = getType(), other$type = other.getType();
        if ((this$type == null) ? (other$type != null) : !this$type.equals(other$type)) return false;
        Object this$name = getName(), other$name = other.getName();
        if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;
        Object this$cname = getCname(), other$cname = other.getCname();
        if ((this$cname == null) ? (other$cname != null) : !this$cname.equals(other$cname)) return false;
        Object this$version = getVersion(), other$version = other.getVersion();
        if ((this$version == null) ? (other$version != null) : !this$version.equals(other$version)) return false;
        Object this$addr = getAddr(), other$addr = other.getAddr();
        if ((this$addr == null) ? (other$addr != null) : !this$addr.equals(other$addr)) return false;
        Object this$ownership = (Object) getOwnership(), other$ownership = (Object) other.getOwnership();
        if ((this$ownership == null) ? (other$ownership != null) : !this$ownership.equals(other$ownership))
            return false;
        Object this$token = getToken(), other$token = other.getToken();
        if ((this$token == null) ? (other$token != null) : !this$token.equals(other$token)) return false;
        Object this$info = (Object) getInfo(), other$info = (Object) other.getInfo();
        return ((this$info == null) ? (other$info != null) : !this$info.equals(other$info)) ? false : (!!Arrays.equals(getData(), other.getData()));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ZModelDTO;
    }

    public int hashCode() {
                 int result = 1;
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $maxToken = getMaxToken();
        result = result * 59 + (($maxToken == null) ? 43 : $maxToken.hashCode());
        Object $type = getType();
        result = result * 59 + (($type == null) ? 43 : $type.hashCode());
        Object $name = getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        Object $cname = getCname();
        result = result * 59 + (($cname == null) ? 43 : $cname.hashCode());
        Object $version = getVersion();
        result = result * 59 + (($version == null) ? 43 : $version.hashCode());
        Object $addr = getAddr();
        result = result * 59 + (($addr == null) ? 43 : $addr.hashCode());
        Object $ownership = (Object) getOwnership();
        result = result * 59 + (($ownership == null) ? 43 : $ownership.hashCode());
        Object $token = getToken();
        result = result * 59 + (($token == null) ? 43 : $token.hashCode());
        Object $info = (Object) getInfo();
        result = result * 59 + (($info == null) ? 43 : $info.hashCode());
        return result * 59 + Arrays.hashCode(getData());
    }

    public String toString() {
        return "ZModelDTO(id=" + getId() + ", name=" + getName() + ", cname=" + getCname() + ", version=" + getVersion() + ", addr=" + getAddr() + ", maxToken=" + getMaxToken() + ", type=" + getType() + ", ownership=" + getOwnership() + ", token=" + getToken() + ", info=" + getInfo() + ", data=" + Arrays.toString(getData()) + ")";
    }

    public Long getId() {
        /* 13 */
        return this.id;
    }

    public String getName() {
        /* 15 */
        return this.name;
    }

    public String getCname() {
        /* 17 */
        return this.cname;
    }

    public String getVersion() {
        /* 19 */
        return this.version;
    }

    public String getAddr() {
        /* 21 */
        return this.addr;
    }

    public Integer getMaxToken() {
        /* 23 */
        return this.maxToken;
    }

    public Long getType() {
        /* 25 */
        return this.type;
    }

    public List<String> getOwnership() {
        /* 27 */
        return this.ownership;
    }

    public String getToken() {
        /* 29 */
        return this.token;
    }

    public Map<String, String> getInfo() {
        /* 31 */
        return this.info;
    }

    public byte[] getData() {
        /* 33 */
        return this.data;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/ZModelDTO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */