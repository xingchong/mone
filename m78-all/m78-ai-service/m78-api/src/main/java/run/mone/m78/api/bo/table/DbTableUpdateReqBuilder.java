  package run.mone.m78.api.bo.table;

  import java.util.List;







  public class DbTableUpdateReqBuilder
  {
    private List<M78ColumnInfo> columnInfoList;
    private String tableName;
    private Long botId;
    private Long workspaceId;
    private String demo;
    private String tableDesc;

    public DbTableUpdateReqBuilder columnInfoList(List<M78ColumnInfo> columnInfoList) {
/* 21 */     this.columnInfoList = columnInfoList; return this; } public DbTableUpdateReqBuilder tableName(String tableName) { this.tableName = tableName; return this; } public DbTableUpdateReqBuilder botId(Long botId) { this.botId = botId; return this; } public DbTableUpdateReqBuilder workspaceId(Long workspaceId) { this.workspaceId = workspaceId; return this; } public DbTableUpdateReqBuilder demo(String demo) { this.demo = demo; return this; } public DbTableUpdateReqBuilder tableDesc(String tableDesc) { this.tableDesc = tableDesc; return this; } public DbTableUpdateReq build() { return new DbTableUpdateReq(this.columnInfoList, this.tableName, this.botId, this.workspaceId, this.demo, this.tableDesc); } public String toString() { return "DbTableUpdateReq.DbTableUpdateReqBuilder(columnInfoList=" + this.columnInfoList + ", tableName=" + this.tableName + ", botId=" + this.botId + ", workspaceId=" + this.workspaceId + ", demo=" + this.demo + ", tableDesc=" + this.tableDesc + ")"; }

  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/table/DbTableUpdateReq$DbTableUpdateReqBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */