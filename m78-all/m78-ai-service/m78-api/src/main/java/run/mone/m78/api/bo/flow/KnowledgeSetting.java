  package run.mone.m78.api.bo.flow;

  import java.io.Serializable;

  public class KnowledgeSetting implements Serializable {
    private String knowledgeBaseId;
    private String maxRecall;
    private String minMatch;
    private String query;

/* 11 */   public void setKnowledgeBaseId(String knowledgeBaseId) { this.knowledgeBaseId = knowledgeBaseId; } public void setMaxRecall(String maxRecall) { this.maxRecall = maxRecall; } public void setMinMatch(String minMatch) { this.minMatch = minMatch; } public void setQuery(String query) { this.query = query; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof KnowledgeSetting)) return false;  KnowledgeSetting other = (KnowledgeSetting)o; if (!other.canEqual(this)) return false;  Object this$knowledgeBaseId = getKnowledgeBaseId(), other$knowledgeBaseId = other.getKnowledgeBaseId(); if ((this$knowledgeBaseId == null) ? (other$knowledgeBaseId != null) : !this$knowledgeBaseId.equals(other$knowledgeBaseId)) return false;  Object this$maxRecall = getMaxRecall(), other$maxRecall = other.getMaxRecall(); if ((this$maxRecall == null) ? (other$maxRecall != null) : !this$maxRecall.equals(other$maxRecall)) return false;  Object this$minMatch = getMinMatch(), other$minMatch = other.getMinMatch(); if ((this$minMatch == null) ? (other$minMatch != null) : !this$minMatch.equals(other$minMatch)) return false;  Object this$query = getQuery(), other$query = other.getQuery(); return !((this$query == null) ? (other$query != null) : !this$query.equals(other$query)); } protected boolean canEqual(Object other) { return other instanceof KnowledgeSetting; } public int hashCode() {  int  result = 1; Object $knowledgeBaseId = getKnowledgeBaseId(); result = result * 59 + (($knowledgeBaseId == null) ? 43 : $knowledgeBaseId.hashCode()); Object $maxRecall = getMaxRecall(); result = result * 59 + (($maxRecall == null) ? 43 : $maxRecall.hashCode()); Object $minMatch = getMinMatch(); result = result * 59 + (($minMatch == null) ? 43 : $minMatch.hashCode()); Object $query = getQuery(); return result * 59 + (($query == null) ? 43 : $query.hashCode()); } public String toString() { return "KnowledgeSetting(knowledgeBaseId=" + getKnowledgeBaseId() + ", maxRecall=" + getMaxRecall() + ", minMatch=" + getMinMatch() + ", query=" + getQuery() + ")"; }


/* 14 */   public String getKnowledgeBaseId() { return this.knowledgeBaseId; }
/* 15 */   public String getMaxRecall() { return this.maxRecall; }
/* 16 */   public String getMinMatch() { return this.minMatch; } public String getQuery() {
/* 17 */     return this.query;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/flow/KnowledgeSetting.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */