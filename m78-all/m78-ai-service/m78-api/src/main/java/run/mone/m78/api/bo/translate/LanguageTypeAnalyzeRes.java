  package run.mone.m78.api.bo.translate;
  
  
  
  
  
  public class LanguageTypeAnalyzeRes
  {
    private String type;
    
    public void setType(String type) {
/* 12 */     this.type = type; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof LanguageTypeAnalyzeRes)) return false;  LanguageTypeAnalyzeRes other = (LanguageTypeAnalyzeRes)o; if (!other.canEqual(this)) return false;  Object this$type = getType(), other$type = other.getType(); return !((this$type == null) ? (other$type != null) : !this$type.equals(other$type)); } protected boolean canEqual(Object other) { return other instanceof LanguageTypeAnalyzeRes; } public int hashCode() {  int  result = 1; Object $type = getType(); return result * 59 + (($type == null) ? 43 : $type.hashCode()); } public String toString() { return "LanguageTypeAnalyzeRes(type=" + getType() + ")"; }
/* 13 */   LanguageTypeAnalyzeRes(String type) { this.type = type; } public static LanguageTypeAnalyzeResBuilder builder() { return new LanguageTypeAnalyzeResBuilder(); } public static class LanguageTypeAnalyzeResBuilder { public LanguageTypeAnalyzeResBuilder type(String type) { this.type = type; return this; } private String type; public LanguageTypeAnalyzeRes build() { return new LanguageTypeAnalyzeRes(this.type); } public String toString() { return "LanguageTypeAnalyzeRes.LanguageTypeAnalyzeResBuilder(type=" + this.type + ")"; }
       }
    public String getType() {
/* 16 */     return this.type;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/translate/LanguageTypeAnalyzeRes.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */