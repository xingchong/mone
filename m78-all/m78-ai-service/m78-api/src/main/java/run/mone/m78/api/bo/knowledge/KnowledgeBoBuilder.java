  package run.mone.m78.api.bo.knowledge;

  import java.util.Date;




  public class KnowledgeBoBuilder
  {
    private Long knowledgeBaseId;
    private String knowledgeName;
    private Date gmtCreate;
    private Date gmtModified;
    private String creator;
    private String remark;
    private String avatarUrl;

    public KnowledgeBoBuilder knowledgeBaseId(Long knowledgeBaseId) {
/* 19 */     this.knowledgeBaseId = knowledgeBaseId; return this; } public KnowledgeBoBuilder knowledgeName(String knowledgeName) { this.knowledgeName = knowledgeName; return this; } public KnowledgeBoBuilder gmtCreate(Date gmtCreate) { this.gmtCreate = gmtCreate; return this; } public KnowledgeBoBuilder gmtModified(Date gmtModified) { this.gmtModified = gmtModified; return this; } public KnowledgeBoBuilder creator(String creator) { this.creator = creator; return this; } public KnowledgeBoBuilder remark(String remark) { this.remark = remark; return this; } public KnowledgeBoBuilder avatarUrl(String avatarUrl) { this.avatarUrl = avatarUrl; return this; } public KnowledgeBo build() { return new KnowledgeBo(this.knowledgeBaseId, this.knowledgeName, this.gmtCreate, this.gmtModified, this.creator, this.remark, this.avatarUrl); } public String toString() { return "KnowledgeBo.KnowledgeBoBuilder(knowledgeBaseId=" + this.knowledgeBaseId + ", knowledgeName=" + this.knowledgeName + ", gmtCreate=" + this.gmtCreate + ", gmtModified=" + this.gmtModified + ", creator=" + this.creator + ", remark=" + this.remark + ", avatarUrl=" + this.avatarUrl + ")"; }

  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/knowledge/KnowledgeBo$KnowledgeBoBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */