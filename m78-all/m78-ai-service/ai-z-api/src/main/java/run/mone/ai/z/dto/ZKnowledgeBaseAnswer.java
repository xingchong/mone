package run.mone.ai.z.dto;

import java.io.Serializable;
import java.util.List;


public class ZKnowledgeBaseAnswer
        implements Serializable {
    private String answer;
    private List<SummaryAnnotation> annotation;

    public void setAnswer(String answer) {
        /* 28 */
        this.answer = answer;
    }

    public void setAnnotation(List<SummaryAnnotation> annotation) {
        this.annotation = annotation;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ZKnowledgeBaseAnswer)) return false;
        ZKnowledgeBaseAnswer other = (ZKnowledgeBaseAnswer) o;
        if (!other.canEqual(this)) return false;
        Object this$answer = getAnswer(), other$answer = other.getAnswer();
        if ((this$answer == null) ? (other$answer != null) : !this$answer.equals(other$answer)) return false;
        Object this$annotation = (Object) getAnnotation(), other$annotation = (Object) other.getAnnotation();
        return !((this$annotation == null) ? (other$annotation != null) : !this$annotation.equals(other$annotation));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ZKnowledgeBaseAnswer;
    }

    public int hashCode() {
                 int result = 1;
        Object $answer = getAnswer();
        result = result * 59 + (($answer == null) ? 43 : $answer.hashCode());
        Object $annotation = (Object) getAnnotation();
        return result * 59 + (($annotation == null) ? 43 : $annotation.hashCode());
    }

    public String toString() {
        return "ZKnowledgeBaseAnswer(answer=" + getAnswer() + ", annotation=" + getAnnotation() + ")";
    }

    public String getAnswer() {
        /* 31 */
        return this.answer;
    }

    public List<SummaryAnnotation> getAnnotation() {
        /* 33 */
        return this.annotation;
    }

    public static class SummaryAnnotation implements Serializable {
        /* 35 */     private String blockAnchor;

        public void setBlockAnchor(String blockAnchor) {
            this.blockAnchor = blockAnchor;
        }

        private String abs;

        public void setAbs(String abs) {
            this.abs = abs;
        }

        public boolean equals(Object o) {
            if (o == this) return true;
            if (!(o instanceof SummaryAnnotation)) return false;
            SummaryAnnotation other = (SummaryAnnotation) o;
            if (!other.canEqual(this)) return false;
            Object this$blockAnchor = getBlockAnchor(), other$blockAnchor = other.getBlockAnchor();
            if ((this$blockAnchor == null) ? (other$blockAnchor != null) : !this$blockAnchor.equals(other$blockAnchor))
                return false;
            Object this$abs = getAbs(), other$abs = other.getAbs();
            return !((this$abs == null) ? (other$abs != null) : !this$abs.equals(other$abs));
        }

        protected boolean canEqual(Object other) {
            return other instanceof SummaryAnnotation;
        }

        public int hashCode() {
            int result = 1;
            Object $blockAnchor = getBlockAnchor();
            result = result * 59 + (($blockAnchor == null) ? 43 : $blockAnchor.hashCode());
            Object $abs = getAbs();
            return result * 59 + (($abs == null) ? 43 : $abs.hashCode());
        }

        public String toString() {
            return "ZKnowledgeBaseAnswer.SummaryAnnotation(blockAnchor=" + getBlockAnchor() + ", abs=" + getAbs() + ")";
        }

        public String getBlockAnchor() {
            /* 37 */
            return this.blockAnchor;
        }

        public String getAbs() {
            /* 39 */
            return this.abs;
        }
    }

    public static ZKnowledgeBaseAnswer empty() {
        /* 43 */
        ZKnowledgeBaseAnswer empty = new ZKnowledgeBaseAnswer();
        /* 44 */
        empty.setAnswer("暂无答案");
        /* 45 */
        return empty;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/ZKnowledgeBaseAnswer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */