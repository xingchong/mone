package run.mone.m78.api.bo.flow;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OutputDataDetailBuilder {
    private String name;
    private String value;
    private String valueType;
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/flow/EndFlowRes$OutputDataDetail$OutputDataDetailBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */