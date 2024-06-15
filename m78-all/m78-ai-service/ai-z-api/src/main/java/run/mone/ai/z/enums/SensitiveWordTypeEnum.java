  package run.mone.ai.z.enums;

  public enum SensitiveWordTypeEnum {
/*  4 */   All(0, "不限制"),
/*  5 */   FiledKey(1, "属性名"),
/*  6 */   FiledValue(2, "属性值");
    public final int code;
    public final String description;

    SensitiveWordTypeEnum(int code, String description) {
/* 11 */     this.code = code;
/* 12 */     this.description = description;
    }

    public int getCode() {
/* 16 */     return this.code;
    }

    public String getDescription() {
/* 20 */     return this.description;
    }

    public static boolean check(Integer type) {
/* 24 */     if (type == null) {
/* 25 */       return false;
      }
/* 27 */     SensitiveWordTypeEnum[] values = values();
/* 28 */     for (SensitiveWordTypeEnum envEnum : values) {
/* 29 */       if (type.intValue() == envEnum.getCode()) {
/* 30 */         return true;
        }
      }
/* 33 */     return false;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/enums/SensitiveWordTypeEnum.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */