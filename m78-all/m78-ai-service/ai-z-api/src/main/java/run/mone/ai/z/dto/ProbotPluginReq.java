/*   */
package run.mone.ai.z.dto;

/*   */ public class ProbotPluginReq {
    private String token;
    /*   */   private String lang;

    /*   */
    /* 5 */
    public void setToken(String token) {
        this.token = token;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ProbotPluginReq)) return false;
        ProbotPluginReq other = (ProbotPluginReq) o;
        if (!other.canEqual(this)) return false;
        Object this$token = getToken(), other$token = other.getToken();
        if ((this$token == null) ? (other$token != null) : !this$token.equals(other$token)) return false;
        Object this$lang = getLang(), other$lang = other.getLang();
        return !((this$lang == null) ? (other$lang != null) : !this$lang.equals(other$lang));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProbotPluginReq;
    }

    public int hashCode() {
                 int result = 1;
        Object $token = getToken();
        result = result * 59 + (($token == null) ? 43 : $token.hashCode());
        Object $lang = getLang();
        return result * 59 + (($lang == null) ? 43 : $lang.hashCode());
    }

    public String toString() {
        return "ProbotPluginReq(token=" + getToken() + ", lang=" + getLang() + ")";
    }

    /*   */
    /* 7 */
    public String getToken() {
        return this.token;
    }

    public String getLang() {
        /* 8 */
        return this.lang;
        /*   */
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/ProbotPluginReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */