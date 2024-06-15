  package run.mone.m78.api.bo.code;
  
  
  
  public class CodeDTOBuilder
  {
    private Long id;
    private CodeDTO.CodeContentDTO code;
    private String name;
    private String desc;
    private Integer type;
    private String model;
    private String creator;
    private Long ctime;
    private Long utime;
    
    public CodeDTOBuilder id(Long id) {
/* 18 */     this.id = id; return this; } public CodeDTOBuilder code(CodeDTO.CodeContentDTO code) { this.code = code; return this; } public CodeDTOBuilder name(String name) { this.name = name; return this; } public CodeDTOBuilder desc(String desc) { this.desc = desc; return this; } public CodeDTOBuilder type(Integer type) { this.type = type; return this; } public CodeDTOBuilder model(String model) { this.model = model; return this; } public CodeDTOBuilder creator(String creator) { this.creator = creator; return this; } public CodeDTOBuilder ctime(Long ctime) { this.ctime = ctime; return this; } public CodeDTOBuilder utime(Long utime) { this.utime = utime; return this; } public CodeDTO build() { return new CodeDTO(this.id, this.code, this.name, this.desc, this.type, this.model, this.creator, this.ctime, this.utime); } public String toString() { return "CodeDTO.CodeDTOBuilder(id=" + this.id + ", code=" + this.code + ", name=" + this.name + ", desc=" + this.desc + ", type=" + this.type + ", model=" + this.model + ", creator=" + this.creator + ", ctime=" + this.ctime + ", utime=" + this.utime + ")"; }
  
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/code/CodeDTO$CodeDTOBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */