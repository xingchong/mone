package run.mone.ai.z.enums;


public enum CsStatusEnum {

    /* 12 */   delete(-1, "已删除"),
    /* 13 */   init(0, "初始化"),
    /* 14 */   gpt_finish(1, "gpt初始化完成"),
    /* 15 */   user_finish(2, "人工录入完成");

    private int code;
    private String msg;

    public int getCode() {
        /* 17 */
        return this.code;
    }

    public String getMsg() {
        /* 19 */
        return this.msg;
    }

    CsStatusEnum(int code, String msg) {
        /* 23 */
        this.code = code;
        /* 24 */
        this.msg = msg;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/enums/CsStatusEnum.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */