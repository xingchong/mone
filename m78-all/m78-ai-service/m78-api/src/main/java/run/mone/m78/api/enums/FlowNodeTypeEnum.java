  package run.mone.m78.api.enums;






  public enum FlowNodeTypeEnum
  {
/* 10 */   BEGIN("begin"),
/* 11 */   END("end"),
/* 12 */   LLM("llm"),
/* 13 */   KNOWLEDGE("knowledge"),
/* 14 */   CODE("code"),
/* 15 */   PLUGIN("plugin"),
/* 16 */   PRECONDITION("precondition"),

/* 18 */   DATABASE("database");

    private final String desc;

    FlowNodeTypeEnum(String desc) {
/* 23 */     this.desc = desc;
    }

    public String getDesc() {
/* 27 */     return this.desc;
    }

    public static FlowNodeTypeEnum getEnumByDesc(String desc) {
/* 31 */     for (FlowNodeTypeEnum value : values()) {
/* 32 */       if (value.getDesc().equals(desc)) {
/* 33 */         return value;
        }
      }
/* 36 */     return null;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/enums/FlowNodeTypeEnum.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */