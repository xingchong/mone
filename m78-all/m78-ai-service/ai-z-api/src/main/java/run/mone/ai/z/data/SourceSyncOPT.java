package run.mone.ai.z.data;

import java.io.Serializable;
import com.xiaomi.mone.http.docs.annotations.HttpApiDocClassDefine;

public class SourceSyncOPT implements Serializable {
    @HttpApiDocClassDefine(value = "auto", required = true, description = "是否自动", defaultValue = "")
    private boolean auto;

    /*  8 */
    public void setAuto(boolean auto) {
        this.auto = auto;
    }

    @HttpApiDocClassDefine(value = "one", required = true, description = "单次配置（哪个commit）", defaultValue = "")
    private String one;
    @HttpApiDocClassDefine(value = "sync", required = true, description = "自动配置（哪个分支）", defaultValue = "")
    private String sync;

    public void setOne(String one) {
        this.one = one;
    }

    public void setSync(String sync) {
        this.sync = sync;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof SourceSyncOPT)) return false;
        SourceSyncOPT other = (SourceSyncOPT) o;
        if (!other.canEqual(this)) return false;
        if (isAuto() != other.isAuto()) return false;
        Object this$one = getOne(), other$one = other.getOne();
        if ((this$one == null) ? (other$one != null) : !this$one.equals(other$one)) return false;
        Object this$sync = getSync(), other$sync = other.getSync();
        return !((this$sync == null) ? (other$sync != null) : !this$sync.equals(other$sync));
    }

    protected boolean canEqual(Object other) {
        return other instanceof SourceSyncOPT;
    }

    public int hashCode() {
                 int result = 1;
        result = result * 59 + (isAuto() ? 79 : 97);
        Object $one = getOne();
        result = result * 59 + (($one == null) ? 43 : $one.hashCode());
        Object $sync = getSync();
        return result * 59 + (($sync == null) ? 43 : $sync.hashCode());
    }

    public String toString() {
        return "SourceSyncOPT(auto=" + isAuto() + ", one=" + getOne() + ", sync=" + getSync() + ")";
    }

    public boolean isAuto() {
        /* 11 */
        return this.auto;
    }

    public String getOne() {
        /* 13 */
        return this.one;
    }

    public String getSync() {
        /* 15 */
        return this.sync;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/data/SourceSyncOPT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */