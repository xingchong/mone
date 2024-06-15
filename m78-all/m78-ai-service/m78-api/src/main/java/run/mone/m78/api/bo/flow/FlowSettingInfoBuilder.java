  package run.mone.m78.api.bo.flow;
  
  import java.util.List;
  
  
  
  
  public class FlowSettingInfoBuilder
  {
    private Integer id;
    private Integer flowBaseId;
    private List<NodeInfo> nodes;
    private List<Edge> edges;
    
    public FlowSettingInfoBuilder id(Integer id) {
/* 16 */     this.id = id; return this; } public FlowSettingInfoBuilder flowBaseId(Integer flowBaseId) { this.flowBaseId = flowBaseId; return this; } public FlowSettingInfoBuilder nodes(List<NodeInfo> nodes) { this.nodes = nodes; return this; } public FlowSettingInfoBuilder edges(List<Edge> edges) { this.edges = edges; return this; } public FlowSettingInfo build() { return new FlowSettingInfo(this.id, this.flowBaseId, this.nodes, this.edges); } public String toString() { return "FlowSettingInfo.FlowSettingInfoBuilder(id=" + this.id + ", flowBaseId=" + this.flowBaseId + ", nodes=" + this.nodes + ", edges=" + this.edges + ")"; }
  
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/flow/FlowSettingInfo$FlowSettingInfoBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */