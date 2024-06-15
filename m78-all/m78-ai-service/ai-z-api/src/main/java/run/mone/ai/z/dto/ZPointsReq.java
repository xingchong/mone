package run.mone.ai.z.dto;


import java.io.Serializable;

public class ZPointsReq implements Serializable {
    private String zuToken;

    /*  7 */
    public void setZuToken(String zuToken) {
        this.zuToken = zuToken;
    }

    private int points;
    private String pointToken;

    public void setPoints(int points) {
        this.points = points;
    }

    public void setPointToken(String pointToken) {
        this.pointToken = pointToken;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ZPointsReq)) return false;
        ZPointsReq other = (ZPointsReq) o;
        if (!other.canEqual(this)) return false;
        if (getPoints() != other.getPoints()) return false;
        Object this$zuToken = getZuToken(), other$zuToken = other.getZuToken();
        if ((this$zuToken == null) ? (other$zuToken != null) : !this$zuToken.equals(other$zuToken)) return false;
        Object this$pointToken = getPointToken(), other$pointToken = other.getPointToken();
        return !((this$pointToken == null) ? (other$pointToken != null) : !this$pointToken.equals(other$pointToken));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ZPointsReq;
    }

    public int hashCode() {
                 int result = 1;
        result = result * 59 + getPoints();
        Object $zuToken = getZuToken();
        result = result * 59 + (($zuToken == null) ? 43 : $zuToken.hashCode());
        Object $pointToken = getPointToken();
        return result * 59 + (($pointToken == null) ? 43 : $pointToken.hashCode());
    }

    public String toString() {
        return "ZPointsReq(zuToken=" + getZuToken() + ", points=" + getPoints() + ", pointToken=" + getPointToken() + ")";
    }

    public String getZuToken() {
        /*  9 */
        return this.zuToken;
    }

    public int getPoints() {
        /* 11 */
        return this.points;
    }

    public String getPointToken() {
        /* 13 */
        return this.pointToken;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/ZPointsReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */