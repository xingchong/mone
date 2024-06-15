package run.mone.m78.api.bo.plugins;

import com.xiaomi.mone.http.docs.annotations.HttpApiDocClassDefine;

import java.util.List;

public class BotPluginOrgDTO {
    @HttpApiDocClassDefine(value = "id", required = true, description = "插件id", defaultValue = "插件id")
    private Long id;
    @HttpApiDocClassDefine(value = "workspaceId", required = true, description = "插件所属空间id", defaultValue = "插件所属空间id")
    private Long workspaceId;
    @HttpApiDocClassDefine(value = "pluginOrgName", required = true, description = "插件名称", defaultValue = "插件名称")
    private String pluginOrgName;
    @HttpApiDocClassDefine(value = "pluginOrgName", required = true, description = "插件名称", defaultValue = "插件名称")
    private String pluginOrgDesc;
    private String avatarUrl;
    private Integer pluginCnt;
    private Integer botRefCnt;
    private double pluginAvgStar;
    @HttpApiDocClassDefine(value = "createTime", required = true, description = "插件创建时间", defaultValue = "插件创建时间")
    private String createTime;
    @HttpApiDocClassDefine(value = "status", required = true, description = "插件上架状态", defaultValue = "0：上架， 1：未上架")
    private Integer status;
    private String modifyTime;
    private String releaseTime;
    @HttpApiDocClassDefine(value = "creator", required = true, description = "插件创建人", defaultValue = "插件名称")
    private String creator;
    @HttpApiDocClassDefine(value = "modifier", required = true, description = "插件更新人", defaultValue = "插件名称")
    private String modifier;
    private List<BotPluginDTO> plugins;
    private List<String> pluginCategory;

    public BotPluginOrgDTO() {
    }

    /* 16 */
    public BotPluginOrgDTO(Long id, Long workspaceId, String pluginOrgName, String pluginOrgDesc, String avatarUrl, Integer pluginCnt, Integer botRefCnt, double pluginAvgStar, String createTime, Integer status, String modifyTime, String releaseTime, String creator, String modifier, List<BotPluginDTO> plugins, List<String> pluginCategory) {
        this.id = id;
        this.workspaceId = workspaceId;
        this.pluginOrgName = pluginOrgName;
        this.pluginOrgDesc = pluginOrgDesc;
        this.avatarUrl = avatarUrl;
        this.pluginCnt = pluginCnt;
        this.botRefCnt = botRefCnt;
        this.pluginAvgStar = pluginAvgStar;
        this.createTime = createTime;
        this.status = status;
        this.modifyTime = modifyTime;
        this.releaseTime = releaseTime;
        this.creator = creator;
        this.modifier = modifier;
        this.plugins = plugins;
        this.pluginCategory = pluginCategory;
    }

    /* 17 */
    public void setId(Long id) {
        this.id = id;
    }

    public void setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
    }

    public void setPluginOrgName(String pluginOrgName) {
        this.pluginOrgName = pluginOrgName;
    }

    public void setPluginOrgDesc(String pluginOrgDesc) {
        this.pluginOrgDesc = pluginOrgDesc;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public void setPluginCnt(Integer pluginCnt) {
        this.pluginCnt = pluginCnt;
    }

    public void setBotRefCnt(Integer botRefCnt) {
        this.botRefCnt = botRefCnt;
    }

    public void setPluginAvgStar(double pluginAvgStar) {
        this.pluginAvgStar = pluginAvgStar;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public void setPlugins(List<BotPluginDTO> plugins) {
        this.plugins = plugins;
    }

    public void setPluginCategory(List<String> pluginCategory) {
        this.pluginCategory = pluginCategory;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof BotPluginOrgDTO)) return false;
        BotPluginOrgDTO other = (BotPluginOrgDTO) o;
        if (!other.canEqual(this)) return false;
        if (Double.compare(getPluginAvgStar(), other.getPluginAvgStar()) != 0) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$workspaceId = getWorkspaceId(), other$workspaceId = other.getWorkspaceId();
        if ((this$workspaceId == null) ? (other$workspaceId != null) : !this$workspaceId.equals(other$workspaceId))
            return false;
        Object this$pluginCnt = getPluginCnt(), other$pluginCnt = other.getPluginCnt();
        if ((this$pluginCnt == null) ? (other$pluginCnt != null) : !this$pluginCnt.equals(other$pluginCnt))
            return false;
        Object this$botRefCnt = getBotRefCnt(), other$botRefCnt = other.getBotRefCnt();
        if ((this$botRefCnt == null) ? (other$botRefCnt != null) : !this$botRefCnt.equals(other$botRefCnt))
            return false;
        Object this$status = getStatus(), other$status = other.getStatus();
        if ((this$status == null) ? (other$status != null) : !this$status.equals(other$status)) return false;
        Object this$pluginOrgName = getPluginOrgName(), other$pluginOrgName = other.getPluginOrgName();
        if ((this$pluginOrgName == null) ? (other$pluginOrgName != null) : !this$pluginOrgName.equals(other$pluginOrgName))
            return false;
        Object this$pluginOrgDesc = getPluginOrgDesc(), other$pluginOrgDesc = other.getPluginOrgDesc();
        if ((this$pluginOrgDesc == null) ? (other$pluginOrgDesc != null) : !this$pluginOrgDesc.equals(other$pluginOrgDesc))
            return false;
        Object this$avatarUrl = getAvatarUrl(), other$avatarUrl = other.getAvatarUrl();
        if ((this$avatarUrl == null) ? (other$avatarUrl != null) : !this$avatarUrl.equals(other$avatarUrl))
            return false;
        Object this$createTime = getCreateTime(), other$createTime = other.getCreateTime();
        if ((this$createTime == null) ? (other$createTime != null) : !this$createTime.equals(other$createTime))
            return false;
        Object this$modifyTime = getModifyTime(), other$modifyTime = other.getModifyTime();
        if ((this$modifyTime == null) ? (other$modifyTime != null) : !this$modifyTime.equals(other$modifyTime))
            return false;
        Object this$releaseTime = getReleaseTime(), other$releaseTime = other.getReleaseTime();
        if ((this$releaseTime == null) ? (other$releaseTime != null) : !this$releaseTime.equals(other$releaseTime))
            return false;
        Object this$creator = getCreator(), other$creator = other.getCreator();
        if ((this$creator == null) ? (other$creator != null) : !this$creator.equals(other$creator)) return false;
        Object this$modifier = getModifier(), other$modifier = other.getModifier();
        if ((this$modifier == null) ? (other$modifier != null) : !this$modifier.equals(other$modifier)) return false;
        Object this$plugins = (Object) getPlugins(), other$plugins = (Object) other.getPlugins();
        if ((this$plugins == null) ? (other$plugins != null) : !this$plugins.equals(other$plugins)) return false;
        Object this$pluginCategory = (Object) getPluginCategory(), other$pluginCategory = (Object) other.getPluginCategory();
        return !((this$pluginCategory == null) ? (other$pluginCategory != null) : !this$pluginCategory.equals(other$pluginCategory));
    }

    protected boolean canEqual(Object other) {
        return other instanceof BotPluginOrgDTO;
    }

    public int hashCode() {
        int result = 1;
        long $pluginAvgStar = Double.doubleToLongBits(getPluginAvgStar());
        result = result * 59 + (int) ($pluginAvgStar >>> 32L ^ $pluginAvgStar);
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $workspaceId = getWorkspaceId();
        result = result * 59 + (($workspaceId == null) ? 43 : $workspaceId.hashCode());
        Object $pluginCnt = getPluginCnt();
        result = result * 59 + (($pluginCnt == null) ? 43 : $pluginCnt.hashCode());
        Object $botRefCnt = getBotRefCnt();
        result = result * 59 + (($botRefCnt == null) ? 43 : $botRefCnt.hashCode());
        Object $status = getStatus();
        result = result * 59 + (($status == null) ? 43 : $status.hashCode());
        Object $pluginOrgName = getPluginOrgName();
        result = result * 59 + (($pluginOrgName == null) ? 43 : $pluginOrgName.hashCode());
        Object $pluginOrgDesc = getPluginOrgDesc();
        result = result * 59 + (($pluginOrgDesc == null) ? 43 : $pluginOrgDesc.hashCode());
        Object $avatarUrl = getAvatarUrl();
        result = result * 59 + (($avatarUrl == null) ? 43 : $avatarUrl.hashCode());
        Object $createTime = getCreateTime();
        result = result * 59 + (($createTime == null) ? 43 : $createTime.hashCode());
        Object $modifyTime = getModifyTime();
        result = result * 59 + (($modifyTime == null) ? 43 : $modifyTime.hashCode());
        Object $releaseTime = getReleaseTime();
        result = result * 59 + (($releaseTime == null) ? 43 : $releaseTime.hashCode());
        Object $creator = getCreator();
        result = result * 59 + (($creator == null) ? 43 : $creator.hashCode());
        Object $modifier = getModifier();
        result = result * 59 + (($modifier == null) ? 43 : $modifier.hashCode());
        Object $plugins = (Object) getPlugins();
        result = result * 59 + (($plugins == null) ? 43 : $plugins.hashCode());
        Object $pluginCategory = (Object) getPluginCategory();
        return result * 59 + (($pluginCategory == null) ? 43 : $pluginCategory.hashCode());
    }

    public String toString() {
        return "BotPluginOrgDTO(id=" + getId() + ", workspaceId=" + getWorkspaceId() + ", pluginOrgName=" + getPluginOrgName() + ", pluginOrgDesc=" + getPluginOrgDesc() + ", avatarUrl=" + getAvatarUrl() + ", pluginCnt=" + getPluginCnt() + ", botRefCnt=" + getBotRefCnt() + ", pluginAvgStar=" + getPluginAvgStar() + ", createTime=" + getCreateTime() + ", status=" + getStatus() + ", modifyTime=" + getModifyTime() + ", releaseTime=" + getReleaseTime() + ", creator=" + getCreator() + ", modifier=" + getModifier() + ", plugins=" + getPlugins() + ", pluginCategory=" + getPluginCategory() + ")";
    }

    /* 18 */
    public static BotPluginOrgDTOBuilder builder() {
        return new BotPluginOrgDTOBuilder();
    }

    public static class BotPluginOrgDTOBuilder {
        private Long id;
        private Long workspaceId;
        private String pluginOrgName;
        private String pluginOrgDesc;
        private String avatarUrl;
        private Integer pluginCnt;
        private Integer botRefCnt;
        private double pluginAvgStar;

        public BotPluginOrgDTOBuilder id(Long id) {
            this.id = id;
            return this;
        }

        private String createTime;
        private Integer status;
        private String modifyTime;
        private String releaseTime;
        private String creator;
        private String modifier;
        private List<BotPluginDTO> plugins;
        private List<String> pluginCategory;

        public BotPluginOrgDTOBuilder workspaceId(Long workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public BotPluginOrgDTOBuilder pluginOrgName(String pluginOrgName) {
            this.pluginOrgName = pluginOrgName;
            return this;
        }

        public BotPluginOrgDTOBuilder pluginOrgDesc(String pluginOrgDesc) {
            this.pluginOrgDesc = pluginOrgDesc;
            return this;
        }

        public BotPluginOrgDTOBuilder avatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }

        public BotPluginOrgDTOBuilder pluginCnt(Integer pluginCnt) {
            this.pluginCnt = pluginCnt;
            return this;
        }

        public BotPluginOrgDTOBuilder botRefCnt(Integer botRefCnt) {
            this.botRefCnt = botRefCnt;
            return this;
        }

        public BotPluginOrgDTOBuilder pluginAvgStar(double pluginAvgStar) {
            this.pluginAvgStar = pluginAvgStar;
            return this;
        }

        public BotPluginOrgDTOBuilder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        public BotPluginOrgDTOBuilder status(Integer status) {
            this.status = status;
            return this;
        }

        public BotPluginOrgDTOBuilder modifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        public BotPluginOrgDTOBuilder releaseTime(String releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }

        public BotPluginOrgDTOBuilder creator(String creator) {
            this.creator = creator;
            return this;
        }

        public BotPluginOrgDTOBuilder modifier(String modifier) {
            this.modifier = modifier;
            return this;
        }

        public BotPluginOrgDTOBuilder plugins(List<BotPluginDTO> plugins) {
            this.plugins = plugins;
            return this;
        }

        public BotPluginOrgDTOBuilder pluginCategory(List<String> pluginCategory) {
            this.pluginCategory = pluginCategory;
            return this;
        }

        public BotPluginOrgDTO build() {
            return new BotPluginOrgDTO(this.id, this.workspaceId, this.pluginOrgName, this.pluginOrgDesc, this.avatarUrl, this.pluginCnt, this.botRefCnt, this.pluginAvgStar, this.createTime, this.status, this.modifyTime, this.releaseTime, this.creator, this.modifier, this.plugins, this.pluginCategory);
        }

        public String toString() {
            return "BotPluginOrgDTO.BotPluginOrgDTOBuilder(id=" + this.id + ", workspaceId=" + this.workspaceId + ", pluginOrgName=" + this.pluginOrgName + ", pluginOrgDesc=" + this.pluginOrgDesc + ", avatarUrl=" + this.avatarUrl + ", pluginCnt=" + this.pluginCnt + ", botRefCnt=" + this.botRefCnt + ", pluginAvgStar=" + this.pluginAvgStar + ", createTime=" + this.createTime + ", status=" + this.status + ", modifyTime=" + this.modifyTime + ", releaseTime=" + this.releaseTime + ", creator=" + this.creator + ", modifier=" + this.modifier + ", plugins=" + this.plugins + ", pluginCategory=" + this.pluginCategory + ")";
        }
    }

    public Long getId() {
        /* 22 */
        return this.id;
    }

    public Long getWorkspaceId() {
        /* 25 */
        return this.workspaceId;
    }

    public String getPluginOrgName() {
        /* 28 */
        return this.pluginOrgName;
    }

    public String getPluginOrgDesc() {
        /* 31 */
        return this.pluginOrgDesc;
    }

    public String getAvatarUrl() {
        /* 33 */
        return this.avatarUrl;
    }

    public Integer getPluginCnt() {
        /* 35 */
        return this.pluginCnt;
    }

    public Integer getBotRefCnt() {
        /* 37 */
        return this.botRefCnt;
    }

    public double getPluginAvgStar() {
        /* 39 */
        return this.pluginAvgStar;
    }

    public String getCreateTime() {
        /* 42 */
        return this.createTime;
    }

    public Integer getStatus() {
        /* 45 */
        return this.status;
    }

    public String getModifyTime() {
        /* 47 */
        return this.modifyTime;
    }

    public String getReleaseTime() {
        /* 49 */
        return this.releaseTime;
    }

    public String getCreator() {
        /* 52 */
        return this.creator;
    }

    public String getModifier() {
        /* 55 */
        return this.modifier;
    }

    public List<BotPluginDTO> getPlugins() {
        /* 57 */
        return this.plugins;
    }

    public List<String> getPluginCategory() {
        /* 59 */
        return this.pluginCategory;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/plugins/BotPluginOrgDTO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */