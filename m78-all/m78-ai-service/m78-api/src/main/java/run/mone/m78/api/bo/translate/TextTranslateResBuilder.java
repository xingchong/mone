  package run.mone.m78.api.bo.translate;


  public class TextTranslateResBuilder
  {
    private String uuid;
    private String fromText;
    private String toText;

    public TextTranslateResBuilder uuid(String uuid) {
/* 11 */     this.uuid = uuid; return this; } public TextTranslateResBuilder fromText(String fromText) { this.fromText = fromText; return this; } public TextTranslateResBuilder toText(String toText) { this.toText = toText; return this; } public TextTranslateRes build() { return new TextTranslateRes(this.uuid, this.fromText, this.toText); } public String toString() { return "TextTranslateRes.TextTranslateResBuilder(uuid=" + this.uuid + ", fromText=" + this.fromText + ", toText=" + this.toText + ")"; }

  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/translate/TextTranslateRes$TextTranslateResBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */