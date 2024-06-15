  package run.mone.m78.api.bo.contact;
  
  
  
  public class ContactParam
  {
    private String userName;
    private String contactName;
    private String contactEmail;
    private String contactSubject;
    private String contactContent;
    
    public void setUserName(String userName) {
/* 14 */     this.userName = userName; } public void setContactName(String contactName) { this.contactName = contactName; } public void setContactEmail(String contactEmail) { this.contactEmail = contactEmail; } public void setContactSubject(String contactSubject) { this.contactSubject = contactSubject; } public void setContactContent(String contactContent) { this.contactContent = contactContent; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof ContactParam)) return false;  ContactParam other = (ContactParam)o; if (!other.canEqual(this)) return false;  Object this$userName = getUserName(), other$userName = other.getUserName(); if ((this$userName == null) ? (other$userName != null) : !this$userName.equals(other$userName)) return false;  Object this$contactName = getContactName(), other$contactName = other.getContactName(); if ((this$contactName == null) ? (other$contactName != null) : !this$contactName.equals(other$contactName)) return false;  Object this$contactEmail = getContactEmail(), other$contactEmail = other.getContactEmail(); if ((this$contactEmail == null) ? (other$contactEmail != null) : !this$contactEmail.equals(other$contactEmail)) return false;  Object this$contactSubject = getContactSubject(), other$contactSubject = other.getContactSubject(); if ((this$contactSubject == null) ? (other$contactSubject != null) : !this$contactSubject.equals(other$contactSubject)) return false;  Object this$contactContent = getContactContent(), other$contactContent = other.getContactContent(); return !((this$contactContent == null) ? (other$contactContent != null) : !this$contactContent.equals(other$contactContent)); } protected boolean canEqual(Object other) { return other instanceof ContactParam; } public int hashCode() {  int  result = 1; Object $userName = getUserName(); result = result * 59 + (($userName == null) ? 43 : $userName.hashCode()); Object $contactName = getContactName(); result = result * 59 + (($contactName == null) ? 43 : $contactName.hashCode()); Object $contactEmail = getContactEmail(); result = result * 59 + (($contactEmail == null) ? 43 : $contactEmail.hashCode()); Object $contactSubject = getContactSubject(); result = result * 59 + (($contactSubject == null) ? 43 : $contactSubject.hashCode()); Object $contactContent = getContactContent(); return result * 59 + (($contactContent == null) ? 43 : $contactContent.hashCode()); } public String toString() { return "ContactParam(userName=" + getUserName() + ", contactName=" + getContactName() + ", contactEmail=" + getContactEmail() + ", contactSubject=" + getContactSubject() + ", contactContent=" + getContactContent() + ")"; }
     public ContactParam() {}
/* 16 */   public ContactParam(String userName, String contactName, String contactEmail, String contactSubject, String contactContent) { this.userName = userName; this.contactName = contactName; this.contactEmail = contactEmail; this.contactSubject = contactSubject; this.contactContent = contactContent; }
/* 17 */   public static ContactParamBuilder builder() { return new ContactParamBuilder(); } public static class ContactParamBuilder { private String userName; private String contactName; public ContactParamBuilder userName(String userName) { this.userName = userName; return this; } private String contactEmail; private String contactSubject; private String contactContent; public ContactParamBuilder contactName(String contactName) { this.contactName = contactName; return this; } public ContactParamBuilder contactEmail(String contactEmail) { this.contactEmail = contactEmail; return this; } public ContactParamBuilder contactSubject(String contactSubject) { this.contactSubject = contactSubject; return this; } public ContactParamBuilder contactContent(String contactContent) { this.contactContent = contactContent; return this; } public ContactParam build() { return new ContactParam(this.userName, this.contactName, this.contactEmail, this.contactSubject, this.contactContent); } public String toString() { return "ContactParam.ContactParamBuilder(userName=" + this.userName + ", contactName=" + this.contactName + ", contactEmail=" + this.contactEmail + ", contactSubject=" + this.contactSubject + ", contactContent=" + this.contactContent + ")"; }
       }
    public String getUserName() {
/* 20 */     return this.userName;
    } public String getContactName() {
/* 22 */     return this.contactName;
    } public String getContactEmail() {
/* 24 */     return this.contactEmail;
    } public String getContactSubject() {
/* 26 */     return this.contactSubject;
    } public String getContactContent() {
/* 28 */     return this.contactContent;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/contact/ContactParam.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */