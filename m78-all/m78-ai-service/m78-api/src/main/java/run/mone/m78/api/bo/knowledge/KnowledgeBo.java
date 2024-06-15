  package run.mone.m78.api.bo.knowledge;
  
  import java.io.Serializable;
  import java.util.Date;
  
  public class KnowledgeBo implements Serializable {
    private Long knowledgeBaseId;
    private String knowledgeName;
    private Date gmtCreate;
    private Date gmtModified;
    private String creator;
    private String remark;
    private String avatarUrl;
    
    public void setKnowledgeBaseId(Long knowledgeBaseId) {
/* 16 */     this.knowledgeBaseId = knowledgeBaseId; } public void setKnowledgeName(String knowledgeName) { this.knowledgeName = knowledgeName; } public void setGmtCreate(Date gmtCreate) { this.gmtCreate = gmtCreate; } public void setGmtModified(Date gmtModified) { this.gmtModified = gmtModified; } public void setCreator(String creator) { this.creator = creator; } public void setRemark(String remark) { this.remark = remark; } public void setAvatarUrl(String avatarUrl) { this.avatarUrl = avatarUrl; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof KnowledgeBo)) return false;  KnowledgeBo other = (KnowledgeBo)o; if (!other.canEqual(this)) return false;  Object this$knowledgeBaseId = getKnowledgeBaseId(), other$knowledgeBaseId = other.getKnowledgeBaseId(); if ((this$knowledgeBaseId == null) ? (other$knowledgeBaseId != null) : !this$knowledgeBaseId.equals(other$knowledgeBaseId)) return false;  Object this$knowledgeName = getKnowledgeName(), other$knowledgeName = other.getKnowledgeName(); if ((this$knowledgeName == null) ? (other$knowledgeName != null) : !this$knowledgeName.equals(other$knowledgeName)) return false;  Object this$gmtCreate = getGmtCreate(), other$gmtCreate = other.getGmtCreate(); if ((this$gmtCreate == null) ? (other$gmtCreate != null) : !this$gmtCreate.equals(other$gmtCreate)) return false;  Object this$gmtModified = getGmtModified(), other$gmtModified = other.getGmtModified(); if ((this$gmtModified == null) ? (other$gmtModified != null) : !this$gmtModified.equals(other$gmtModified)) return false;  Object this$creator = getCreator(), other$creator = other.getCreator(); if ((this$creator == null) ? (other$creator != null) : !this$creator.equals(other$creator)) return false;  Object this$remark = getRemark(), other$remark = other.getRemark(); if ((this$remark == null) ? (other$remark != null) : !this$remark.equals(other$remark)) return false;  Object this$avatarUrl = getAvatarUrl(), other$avatarUrl = other.getAvatarUrl(); return !((this$avatarUrl == null) ? (other$avatarUrl != null) : !this$avatarUrl.equals(other$avatarUrl)); } protected boolean canEqual(Object other) { return other instanceof KnowledgeBo; } public int hashCode() {  int  result = 1; Object $knowledgeBaseId = getKnowledgeBaseId(); result = result * 59 + (($knowledgeBaseId == null) ? 43 : $knowledgeBaseId.hashCode()); Object $knowledgeName = getKnowledgeName(); result = result * 59 + (($knowledgeName == null) ? 43 : $knowledgeName.hashCode()); Object $gmtCreate = getGmtCreate(); result = result * 59 + (($gmtCreate == null) ? 43 : $gmtCreate.hashCode()); Object $gmtModified = getGmtModified(); result = result * 59 + (($gmtModified == null) ? 43 : $gmtModified.hashCode()); Object $creator = getCreator(); result = result * 59 + (($creator == null) ? 43 : $creator.hashCode()); Object $remark = getRemark(); result = result * 59 + (($remark == null) ? 43 : $remark.hashCode()); Object $avatarUrl = getAvatarUrl(); return result * 59 + (($avatarUrl == null) ? 43 : $avatarUrl.hashCode()); } public String toString() { return "KnowledgeBo(knowledgeBaseId=" + getKnowledgeBaseId() + ", knowledgeName=" + getKnowledgeName() + ", gmtCreate=" + getGmtCreate() + ", gmtModified=" + getGmtModified() + ", creator=" + getCreator() + ", remark=" + getRemark() + ", avatarUrl=" + getAvatarUrl() + ")"; } public KnowledgeBo(Long knowledgeBaseId, String knowledgeName, Date gmtCreate, Date gmtModified, String creator, String remark, String avatarUrl) {
/* 17 */     this.knowledgeBaseId = knowledgeBaseId; this.knowledgeName = knowledgeName; this.gmtCreate = gmtCreate; this.gmtModified = gmtModified; this.creator = creator; this.remark = remark; this.avatarUrl = avatarUrl;
    } public KnowledgeBo() {}
/* 19 */   public static KnowledgeBoBuilder builder() { return new KnowledgeBoBuilder(); } public static class KnowledgeBoBuilder { private Long knowledgeBaseId; private String knowledgeName; private Date gmtCreate; public KnowledgeBoBuilder knowledgeBaseId(Long knowledgeBaseId) { this.knowledgeBaseId = knowledgeBaseId; return this; } private Date gmtModified; private String creator; private String remark; private String avatarUrl; public KnowledgeBoBuilder knowledgeName(String knowledgeName) { this.knowledgeName = knowledgeName; return this; } public KnowledgeBoBuilder gmtCreate(Date gmtCreate) { this.gmtCreate = gmtCreate; return this; } public KnowledgeBoBuilder gmtModified(Date gmtModified) { this.gmtModified = gmtModified; return this; } public KnowledgeBoBuilder creator(String creator) { this.creator = creator; return this; } public KnowledgeBoBuilder remark(String remark) { this.remark = remark; return this; } public KnowledgeBoBuilder avatarUrl(String avatarUrl) { this.avatarUrl = avatarUrl; return this; } public KnowledgeBo build() { return new KnowledgeBo(this.knowledgeBaseId, this.knowledgeName, this.gmtCreate, this.gmtModified, this.creator, this.remark, this.avatarUrl); } public String toString() { return "KnowledgeBo.KnowledgeBoBuilder(knowledgeBaseId=" + this.knowledgeBaseId + ", knowledgeName=" + this.knowledgeName + ", gmtCreate=" + this.gmtCreate + ", gmtModified=" + this.gmtModified + ", creator=" + this.creator + ", remark=" + this.remark + ", avatarUrl=" + this.avatarUrl + ")"; }
       }
    
/* 22 */   public Long getKnowledgeBaseId() { return this.knowledgeBaseId; }
/* 23 */   public String getKnowledgeName() { return this.knowledgeName; }
/* 24 */   public Date getGmtCreate() { return this.gmtCreate; }
/* 25 */   public Date getGmtModified() { return this.gmtModified; }
/* 26 */   public String getCreator() { return this.creator; }
/* 27 */   public String getRemark() { return this.remark; } public String getAvatarUrl() {
/* 28 */     return this.avatarUrl;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/knowledge/KnowledgeBo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */