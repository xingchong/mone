  package run.mone.m78.api.bo.translate;



  public class TextTranslateChatResBuilder
  {
    private String aiDetail;
    private String toNewText;

    public TextTranslateChatResBuilder aiDetail(String aiDetail) {
/* 11 */     this.aiDetail = aiDetail; return this; } public TextTranslateChatResBuilder toNewText(String toNewText) { this.toNewText = toNewText; return this; } public TextTranslateChatRes build() { return new TextTranslateChatRes(this.aiDetail, this.toNewText); } public String toString() { return "TextTranslateChatRes.TextTranslateChatResBuilder(aiDetail=" + this.aiDetail + ", toNewText=" + this.toNewText + ")"; }

  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/translate/TextTranslateChatRes$TextTranslateChatResBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */