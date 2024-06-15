  package run.mone.m78.api.bo.image;
  
  
  
  
  
  
  
  
  
  
  
  
  
  public class BotImageResult
  {
    private String url;
    private String base64;
    
    public void setUrl(String url) {
/* 21 */     this.url = url; } public void setBase64(String base64) { this.base64 = base64; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof BotImageResult)) return false;  BotImageResult other = (BotImageResult)o; if (!other.canEqual(this)) return false;  Object this$url = getUrl(), other$url = other.getUrl(); if ((this$url == null) ? (other$url != null) : !this$url.equals(other$url)) return false;  Object this$base64 = getBase64(), other$base64 = other.getBase64(); return !((this$base64 == null) ? (other$base64 != null) : !this$base64.equals(other$base64)); } protected boolean canEqual(Object other) { return other instanceof BotImageResult; } public int hashCode() {  int  result = 1; Object $url = getUrl(); result = result * 59 + (($url == null) ? 43 : $url.hashCode()); Object $base64 = getBase64(); return result * 59 + (($base64 == null) ? 43 : $base64.hashCode()); } public String toString() { return "BotImageResult(url=" + getUrl() + ", base64=" + getBase64() + ")"; }
/* 22 */   BotImageResult(String url, String base64) { this.url = url; this.base64 = base64; } public static BotImageResultBuilder builder() { return new BotImageResultBuilder(); } public static class BotImageResultBuilder { private String url; public BotImageResultBuilder url(String url) { this.url = url; return this; } private String base64; public BotImageResultBuilder base64(String base64) { this.base64 = base64; return this; } public BotImageResult build() { return new BotImageResult(this.url, this.base64); } public String toString() { return "BotImageResult.BotImageResultBuilder(url=" + this.url + ", base64=" + this.base64 + ")"; }
       }
/* 24 */   public String getUrl() { return this.url; } public String getBase64() {
/* 25 */     return this.base64;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/image/BotImageResult.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */