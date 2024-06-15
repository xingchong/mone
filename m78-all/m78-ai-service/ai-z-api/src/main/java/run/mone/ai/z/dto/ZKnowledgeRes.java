  package run.mone.ai.z.dto;
  
  import java.io.Serializable;
  import java.util.Arrays;
  
  
  
  
  
  
  
  
  
  
  public class ZKnowledgeRes
    implements Serializable
  {
    private Long tenantId;
    private Long knowledgeBaseId;
    private Long docId;
    private Long blockId;
    private double distance;
    private double[] vector;
    private String content;
    
    public void setTenantId(Long tenantId) {
/* 27 */     this.tenantId = tenantId; } public void setKnowledgeBaseId(Long knowledgeBaseId) { this.knowledgeBaseId = knowledgeBaseId; } public void setDocId(Long docId) { this.docId = docId; } public void setBlockId(Long blockId) { this.blockId = blockId; } public void setDistance(double distance) { this.distance = distance; } public void setVector(double[] vector) { this.vector = vector; } public void setContent(String content) { this.content = content; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof ZKnowledgeRes)) return false;  ZKnowledgeRes other = (ZKnowledgeRes)o; if (!other.canEqual(this)) return false;  if (Double.compare(getDistance(), other.getDistance()) != 0) return false;  Object this$tenantId = getTenantId(), other$tenantId = other.getTenantId(); if ((this$tenantId == null) ? (other$tenantId != null) : !this$tenantId.equals(other$tenantId)) return false;  Object this$knowledgeBaseId = getKnowledgeBaseId(), other$knowledgeBaseId = other.getKnowledgeBaseId(); if ((this$knowledgeBaseId == null) ? (other$knowledgeBaseId != null) : !this$knowledgeBaseId.equals(other$knowledgeBaseId)) return false;  Object this$docId = getDocId(), other$docId = other.getDocId(); if ((this$docId == null) ? (other$docId != null) : !this$docId.equals(other$docId)) return false;  Object this$blockId = getBlockId(), other$blockId = other.getBlockId(); if ((this$blockId == null) ? (other$blockId != null) : !this$blockId.equals(other$blockId)) return false;  if (!Arrays.equals(getVector(), other.getVector())) return false;  Object this$content = getContent(), other$content = other.getContent(); return !((this$content == null) ? (other$content != null) : !this$content.equals(other$content)); } protected boolean canEqual(Object other) { return other instanceof ZKnowledgeRes; } public int hashCode() {  int  result = 1; long $distance = Double.doubleToLongBits(getDistance()); result = result * 59 + (int)($distance >>> 32L ^ $distance); Object $tenantId = getTenantId(); result = result * 59 + (($tenantId == null) ? 43 : $tenantId.hashCode()); Object $knowledgeBaseId = getKnowledgeBaseId(); result = result * 59 + (($knowledgeBaseId == null) ? 43 : $knowledgeBaseId.hashCode()); Object $docId = getDocId(); result = result * 59 + (($docId == null) ? 43 : $docId.hashCode()); Object $blockId = getBlockId(); result = result * 59 + (($blockId == null) ? 43 : $blockId.hashCode()); result = result * 59 + Arrays.hashCode(getVector()); Object $content = getContent(); return result * 59 + (($content == null) ? 43 : $content.hashCode()); } public String toString() { return "ZKnowledgeRes(tenantId=" + getTenantId() + ", knowledgeBaseId=" + getKnowledgeBaseId() + ", docId=" + getDocId() + ", blockId=" + getBlockId() + ", distance=" + getDistance() + ", vector=" + Arrays.toString(getVector()) + ", content=" + getContent() + ")"; }
    
    public Long getTenantId() {
/* 30 */     return this.tenantId;
    } public Long getKnowledgeBaseId() {
/* 32 */     return this.knowledgeBaseId;
    } public Long getDocId() {
/* 34 */     return this.docId;
    } public Long getBlockId() {
/* 36 */     return this.blockId;
    } public double getDistance() {
/* 38 */     return this.distance;
    }
    public double[] getVector() {
/* 41 */     return this.vector;
    } public String getContent() {
/* 43 */     return this.content;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/ZKnowledgeRes.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */