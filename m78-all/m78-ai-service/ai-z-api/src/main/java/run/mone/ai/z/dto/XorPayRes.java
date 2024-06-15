  package run.mone.ai.z.dto;

  import java.io.Serializable;














  public class XorPayRes
    implements Serializable
  {
    private String status;
    private int expires_in;
    private String aoid;
    private QrInfo info;

    public void setStatus(String status) {
/* 27 */     this.status = status; } public void setExpires_in(int expires_in) { this.expires_in = expires_in; } public void setAoid(String aoid) { this.aoid = aoid; } public void setInfo(QrInfo info) { this.info = info; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof XorPayRes)) return false;  XorPayRes other = (XorPayRes)o; if (!other.canEqual(this)) return false;  if (getExpires_in() != other.getExpires_in()) return false;  Object this$status = getStatus(), other$status = other.getStatus(); if ((this$status == null) ? (other$status != null) : !this$status.equals(other$status)) return false;  Object this$aoid = getAoid(), other$aoid = other.getAoid(); if ((this$aoid == null) ? (other$aoid != null) : !this$aoid.equals(other$aoid)) return false;  Object this$info = getInfo(), other$info = other.getInfo(); return !((this$info == null) ? (other$info != null) : !this$info.equals(other$info)); } protected boolean canEqual(Object other) { return other instanceof XorPayRes; } public int hashCode() {  int  result = 1; result = result * 59 + getExpires_in(); Object $status = getStatus(); result = result * 59 + (($status == null) ? 43 : $status.hashCode()); Object $aoid = getAoid(); result = result * 59 + (($aoid == null) ? 43 : $aoid.hashCode()); Object $info = getInfo(); return result * 59 + (($info == null) ? 43 : $info.hashCode()); } public String toString() { return "XorPayRes(status=" + getStatus() + ", expires_in=" + getExpires_in() + ", aoid=" + getAoid() + ", info=" + getInfo() + ")"; }
     public String getStatus() {
/* 29 */     return this.status;
    } public int getExpires_in() {
/* 31 */     return this.expires_in;
    } public String getAoid() {
/* 33 */     return this.aoid;
    } public QrInfo getInfo() {
/* 35 */     return this.info;
    } public static class QrInfo {
/* 37 */     public String toString() { return "XorPayRes.QrInfo(qr=" + getQr() + ")"; } private String qr; public int hashCode() {  int  result = 1; Object $qr = getQr(); return result * 59 + (($qr == null) ? 43 : $qr.hashCode()); } protected boolean canEqual(Object other) { return other instanceof QrInfo; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof QrInfo)) return false;  QrInfo other = (QrInfo)o; if (!other.canEqual(this)) return false;  Object this$qr = getQr(), other$qr = other.getQr(); return !((this$qr == null) ? (other$qr != null) : !this$qr.equals(other$qr)); } public void setQr(String qr) { this.qr = qr; }

      public String getQr() {
/* 40 */       return this.qr;
      }
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/XorPayRes.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */