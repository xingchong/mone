package run.mone.ai.z.dto;


public class ZQAResBuilder {
    private Long csId;
    private String question;
    private String answer;

    public ZQAResBuilder csId(Long csId) {
        /* 16 */
        this.csId = csId;
        return this;
    }

    public ZQAResBuilder question(String question) {
        this.question = question;
        return this;
    }

    public ZQAResBuilder answer(String answer) {
        this.answer = answer;
        return this;
    }

    public ZQARes build() {
        return new ZQARes(this.csId, this.question, this.answer);
    }

    public String toString() {
        return "ZQARes.ZQAResBuilder(csId=" + this.csId + ", question=" + this.question + ", answer=" + this.answer + ")";
    }

}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/ZQARes$ZQAResBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */