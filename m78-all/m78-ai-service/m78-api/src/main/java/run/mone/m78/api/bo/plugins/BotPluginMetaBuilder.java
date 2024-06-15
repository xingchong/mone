  package run.mone.m78.api.bo.plugins;
  
  import java.util.List;
  import java.util.Map;
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  public class BotPluginMetaBuilder
  {
    private String desc;
    private Map<String, String> http_headers;
    private String http_method;
    private List<BotPluginDTO.BotPluginMetaParam> input;
    private List<BotPluginDTO.BotPluginMetaParam> output;
    private String display;
    private int resContentType;
    
    public BotPluginMetaBuilder desc(String desc) {
/* 76 */     this.desc = desc; return this; } public BotPluginMetaBuilder http_headers(Map<String, String> http_headers) { this.http_headers = http_headers; return this; } public BotPluginMetaBuilder http_method(String http_method) { this.http_method = http_method; return this; } public BotPluginMetaBuilder input(List<BotPluginDTO.BotPluginMetaParam> input) { this.input = input; return this; } public BotPluginMetaBuilder output(List<BotPluginDTO.BotPluginMetaParam> output) { this.output = output; return this; } public BotPluginMetaBuilder display(String display) { this.display = display; return this; } public BotPluginMetaBuilder resContentType(int resContentType) { this.resContentType = resContentType; return this; } public BotPluginDTO.BotPluginMeta build() { return new BotPluginDTO.BotPluginMeta(this.desc, this.http_headers, this.http_method, this.input, this.output, this.display, this.resContentType); } public String toString() { return "BotPluginDTO.BotPluginMeta.BotPluginMetaBuilder(desc=" + this.desc + ", http_headers=" + this.http_headers + ", http_method=" + this.http_method + ", input=" + this.input + ", output=" + this.output + ", display=" + this.display + ", resContentType=" + this.resContentType + ")"; }
  
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/plugins/BotPluginDTO$BotPluginMeta$BotPluginMetaBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */