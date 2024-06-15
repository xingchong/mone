  package run.mone.m78.api.bo.plugins;
  
  import java.util.List;
  
  
  public class BotPluginOrgDTOBuilder
  {
    private Long id;
    private Long workspaceId;
    private String pluginOrgName;
    private String pluginOrgDesc;
    private String avatarUrl;
    private Integer pluginCnt;
    private Integer botRefCnt;
    private double pluginAvgStar;
    
    public BotPluginOrgDTOBuilder id(Long id) {
/* 18 */     this.id = id; return this; } private String createTime; private Integer status; private String modifyTime; private String releaseTime; private String creator; private String modifier; private List<BotPluginDTO> plugins; private List<String> pluginCategory; public BotPluginOrgDTOBuilder workspaceId(Long workspaceId) { this.workspaceId = workspaceId; return this; } public BotPluginOrgDTOBuilder pluginOrgName(String pluginOrgName) { this.pluginOrgName = pluginOrgName; return this; } public BotPluginOrgDTOBuilder pluginOrgDesc(String pluginOrgDesc) { this.pluginOrgDesc = pluginOrgDesc; return this; } public BotPluginOrgDTOBuilder avatarUrl(String avatarUrl) { this.avatarUrl = avatarUrl; return this; } public BotPluginOrgDTOBuilder pluginCnt(Integer pluginCnt) { this.pluginCnt = pluginCnt; return this; } public BotPluginOrgDTOBuilder botRefCnt(Integer botRefCnt) { this.botRefCnt = botRefCnt; return this; } public BotPluginOrgDTOBuilder pluginAvgStar(double pluginAvgStar) { this.pluginAvgStar = pluginAvgStar; return this; } public BotPluginOrgDTOBuilder createTime(String createTime) { this.createTime = createTime; return this; } public BotPluginOrgDTOBuilder status(Integer status) { this.status = status; return this; } public BotPluginOrgDTOBuilder modifyTime(String modifyTime) { this.modifyTime = modifyTime; return this; } public BotPluginOrgDTOBuilder releaseTime(String releaseTime) { this.releaseTime = releaseTime; return this; } public BotPluginOrgDTOBuilder creator(String creator) { this.creator = creator; return this; } public BotPluginOrgDTOBuilder modifier(String modifier) { this.modifier = modifier; return this; } public BotPluginOrgDTOBuilder plugins(List<BotPluginDTO> plugins) { this.plugins = plugins; return this; } public BotPluginOrgDTOBuilder pluginCategory(List<String> pluginCategory) { this.pluginCategory = pluginCategory; return this; } public BotPluginOrgDTO build() { return new BotPluginOrgDTO(this.id, this.workspaceId, this.pluginOrgName, this.pluginOrgDesc, this.avatarUrl, this.pluginCnt, this.botRefCnt, this.pluginAvgStar, this.createTime, this.status, this.modifyTime, this.releaseTime, this.creator, this.modifier, this.plugins, this.pluginCategory); } public String toString() { return "BotPluginOrgDTO.BotPluginOrgDTOBuilder(id=" + this.id + ", workspaceId=" + this.workspaceId + ", pluginOrgName=" + this.pluginOrgName + ", pluginOrgDesc=" + this.pluginOrgDesc + ", avatarUrl=" + this.avatarUrl + ", pluginCnt=" + this.pluginCnt + ", botRefCnt=" + this.botRefCnt + ", pluginAvgStar=" + this.pluginAvgStar + ", createTime=" + this.createTime + ", status=" + this.status + ", modifyTime=" + this.modifyTime + ", releaseTime=" + this.releaseTime + ", creator=" + this.creator + ", modifier=" + this.modifier + ", plugins=" + this.plugins + ", pluginCategory=" + this.pluginCategory + ")"; }
  
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/plugins/BotPluginOrgDTO$BotPluginOrgDTOBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */