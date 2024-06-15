  package run.mone.ai.z.dto.code;


  public class AthenaClassInfoBuilder
  {
    private String name;
    private String classCode;
    private String md5;

    public AthenaClassInfoBuilder name(String name) {
/* 11 */     this.name = name; return this; } public AthenaClassInfoBuilder classCode(String classCode) { this.classCode = classCode; return this; } public AthenaClassInfoBuilder md5(String md5) { this.md5 = md5; return this; } public AthenaClassInfo build() { return new AthenaClassInfo(this.name, this.classCode, this.md5); } public String toString() { return "AthenaClassInfo.AthenaClassInfoBuilder(name=" + this.name + ", classCode=" + this.classCode + ", md5=" + this.md5 + ")"; }

  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/code/AthenaClassInfo$AthenaClassInfoBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */