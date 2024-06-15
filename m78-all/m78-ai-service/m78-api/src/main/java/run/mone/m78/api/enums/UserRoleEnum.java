  package run.mone.m78.api.enums;
  
  
  
  
  
  
  
  
  
  public enum UserRoleEnum
  {
/* 13 */   UN_KNOW(-1, "未知用户"),
/* 14 */   USER(0, "用户"),
/* 15 */   ADMIN(1, "管理员"),
/* 16 */   OWNER(2, "所有者"),
/* 17 */   SUPER_ADMIN(999, "超级管理员");
    private Integer code; private String desc;
    
/* 20 */   public Integer getCode() { return this.code; } public String getDesc() {
/* 21 */     return this.desc;
    }
    public static UserRoleEnum valueOfCode(int code) {
/* 24 */     for (UserRoleEnum userRoleEnum : values()) {
/* 25 */       if (userRoleEnum.code.intValue() == code) {
/* 26 */         return userRoleEnum;
        }
      } 
/* 29 */     return UN_KNOW;
    }
    
    public static UserRoleEnum valueOfDesc(String desc) {
/* 33 */     for (UserRoleEnum userRoleEnum : values()) {
/* 34 */       if (userRoleEnum.desc.equals(desc)) {
/* 35 */         return userRoleEnum;
        }
      } 
/* 38 */     return null;
    }
  
    
    UserRoleEnum(int code, String desc) {
/* 43 */     this.code = Integer.valueOf(code);
/* 44 */     this.desc = desc;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/enums/UserRoleEnum.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */