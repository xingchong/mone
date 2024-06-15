  package run.mone.m78.api.bo.plugins;
  public class PluginOrgReqBuilder {
    private Long id;
    private Long workspaceId;
    private String name;
    private String categoryId;
    private String userName;
    private Integer pageSize;
    private Integer pageNum;
    private String scope;
    private String order;
    private boolean orgOnly;
    private Integer status;
    private Integer subStatus;

/* 16 */   public PluginOrgReqBuilder id(Long id) { this.id = id; return this; } public PluginOrgReqBuilder workspaceId(Long workspaceId) { this.workspaceId = workspaceId; return this; } public PluginOrgReqBuilder name(String name) { this.name = name; return this; } public PluginOrgReqBuilder categoryId(String categoryId) { this.categoryId = categoryId; return this; } public PluginOrgReqBuilder userName(String userName) { this.userName = userName; return this; } public PluginOrgReqBuilder pageSize(Integer pageSize) { this.pageSize = pageSize; return this; } public PluginOrgReqBuilder pageNum(Integer pageNum) { this.pageNum = pageNum; return this; } public PluginOrgReqBuilder scope(String scope) { this.scope = scope; return this; } public PluginOrgReqBuilder order(String order) { this.order = order; return this; } public PluginOrgReqBuilder orgOnly(boolean orgOnly) { this.orgOnly = orgOnly; return this; } public PluginOrgReqBuilder status(Integer status) { this.status = status; return this; } public PluginOrgReqBuilder subStatus(Integer subStatus) { this.subStatus = subStatus; return this; } public PluginOrgReq build() { return new PluginOrgReq(this.id, this.workspaceId, this.name, this.categoryId, this.userName, this.pageSize, this.pageNum, this.scope, this.order, this.orgOnly, this.status, this.subStatus); } public String toString() { return "PluginOrgReq.PluginOrgReqBuilder(id=" + this.id + ", workspaceId=" + this.workspaceId + ", name=" + this.name + ", categoryId=" + this.categoryId + ", userName=" + this.userName + ", pageSize=" + this.pageSize + ", pageNum=" + this.pageNum + ", scope=" + this.scope + ", order=" + this.order + ", orgOnly=" + this.orgOnly + ", status=" + this.status + ", subStatus=" + this.subStatus + ")"; }

  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/plugins/PluginOrgReq$PluginOrgReqBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */