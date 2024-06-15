  package run.mone.m78.api.bo.flow;
  
  import java.util.List;
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  public class EndFlowOutputBuilder
  {
    private String answerContent;
    private List<SyncFlowStatus.EndFlowOutputDetail> endFlowOutputDetails;
    
    public EndFlowOutputBuilder answerContent(String answerContent) {
/* 83 */     this.answerContent = answerContent; return this; } public EndFlowOutputBuilder endFlowOutputDetails(List<SyncFlowStatus.EndFlowOutputDetail> endFlowOutputDetails) { this.endFlowOutputDetails = endFlowOutputDetails; return this; } public SyncFlowStatus.EndFlowOutput build() { return new SyncFlowStatus.EndFlowOutput(this.answerContent, this.endFlowOutputDetails); } public String toString() { return "SyncFlowStatus.EndFlowOutput.EndFlowOutputBuilder(answerContent=" + this.answerContent + ", endFlowOutputDetails=" + this.endFlowOutputDetails + ")"; }
  
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/flow/SyncFlowStatus$EndFlowOutput$EndFlowOutputBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */