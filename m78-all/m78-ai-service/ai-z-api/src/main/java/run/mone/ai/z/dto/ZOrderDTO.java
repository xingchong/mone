  package run.mone.ai.z.dto;

  import java.io.Serializable;
  import java.util.Date;






  public class ZOrderDTO
    implements Serializable
  {
    private Long orderId;
    private Date gmtCreate;
    private Date gmtModified;
    private String account;
    private Integer packageId;
    private String price;
    private String priceValue;
    private Integer status;
    private Integer payType;
    private String paySubType;
    private Integer expire;
    private String xorOrderId;

    public void setOrderId(Long orderId) {
/* 28 */     this.orderId = orderId; } public void setGmtCreate(Date gmtCreate) { this.gmtCreate = gmtCreate; } public void setGmtModified(Date gmtModified) { this.gmtModified = gmtModified; } public void setAccount(String account) { this.account = account; } public void setPackageId(Integer packageId) { this.packageId = packageId; } public void setPrice(String price) { this.price = price; } public void setPriceValue(String priceValue) { this.priceValue = priceValue; } public void setStatus(Integer status) { this.status = status; } public void setPayType(Integer payType) { this.payType = payType; } public void setPaySubType(String paySubType) { this.paySubType = paySubType; } public void setExpire(Integer expire) { this.expire = expire; } public void setXorOrderId(String xorOrderId) { this.xorOrderId = xorOrderId; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof ZOrderDTO)) return false;  ZOrderDTO other = (ZOrderDTO)o; if (!other.canEqual(this)) return false;  Object this$orderId = getOrderId(), other$orderId = other.getOrderId(); if ((this$orderId == null) ? (other$orderId != null) : !this$orderId.equals(other$orderId)) return false;  Object this$packageId = getPackageId(), other$packageId = other.getPackageId(); if ((this$packageId == null) ? (other$packageId != null) : !this$packageId.equals(other$packageId)) return false;  Object this$status = getStatus(), other$status = other.getStatus(); if ((this$status == null) ? (other$status != null) : !this$status.equals(other$status)) return false;  Object this$payType = getPayType(), other$payType = other.getPayType(); if ((this$payType == null) ? (other$payType != null) : !this$payType.equals(other$payType)) return false;  Object this$expire = getExpire(), other$expire = other.getExpire(); if ((this$expire == null) ? (other$expire != null) : !this$expire.equals(other$expire)) return false;  Object this$gmtCreate = getGmtCreate(), other$gmtCreate = other.getGmtCreate(); if ((this$gmtCreate == null) ? (other$gmtCreate != null) : !this$gmtCreate.equals(other$gmtCreate)) return false;  Object this$gmtModified = getGmtModified(), other$gmtModified = other.getGmtModified(); if ((this$gmtModified == null) ? (other$gmtModified != null) : !this$gmtModified.equals(other$gmtModified)) return false;  Object this$account = getAccount(), other$account = other.getAccount(); if ((this$account == null) ? (other$account != null) : !this$account.equals(other$account)) return false;  Object this$price = getPrice(), other$price = other.getPrice(); if ((this$price == null) ? (other$price != null) : !this$price.equals(other$price)) return false;  Object this$priceValue = getPriceValue(), other$priceValue = other.getPriceValue(); if ((this$priceValue == null) ? (other$priceValue != null) : !this$priceValue.equals(other$priceValue)) return false;  Object this$paySubType = getPaySubType(), other$paySubType = other.getPaySubType(); if ((this$paySubType == null) ? (other$paySubType != null) : !this$paySubType.equals(other$paySubType)) return false;  Object this$xorOrderId = getXorOrderId(), other$xorOrderId = other.getXorOrderId(); return !((this$xorOrderId == null) ? (other$xorOrderId != null) : !this$xorOrderId.equals(other$xorOrderId)); } protected boolean canEqual(Object other) { return other instanceof ZOrderDTO; } public int hashCode() {  int  result = 1; Object $orderId = getOrderId(); result = result * 59 + (($orderId == null) ? 43 : $orderId.hashCode()); Object $packageId = getPackageId(); result = result * 59 + (($packageId == null) ? 43 : $packageId.hashCode()); Object $status = getStatus(); result = result * 59 + (($status == null) ? 43 : $status.hashCode()); Object $payType = getPayType(); result = result * 59 + (($payType == null) ? 43 : $payType.hashCode()); Object $expire = getExpire(); result = result * 59 + (($expire == null) ? 43 : $expire.hashCode()); Object $gmtCreate = getGmtCreate(); result = result * 59 + (($gmtCreate == null) ? 43 : $gmtCreate.hashCode()); Object $gmtModified = getGmtModified(); result = result * 59 + (($gmtModified == null) ? 43 : $gmtModified.hashCode()); Object $account = getAccount(); result = result * 59 + (($account == null) ? 43 : $account.hashCode()); Object $price = getPrice(); result = result * 59 + (($price == null) ? 43 : $price.hashCode()); Object $priceValue = getPriceValue(); result = result * 59 + (($priceValue == null) ? 43 : $priceValue.hashCode()); Object $paySubType = getPaySubType(); result = result * 59 + (($paySubType == null) ? 43 : $paySubType.hashCode()); Object $xorOrderId = getXorOrderId(); return result * 59 + (($xorOrderId == null) ? 43 : $xorOrderId.hashCode()); } public String toString() { return "ZOrderDTO(orderId=" + getOrderId() + ", gmtCreate=" + getGmtCreate() + ", gmtModified=" + getGmtModified() + ", account=" + getAccount() + ", packageId=" + getPackageId() + ", price=" + getPrice() + ", priceValue=" + getPriceValue() + ", status=" + getStatus() + ", payType=" + getPayType() + ", paySubType=" + getPaySubType() + ", expire=" + getExpire() + ", xorOrderId=" + getXorOrderId() + ")"; }

    public Long getOrderId() {
/* 31 */     return this.orderId;
    } public Date getGmtCreate() {
/* 33 */     return this.gmtCreate;
    } public Date getGmtModified() {
/* 35 */     return this.gmtModified;
    } public String getAccount() {
/* 37 */     return this.account;
    } public Integer getPackageId() {
/* 39 */     return this.packageId;
    } public String getPrice() {
/* 41 */     return this.price;
    } public String getPriceValue() {
/* 43 */     return this.priceValue;
    } public Integer getStatus() {
/* 45 */     return this.status;
    } public Integer getPayType() {
/* 47 */     return this.payType;
    } public String getPaySubType() {
/* 49 */     return this.paySubType;
    } public Integer getExpire() {
/* 51 */     return this.expire;
    } public String getXorOrderId() {
/* 53 */     return this.xorOrderId;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/ZOrderDTO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */