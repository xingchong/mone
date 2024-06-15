  package run.mone.m78.api.bo.table;
  
  import java.util.List;
  
  
  
  public class DbTableReqBuilder
  {
    private String tableDesc;
    private String model;
    private Long botId;
    private Long workspaceId;
    private List<M78ColumnInfo> columnInfoList;
    private String ddl;
    private String tableName;
    private Long id;
    
    public DbTableReqBuilder tableDesc(String tableDesc) {
/* 19 */     this.tableDesc = tableDesc; return this; } public DbTableReqBuilder model(String model) { this.model = model; return this; } public DbTableReqBuilder botId(Long botId) { this.botId = botId; return this; } public DbTableReqBuilder workspaceId(Long workspaceId) { this.workspaceId = workspaceId; return this; } public DbTableReqBuilder columnInfoList(List<M78ColumnInfo> columnInfoList) { this.columnInfoList = columnInfoList; return this; } public DbTableReqBuilder ddl(String ddl) { this.ddl = ddl; return this; } public DbTableReqBuilder tableName(String tableName) { this.tableName = tableName; return this; } public DbTableReqBuilder id(Long id) { this.id = id; return this; } public DbTableReq build() { return new DbTableReq(this.tableDesc, this.model, this.botId, this.workspaceId, this.columnInfoList, this.ddl, this.tableName, this.id); } public String toString() { return "DbTableReq.DbTableReqBuilder(tableDesc=" + this.tableDesc + ", model=" + this.model + ", botId=" + this.botId + ", workspaceId=" + this.workspaceId + ", columnInfoList=" + this.columnInfoList + ", ddl=" + this.ddl + ", tableName=" + this.tableName + ", id=" + this.id + ")"; }
  
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/table/DbTableReq$DbTableReqBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */