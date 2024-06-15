package run.mone.ai.z.enums;


public enum KnowledgeBaseFileTypeEnum {
    /* 24 */   PDF("pdf"),

    /* 26 */   ATHENA("athena"),
    /* 27 */   TXT("txt"),
    /* 28 */   DOC("doc"),
    /* 29 */   MD("md");

    private String type;


    KnowledgeBaseFileTypeEnum(String type) {
        /* 35 */
        this.type = type;
    }

    public String getType() {
        /* 39 */
        return this.type;
    }


    public static KnowledgeBaseFileTypeEnum of(String type) {
        /* 44 */
        for (KnowledgeBaseFileTypeEnum typeEnum : values()) {
            /* 45 */
            if (typeEnum.getType().equals(type)) {
                /* 46 */
                return typeEnum;
            }
        }

        /* 50 */
        return null;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/enums/KnowledgeBaseFileTypeEnum.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */