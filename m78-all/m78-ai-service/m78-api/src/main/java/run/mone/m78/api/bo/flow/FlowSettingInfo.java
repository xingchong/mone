package run.mone.m78.api.bo.flow;

import java.io.Serializable;
import java.util.List;

public class FlowSettingInfo
        implements Serializable {
    private Integer id;
    private Integer flowBaseId;
    private List<NodeInfo> nodes;
    private List<Edge> edges;

    public void setId(Integer id) {
        /* 15 */
        this.id = id;
    }

    public void setFlowBaseId(Integer flowBaseId) {
        this.flowBaseId = flowBaseId;
    }

    public void setNodes(List<NodeInfo> nodes) {
        this.nodes = nodes;
    }

    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof FlowSettingInfo)) return false;
        FlowSettingInfo other = (FlowSettingInfo) o;
        if (!other.canEqual(this)) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$flowBaseId = getFlowBaseId(), other$flowBaseId = other.getFlowBaseId();
        if ((this$flowBaseId == null) ? (other$flowBaseId != null) : !this$flowBaseId.equals(other$flowBaseId))
            return false;
        Object this$nodes = (Object) getNodes(), other$nodes = (Object) other.getNodes();
        if ((this$nodes == null) ? (other$nodes != null) : !this$nodes.equals(other$nodes)) return false;
        Object this$edges = (Object) getEdges(), other$edges = (Object) other.getEdges();
        return !((this$edges == null) ? (other$edges != null) : !this$edges.equals(other$edges));
    }

    protected boolean canEqual(Object other) {
        return other instanceof FlowSettingInfo;
    }

    public int hashCode() {
        int result = 1;
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $flowBaseId = getFlowBaseId();
        result = result * 59 + (($flowBaseId == null) ? 43 : $flowBaseId.hashCode());
        Object $nodes = (Object) getNodes();
        result = result * 59 + (($nodes == null) ? 43 : $nodes.hashCode());
        Object $edges = (Object) getEdges();
        return result * 59 + (($edges == null) ? 43 : $edges.hashCode());
    }

    public String toString() {
        return "FlowSettingInfo(id=" + getId() + ", flowBaseId=" + getFlowBaseId() + ", nodes=" + getNodes() + ", edges=" + getEdges() + ")";
    }

    /* 16 */
    public static FlowSettingInfoBuilder builder() {
        return new FlowSettingInfoBuilder();
    }

    public static class FlowSettingInfoBuilder {
        private Integer id;
        private Integer flowBaseId;

        public FlowSettingInfoBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        private List<NodeInfo> nodes;
        private List<Edge> edges;

        public FlowSettingInfoBuilder flowBaseId(Integer flowBaseId) {
            this.flowBaseId = flowBaseId;
            return this;
        }

        public FlowSettingInfoBuilder nodes(List<NodeInfo> nodes) {
            this.nodes = nodes;
            return this;
        }

        public FlowSettingInfoBuilder edges(List<Edge> edges) {
            this.edges = edges;
            return this;
        }

        public FlowSettingInfo build() {
            return new FlowSettingInfo(this.id, this.flowBaseId, this.nodes, this.edges);
        }

        public String toString() {
            return "FlowSettingInfo.FlowSettingInfoBuilder(id=" + this.id + ", flowBaseId=" + this.flowBaseId + ", nodes=" + this.nodes + ", edges=" + this.edges + ")";
        }
    }

    public FlowSettingInfo(Integer id, Integer flowBaseId, List<NodeInfo> nodes, List<Edge> edges) {
        /* 17 */
        this.id = id;
        this.flowBaseId = flowBaseId;
        this.nodes = nodes;
        this.edges = edges;
    }

    public FlowSettingInfo() {
    }

    public Integer getId() {
        /* 21 */
        return this.id;
    }

    public Integer getFlowBaseId() {
        /* 23 */
        return this.flowBaseId;
    }

    public List<NodeInfo> getNodes() {
        /* 25 */
        return this.nodes;
    }

    public List<Edge> getEdges() {
        /* 27 */
        return this.edges;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/flow/FlowSettingInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */