  package run.mone.m78.api.bo.code;


  public class GenerateMethodParam
  {
    private String uuid;
    private String languageType;
    private String comment;
    private String user;

    public void setUuid(String uuid) {
/* 12 */     this.uuid = uuid; } public void setLanguageType(String languageType) { this.languageType = languageType; } public void setComment(String comment) { this.comment = comment; } public void setUser(String user) { this.user = user; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof GenerateMethodParam)) return false;  GenerateMethodParam other = (GenerateMethodParam)o; if (!other.canEqual(this)) return false;  Object this$uuid = getUuid(), other$uuid = other.getUuid(); if ((this$uuid == null) ? (other$uuid != null) : !this$uuid.equals(other$uuid)) return false;  Object this$languageType = getLanguageType(), other$languageType = other.getLanguageType(); if ((this$languageType == null) ? (other$languageType != null) : !this$languageType.equals(other$languageType)) return false;  Object this$comment = getComment(), other$comment = other.getComment(); if ((this$comment == null) ? (other$comment != null) : !this$comment.equals(other$comment)) return false;  Object this$user = getUser(), other$user = other.getUser(); return !((this$user == null) ? (other$user != null) : !this$user.equals(other$user)); } protected boolean canEqual(Object other) { return other instanceof GenerateMethodParam; } public int hashCode() {  int  result = 1; Object $uuid = getUuid(); result = result * 59 + (($uuid == null) ? 43 : $uuid.hashCode()); Object $languageType = getLanguageType(); result = result * 59 + (($languageType == null) ? 43 : $languageType.hashCode()); Object $comment = getComment(); result = result * 59 + (($comment == null) ? 43 : $comment.hashCode()); Object $user = getUser(); return result * 59 + (($user == null) ? 43 : $user.hashCode()); } public String toString() { return "GenerateMethodParam(uuid=" + getUuid() + ", languageType=" + getLanguageType() + ", comment=" + getComment() + ", user=" + getUser() + ")"; }
     public GenerateMethodParam() {}
/* 14 */   public GenerateMethodParam(String uuid, String languageType, String comment, String user) { this.uuid = uuid; this.languageType = languageType; this.comment = comment; this.user = user; }
/* 15 */   public static GenerateMethodParamBuilder builder() { return new GenerateMethodParamBuilder(); } public static class GenerateMethodParamBuilder { private String uuid; private String languageType; public GenerateMethodParamBuilder uuid(String uuid) { this.uuid = uuid; return this; } private String comment; private String user; public GenerateMethodParamBuilder languageType(String languageType) { this.languageType = languageType; return this; } public GenerateMethodParamBuilder comment(String comment) { this.comment = comment; return this; } public GenerateMethodParamBuilder user(String user) { this.user = user; return this; } public GenerateMethodParam build() { return new GenerateMethodParam(this.uuid, this.languageType, this.comment, this.user); } public String toString() { return "GenerateMethodParam.GenerateMethodParamBuilder(uuid=" + this.uuid + ", languageType=" + this.languageType + ", comment=" + this.comment + ", user=" + this.user + ")"; }
       }
    public String getUuid() {
/* 18 */     return this.uuid;
    } public String getLanguageType() {
/* 20 */     return this.languageType;
    } public String getComment() {
/* 22 */     return this.comment;
    } public String getUser() {
/* 24 */     return this.user;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/code/GenerateMethodParam.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */