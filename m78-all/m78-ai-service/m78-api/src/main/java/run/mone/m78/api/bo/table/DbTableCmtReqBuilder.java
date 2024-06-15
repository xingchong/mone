  package run.mone.m78.api.bo.table;

  import javax.annotation.Nonnull;






  public class DbTableCmtReqBuilder
  {
    private Long workspaceId;
    private String comment;
    private String tableName;
    private String model;

    public DbTableCmtReqBuilder workspaceId(@Nonnull Long workspaceId) {
/* 18 */     if (workspaceId == null) throw new NullPointerException("workspaceId is marked non-null but is null");  this.workspaceId = workspaceId; return this; } public DbTableCmtReqBuilder comment(@Nonnull String comment) { if (comment == null) throw new NullPointerException("comment is marked non-null but is null");  this.comment = comment; return this; } public DbTableCmtReqBuilder tableName(@Nonnull String tableName) { if (tableName == null) throw new NullPointerException("tableName is marked non-null but is null");  this.tableName = tableName; return this; } public DbTableCmtReqBuilder model(String model) { this.model = model; return this; } public DbTableCmtReq build() { return new DbTableCmtReq(this.workspaceId, this.comment, this.tableName, this.model); } public String toString() { return "DbTableCmtReq.DbTableCmtReqBuilder(workspaceId=" + this.workspaceId + ", comment=" + this.comment + ", tableName=" + this.tableName + ", model=" + this.model + ")"; }

  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/table/DbTableCmtReq$DbTableCmtReqBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */