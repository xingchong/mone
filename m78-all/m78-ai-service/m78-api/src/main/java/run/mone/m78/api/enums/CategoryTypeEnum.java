  package run.mone.m78.api.enums;









  public enum CategoryTypeEnum
  {
/* 13 */   PROBOT(1, "probot"),
/* 14 */   PLUGIN(2, "plugin");
    private int code; private String desc;

/* 17 */   public int getCode() { return this.code; } public String getDesc() {
/* 18 */     return this.desc;
    }
    public static CategoryTypeEnum valueOfCode(int code) {
/* 21 */     for (CategoryTypeEnum userRoleEnum : values()) {
/* 22 */       if (userRoleEnum.code == code) {
/* 23 */         return userRoleEnum;
        }
      }
/* 26 */     return null;
    }

    public static CategoryTypeEnum valueOfDesc(String desc) {
/* 30 */     for (CategoryTypeEnum userRoleEnum : values()) {
/* 31 */       if (userRoleEnum.desc.equals(desc)) {
/* 32 */         return userRoleEnum;
        }
      }
/* 35 */     return null;
    }


    CategoryTypeEnum(int code, String desc) {
/* 40 */     this.code = code;
/* 41 */     this.desc = desc;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/enums/CategoryTypeEnum.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */