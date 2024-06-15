  package run.mone.ai.z.enums;
  
  public enum ModeEnum {
/*  4 */   Question("question", 1, "问题模式"),
/*  5 */   Prompt("prompt", 2, "提示词模式"),
/*  6 */   Plugin("plugin", 3, "插件模式");
    public final String name;
    public final int code;
    public final String description;
    
    ModeEnum(String name, int code, String description) {
/* 12 */     this.name = name;
/* 13 */     this.code = code;
/* 14 */     this.description = description;
    }
    
    public static ModeEnum fromName(String name) {
/* 18 */     for (ModeEnum d : values()) {
/* 19 */       if (d.name.equals(name)) {
/* 20 */         return d;
        }
      } 
/* 23 */     return null;
    }
    
    public static ModeEnum fromCode(int code) {
/* 27 */     for (ModeEnum d : values()) {
/* 28 */       if (d.code == code) {
/* 29 */         return d;
        }
      } 
/* 32 */     return null;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/enums/ModeEnum.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */