  package run.mone.ai.z.dto.code;
  
  public class AthenaClassInfo
  {
    private String name;
    private String classCode;
    private String md5;
    
    public void setName(String name) {
/* 10 */     this.name = name; } public void setClassCode(String classCode) { this.classCode = classCode; } public void setMd5(String md5) { this.md5 = md5; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof AthenaClassInfo)) return false;  AthenaClassInfo other = (AthenaClassInfo)o; if (!other.canEqual(this)) return false;  Object this$name = getName(), other$name = other.getName(); if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;  Object this$classCode = getClassCode(), other$classCode = other.getClassCode(); if ((this$classCode == null) ? (other$classCode != null) : !this$classCode.equals(other$classCode)) return false;  Object this$md5 = getMd5(), other$md5 = other.getMd5(); return !((this$md5 == null) ? (other$md5 != null) : !this$md5.equals(other$md5)); } protected boolean canEqual(Object other) { return other instanceof AthenaClassInfo; } public int hashCode() {  int  result = 1; Object $name = getName(); result = result * 59 + (($name == null) ? 43 : $name.hashCode()); Object $classCode = getClassCode(); result = result * 59 + (($classCode == null) ? 43 : $classCode.hashCode()); Object $md5 = getMd5(); return result * 59 + (($md5 == null) ? 43 : $md5.hashCode()); } public String toString() { return "AthenaClassInfo(name=" + getName() + ", classCode=" + getClassCode() + ", md5=" + getMd5() + ")"; }
/* 11 */   AthenaClassInfo(String name, String classCode, String md5) { this.name = name; this.classCode = classCode; this.md5 = md5; } public static AthenaClassInfoBuilder builder() { return new AthenaClassInfoBuilder(); } public static class AthenaClassInfoBuilder { private String name; public AthenaClassInfoBuilder name(String name) { this.name = name; return this; } private String classCode; private String md5; public AthenaClassInfoBuilder classCode(String classCode) { this.classCode = classCode; return this; } public AthenaClassInfoBuilder md5(String md5) { this.md5 = md5; return this; } public AthenaClassInfo build() { return new AthenaClassInfo(this.name, this.classCode, this.md5); } public String toString() { return "AthenaClassInfo.AthenaClassInfoBuilder(name=" + this.name + ", classCode=" + this.classCode + ", md5=" + this.md5 + ")"; }
       }
    public String getName() {
/* 14 */     return this.name;
    } public String getClassCode() {
/* 16 */     return this.classCode;
    } public String getMd5() {
/* 18 */     return this.md5;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/code/AthenaClassInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */