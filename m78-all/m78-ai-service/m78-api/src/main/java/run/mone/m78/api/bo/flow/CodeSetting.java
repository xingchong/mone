  package run.mone.m78.api.bo.flow;
  
  import java.io.Serializable;
  
  public class CodeSetting
    implements Serializable {
    private static final long serialVersionUID = 1102544143508934316L;
    private String code;
    
    public String toString() {
/* 11 */     return "CodeSetting(code=" + getCode() + ")"; } public int hashCode() {  int  result = 1; Object $code = getCode(); return result * 59 + (($code == null) ? 43 : $code.hashCode()); } protected boolean canEqual(Object other) { return other instanceof CodeSetting; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof CodeSetting)) return false;  CodeSetting other = (CodeSetting)o; if (!other.canEqual(this)) return false;  Object this$code = getCode(), other$code = other.getCode(); return !((this$code == null) ? (other$code != null) : !this$code.equals(other$code)); } public void setCode(String code) { this.code = code; }
  
  
    
    public String getCode() {
/* 16 */     return this.code;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/flow/CodeSetting.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */