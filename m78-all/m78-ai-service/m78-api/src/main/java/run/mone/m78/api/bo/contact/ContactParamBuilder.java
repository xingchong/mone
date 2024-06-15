  package run.mone.m78.api.bo.contact;






  public class ContactParamBuilder
  {
    private String userName;
    private String contactName;
    private String contactEmail;
    private String contactSubject;
    private String contactContent;

    public ContactParamBuilder userName(String userName) {
/* 17 */     this.userName = userName; return this; } public ContactParamBuilder contactName(String contactName) { this.contactName = contactName; return this; } public ContactParamBuilder contactEmail(String contactEmail) { this.contactEmail = contactEmail; return this; } public ContactParamBuilder contactSubject(String contactSubject) { this.contactSubject = contactSubject; return this; } public ContactParamBuilder contactContent(String contactContent) { this.contactContent = contactContent; return this; } public ContactParam build() { return new ContactParam(this.userName, this.contactName, this.contactEmail, this.contactSubject, this.contactContent); } public String toString() { return "ContactParam.ContactParamBuilder(userName=" + this.userName + ", contactName=" + this.contactName + ", contactEmail=" + this.contactEmail + ", contactSubject=" + this.contactSubject + ", contactContent=" + this.contactContent + ")"; }

  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/contact/ContactParam$ContactParamBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */