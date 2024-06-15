package run.mone.ai.z.dto;

import java.io.Serializable;

public class ZReq implements Serializable {
    private String name;
    private String model;

    /*  7 */
    public void setName(String name) {
        this.name = name;
    }

    private String description;
    private String dataSrc;

    public void setModel(String model) {
        this.model = model;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDataSrc(String dataSrc) {
        this.dataSrc = dataSrc;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ZReq)) return false;
        ZReq other = (ZReq) o;
        if (!other.canEqual(this)) return false;
        Object this$name = getName(), other$name = other.getName();
        if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;
        Object this$model = getModel(), other$model = other.getModel();
        if ((this$model == null) ? (other$model != null) : !this$model.equals(other$model)) return false;
        Object this$description = getDescription(), other$description = other.getDescription();
        if ((this$description == null) ? (other$description != null) : !this$description.equals(other$description))
            return false;
        Object this$dataSrc = getDataSrc(), other$dataSrc = other.getDataSrc();
        return !((this$dataSrc == null) ? (other$dataSrc != null) : !this$dataSrc.equals(other$dataSrc));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ZReq;
    }

    public int hashCode() {
        int result = 1;
        Object $name = getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        Object $model = getModel();
        result = result * 59 + (($model == null) ? 43 : $model.hashCode());
        Object $description = getDescription();
        result = result * 59 + (($description == null) ? 43 : $description.hashCode());
        Object $dataSrc = getDataSrc();
        return result * 59 + (($dataSrc == null) ? 43 : $dataSrc.hashCode());
    }

    public String toString() {
        return "ZReq(name=" + getName() + ", model=" + getModel() + ", description=" + getDescription() + ", dataSrc=" + getDataSrc() + ")";
    }

    public String getName() {
        /*  9 */
        return this.name;
    }

    public String getModel() {
        /* 11 */
        return this.model;
    }

    public String getDescription() {
        /* 13 */
        return this.description;
    }

    public String getDataSrc() {
        /* 15 */
        return this.dataSrc;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/ZReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */