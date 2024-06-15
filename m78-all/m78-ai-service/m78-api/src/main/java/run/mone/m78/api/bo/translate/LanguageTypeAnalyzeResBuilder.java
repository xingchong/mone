  package run.mone.m78.api.bo.translate;






  public class LanguageTypeAnalyzeResBuilder
  {
    private String type;

    public LanguageTypeAnalyzeResBuilder type(String type) {
/* 13 */     this.type = type; return this; } public LanguageTypeAnalyzeRes build() { return new LanguageTypeAnalyzeRes(this.type); } public String toString() { return "LanguageTypeAnalyzeRes.LanguageTypeAnalyzeResBuilder(type=" + this.type + ")"; }

  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/translate/LanguageTypeAnalyzeRes$LanguageTypeAnalyzeResBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */