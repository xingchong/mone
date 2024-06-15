  package run.mone.m78.api.bo.code;

  import java.io.Serializable;
















































  public class CodeParamDTO
    implements Serializable
  {
    private static final long serialVersionUID = -7646951138269813280L;
    private String name;
    private String type;

    public CodeParamDTO() {}

    public CodeParamDTO(String name, String type) {
/* 62 */     this.name = name; this.type = type;
/* 63 */   } public void setName(String name) { this.name = name; } public void setType(String type) { this.type = type; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof CodeParamDTO)) return false;  CodeParamDTO other = (CodeParamDTO)o; if (!other.canEqual(this)) return false;  Object this$name = getName(), other$name = other.getName(); if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;  Object this$type = getType(), other$type = other.getType(); return !((this$type == null) ? (other$type != null) : !this$type.equals(other$type)); } protected boolean canEqual(Object other) { return other instanceof CodeParamDTO; } public int hashCode() {  int  result = 1; Object $name = getName(); result = result * 59 + (($name == null) ? 43 : $name.hashCode()); Object $type = getType(); return result * 59 + (($type == null) ? 43 : $type.hashCode()); } public String toString() { return "CodeDTO.CodeParamDTO(name=" + getName() + ", type=" + getType() + ")"; }
/* 64 */   public static CodeParamDTOBuilder builder() { return new CodeParamDTOBuilder(); } public static class CodeParamDTOBuilder { private String name; public CodeParamDTOBuilder name(String name) { this.name = name; return this; } private String type; public CodeParamDTOBuilder type(String type) { this.type = type; return this; } public CodeDTO.CodeParamDTO build() { return new CodeDTO.CodeParamDTO(this.name, this.type); } public String toString() { return "CodeDTO.CodeParamDTO.CodeParamDTOBuilder(name=" + this.name + ", type=" + this.type + ")"; }
       }


    public String getName() {
/* 69 */     return this.name;
    } public String getType() {
/* 71 */     return this.type;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/code/CodeDTO$CodeParamDTO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */