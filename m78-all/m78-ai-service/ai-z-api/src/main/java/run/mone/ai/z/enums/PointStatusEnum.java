  package run.mone.ai.z.enums;
  
  public enum PointStatusEnum {
/*  4 */   Init("等待中", 0),
/*  5 */   Done("兑换成功", 1),
/*  6 */   Timeout("兑换超时，请手动检查交易状态", 2),
/*  7 */   Failed("兑换失败", 3);
    public final String name;
    public final int code;
    
    PointStatusEnum(String name, int code) {
/* 12 */     this.name = name;
/* 13 */     this.code = code;
    }
    
    public static PointStatusEnum fromName(String name) {
/* 17 */     for (PointStatusEnum d : values()) {
/* 18 */       if (d.name.equals(name)) {
/* 19 */         return d;
        }
      } 
/* 22 */     return null;
    }
    
    public static PointStatusEnum fromCode(int code) {
/* 26 */     for (PointStatusEnum d : values()) {
/* 27 */       if (d.code == code) {
/* 28 */         return d;
        }
      } 
/* 31 */     return null;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/enums/PointStatusEnum.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */