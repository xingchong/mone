  package run.mone.m78.api.bo.code;
























































  public class CodeParamDTOBuilder
  {
    private String name;
    private String type;

    public CodeParamDTOBuilder name(String name) {
/* 64 */     this.name = name; return this; } public CodeParamDTOBuilder type(String type) { this.type = type; return this; } public CodeDTO.CodeParamDTO build() { return new CodeDTO.CodeParamDTO(this.name, this.type); } public String toString() { return "CodeDTO.CodeParamDTO.CodeParamDTOBuilder(name=" + this.name + ", type=" + this.type + ")"; }

  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/code/CodeDTO$CodeParamDTO$CodeParamDTOBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */