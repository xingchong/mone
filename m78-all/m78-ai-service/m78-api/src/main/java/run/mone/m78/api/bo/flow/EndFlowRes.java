package run.mone.m78.api.bo.flow;

import java.io.Serializable;
import java.util.List;


public class EndFlowRes implements Serializable {
    private String answerContent;
    private List<OutputDataDetail> outputDataDetails;

    public void setAnswerContent(String answerContent) {
        /* 15 */
        this.answerContent = answerContent;
    }

    public void setOutputDataDetails(List<OutputDataDetail> outputDataDetails) {
        this.outputDataDetails = outputDataDetails;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof EndFlowRes)) return false;
        EndFlowRes other = (EndFlowRes) o;
        if (!other.canEqual(this)) return false;
        Object this$answerContent = getAnswerContent(), other$answerContent = other.getAnswerContent();
        if ((this$answerContent == null) ? (other$answerContent != null) : !this$answerContent.equals(other$answerContent))
            return false;
        Object this$outputDataDetails = (Object) getOutputDataDetails(), other$outputDataDetails = (Object) other.getOutputDataDetails();
        return !((this$outputDataDetails == null) ? (other$outputDataDetails != null) : !this$outputDataDetails.equals(other$outputDataDetails));
    }

    protected boolean canEqual(Object other) {
        return other instanceof EndFlowRes;
    }

    public int hashCode() {
        int result = 1;
        Object $answerContent = getAnswerContent();
        result = result * 59 + (($answerContent == null) ? 43 : $answerContent.hashCode());
        Object $outputDataDetails = (Object) getOutputDataDetails();
        return result * 59 + (($outputDataDetails == null) ? 43 : $outputDataDetails.hashCode());
    }

    public String toString() {
        return "EndFlowRes(answerContent=" + getAnswerContent() + ", outputDataDetails=" + getOutputDataDetails() + ")";
    }

    EndFlowRes(String answerContent, List<OutputDataDetail> outputDataDetails) {
        this.answerContent = answerContent;
        this.outputDataDetails = outputDataDetails;
    }

    public static EndFlowResBuilder builder() {
        return new EndFlowResBuilder();
    }

    public static class EndFlowResBuilder {
        private String answerContent;
        private List<EndFlowRes.OutputDataDetail> outputDataDetails;

        public EndFlowResBuilder answerContent(String answerContent) {
            this.answerContent = answerContent;
            return this;
        }

        public EndFlowResBuilder outputDataDetails(List<EndFlowRes.OutputDataDetail> outputDataDetails) {
            this.outputDataDetails = outputDataDetails;
            return this;
        }

        public EndFlowRes build() {
            return new EndFlowRes(this.answerContent, this.outputDataDetails);
        }

        public String toString() {
            return "EndFlowRes.EndFlowResBuilder(answerContent=" + this.answerContent + ", outputDataDetails=" + this.outputDataDetails + ")";
        }
    }

    public String getAnswerContent() {
        /* 19 */
        return this.answerContent;
    }

    public List<OutputDataDetail> getOutputDataDetails() {
        /* 21 */
        return this.outputDataDetails;
    }

    public static class OutputDataDetail {
        private String name;
        private String value;
        private String valueType;

        /* 23 */
        public void setName(String name) {
            this.name = name;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public void setValueType(String valueType) {
            this.valueType = valueType;
        }

        public boolean equals(Object o) {
            if (o == this) return true;
            if (!(o instanceof OutputDataDetail)) return false;
            OutputDataDetail other = (OutputDataDetail) o;
            if (!other.canEqual(this)) return false;
            Object this$name = getName(), other$name = other.getName();
            if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;
            Object this$value = getValue(), other$value = other.getValue();
            if ((this$value == null) ? (other$value != null) : !this$value.equals(other$value)) return false;
            Object this$valueType = getValueType(), other$valueType = other.getValueType();
            return !((this$valueType == null) ? (other$valueType != null) : !this$valueType.equals(other$valueType));
        }

        protected boolean canEqual(Object other) {
            return other instanceof OutputDataDetail;
        }

        public int hashCode() {
            int result = 1;
            Object $name = getName();
            result = result * 59 + (($name == null) ? 43 : $name.hashCode());
            Object $value = getValue();
            result = result * 59 + (($value == null) ? 43 : $value.hashCode());
            Object $valueType = getValueType();
            return result * 59 + (($valueType == null) ? 43 : $valueType.hashCode());
        }

        public String toString() {
            return "EndFlowRes.OutputDataDetail(name=" + getName() + ", value=" + getValue() + ", valueType=" + getValueType() + ")";
        }

        /* 24 */
        public static OutputDataDetailBuilder builder() {
            return new OutputDataDetailBuilder();
        }

        public static class OutputDataDetailBuilder {
            private String name;

            public OutputDataDetailBuilder name(String name) {
                this.name = name;
                return this;
            }

            private String value;
            private String valueType;

            public OutputDataDetailBuilder value(String value) {
                this.value = value;
                return this;
            }

            public OutputDataDetailBuilder valueType(String valueType) {
                this.valueType = valueType;
                return this;
            }

            public EndFlowRes.OutputDataDetail build() {
                return new EndFlowRes.OutputDataDetail(this.name, this.value, this.valueType);
            }

            public String toString() {
                return "EndFlowRes.OutputDataDetail.OutputDataDetailBuilder(name=" + this.name + ", value=" + this.value + ", valueType=" + this.valueType + ")";
            }
        }

        public OutputDataDetail() {
        }

        public OutputDataDetail(String name, String value, String valueType) {
            /* 26 */
            this.name = name;
            this.value = value;
            this.valueType = valueType;
        }

        /* 28 */
        public String getName() {
            return this.name;
        }

        public String getValue() {
            /* 29 */
            return this.value;
        }

        public String getValueType() {
            /* 31 */
            return this.valueType;
        }
    }

}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/flow/EndFlowRes.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */