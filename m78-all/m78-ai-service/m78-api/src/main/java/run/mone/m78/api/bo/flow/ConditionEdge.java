package run.mone.m78.api.bo.flow;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class ConditionEdge
        implements Serializable {
    private Map<Integer, List<Integer>> ifEdgeMap;
    private Map<Integer, List<Integer>> elseEdgeMap;

    public void setIfEdgeMap(Map<Integer, List<Integer>> ifEdgeMap) {
        /* 13 */
        this.ifEdgeMap = ifEdgeMap;
    }

    public void setElseEdgeMap(Map<Integer, List<Integer>> elseEdgeMap) {
        this.elseEdgeMap = elseEdgeMap;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ConditionEdge)) return false;
        ConditionEdge other = (ConditionEdge) o;
        if (!other.canEqual(this)) return false;
        Object this$ifEdgeMap = (Object) getIfEdgeMap(), other$ifEdgeMap = (Object) other.getIfEdgeMap();
        if ((this$ifEdgeMap == null) ? (other$ifEdgeMap != null) : !this$ifEdgeMap.equals(other$ifEdgeMap))
            return false;
        Object this$elseEdgeMap = (Object) getElseEdgeMap(), other$elseEdgeMap = (Object) other.getElseEdgeMap();
        return !((this$elseEdgeMap == null) ? (other$elseEdgeMap != null) : !this$elseEdgeMap.equals(other$elseEdgeMap));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ConditionEdge;
    }

    public int hashCode() {
        int result = 1;
        Object $ifEdgeMap = (Object) getIfEdgeMap();
        result = result * 59 + (($ifEdgeMap == null) ? 43 : $ifEdgeMap.hashCode());
        Object $elseEdgeMap = (Object) getElseEdgeMap();
        return result * 59 + (($elseEdgeMap == null) ? 43 : $elseEdgeMap.hashCode());
    }

    public String toString() {
        return "ConditionEdge(ifEdgeMap=" + getIfEdgeMap() + ", elseEdgeMap=" + getElseEdgeMap() + ")";
    }


    public Map<Integer, List<Integer>> getIfEdgeMap() {
        /* 17 */
        return this.ifEdgeMap;
    }

    public Map<Integer, List<Integer>> getElseEdgeMap() {
        /* 19 */
        return this.elseEdgeMap;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/flow/ConditionEdge.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */