package run.mone.ai.z.dto;

import java.io.Serializable;


public class XorPayQrCodeReq
        implements Serializable {
    private String name;
    private String payType;
    private int payPackageId;
    private String price;
    private String priceValue;
    private String orderId;
    private String orderUid;
    private String notifyUrl;

    public void setName(String name) {
        /* 27 */
        this.name = name;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public void setPayPackageId(int payPackageId) {
        this.payPackageId = payPackageId;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setPriceValue(String priceValue) {
        this.priceValue = priceValue;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setOrderUid(String orderUid) {
        this.orderUid = orderUid;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public void setExpire(int expire) {
        this.expire = expire;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof XorPayQrCodeReq)) return false;
        XorPayQrCodeReq other = (XorPayQrCodeReq) o;
        if (!other.canEqual(this)) return false;
        if (getPayPackageId() != other.getPayPackageId()) return false;
        if (getExpire() != other.getExpire()) return false;
        Object this$name = getName(), other$name = other.getName();
        if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;
        Object this$payType = getPayType(), other$payType = other.getPayType();
        if ((this$payType == null) ? (other$payType != null) : !this$payType.equals(other$payType)) return false;
        Object this$price = getPrice(), other$price = other.getPrice();
        if ((this$price == null) ? (other$price != null) : !this$price.equals(other$price)) return false;
        Object this$priceValue = getPriceValue(), other$priceValue = other.getPriceValue();
        if ((this$priceValue == null) ? (other$priceValue != null) : !this$priceValue.equals(other$priceValue))
            return false;
        Object this$orderId = getOrderId(), other$orderId = other.getOrderId();
        if ((this$orderId == null) ? (other$orderId != null) : !this$orderId.equals(other$orderId)) return false;
        Object this$orderUid = getOrderUid(), other$orderUid = other.getOrderUid();
        if ((this$orderUid == null) ? (other$orderUid != null) : !this$orderUid.equals(other$orderUid)) return false;
        Object this$notifyUrl = getNotifyUrl(), other$notifyUrl = other.getNotifyUrl();
        if ((this$notifyUrl == null) ? (other$notifyUrl != null) : !this$notifyUrl.equals(other$notifyUrl))
            return false;
        Object this$appSecret = getAppSecret(), other$appSecret = other.getAppSecret();
        if ((this$appSecret == null) ? (other$appSecret != null) : !this$appSecret.equals(other$appSecret))
            return false;
        Object this$sign = getSign(), other$sign = other.getSign();
        return !((this$sign == null) ? (other$sign != null) : !this$sign.equals(other$sign));
    }

    protected boolean canEqual(Object other) {
        return other instanceof XorPayQrCodeReq;
    }

    public int hashCode() {
                 int result = 1;
        result = result * 59 + getPayPackageId();
        result = result * 59 + getExpire();
        Object $name = getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        Object $payType = getPayType();
        result = result * 59 + (($payType == null) ? 43 : $payType.hashCode());
        Object $price = getPrice();
        result = result * 59 + (($price == null) ? 43 : $price.hashCode());
        Object $priceValue = getPriceValue();
        result = result * 59 + (($priceValue == null) ? 43 : $priceValue.hashCode());
        Object $orderId = getOrderId();
        result = result * 59 + (($orderId == null) ? 43 : $orderId.hashCode());
        Object $orderUid = getOrderUid();
        result = result * 59 + (($orderUid == null) ? 43 : $orderUid.hashCode());
        Object $notifyUrl = getNotifyUrl();
        result = result * 59 + (($notifyUrl == null) ? 43 : $notifyUrl.hashCode());
        Object $appSecret = getAppSecret();
        result = result * 59 + (($appSecret == null) ? 43 : $appSecret.hashCode());
        Object $sign = getSign();
        return result * 59 + (($sign == null) ? 43 : $sign.hashCode());
    }

    public String toString() {
        return "XorPayQrCodeReq(name=" + getName() + ", payType=" + getPayType() + ", payPackageId=" + getPayPackageId() + ", price=" + getPrice() + ", priceValue=" + getPriceValue() + ", orderId=" + getOrderId() + ", orderUid=" + getOrderUid() + ", notifyUrl=" + getNotifyUrl() + ", expire=" + getExpire() + ", appSecret=" + getAppSecret() + ", sign=" + getSign() + ")";
    }

    /* 29 */
    public String getName() {
        return this.name;
    }

    public String getPayType() {
        /* 30 */
        return this.payType;
    }

    /* 32 */
    public int getPayPackageId() {
        return this.payPackageId;
    }

    public String getPrice() {
        /* 33 */
        return this.price;
    }

    /* 35 */
    public String getPriceValue() {
        return this.priceValue;
    }

    /* 36 */
    public String getOrderId() {
        return this.orderId;
    }

    /* 37 */
    public String getOrderUid() {
        return this.orderUid;
    }

    public String getNotifyUrl() {
        /* 38 */
        return this.notifyUrl;
        /* 39 */
    }

    private String appSecret;
    private int expire = 7200;
    private String sign;

    public int getExpire() {
        return this.expire;
    }

    public String getAppSecret() {
        /* 40 */
        return this.appSecret;
    }

    public String getSign() {
        /* 42 */
        return this.sign;
    }

    public String getSignStr() {
        /* 45 */
        return this.name + this.payType + this.price + this.orderId + this.notifyUrl + this.appSecret;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/XorPayQrCodeReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */