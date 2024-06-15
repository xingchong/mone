package run.mone.ai.z.dto;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class ZPredict implements Serializable {
    private Float single;

    /*  8 */
    public void setSingle(Float single) {
        this.single = single;
    }

    private float[] list;
    private List<float[]> lists;

    public void setList(float[] list) {
        this.list = list;
    }

    public void setLists(List<float[]> lists) {
        this.lists = lists;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ZPredict)) return false;
        ZPredict other = (ZPredict) o;
        if (!other.canEqual(this)) return false;
        Object this$single = getSingle(), other$single = other.getSingle();
        if ((this$single == null) ? (other$single != null) : !this$single.equals(other$single)) return false;
        if (!Arrays.equals(getList(), other.getList())) return false;
        Object this$lists = (Object) getLists(), other$lists = (Object) other.getLists();
        return !((this$lists == null) ? (other$lists != null) : !this$lists.equals(other$lists));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ZPredict;
    }

    public int hashCode() {
        int result = 1;
        Object $single = getSingle();
        result = result * 59 + (($single == null) ? 43 : $single.hashCode());
        result = result * 59 + Arrays.hashCode(getList());
        Object $lists = (Object) getLists();
        return result * 59 + (($lists == null) ? 43 : $lists.hashCode());
    }

    public String toString() {
        return "ZPredict(single=" + getSingle() + ", list=" + Arrays.toString(getList()) + ", lists=" + getLists() + ")";
    }

    public Float getSingle() {
        /* 10 */
        return this.single;
    }

    public float[] getList() {
        /* 12 */
        return this.list;
    }

    public List<float[]> getLists() {
        /* 14 */
        return this.lists;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/ZPredict.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */