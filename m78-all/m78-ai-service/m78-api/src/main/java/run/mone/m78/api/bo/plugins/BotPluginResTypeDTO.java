  package run.mone.m78.api.bo.plugins;



  public class BotPluginResTypeDTO
  {
    private int code;
    private String name;

    public BotPluginResTypeDTO() {}

    public BotPluginResTypeDTO(int code, String name) {
/* 13 */     this.code = code; this.name = name;
/* 14 */   } public void setCode(int code) { this.code = code; } public void setName(String name) { this.name = name; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof BotPluginResTypeDTO)) return false;  BotPluginResTypeDTO other = (BotPluginResTypeDTO)o; if (!other.canEqual(this)) return false;  if (getCode() != other.getCode()) return false;  Object this$name = getName(), other$name = other.getName(); return !((this$name == null) ? (other$name != null) : !this$name.equals(other$name)); } protected boolean canEqual(Object other) { return other instanceof BotPluginResTypeDTO; } public int hashCode() {  int  result = 1; result = result * 59 + getCode(); Object $name = getName(); return result * 59 + (($name == null) ? 43 : $name.hashCode()); } public String toString() { return "BotPluginResTypeDTO(code=" + getCode() + ", name=" + getName() + ")"; }
/* 15 */   public static BotPluginResTypeDTOBuilder builder() { return new BotPluginResTypeDTOBuilder(); } public static class BotPluginResTypeDTOBuilder { private int code; public BotPluginResTypeDTOBuilder code(int code) { this.code = code; return this; } private String name; public BotPluginResTypeDTOBuilder name(String name) { this.name = name; return this; } public BotPluginResTypeDTO build() { return new BotPluginResTypeDTO(this.code, this.name); } public String toString() { return "BotPluginResTypeDTO.BotPluginResTypeDTOBuilder(code=" + this.code + ", name=" + this.name + ")"; }
       }
    public int getCode() {
/* 18 */     return this.code;
    } public String getName() {
/* 20 */     return this.name;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/plugins/BotPluginResTypeDTO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */