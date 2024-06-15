  package run.mone.ai.z.dto;


  public class InviteesReq
  {
    private String username;
    private String invitationCode;

    public void setUsername(String username) {
/* 10 */     this.username = username; } public void setInvitationCode(String invitationCode) { this.invitationCode = invitationCode; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof InviteesReq)) return false;  InviteesReq other = (InviteesReq)o; if (!other.canEqual(this)) return false;  Object this$username = getUsername(), other$username = other.getUsername(); if ((this$username == null) ? (other$username != null) : !this$username.equals(other$username)) return false;  Object this$invitationCode = getInvitationCode(), other$invitationCode = other.getInvitationCode(); return !((this$invitationCode == null) ? (other$invitationCode != null) : !this$invitationCode.equals(other$invitationCode)); } protected boolean canEqual(Object other) { return other instanceof InviteesReq; } public int hashCode() {  int  result = 1; Object $username = getUsername(); result = result * 59 + (($username == null) ? 43 : $username.hashCode()); Object $invitationCode = getInvitationCode(); return result * 59 + (($invitationCode == null) ? 43 : $invitationCode.hashCode()); } public String toString() { return "InviteesReq(username=" + getUsername() + ", invitationCode=" + getInvitationCode() + ")"; }

    public String getUsername() {
/* 13 */     return this.username;
    } public String getInvitationCode() {
/* 15 */     return this.invitationCode;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/InviteesReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */