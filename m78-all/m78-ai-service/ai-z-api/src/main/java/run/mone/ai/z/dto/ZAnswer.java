package run.mone.ai.z.dto;


import com.xiaomi.mone.http.docs.annotations.HttpApiDocClassDefine;

import java.io.Serializable;

public class ZAnswer implements Serializable {
    @HttpApiDocClassDefine(value = "answer", description = "回答", defaultValue = "")
    private String answer;

    /*  8 */
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @HttpApiDocClassDefine(value = "question", description = "提示词，问题", defaultValue = "")
    private String question;

    public void setQuestion(String question) {
        this.question = question;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ZAnswer)) return false;
        ZAnswer other = (ZAnswer) o;
        if (!other.canEqual(this)) return false;
        Object this$answer = getAnswer(), other$answer = other.getAnswer();
        if ((this$answer == null) ? (other$answer != null) : !this$answer.equals(other$answer)) return false;
        Object this$question = getQuestion(), other$question = other.getQuestion();
        return !((this$question == null) ? (other$question != null) : !this$question.equals(other$question));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ZAnswer;
    }

    public int hashCode() {
        int result = 1;
        Object $answer = getAnswer();
        result = result * 59 + (($answer == null) ? 43 : $answer.hashCode());
        Object $question = getQuestion();
        return result * 59 + (($question == null) ? 43 : $question.hashCode());
    }

    public String toString() {
        return "ZAnswer(answer=" + getAnswer() + ", question=" + getQuestion() + ")";
    }

    public String getAnswer() {
        /* 11 */
        return this.answer;
    }

    public String getQuestion() {
        /* 13 */
        return this.question;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/ZAnswer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */