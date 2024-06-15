  package run.mone.m78.api.bo.code;

  import java.util.List;































  public class CodeContentDTOBuilder
  {
    private String name;
    private String language;
    private List<CodeDTO.CodeParamDTO> params;
    private String code;
    private List<CodeDTO.CodeParamDTO> outs;

    public CodeContentDTOBuilder name(String name) {
/* 44 */     this.name = name; return this; } public CodeContentDTOBuilder language(String language) { this.language = language; return this; } public CodeContentDTOBuilder params(List<CodeDTO.CodeParamDTO> params) { this.params = params; return this; } public CodeContentDTOBuilder code(String code) { this.code = code; return this; } public CodeContentDTOBuilder outs(List<CodeDTO.CodeParamDTO> outs) { this.outs = outs; return this; } public CodeDTO.CodeContentDTO build() { return new CodeDTO.CodeContentDTO(this.name, this.language, this.params, this.code, this.outs); } public String toString() { return "CodeDTO.CodeContentDTO.CodeContentDTOBuilder(name=" + this.name + ", language=" + this.language + ", params=" + this.params + ", code=" + this.code + ", outs=" + this.outs + ")"; }

  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/code/CodeDTO$CodeContentDTO$CodeContentDTOBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */