  package run.mone.m78.api.bo.table;

  import java.time.LocalDateTime;






  public class DbTableBoBuilder
  {
    private Long id;
    private Long workspaceId;
    private String tableName;
    private String creator;
    private LocalDateTime createTime;

    public DbTableBoBuilder id(Long id) {
/* 19 */     this.id = id; return this; } public DbTableBoBuilder workspaceId(Long workspaceId) { this.workspaceId = workspaceId; return this; } public DbTableBoBuilder tableName(String tableName) { this.tableName = tableName; return this; } public DbTableBoBuilder creator(String creator) { this.creator = creator; return this; } public DbTableBoBuilder createTime(LocalDateTime createTime) { this.createTime = createTime; return this; } public DbTableBo build() { return new DbTableBo(this.id, this.workspaceId, this.tableName, this.creator, this.createTime); } public String toString() { return "DbTableBo.DbTableBoBuilder(id=" + this.id + ", workspaceId=" + this.workspaceId + ", tableName=" + this.tableName + ", creator=" + this.creator + ", createTime=" + this.createTime + ")"; }

  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/table/DbTableBo$DbTableBoBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */