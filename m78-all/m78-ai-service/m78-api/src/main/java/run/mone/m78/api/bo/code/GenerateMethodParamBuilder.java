  package run.mone.m78.api.bo.code;





  public class GenerateMethodParamBuilder
  {
    private String uuid;
    private String languageType;
    private String comment;
    private String user;

    public GenerateMethodParamBuilder uuid(String uuid) {
/* 15 */     this.uuid = uuid; return this; } public GenerateMethodParamBuilder languageType(String languageType) { this.languageType = languageType; return this; } public GenerateMethodParamBuilder comment(String comment) { this.comment = comment; return this; } public GenerateMethodParamBuilder user(String user) { this.user = user; return this; } public GenerateMethodParam build() { return new GenerateMethodParam(this.uuid, this.languageType, this.comment, this.user); } public String toString() { return "GenerateMethodParam.GenerateMethodParamBuilder(uuid=" + this.uuid + ", languageType=" + this.languageType + ", comment=" + this.comment + ", user=" + this.user + ")"; }

  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/code/GenerateMethodParam$GenerateMethodParamBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */