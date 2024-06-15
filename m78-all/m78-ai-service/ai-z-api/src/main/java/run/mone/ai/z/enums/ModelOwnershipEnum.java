  package run.mone.ai.z.enums;
  
  public enum ModelOwnershipEnum {
/*  4 */   Public("public"),
/*  5 */   AdminOnly("admin_only"),
/*  6 */   Probot("probot");
    
    ModelOwnershipEnum(String name) {
/*  9 */     this.name = name;
    }
    public final String name;
    
    public static ModelOwnershipEnum fromName(String name) {
/* 14 */     for (ModelOwnershipEnum d : values()) {
/* 15 */       if (d.name.equals(name)) {
/* 16 */         return d;
        }
      } 
/* 19 */     return AdminOnly;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/enums/ModelOwnershipEnum.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */