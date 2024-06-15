  package run.mone.m78.api.bo.image;


  public class ImageParam
  {
    private Integer operateType;
    private String uuid;
    private String content;
    private String user;

    public void setOperateType(Integer operateType) {
/* 12 */     this.operateType = operateType; } public void setUuid(String uuid) { this.uuid = uuid; } public void setContent(String content) { this.content = content; } public void setUser(String user) { this.user = user; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof ImageParam)) return false;  ImageParam other = (ImageParam)o; if (!other.canEqual(this)) return false;  Object this$operateType = getOperateType(), other$operateType = other.getOperateType(); if ((this$operateType == null) ? (other$operateType != null) : !this$operateType.equals(other$operateType)) return false;  Object this$uuid = getUuid(), other$uuid = other.getUuid(); if ((this$uuid == null) ? (other$uuid != null) : !this$uuid.equals(other$uuid)) return false;  Object this$content = getContent(), other$content = other.getContent(); if ((this$content == null) ? (other$content != null) : !this$content.equals(other$content)) return false;  Object this$user = getUser(), other$user = other.getUser(); return !((this$user == null) ? (other$user != null) : !this$user.equals(other$user)); } protected boolean canEqual(Object other) { return other instanceof ImageParam; } public int hashCode() {  int  result = 1; Object $operateType = getOperateType(); result = result * 59 + (($operateType == null) ? 43 : $operateType.hashCode()); Object $uuid = getUuid(); result = result * 59 + (($uuid == null) ? 43 : $uuid.hashCode()); Object $content = getContent(); result = result * 59 + (($content == null) ? 43 : $content.hashCode()); Object $user = getUser(); return result * 59 + (($user == null) ? 43 : $user.hashCode()); } public String toString() { return "ImageParam(operateType=" + getOperateType() + ", uuid=" + getUuid() + ", content=" + getContent() + ", user=" + getUser() + ")"; }
     public ImageParam() {}
/* 14 */   public ImageParam(Integer operateType, String uuid, String content, String user) { this.operateType = operateType; this.uuid = uuid; this.content = content; this.user = user; }
/* 15 */   public static ImageParamBuilder builder() { return new ImageParamBuilder(); } public static class ImageParamBuilder { private Integer operateType; private String uuid; public ImageParamBuilder operateType(Integer operateType) { this.operateType = operateType; return this; } private String content; private String user; public ImageParamBuilder uuid(String uuid) { this.uuid = uuid; return this; } public ImageParamBuilder content(String content) { this.content = content; return this; } public ImageParamBuilder user(String user) { this.user = user; return this; } public ImageParam build() { return new ImageParam(this.operateType, this.uuid, this.content, this.user); } public String toString() { return "ImageParam.ImageParamBuilder(operateType=" + this.operateType + ", uuid=" + this.uuid + ", content=" + this.content + ", user=" + this.user + ")"; }
       }
    public Integer getOperateType() {
/* 18 */     return this.operateType;
    } public String getUuid() {
/* 20 */     return this.uuid;
    } public String getContent() {
/* 22 */     return this.content;
    } public String getUser() {
/* 24 */     return this.user;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/image/ImageParam.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */