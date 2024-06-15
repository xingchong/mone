  package run.mone.m78.api.bo.feature.router;

  import java.util.Map;

  public class FeatureRouterDTOBuilder {
    private long id;
    private String name;
    private String userName;
    private Long labelId;
    private Integer status;
    private String createTime;
    private String updateTime;
    private Map<String, String> routerMeta;
    private String curl;
    private String content;
    private Integer type;

/* 18 */   public FeatureRouterDTOBuilder id(long id) { this.id = id; return this; } public FeatureRouterDTOBuilder name(String name) { this.name = name; return this; } public FeatureRouterDTOBuilder userName(String userName) { this.userName = userName; return this; } public FeatureRouterDTOBuilder labelId(Long labelId) { this.labelId = labelId; return this; } public FeatureRouterDTOBuilder status(Integer status) { this.status = status; return this; } public FeatureRouterDTOBuilder createTime(String createTime) { this.createTime = createTime; return this; } public FeatureRouterDTOBuilder updateTime(String updateTime) { this.updateTime = updateTime; return this; } public FeatureRouterDTOBuilder routerMeta(Map<String, String> routerMeta) { this.routerMeta = routerMeta; return this; } public FeatureRouterDTOBuilder curl(String curl) { this.curl = curl; return this; } public FeatureRouterDTOBuilder content(String content) { this.content = content; return this; } public FeatureRouterDTOBuilder type(Integer type) { this.type = type; return this; } public FeatureRouterDTO build() { return new FeatureRouterDTO(this.id, this.name, this.userName, this.labelId, this.status, this.createTime, this.updateTime, this.routerMeta, this.curl, this.content, this.type); } public String toString() { return "FeatureRouterDTO.FeatureRouterDTOBuilder(id=" + this.id + ", name=" + this.name + ", userName=" + this.userName + ", labelId=" + this.labelId + ", status=" + this.status + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + ", routerMeta=" + this.routerMeta + ", curl=" + this.curl + ", content=" + this.content + ", type=" + this.type + ")"; }

  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/feature/router/FeatureRouterDTO$FeatureRouterDTOBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */