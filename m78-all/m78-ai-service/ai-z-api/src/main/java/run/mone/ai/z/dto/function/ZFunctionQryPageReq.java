  package run.mone.ai.z.dto.function;

  import java.io.Serializable;
  import run.mone.ai.z.dto.ZPageReq;

  public class ZFunctionQryPageReq
    extends ZPageReq
    implements Serializable {
    private String name;

    public void setName(String name) {
/* 12 */     this.name = name; } public void setNameFuzzyMatch(Boolean nameFuzzyMatch) { this.nameFuzzyMatch = nameFuzzyMatch; } public void setType(Integer type) { this.type = type; } public void setAvailable(Boolean available) { this.available = available; } public void setIsRegexMatch(Boolean isRegexMatch) { this.isRegexMatch = isRegexMatch; } public void setIsCaseSensitive(Boolean isCaseSensitive) { this.isCaseSensitive = isCaseSensitive; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof ZFunctionQryPageReq)) return false;  ZFunctionQryPageReq other = (ZFunctionQryPageReq)o; if (!other.canEqual(this)) return false;  Object this$nameFuzzyMatch = getNameFuzzyMatch(), other$nameFuzzyMatch = other.getNameFuzzyMatch(); if ((this$nameFuzzyMatch == null) ? (other$nameFuzzyMatch != null) : !this$nameFuzzyMatch.equals(other$nameFuzzyMatch)) return false;  Object this$type = getType(), other$type = other.getType(); if ((this$type == null) ? (other$type != null) : !this$type.equals(other$type)) return false;  Object this$available = getAvailable(), other$available = other.getAvailable(); if ((this$available == null) ? (other$available != null) : !this$available.equals(other$available)) return false;  Object this$isRegexMatch = getIsRegexMatch(), other$isRegexMatch = other.getIsRegexMatch(); if ((this$isRegexMatch == null) ? (other$isRegexMatch != null) : !this$isRegexMatch.equals(other$isRegexMatch)) return false;  Object this$isCaseSensitive = getIsCaseSensitive(), other$isCaseSensitive = other.getIsCaseSensitive(); if ((this$isCaseSensitive == null) ? (other$isCaseSensitive != null) : !this$isCaseSensitive.equals(other$isCaseSensitive)) return false;  Object this$name = getName(), other$name = other.getName(); return !((this$name == null) ? (other$name != null) : !this$name.equals(other$name)); } protected boolean canEqual(Object other) { return other instanceof ZFunctionQryPageReq; } public int hashCode() {  int  result = 1; Object $nameFuzzyMatch = getNameFuzzyMatch(); result = result * 59 + (($nameFuzzyMatch == null) ? 43 : $nameFuzzyMatch.hashCode()); Object $type = getType(); result = result * 59 + (($type == null) ? 43 : $type.hashCode()); Object $available = getAvailable(); result = result * 59 + (($available == null) ? 43 : $available.hashCode()); Object $isRegexMatch = getIsRegexMatch(); result = result * 59 + (($isRegexMatch == null) ? 43 : $isRegexMatch.hashCode()); Object $isCaseSensitive = getIsCaseSensitive(); result = result * 59 + (($isCaseSensitive == null) ? 43 : $isCaseSensitive.hashCode()); Object $name = getName(); return result * 59 + (($name == null) ? 43 : $name.hashCode()); } public String toString() { return "ZFunctionQryPageReq(name=" + getName() + ", nameFuzzyMatch=" + getNameFuzzyMatch() + ", type=" + getType() + ", available=" + getAvailable() + ", isRegexMatch=" + getIsRegexMatch() + ", isCaseSensitive=" + getIsCaseSensitive() + ")"; }
     public String getName() {
/* 14 */     return this.name;
/* 15 */   } private Integer type; private Boolean available; private Boolean nameFuzzyMatch = Boolean.valueOf(true); private Boolean isRegexMatch; private Boolean isCaseSensitive; public Boolean getNameFuzzyMatch() { return this.nameFuzzyMatch; }
/* 16 */   public Integer getType() { return this.type; }
/* 17 */   public Boolean getAvailable() { return this.available; }
/* 18 */   public Boolean getIsRegexMatch() { return this.isRegexMatch; } public Boolean getIsCaseSensitive() {
/* 19 */     return this.isCaseSensitive;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/function/ZFunctionQryPageReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */