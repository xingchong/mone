package run.mone.ai.z.dto;


public class QrInfo {
    private String qr;

    public String toString() {
        /* 37 */
        return "XorPayRes.QrInfo(qr=" + getQr() + ")";
    }

    public int hashCode() {
        int result = 1;
        Object $qr = getQr();
        return result * 59 + (($qr == null) ? 43 : $qr.hashCode());
    }

    protected boolean canEqual(Object other) {
        return other instanceof QrInfo;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof QrInfo)) return false;
        QrInfo other = (QrInfo) o;
        if (!other.canEqual(this)) return false;
        Object this$qr = getQr(), other$qr = other.getQr();
        return !((this$qr == null) ? (other$qr != null) : !this$qr.equals(other$qr));
    }

    public void setQr(String qr) {
        this.qr = qr;
    }

    public String getQr() {
        /* 40 */
        return this.qr;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/XorPayRes$QrInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */