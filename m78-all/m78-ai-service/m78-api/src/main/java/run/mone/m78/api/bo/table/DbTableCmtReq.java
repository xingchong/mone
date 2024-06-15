  package run.mone.m78.api.bo.table;


  import javax.annotation.Nonnull;
  import java.io.Serializable;

  public class DbTableCmtReq implements Serializable {
    private static final long serialVersionUID = -1829537606644445021L;
    @Nonnull
    private Long workspaceId;
    @Nonnull
    private String comment;
    @Nonnull
    private String tableName;
    private String model;
    
    public DbTableCmtReq() {}
    
/* 16 */   public DbTableCmtReq(@Nonnull Long workspaceId, @Nonnull String comment, @Nonnull String tableName, String model) { if (workspaceId == null) throw new NullPointerException("workspaceId is marked non-null but is null");  if (comment == null) throw new NullPointerException("comment is marked non-null but is null");  if (tableName == null) throw new NullPointerException("tableName is marked non-null but is null");  this.workspaceId = workspaceId; this.comment = comment; this.tableName = tableName; this.model = model; }
/* 17 */   public void setWorkspaceId(@Nonnull Long workspaceId) { if (workspaceId == null) throw new NullPointerException("workspaceId is marked non-null but is null");  this.workspaceId = workspaceId; } public void setComment(@Nonnull String comment) { if (comment == null) throw new NullPointerException("comment is marked non-null but is null");  this.comment = comment; } public void setTableName(@Nonnull String tableName) { if (tableName == null) throw new NullPointerException("tableName is marked non-null but is null");  this.tableName = tableName; } public void setModel(String model) { this.model = model; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof DbTableCmtReq)) return false;  DbTableCmtReq other = (DbTableCmtReq)o; if (!other.canEqual(this)) return false;  Object this$workspaceId = getWorkspaceId(), other$workspaceId = other.getWorkspaceId(); if ((this$workspaceId == null) ? (other$workspaceId != null) : !this$workspaceId.equals(other$workspaceId)) return false;  Object this$comment = getComment(), other$comment = other.getComment(); if ((this$comment == null) ? (other$comment != null) : !this$comment.equals(other$comment)) return false;  Object this$tableName = getTableName(), other$tableName = other.getTableName(); if ((this$tableName == null) ? (other$tableName != null) : !this$tableName.equals(other$tableName)) return false;  Object this$model = getModel(), other$model = other.getModel(); return !((this$model == null) ? (other$model != null) : !this$model.equals(other$model)); } protected boolean canEqual(Object other) { return other instanceof DbTableCmtReq; } public int hashCode() {  int  result = 1; Object $workspaceId = getWorkspaceId(); result = result * 59 + (($workspaceId == null) ? 43 : $workspaceId.hashCode()); Object $comment = getComment(); result = result * 59 + (($comment == null) ? 43 : $comment.hashCode()); Object $tableName = getTableName(); result = result * 59 + (($tableName == null) ? 43 : $tableName.hashCode()); Object $model = getModel(); return result * 59 + (($model == null) ? 43 : $model.hashCode()); } public String toString() { return "DbTableCmtReq(workspaceId=" + getWorkspaceId() + ", comment=" + getComment() + ", tableName=" + getTableName() + ", model=" + getModel() + ")"; }
/* 18 */   public static DbTableCmtReqBuilder builder() { return new DbTableCmtReqBuilder(); } public static class DbTableCmtReqBuilder { private Long workspaceId; private String comment; public DbTableCmtReqBuilder workspaceId(@Nonnull Long workspaceId) { if (workspaceId == null) throw new NullPointerException("workspaceId is marked non-null but is null");  this.workspaceId = workspaceId; return this; } private String tableName; private String model; public DbTableCmtReqBuilder comment(@Nonnull String comment) { if (comment == null) throw new NullPointerException("comment is marked non-null but is null");  this.comment = comment; return this; } public DbTableCmtReqBuilder tableName(@Nonnull String tableName) { if (tableName == null) throw new NullPointerException("tableName is marked non-null but is null");  this.tableName = tableName; return this; } public DbTableCmtReqBuilder model(String model) { this.model = model; return this; } public DbTableCmtReq build() { return new DbTableCmtReq(this.workspaceId, this.comment, this.tableName, this.model); } public String toString() { return "DbTableCmtReq.DbTableCmtReqBuilder(workspaceId=" + this.workspaceId + ", comment=" + this.comment + ", tableName=" + this.tableName + ", model=" + this.model + ")"; }
       }
  
    
    @Nonnull
    public Long getWorkspaceId() {
/* 24 */     return this.workspaceId;
    } @Nonnull
    public String getComment() {
/* 27 */     return this.comment;
    } @Nonnull
    public String getTableName() {
/* 30 */     return this.tableName;
    } public String getModel() {
/* 32 */     return this.model;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/table/DbTableCmtReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */