  package run.mone.m78.api.enums;






  public enum FlowRunStatusEnum
  {
/* 10 */   NOT_RUN(0, "未运行"),
/* 11 */   RUN_SUCCEED(1, "运行成功"),
/* 12 */   RUN_FAILED(1, "运行失败");

    private Integer code;
    private String desc;

    public Integer getCode() {
/* 18 */     return this.code;
    }

    public String getDesc() {
/* 22 */     return this.desc;
    }

    FlowRunStatusEnum(int code, String desc) {
/* 26 */     this.code = Integer.valueOf(code);
/* 27 */     this.desc = desc;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/enums/FlowRunStatusEnum.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */