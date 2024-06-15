  package run.mone.ai.z.enums;























  public enum PayPackageEnum
  {
/* 27 */   TEST(1, "测试0.01", "0.01", 1),

/* 29 */   SIX(6, "6元首充", "6.0", 0),

/* 31 */   TEN(10, "10元", "10.0", 1),

/* 33 */   TWENTY(20, "20元", "20.0", 1);

    private int packageId;

    private String packageName;

    private String price;
    private int packageType;

    PayPackageEnum(int packageId, String packageName, String price, int packageType) {
/* 43 */     this.packageId = packageId;
/* 44 */     this.packageName = packageName;
/* 45 */     this.price = price;
/* 46 */     this.packageType = packageType;
    }

    public int getPackageId() {
/* 50 */     return this.packageId;
    }

    public String getPackageName() {
/* 54 */     return this.packageName;
    }

    public String getPrice() {
/* 58 */     return this.price;
    }

    public int getPackageType() {
/* 62 */     return this.packageType;
    }

    public static PayPackageEnum of(int packageId) {
/* 66 */     for (PayPackageEnum payPackageEnum : values()) {
/* 67 */       if (payPackageEnum.getPackageId() == packageId) {
/* 68 */         return payPackageEnum;
        }
      }

/* 72 */     return null;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/enums/PayPackageEnum.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */