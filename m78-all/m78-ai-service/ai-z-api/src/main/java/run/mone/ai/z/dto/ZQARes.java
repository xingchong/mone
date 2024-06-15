  package run.mone.ai.z.dto;

  import java.io.Serializable;



  public class ZQARes
    implements Serializable
  {
    private Long csId;
    private String question;
    private String answer;

    public void setCsId(Long csId) {
/* 15 */     this.csId = csId; } public void setQuestion(String question) { this.question = question; } public void setAnswer(String answer) { this.answer = answer; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof ZQARes)) return false;  ZQARes other = (ZQARes)o; if (!other.canEqual(this)) return false;  Object this$csId = getCsId(), other$csId = other.getCsId(); if ((this$csId == null) ? (other$csId != null) : !this$csId.equals(other$csId)) return false;  Object this$question = getQuestion(), other$question = other.getQuestion(); if ((this$question == null) ? (other$question != null) : !this$question.equals(other$question)) return false;  Object this$answer = getAnswer(), other$answer = other.getAnswer(); return !((this$answer == null) ? (other$answer != null) : !this$answer.equals(other$answer)); } protected boolean canEqual(Object other) { return other instanceof ZQARes; } public int hashCode() {  int  result = 1; Object $csId = getCsId(); result = result * 59 + (($csId == null) ? 43 : $csId.hashCode()); Object $question = getQuestion(); result = result * 59 + (($question == null) ? 43 : $question.hashCode()); Object $answer = getAnswer(); return result * 59 + (($answer == null) ? 43 : $answer.hashCode()); } public String toString() { return "ZQARes(csId=" + getCsId() + ", question=" + getQuestion() + ", answer=" + getAnswer() + ")"; }
/* 16 */   public static ZQAResBuilder builder() { return new ZQAResBuilder(); } public static class ZQAResBuilder { private Long csId; public ZQAResBuilder csId(Long csId) { this.csId = csId; return this; } private String question; private String answer; public ZQAResBuilder question(String question) { this.question = question; return this; } public ZQAResBuilder answer(String answer) { this.answer = answer; return this; } public ZQARes build() { return new ZQARes(this.csId, this.question, this.answer); } public String toString() { return "ZQARes.ZQAResBuilder(csId=" + this.csId + ", question=" + this.question + ", answer=" + this.answer + ")"; } } public ZQARes(Long csId, String question, String answer) {
/* 17 */     this.csId = csId; this.question = question; this.answer = answer;
    }
    public ZQARes() {}
    public Long getCsId() {
/* 21 */     return this.csId;
    } public String getQuestion() {
/* 23 */     return this.question;
    } public String getAnswer() {
/* 25 */     return this.answer;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/ZQARes.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */