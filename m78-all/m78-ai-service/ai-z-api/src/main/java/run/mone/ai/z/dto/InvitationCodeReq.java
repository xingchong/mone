  package run.mone.ai.z.dto;



  public class InvitationCodeReq
  {
    private String zuToken;

    public String toString() {
/* 10 */     return "InvitationCodeReq(zuToken=" + getZuToken() + ")"; } public int hashCode() {  int  result = 1; Object $zuToken = getZuToken(); return result * 59 + (($zuToken == null) ? 43 : $zuToken.hashCode()); } protected boolean canEqual(Object other) { return other instanceof InvitationCodeReq; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof InvitationCodeReq)) return false;  InvitationCodeReq other = (InvitationCodeReq)o; if (!other.canEqual(this)) return false;  Object this$zuToken = getZuToken(), other$zuToken = other.getZuToken(); return !((this$zuToken == null) ? (other$zuToken != null) : !this$zuToken.equals(other$zuToken)); } public void setZuToken(String zuToken) { this.zuToken = zuToken; }

    public String getZuToken() {
/* 13 */     return this.zuToken;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/InvitationCodeReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */