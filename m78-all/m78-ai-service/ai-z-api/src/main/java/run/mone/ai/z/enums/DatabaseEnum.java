  package run.mone.ai.z.enums;
  
  public enum DatabaseEnum {
/*  4 */   API("miapi", 1, "api信息"),
/*  5 */   Questions("questions", 2, "问题"),
/*  6 */   HeraChat("hera chat", 11, "hera chat"),
/*  7 */   MiApiChat("mi-api chat", 12, "mi-api chat"),
/*  8 */   MioneChat("mione chat", 13, "mi-api chat"),
/*  9 */   DayuProjects("dayu", 21, "大禹项目信息"),
/* 10 */   Manual("manual", 31, "手动录入"),
/* 11 */   Tesla("tesla", 41, "网关api"),
/* 12 */   CMD("cmd", 51, "命令");
    
    public final String name;
    public final int code;
    public final String description;
    
    DatabaseEnum(String name, int code, String description) {
/* 19 */     this.name = name;
/* 20 */     this.code = code;
/* 21 */     this.description = description;
    }
    
    public static DatabaseEnum fromName(String name) {
/* 25 */     for (DatabaseEnum d : values()) {
/* 26 */       if (d.name.equals(name)) {
/* 27 */         return d;
        }
      } 
/* 30 */     return null;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/enums/DatabaseEnum.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */