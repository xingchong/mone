  package run.mone.ai.z.dto.feishu;


  public class FeishuUserBaseInfo
  {
    private String name;

    public String toString() {
/*  9 */     return "FeishuUserBaseInfo(name=" + getName() + ")"; } public int hashCode() {  int  result = 1; Object $name = getName(); return result * 59 + (($name == null) ? 43 : $name.hashCode()); } protected boolean canEqual(Object other) { return other instanceof FeishuUserBaseInfo; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof FeishuUserBaseInfo)) return false;  FeishuUserBaseInfo other = (FeishuUserBaseInfo)o; if (!other.canEqual(this)) return false;  Object this$name = getName(), other$name = other.getName(); return !((this$name == null) ? (other$name != null) : !this$name.equals(other$name)); } public void setName(String name) { this.name = name; }
     public String getName() {
/* 11 */     return this.name;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/feishu/FeishuUserBaseInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */