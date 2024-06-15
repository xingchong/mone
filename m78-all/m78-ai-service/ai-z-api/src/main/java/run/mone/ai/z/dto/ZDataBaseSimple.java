package run.mone.ai.z.dto;

import com.xiaomi.mone.http.docs.annotations.HttpApiDocClassDefine;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class ZDataBaseSimple implements Serializable {
    @HttpApiDocClassDefine(value = "id", required = false, description = "id，创建时不传", defaultValue = "")
    private Long id;
    @HttpApiDocClassDefine(value = "embedding", required = false, description = "embedding，创建时不传", defaultValue = "")
    private boolean embedding;
    @HttpApiDocClassDefine(value = "inner_embedding", required = false, description = "inner_embedding，创建时不传", defaultValue = "")
    private boolean inner_embedding;
    @HttpApiDocClassDefine(value = "data", required = true, description = "回答/提示词", defaultValue = "")
    private String data;
    @HttpApiDocClassDefine(value = "type", required = true, description = "类型（types/list枚举)", defaultValue = "")
    private Integer type;
    @HttpApiDocClassDefine(value = "mode", required = false, description = "模式（modes枚举）", defaultValue = "")
    private int mode;
    @HttpApiDocClassDefine(value = "name", required = false, description = "名称", defaultValue = "")
    private String name;
    @HttpApiDocClassDefine(value = "info", required = true, description = "提问/标题", defaultValue = "")
    private String info;
    @HttpApiDocClassDefine(value = "meta", required = true, description = "元数据", defaultValue = "")
    /* 10 */ private String meta;

    public void setId(Long id) {
        this.id = id;
    }

    @HttpApiDocClassDefine(value = "designer", required = true, description = "设计者", defaultValue = "")
    private String designer;
    @HttpApiDocClassDefine(value = "description", required = true, description = "描述", defaultValue = "")
    private String description;
    @HttpApiDocClassDefine(value = "addon", required = false, description = "额外信息", defaultValue = "")
    private List<String> addon;
    @HttpApiDocClassDefine(value = "addon_metas", required = false, description = "额外信息", defaultValue = "")
    private List<ZDataBaseAddonItem> addon_metas;
    @HttpApiDocClassDefine(value = "tags", required = false, description = "tag", defaultValue = "")
    private List<ZDataTags> tags;
    @HttpApiDocClassDefine(value = "collected", required = false, description = "被收藏", defaultValue = "")
    private boolean collected;
    @HttpApiDocClassDefine(value = "labels", required = false, description = "label", defaultValue = "")
    private Map<String, String> labels;
    @HttpApiDocClassDefine(value = "userLabels", required = false, description = "userLabels", defaultValue = "")
    private Map<String, String> userLabels;
    @HttpApiDocClassDefine(value = "usedTimes", required = false, description = "usedTimes", defaultValue = "")
    private Long usedTimes;
    @HttpApiDocClassDefine(value = "collectedSort", required = false, description = "收藏列表索引", defaultValue = "")
    private Integer collectedSort;

    public void setEmbedding(boolean embedding) {
        this.embedding = embedding;
    }

    public void setInner_embedding(boolean inner_embedding) {
        this.inner_embedding = inner_embedding;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setMode(int mode) {
        this.mode = mode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public void setDesigner(String designer) {
        this.designer = designer;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAddon(List<String> addon) {
        this.addon = addon;
    }

    public void setAddon_metas(List<ZDataBaseAddonItem> addon_metas) {
        this.addon_metas = addon_metas;
    }

    public void setTags(List<ZDataTags> tags) {
        this.tags = tags;
    }

    public void setCollected(boolean collected) {
        this.collected = collected;
    }

    public void setLabels(Map<String, String> labels) {
        this.labels = labels;
    }

    public void setUserLabels(Map<String, String> userLabels) {
        this.userLabels = userLabels;
    }

    public void setUsedTimes(Long usedTimes) {
        this.usedTimes = usedTimes;
    }

    public void setCollectedSort(Integer collectedSort) {
        this.collectedSort = collectedSort;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ZDataBaseSimple)) return false;
        ZDataBaseSimple other = (ZDataBaseSimple) o;
        if (!other.canEqual(this)) return false;
        if (isEmbedding() != other.isEmbedding()) return false;
        if (isInner_embedding() != other.isInner_embedding()) return false;
        if (getMode() != other.getMode()) return false;
        if (isCollected() != other.isCollected()) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$type = getType(), other$type = other.getType();
        if ((this$type == null) ? (other$type != null) : !this$type.equals(other$type)) return false;
        Object this$usedTimes = getUsedTimes(), other$usedTimes = other.getUsedTimes();
        if ((this$usedTimes == null) ? (other$usedTimes != null) : !this$usedTimes.equals(other$usedTimes))
            return false;
        Object this$collectedSort = getCollectedSort(), other$collectedSort = other.getCollectedSort();
        if ((this$collectedSort == null) ? (other$collectedSort != null) : !this$collectedSort.equals(other$collectedSort))
            return false;
        Object this$data = getData(), other$data = other.getData();
        if ((this$data == null) ? (other$data != null) : !this$data.equals(other$data)) return false;
        Object this$name = getName(), other$name = other.getName();
        if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;
        Object this$info = getInfo(), other$info = other.getInfo();
        if ((this$info == null) ? (other$info != null) : !this$info.equals(other$info)) return false;
        Object this$meta = getMeta(), other$meta = other.getMeta();
        if ((this$meta == null) ? (other$meta != null) : !this$meta.equals(other$meta)) return false;
        Object this$designer = getDesigner(), other$designer = other.getDesigner();
        if ((this$designer == null) ? (other$designer != null) : !this$designer.equals(other$designer)) return false;
        Object this$description = getDescription(), other$description = other.getDescription();
        if ((this$description == null) ? (other$description != null) : !this$description.equals(other$description))
            return false;
        Object this$addon = (Object) getAddon(), other$addon = (Object) other.getAddon();
        if ((this$addon == null) ? (other$addon != null) : !this$addon.equals(other$addon)) return false;
        Object this$addon_metas = (Object) getAddon_metas(), other$addon_metas = (Object) other.getAddon_metas();
        if ((this$addon_metas == null) ? (other$addon_metas != null) : !this$addon_metas.equals(other$addon_metas))
            return false;
        Object this$tags = (Object) getTags(), other$tags = (Object) other.getTags();
        if ((this$tags == null) ? (other$tags != null) : !this$tags.equals(other$tags)) return false;
        Object this$labels = (Object) getLabels(), other$labels = (Object) other.getLabels();
        if ((this$labels == null) ? (other$labels != null) : !this$labels.equals(other$labels)) return false;
        Object this$userLabels = (Object) getUserLabels(), other$userLabels = (Object) other.getUserLabels();
        return !((this$userLabels == null) ? (other$userLabels != null) : !this$userLabels.equals(other$userLabels));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ZDataBaseSimple;
    }

    public int hashCode() {
                 int result = 1;
        result = result * 59 + (isEmbedding() ? 79 : 97);
        result = result * 59 + (isInner_embedding() ? 79 : 97);
        result = result * 59 + getMode();
        result = result * 59 + (isCollected() ? 79 : 97);
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $type = getType();
        result = result * 59 + (($type == null) ? 43 : $type.hashCode());
        Object $usedTimes = getUsedTimes();
        result = result * 59 + (($usedTimes == null) ? 43 : $usedTimes.hashCode());
        Object $collectedSort = getCollectedSort();
        result = result * 59 + (($collectedSort == null) ? 43 : $collectedSort.hashCode());
        Object $data = getData();
        result = result * 59 + (($data == null) ? 43 : $data.hashCode());
        Object $name = getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        Object $info = getInfo();
        result = result * 59 + (($info == null) ? 43 : $info.hashCode());
        Object $meta = getMeta();
        result = result * 59 + (($meta == null) ? 43 : $meta.hashCode());
        Object $designer = getDesigner();
        result = result * 59 + (($designer == null) ? 43 : $designer.hashCode());
        Object $description = getDescription();
        result = result * 59 + (($description == null) ? 43 : $description.hashCode());
        Object $addon = (Object) getAddon();
        result = result * 59 + (($addon == null) ? 43 : $addon.hashCode());
        Object $addon_metas = (Object) getAddon_metas();
        result = result * 59 + (($addon_metas == null) ? 43 : $addon_metas.hashCode());
        Object $tags = (Object) getTags();
        result = result * 59 + (($tags == null) ? 43 : $tags.hashCode());
        Object $labels = (Object) getLabels();
        result = result * 59 + (($labels == null) ? 43 : $labels.hashCode());
        Object $userLabels = (Object) getUserLabels();
        return result * 59 + (($userLabels == null) ? 43 : $userLabels.hashCode());
    }

    public String toString() {
        return "ZDataBaseSimple(id=" + getId() + ", embedding=" + isEmbedding() + ", inner_embedding=" + isInner_embedding() + ", data=" + getData() + ", type=" + getType() + ", mode=" + getMode() + ", name=" + getName() + ", info=" + getInfo() + ", meta=" + getMeta() + ", designer=" + getDesigner() + ", description=" + getDescription() + ", addon=" + getAddon() + ", addon_metas=" + getAddon_metas() + ", tags=" + getTags() + ", collected=" + isCollected() + ", labels=" + getLabels() + ", userLabels=" + getUserLabels() + ", usedTimes=" + getUsedTimes() + ", collectedSort=" + getCollectedSort() + ")";
    }

    public Long getId() {
        /* 13 */
        return this.id;
    }

    public boolean isEmbedding() {
        /* 15 */
        return this.embedding;
    }

    public boolean isInner_embedding() {
        /* 17 */
        return this.inner_embedding;
    }

    public String getData() {
        /* 19 */
        return this.data;
    }

    public Integer getType() {
        /* 21 */
        return this.type;
    }

    public int getMode() {
        /* 23 */
        return this.mode;
    }

    public String getName() {
        /* 25 */
        return this.name;
    }

    public String getInfo() {
        /* 27 */
        return this.info;
    }

    public String getMeta() {
        /* 30 */
        return this.meta;
    }

    public String getDesigner() {
        /* 32 */
        return this.designer;
    }

    public String getDescription() {
        /* 34 */
        return this.description;
    }

    public List<String> getAddon() {
        /* 36 */
        return this.addon;
    }

    public List<ZDataBaseAddonItem> getAddon_metas() {
        /* 38 */
        return this.addon_metas;
    }

    public List<ZDataTags> getTags() {
        /* 41 */
        return this.tags;
    }

    public boolean isCollected() {
        /* 44 */
        return this.collected;
    }

    public Map<String, String> getLabels() {
        /* 47 */
        return this.labels;
    }

    public Map<String, String> getUserLabels() {
        /* 50 */
        return this.userLabels;
    }

    public Long getUsedTimes() {
        /* 53 */
        return this.usedTimes;
    }

    public Integer getCollectedSort() {
        /* 56 */
        return this.collectedSort;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/ZDataBaseSimple.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */