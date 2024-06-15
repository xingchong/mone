  package run.mone.m78.api.bo.flow;

  import java.io.Serializable;

  public class DatabaseSetting
    implements Serializable {
    private static final long serialVersionUID = 2911272348580476282L;
    private String sql;

    public String toString() {
/* 11 */     return "DatabaseSetting(sql=" + getSql() + ")"; } public int hashCode() {  int  result = 1; Object $sql = getSql(); return result * 59 + (($sql == null) ? 43 : $sql.hashCode()); } protected boolean canEqual(Object other) { return other instanceof DatabaseSetting; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof DatabaseSetting)) return false;  DatabaseSetting other = (DatabaseSetting)o; if (!other.canEqual(this)) return false;  Object this$sql = getSql(), other$sql = other.getSql(); return !((this$sql == null) ? (other$sql != null) : !this$sql.equals(other$sql)); } public void setSql(String sql) { this.sql = sql; }



    public String getSql() {
/* 16 */     return this.sql;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/flow/DatabaseSetting.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */