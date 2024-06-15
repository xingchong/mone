  package run.mone.m78.api.enums;








  public enum BotPermissionEnum
  {
/* 13 */   PRIVATE(0, "私有"),
/* 14 */   PUBLIC(1, "公开"); private String desc;

        private Integer code;

    public Integer getCode() {
/* 16 */     return this.code; } public String getDesc() {
/* 17 */     return this.desc;
    }
    BotPermissionEnum(int code, String desc) {
/* 20 */     this.code = Integer.valueOf(code);
/* 21 */     this.desc = desc;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/enums/BotPermissionEnum.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */