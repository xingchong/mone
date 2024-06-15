  package run.mone.m78.api.bo.table;

  import run.mone.m78.api.bo.datasource.ConnectionInfoDTO;






  public class DbTableDetailBuilder
  {
    private ConnectionInfoDTO connectionInfo;
    private String tableName;

    public DbTableDetailBuilder connectionInfo(ConnectionInfoDTO connectionInfo) {
/* 16 */     this.connectionInfo = connectionInfo; return this; } public DbTableDetailBuilder tableName(String tableName) { this.tableName = tableName; return this; } public DbTableDetail build() { return new DbTableDetail(this.connectionInfo, this.tableName); } public String toString() { return "DbTableDetail.DbTableDetailBuilder(connectionInfo=" + this.connectionInfo + ", tableName=" + this.tableName + ")"; }

  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/table/DbTableDetail$DbTableDetailBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */