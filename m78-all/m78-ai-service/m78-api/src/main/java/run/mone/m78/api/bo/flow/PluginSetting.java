  package run.mone.m78.api.bo.flow;

  import java.io.Serializable;

  public class PluginSetting
    implements Serializable
  {
    private String pluginId;

    public String toString() {
/* 11 */     return "PluginSetting(pluginId=" + getPluginId() + ")"; } public int hashCode() {  int  result = 1; Object $pluginId = getPluginId(); return result * 59 + (($pluginId == null) ? 43 : $pluginId.hashCode()); } protected boolean canEqual(Object other) { return other instanceof PluginSetting; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof PluginSetting)) return false;  PluginSetting other = (PluginSetting)o; if (!other.canEqual(this)) return false;  Object this$pluginId = getPluginId(), other$pluginId = other.getPluginId(); return !((this$pluginId == null) ? (other$pluginId != null) : !this$pluginId.equals(other$pluginId)); } public void setPluginId(String pluginId) { this.pluginId = pluginId; }

    public String getPluginId() {
/* 14 */     return this.pluginId;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/flow/PluginSetting.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */