  package run.mone.m78.api.bo.translate;

  import java.util.List;


  public class TextTranslateChatParamBuilder
  {
    private List<String> requirements;
    private String fromLanguage;
    private String toLanguage;
    private String fromText;
    private String toText;
    private String chatContent;
    private String user;

    public TextTranslateChatParamBuilder requirements(List<String> requirements) {
/* 17 */     this.requirements = requirements; return this; } public TextTranslateChatParamBuilder fromLanguage(String fromLanguage) { this.fromLanguage = fromLanguage; return this; } public TextTranslateChatParamBuilder toLanguage(String toLanguage) { this.toLanguage = toLanguage; return this; } public TextTranslateChatParamBuilder fromText(String fromText) { this.fromText = fromText; return this; } public TextTranslateChatParamBuilder toText(String toText) { this.toText = toText; return this; } public TextTranslateChatParamBuilder chatContent(String chatContent) { this.chatContent = chatContent; return this; } public TextTranslateChatParamBuilder user(String user) { this.user = user; return this; } public TextTranslateChatParam build() { return new TextTranslateChatParam(this.requirements, this.fromLanguage, this.toLanguage, this.fromText, this.toText, this.chatContent, this.user); } public String toString() { return "TextTranslateChatParam.TextTranslateChatParamBuilder(requirements=" + this.requirements + ", fromLanguage=" + this.fromLanguage + ", toLanguage=" + this.toLanguage + ", fromText=" + this.fromText + ", toText=" + this.toText + ", chatContent=" + this.chatContent + ", user=" + this.user + ")"; }

  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/translate/TextTranslateChatParam$TextTranslateChatParamBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */