  package run.mone.m78.api.bo.plugins;
  
  
  
  
  
  
  
  public class BotPluginResTypeDTOBuilder
  {
    private int code;
    private String name;
    
    public BotPluginResTypeDTOBuilder code(int code) {
/* 15 */     this.code = code; return this; } public BotPluginResTypeDTOBuilder name(String name) { this.name = name; return this; } public BotPluginResTypeDTO build() { return new BotPluginResTypeDTO(this.code, this.name); } public String toString() { return "BotPluginResTypeDTO.BotPluginResTypeDTOBuilder(code=" + this.code + ", name=" + this.name + ")"; }
  
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/plugins/BotPluginResTypeDTO$BotPluginResTypeDTOBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */