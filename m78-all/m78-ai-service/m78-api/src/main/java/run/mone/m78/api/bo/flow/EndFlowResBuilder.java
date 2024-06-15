package run.mone.m78.api.bo.flow;

import java.util.List;


public class EndFlowResBuilder {
    private String answerContent;
    private List<EndFlowRes.OutputDataDetail> outputDataDetails;

    public EndFlowResBuilder answerContent(String answerContent) {
        /* 16 */
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


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/flow/EndFlowRes$EndFlowResBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */