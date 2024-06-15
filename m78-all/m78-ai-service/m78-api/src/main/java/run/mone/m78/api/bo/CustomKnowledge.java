  package run.mone.m78.api.bo;


  public class CustomKnowledge
  {
    private String customKnowledgeText;

    public String toString() {
/*  9 */     return "CustomKnowledge(customKnowledgeText=" + getCustomKnowledgeText() + ")"; } public int hashCode() {  int  result = 1; Object $customKnowledgeText = getCustomKnowledgeText(); return result * 59 + (($customKnowledgeText == null) ? 43 : $customKnowledgeText.hashCode()); } protected boolean canEqual(Object other) { return other instanceof CustomKnowledge; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof CustomKnowledge)) return false;  CustomKnowledge other = (CustomKnowledge)o; if (!other.canEqual(this)) return false;  Object this$customKnowledgeText = getCustomKnowledgeText(), other$customKnowledgeText = other.getCustomKnowledgeText(); return !((this$customKnowledgeText == null) ? (other$customKnowledgeText != null) : !this$customKnowledgeText.equals(other$customKnowledgeText)); } public void setCustomKnowledgeText(String customKnowledgeText) { this.customKnowledgeText = customKnowledgeText; }


    public String getCustomKnowledgeText() {
/* 13 */     return this.customKnowledgeText;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/CustomKnowledge.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */