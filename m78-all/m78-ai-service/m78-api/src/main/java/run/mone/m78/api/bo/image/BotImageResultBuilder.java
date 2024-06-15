  package run.mone.m78.api.bo.image;














  public class BotImageResultBuilder
  {
    private String url;
    private String base64;

    public BotImageResultBuilder url(String url) {
/* 22 */     this.url = url; return this; } public BotImageResultBuilder base64(String base64) { this.base64 = base64; return this; } public BotImageResult build() { return new BotImageResult(this.url, this.base64); } public String toString() { return "BotImageResult.BotImageResultBuilder(url=" + this.url + ", base64=" + this.base64 + ")"; }

  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/image/BotImageResult$BotImageResultBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */