package run.mone.ai.z.dto;

import com.xiaomi.mone.http.docs.annotations.HttpApiDocClassDefine;
import run.mone.ai.z.data.SourceSyncOPT;

import java.io.Serializable;

public class ZDatasourceInfo implements Serializable {
    @HttpApiDocClassDefine(value = "id", required = false, description = "id，创建时不传", defaultValue = "")
    private Long id;
    @HttpApiDocClassDefine(value = "addr", required = true, description = "地址(git等)", defaultValue = "")
    private String addr;
    @HttpApiDocClassDefine(value = "type", required = true, description = "类型（types/list枚举)", defaultValue = "")
    private Integer type;

    /*  9 */
    public void setId(Long id) {
        this.id = id;
    }

    @HttpApiDocClassDefine(value = "mode", required = false, description = "模式（modes枚举）", defaultValue = "")
    private int mode;
    @HttpApiDocClassDefine(value = "path", required = false, description = "路径", defaultValue = "")
    private String path;
    @HttpApiDocClassDefine(value = "sync", required = true, description = "同步配置", defaultValue = "")
    private SourceSyncOPT sync;

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setMode(int mode) {
        this.mode = mode;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setSync(SourceSyncOPT sync) {
        this.sync = sync;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ZDatasourceInfo)) return false;
        ZDatasourceInfo other = (ZDatasourceInfo) o;
        if (!other.canEqual(this)) return false;
        if (getMode() != other.getMode()) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$type = getType(), other$type = other.getType();
        if ((this$type == null) ? (other$type != null) : !this$type.equals(other$type)) return false;
        Object this$addr = getAddr(), other$addr = other.getAddr();
        if ((this$addr == null) ? (other$addr != null) : !this$addr.equals(other$addr)) return false;
        Object this$path = getPath(), other$path = other.getPath();
        if ((this$path == null) ? (other$path != null) : !this$path.equals(other$path)) return false;
        Object this$sync = getSync(), other$sync = other.getSync();
        return !((this$sync == null) ? (other$sync != null) : !this$sync.equals(other$sync));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ZDatasourceInfo;
    }

    public int hashCode() {
                 int result = 1;
        result = result * 59 + getMode();
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $type = getType();
        result = result * 59 + (($type == null) ? 43 : $type.hashCode());
        Object $addr = getAddr();
        result = result * 59 + (($addr == null) ? 43 : $addr.hashCode());
        Object $path = getPath();
        result = result * 59 + (($path == null) ? 43 : $path.hashCode());
        Object $sync = getSync();
        return result * 59 + (($sync == null) ? 43 : $sync.hashCode());
    }

    public String toString() {
        return "ZDatasourceInfo(id=" + getId() + ", addr=" + getAddr() + ", type=" + getType() + ", mode=" + getMode() + ", path=" + getPath() + ", sync=" + getSync() + ")";
    }

    public Long getId() {
        /* 12 */
        return this.id;
    }

    public String getAddr() {
        /* 14 */
        return this.addr;
    }

    public Integer getType() {
        /* 16 */
        return this.type;
    }

    public int getMode() {
        /* 18 */
        return this.mode;
    }

    public String getPath() {
        /* 20 */
        return this.path;
    }

    public SourceSyncOPT getSync() {
        /* 22 */
        return this.sync;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/ZDatasourceInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */