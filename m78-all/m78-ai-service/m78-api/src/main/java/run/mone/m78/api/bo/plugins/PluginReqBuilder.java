  package run.mone.m78.api.bo.plugins;

  public class PluginReqBuilder {
    private Long id;
    private Long orgId;
    private Long workspaceId;
    private String name;
    private String categoryName;
    private Long categoryId;
    private String userName;
    private Integer type;
    private String scale;
    private String order;
    private Integer pageSize;
    private Integer pageNum;
    private Integer status;

/* 18 */   public PluginReqBuilder id(Long id) { this.id = id; return this; } public PluginReqBuilder orgId(Long orgId) { this.orgId = orgId; return this; } public PluginReqBuilder workspaceId(Long workspaceId) { this.workspaceId = workspaceId; return this; } public PluginReqBuilder name(String name) { this.name = name; return this; } public PluginReqBuilder categoryName(String categoryName) { this.categoryName = categoryName; return this; } public PluginReqBuilder categoryId(Long categoryId) { this.categoryId = categoryId; return this; } public PluginReqBuilder userName(String userName) { this.userName = userName; return this; } public PluginReqBuilder type(Integer type) { this.type = type; return this; } public PluginReqBuilder scale(String scale) { this.scale = scale; return this; } public PluginReqBuilder order(String order) { this.order = order; return this; } public PluginReqBuilder pageSize(Integer pageSize) { this.pageSize = pageSize; return this; } public PluginReqBuilder pageNum(Integer pageNum) { this.pageNum = pageNum; return this; } public PluginReqBuilder status(Integer status) { this.status = status; return this; } public PluginReq build() { return new PluginReq(this.id, this.orgId, this.workspaceId, this.name, this.categoryName, this.categoryId, this.userName, this.type, this.scale, this.order, this.pageSize, this.pageNum, this.status); } public String toString() { return "PluginReq.PluginReqBuilder(id=" + this.id + ", orgId=" + this.orgId + ", workspaceId=" + this.workspaceId + ", name=" + this.name + ", categoryName=" + this.categoryName + ", categoryId=" + this.categoryId + ", userName=" + this.userName + ", type=" + this.type + ", scale=" + this.scale + ", order=" + this.order + ", pageSize=" + this.pageSize + ", pageNum=" + this.pageNum + ", status=" + this.status + ")"; }

  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/plugins/PluginReq$PluginReqBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */