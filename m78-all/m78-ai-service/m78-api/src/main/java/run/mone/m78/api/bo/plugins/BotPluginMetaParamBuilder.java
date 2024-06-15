  package run.mone.m78.api.bo.plugins;

  import java.util.List;

















































































  public class BotPluginMetaParamBuilder
  {
    private String id;
    private String name;
    private String valueType;
    private String originalType;
    private String desc;
    private List<BotPluginDTO.BotPluginMetaParam> children;
    private Boolean required;

    public BotPluginMetaParamBuilder id(String id) {
/* 96 */     this.id = id; return this; } public BotPluginMetaParamBuilder name(String name) { this.name = name; return this; } public BotPluginMetaParamBuilder valueType(String valueType) { this.valueType = valueType; return this; } public BotPluginMetaParamBuilder originalType(String originalType) { this.originalType = originalType; return this; } public BotPluginMetaParamBuilder desc(String desc) { this.desc = desc; return this; } public BotPluginMetaParamBuilder children(List<BotPluginDTO.BotPluginMetaParam> children) { this.children = children; return this; } public BotPluginMetaParamBuilder required(Boolean required) { this.required = required; return this; } public BotPluginDTO.BotPluginMetaParam build() { return new BotPluginDTO.BotPluginMetaParam(this.id, this.name, this.valueType, this.originalType, this.desc, this.children, this.required); } public String toString() { return "BotPluginDTO.BotPluginMetaParam.BotPluginMetaParamBuilder(id=" + this.id + ", name=" + this.name + ", valueType=" + this.valueType + ", originalType=" + this.originalType + ", desc=" + this.desc + ", children=" + this.children + ", required=" + this.required + ")"; }

  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/plugins/BotPluginDTO$BotPluginMetaParam$BotPluginMetaParamBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */