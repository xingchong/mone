  package run.mone.m78.api.bo.image;





  public class ImageParamBuilder
  {
    private Integer operateType;
    private String uuid;
    private String content;
    private String user;

    public ImageParamBuilder operateType(Integer operateType) {
/* 15 */     this.operateType = operateType; return this; } public ImageParamBuilder uuid(String uuid) { this.uuid = uuid; return this; } public ImageParamBuilder content(String content) { this.content = content; return this; } public ImageParamBuilder user(String user) { this.user = user; return this; } public ImageParam build() { return new ImageParam(this.operateType, this.uuid, this.content, this.user); } public String toString() { return "ImageParam.ImageParamBuilder(operateType=" + this.operateType + ", uuid=" + this.uuid + ", content=" + this.content + ", user=" + this.user + ")"; }

  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/image/ImageParam$ImageParamBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */