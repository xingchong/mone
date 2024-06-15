  package run.mone.m78.api.bo.plugins;
  public class BotPluginDTOBuilder {
    private Long id;
    private Long orgId;
    private String name;
    private String userName;
    private String modifier;
    private Integer status;
    private Integer debugStatus;
    private String createTime;
    private String apiUrl;
    private String avatarUrl;
    private String type;
    private Long featureRouterId;
    private String meta;
    private BotPluginDTO.BotPluginMeta botPluginMeta;
    private String desc;
    private String display;
    
/* 20 */   public BotPluginDTOBuilder id(Long id) { this.id = id; return this; } public BotPluginDTOBuilder orgId(Long orgId) { this.orgId = orgId; return this; } public BotPluginDTOBuilder name(String name) { this.name = name; return this; } public BotPluginDTOBuilder userName(String userName) { this.userName = userName; return this; } public BotPluginDTOBuilder modifier(String modifier) { this.modifier = modifier; return this; } public BotPluginDTOBuilder status(Integer status) { this.status = status; return this; } public BotPluginDTOBuilder debugStatus(Integer debugStatus) { this.debugStatus = debugStatus; return this; } public BotPluginDTOBuilder createTime(String createTime) { this.createTime = createTime; return this; } public BotPluginDTOBuilder apiUrl(String apiUrl) { this.apiUrl = apiUrl; return this; } public BotPluginDTOBuilder avatarUrl(String avatarUrl) { this.avatarUrl = avatarUrl; return this; } public BotPluginDTOBuilder type(String type) { this.type = type; return this; } public BotPluginDTOBuilder featureRouterId(Long featureRouterId) { this.featureRouterId = featureRouterId; return this; } public BotPluginDTOBuilder meta(String meta) { this.meta = meta; return this; } public BotPluginDTOBuilder botPluginMeta(BotPluginDTO.BotPluginMeta botPluginMeta) { this.botPluginMeta = botPluginMeta; return this; } public BotPluginDTOBuilder desc(String desc) { this.desc = desc; return this; } public BotPluginDTOBuilder display(String display) { this.display = display; return this; } public BotPluginDTO build() { return new BotPluginDTO(this.id, this.orgId, this.name, this.userName, this.modifier, this.status, this.debugStatus, this.createTime, this.apiUrl, this.avatarUrl, this.type, this.featureRouterId, this.meta, this.botPluginMeta, this.desc, this.display); } public String toString() { return "BotPluginDTO.BotPluginDTOBuilder(id=" + this.id + ", orgId=" + this.orgId + ", name=" + this.name + ", userName=" + this.userName + ", modifier=" + this.modifier + ", status=" + this.status + ", debugStatus=" + this.debugStatus + ", createTime=" + this.createTime + ", apiUrl=" + this.apiUrl + ", avatarUrl=" + this.avatarUrl + ", type=" + this.type + ", featureRouterId=" + this.featureRouterId + ", meta=" + this.meta + ", botPluginMeta=" + this.botPluginMeta + ", desc=" + this.desc + ", display=" + this.display + ")"; }
  
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/plugins/BotPluginDTO$BotPluginDTOBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */