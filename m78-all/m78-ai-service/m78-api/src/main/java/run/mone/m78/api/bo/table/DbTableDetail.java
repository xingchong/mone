  package run.mone.m78.api.bo.table;

  import run.mone.m78.api.bo.datasource.ConnectionInfoDTO;


  public class DbTableDetail
  {
    private ConnectionInfoDTO connectionInfo;
    private String tableName;

    public DbTableDetail() {}

    public DbTableDetail(ConnectionInfoDTO connectionInfo, String tableName) {
/* 14 */     this.connectionInfo = connectionInfo; this.tableName = tableName;
/* 15 */   } public void setConnectionInfo(ConnectionInfoDTO connectionInfo) { this.connectionInfo = connectionInfo; } public void setTableName(String tableName) { this.tableName = tableName; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof DbTableDetail)) return false;  DbTableDetail other = (DbTableDetail)o; if (!other.canEqual(this)) return false;  Object this$connectionInfo = getConnectionInfo(), other$connectionInfo = other.getConnectionInfo(); if ((this$connectionInfo == null) ? (other$connectionInfo != null) : !this$connectionInfo.equals(other$connectionInfo)) return false;  Object this$tableName = getTableName(), other$tableName = other.getTableName(); return !((this$tableName == null) ? (other$tableName != null) : !this$tableName.equals(other$tableName)); } protected boolean canEqual(Object other) { return other instanceof DbTableDetail; } public int hashCode() {  int  result = 1; Object $connectionInfo = getConnectionInfo(); result = result * 59 + (($connectionInfo == null) ? 43 : $connectionInfo.hashCode()); Object $tableName = getTableName(); return result * 59 + (($tableName == null) ? 43 : $tableName.hashCode()); } public String toString() { return "DbTableDetail(connectionInfo=" + getConnectionInfo() + ", tableName=" + getTableName() + ")"; }
/* 16 */   public static DbTableDetailBuilder builder() { return new DbTableDetailBuilder(); } public static class DbTableDetailBuilder { private ConnectionInfoDTO connectionInfo; public DbTableDetailBuilder connectionInfo(ConnectionInfoDTO connectionInfo) { this.connectionInfo = connectionInfo; return this; } private String tableName; public DbTableDetailBuilder tableName(String tableName) { this.tableName = tableName; return this; } public DbTableDetail build() { return new DbTableDetail(this.connectionInfo, this.tableName); } public String toString() { return "DbTableDetail.DbTableDetailBuilder(connectionInfo=" + this.connectionInfo + ", tableName=" + this.tableName + ")"; }
       }
    public ConnectionInfoDTO getConnectionInfo() {
/* 19 */     return this.connectionInfo;
    } public String getTableName() {
/* 21 */     return this.tableName;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/table/DbTableDetail.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */