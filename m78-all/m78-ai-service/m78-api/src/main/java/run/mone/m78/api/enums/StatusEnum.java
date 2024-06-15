  package run.mone.m78.api.enums;












  public enum StatusEnum
  {
/* 17 */   NOT_DELETED(Integer.valueOf(0), "正常数据"),
/* 18 */   DELETED(Integer.valueOf(1), "已删除数据");
    private Integer code;
           private String desc;
    public Integer getCode() {
/* 20 */     return this.code; } public String getDesc() {
/* 21 */     return this.desc;
    }
    StatusEnum(Integer code, String desc) {
/* 24 */     this.code = code;
/* 25 */     this.desc = desc;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/enums/StatusEnum.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */