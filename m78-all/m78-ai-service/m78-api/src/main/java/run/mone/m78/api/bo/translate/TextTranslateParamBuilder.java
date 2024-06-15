  package run.mone.m78.api.bo.translate;
  
  import java.util.List;
  
  
  public class TextTranslateParamBuilder
  {
    private String uuid;
    private int type;
    private List<String> requirements;
    private String fromLanguage;
    private String toLanguage;
    private String fromText;
    private String user;
    
    public TextTranslateParamBuilder uuid(String uuid) {
/* 17 */     this.uuid = uuid; return this; } public TextTranslateParamBuilder type(int type) { this.type = type; return this; } public TextTranslateParamBuilder requirements(List<String> requirements) { this.requirements = requirements; return this; } public TextTranslateParamBuilder fromLanguage(String fromLanguage) { this.fromLanguage = fromLanguage; return this; } public TextTranslateParamBuilder toLanguage(String toLanguage) { this.toLanguage = toLanguage; return this; } public TextTranslateParamBuilder fromText(String fromText) { this.fromText = fromText; return this; } public TextTranslateParamBuilder user(String user) { this.user = user; return this; } public TextTranslateParam build() { return new TextTranslateParam(this.uuid, this.type, this.requirements, this.fromLanguage, this.toLanguage, this.fromText, this.user); } public String toString() { return "TextTranslateParam.TextTranslateParamBuilder(uuid=" + this.uuid + ", type=" + this.type + ", requirements=" + this.requirements + ", fromLanguage=" + this.fromLanguage + ", toLanguage=" + this.toLanguage + ", fromText=" + this.fromText + ", user=" + this.user + ")"; }
  
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/translate/TextTranslateParam$TextTranslateParamBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */