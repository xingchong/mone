  package run.mone.m78.api.bo.translate;

  public class TranslateQry
  {
    private int type;
    private String user;

    public void setType(int type) {
/*  9 */     this.type = type; } public void setUser(String user) { this.user = user; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof TranslateQry)) return false;  TranslateQry other = (TranslateQry)o; if (!other.canEqual(this)) return false;  if (getType() != other.getType()) return false;  Object this$user = getUser(), other$user = other.getUser(); return !((this$user == null) ? (other$user != null) : !this$user.equals(other$user)); } protected boolean canEqual(Object other) { return other instanceof TranslateQry; } public int hashCode() {  int  result = 1; result = result * 59 + getType(); Object $user = getUser(); return result * 59 + (($user == null) ? 43 : $user.hashCode()); } public String toString() { return "TranslateQry(type=" + getType() + ", user=" + getUser() + ")"; }
     public int getType() {
/* 11 */     return this.type;
    } public String getUser() {
/* 13 */     return this.user;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/translate/TranslateQry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */