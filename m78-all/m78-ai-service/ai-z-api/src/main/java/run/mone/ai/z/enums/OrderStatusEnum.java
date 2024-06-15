  package run.mone.ai.z.enums;
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  public enum OrderStatusEnum
  {
/* 25 */   INIT("初始化状态", 0),
/* 26 */   PAID("已支付-待Z积分充值", 1),
/* 27 */   Z_POINTS("Z积分充值完成", 2),
/* 28 */   PAY_FAILED("支付失败", 11),
/* 29 */   Z_PAY_FAILED("Z积分充值失败", 12);
    
    private String name;
    
    private int status;
  
    
    OrderStatusEnum(String name, int status) {
/* 37 */     this.name = name;
/* 38 */     this.status = status;
    }
    
    public String getName() {
/* 42 */     return this.name;
    }
    
    public int getStatus() {
/* 46 */     return this.status;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/enums/OrderStatusEnum.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */