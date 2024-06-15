  package run.mone.m78.api.bo.feature.router;
  
  import java.util.Map;
  
  public class FeatureRouterReqBuilder {
    private Long id;
    private Long labelId;
    private Long datasourceId;
    private String name;
    private String userName;
    private Map<String, Object> reqData;
    private Integer type;
    private Integer routerType;
    private Integer page;
    private Integer pageSize;
    private String content;
    
    public FeatureRouterReqBuilder id(Long id) {
/* 19 */     this.id = id; return this; } public FeatureRouterReqBuilder labelId(Long labelId) { this.labelId = labelId; return this; } public FeatureRouterReqBuilder datasourceId(Long datasourceId) { this.datasourceId = datasourceId; return this; } public FeatureRouterReqBuilder name(String name) { this.name = name; return this; } public FeatureRouterReqBuilder userName(String userName) { this.userName = userName; return this; } public FeatureRouterReqBuilder reqData(Map<String, Object> reqData) { this.reqData = reqData; return this; } public FeatureRouterReqBuilder type(Integer type) { this.type = type; return this; } public FeatureRouterReqBuilder routerType(Integer routerType) { this.routerType = routerType; return this; } public FeatureRouterReqBuilder page(Integer page) { this.page = page; return this; } public FeatureRouterReqBuilder pageSize(Integer pageSize) { this.pageSize = pageSize; return this; } public FeatureRouterReqBuilder content(String content) { this.content = content; return this; } public FeatureRouterReq build() { return new FeatureRouterReq(this.id, this.labelId, this.datasourceId, this.name, this.userName, this.reqData, this.type, this.routerType, this.page, this.pageSize, this.content); } public String toString() { return "FeatureRouterReq.FeatureRouterReqBuilder(id=" + this.id + ", labelId=" + this.labelId + ", datasourceId=" + this.datasourceId + ", name=" + this.name + ", userName=" + this.userName + ", reqData=" + this.reqData + ", type=" + this.type + ", routerType=" + this.routerType + ", page=" + this.page + ", pageSize=" + this.pageSize + ", content=" + this.content + ")"; }
  
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/feature/router/FeatureRouterReq$FeatureRouterReqBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */