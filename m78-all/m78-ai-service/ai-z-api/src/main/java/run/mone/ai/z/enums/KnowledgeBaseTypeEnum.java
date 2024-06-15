package run.mone.ai.z.enums;


public enum KnowledgeBaseTypeEnum {
    /* 25 */   NORMAL("normal", "普通"),
    /* 26 */   ATHENA_CODE("athenaCode", "ai插件code"),
    /* 27 */   AI_CUSTOMER_SERVICE("aiCS", "智能客服知识库"),
    /* 28 */   OTHER("other", "其它");

    private String type;
    private String msg;

    KnowledgeBaseTypeEnum(String type, String msg) {
        /* 34 */
        this.type = type;
        /* 35 */
        this.msg = msg;
    }

    public String getType() {
        /* 39 */
        return this.type;
    }

    public String getMsg() {
        /* 43 */
        return this.msg;
    }

    public static KnowledgeBaseTypeEnum of(String type) {
        /* 47 */
        for (KnowledgeBaseTypeEnum typeEnum : values()) {
            /* 48 */
            if (typeEnum.getType().equals(type)) {
                /* 49 */
                return typeEnum;
            }
        }

        /* 53 */
        return null;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/enums/KnowledgeBaseTypeEnum.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */