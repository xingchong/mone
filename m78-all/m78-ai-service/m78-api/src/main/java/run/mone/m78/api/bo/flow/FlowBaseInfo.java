package run.mone.m78.api.bo.flow;

import java.io.Serializable;
import java.util.List;

public class FlowBaseInfo implements Serializable {
    private Integer id;
    private Long workSpaceId;
    private String name;
    private String creator;
    private String desc;
    private Integer state;
    private Integer publishStatus;
    private Integer runStatus;
    private String avatarUrl;
    private List<NodeInputInfo> inputs;
    private Long ctime;
    private Long utime;

    /* 16 */
    public void setId(Integer id) {
        this.id = id;
    }

    public void setWorkSpaceId(Long workSpaceId) {
        this.workSpaceId = workSpaceId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public void setPublishStatus(Integer publishStatus) {
        this.publishStatus = publishStatus;
    }

    public void setRunStatus(Integer runStatus) {
        this.runStatus = runStatus;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public void setInputs(List<NodeInputInfo> inputs) {
        this.inputs = inputs;
    }

    public void setCtime(Long ctime) {
        this.ctime = ctime;
    }

    public void setUtime(Long utime) {
        this.utime = utime;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof FlowBaseInfo)) return false;
        FlowBaseInfo other = (FlowBaseInfo) o;
        if (!other.canEqual(this)) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$workSpaceId = getWorkSpaceId(), other$workSpaceId = other.getWorkSpaceId();
        if ((this$workSpaceId == null) ? (other$workSpaceId != null) : !this$workSpaceId.equals(other$workSpaceId))
            return false;
        Object this$state = getState(), other$state = other.getState();
        if ((this$state == null) ? (other$state != null) : !this$state.equals(other$state)) return false;
        Object this$publishStatus = getPublishStatus(), other$publishStatus = other.getPublishStatus();
        if ((this$publishStatus == null) ? (other$publishStatus != null) : !this$publishStatus.equals(other$publishStatus))
            return false;
        Object this$runStatus = getRunStatus(), other$runStatus = other.getRunStatus();
        if ((this$runStatus == null) ? (other$runStatus != null) : !this$runStatus.equals(other$runStatus))
            return false;
        Object this$ctime = getCtime(), other$ctime = other.getCtime();
        if ((this$ctime == null) ? (other$ctime != null) : !this$ctime.equals(other$ctime)) return false;
        Object this$utime = getUtime(), other$utime = other.getUtime();
        if ((this$utime == null) ? (other$utime != null) : !this$utime.equals(other$utime)) return false;
        Object this$name = getName(), other$name = other.getName();
        if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;
        Object this$creator = getCreator(), other$creator = other.getCreator();
        if ((this$creator == null) ? (other$creator != null) : !this$creator.equals(other$creator)) return false;
        Object this$desc = getDesc(), other$desc = other.getDesc();
        if ((this$desc == null) ? (other$desc != null) : !this$desc.equals(other$desc)) return false;
        Object this$avatarUrl = getAvatarUrl(), other$avatarUrl = other.getAvatarUrl();
        if ((this$avatarUrl == null) ? (other$avatarUrl != null) : !this$avatarUrl.equals(other$avatarUrl))
            return false;
        Object this$inputs = (Object) getInputs(), other$inputs = (Object) other.getInputs();
        return !((this$inputs == null) ? (other$inputs != null) : !this$inputs.equals(other$inputs));
    }

    protected boolean canEqual(Object other) {
        return other instanceof FlowBaseInfo;
    }

    public int hashCode() {
                 int result = 1;
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $workSpaceId = getWorkSpaceId();
        result = result * 59 + (($workSpaceId == null) ? 43 : $workSpaceId.hashCode());
        Object $state = getState();
        result = result * 59 + (($state == null) ? 43 : $state.hashCode());
        Object $publishStatus = getPublishStatus();
        result = result * 59 + (($publishStatus == null) ? 43 : $publishStatus.hashCode());
        Object $runStatus = getRunStatus();
        result = result * 59 + (($runStatus == null) ? 43 : $runStatus.hashCode());
        Object $ctime = getCtime();
        result = result * 59 + (($ctime == null) ? 43 : $ctime.hashCode());
        Object $utime = getUtime();
        result = result * 59 + (($utime == null) ? 43 : $utime.hashCode());
        Object $name = getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        Object $creator = getCreator();
        result = result * 59 + (($creator == null) ? 43 : $creator.hashCode());
        Object $desc = getDesc();
        result = result * 59 + (($desc == null) ? 43 : $desc.hashCode());
        Object $avatarUrl = getAvatarUrl();
        result = result * 59 + (($avatarUrl == null) ? 43 : $avatarUrl.hashCode());
        Object $inputs = (Object) getInputs();
        return result * 59 + (($inputs == null) ? 43 : $inputs.hashCode());
    }

    public String toString() {
        return "FlowBaseInfo(id=" + getId() + ", workSpaceId=" + getWorkSpaceId() + ", name=" + getName() + ", creator=" + getCreator() + ", desc=" + getDesc() + ", state=" + getState() + ", publishStatus=" + getPublishStatus() + ", runStatus=" + getRunStatus() + ", avatarUrl=" + getAvatarUrl() + ", inputs=" + getInputs() + ", ctime=" + getCtime() + ", utime=" + getUtime() + ")";
    }

    /* 17 */
    public static FlowBaseInfoBuilder builder() {
        return new FlowBaseInfoBuilder();
    }

    public static class FlowBaseInfoBuilder {
        private Integer id;
        private Long workSpaceId;
        private String name;
        private String creator;
        private String desc;
        private Integer state;

        public FlowBaseInfoBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        private Integer publishStatus;
        private Integer runStatus;
        private String avatarUrl;
        private List<NodeInputInfo> inputs;
        private Long ctime;
        private Long utime;

        public FlowBaseInfoBuilder workSpaceId(Long workSpaceId) {
            this.workSpaceId = workSpaceId;
            return this;
        }

        public FlowBaseInfoBuilder name(String name) {
            this.name = name;
            return this;
        }

        public FlowBaseInfoBuilder creator(String creator) {
            this.creator = creator;
            return this;
        }

        public FlowBaseInfoBuilder desc(String desc) {
            this.desc = desc;
            return this;
        }

        public FlowBaseInfoBuilder state(Integer state) {
            this.state = state;
            return this;
        }

        public FlowBaseInfoBuilder publishStatus(Integer publishStatus) {
            this.publishStatus = publishStatus;
            return this;
        }

        public FlowBaseInfoBuilder runStatus(Integer runStatus) {
            this.runStatus = runStatus;
            return this;
        }

        public FlowBaseInfoBuilder avatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }

        public FlowBaseInfoBuilder inputs(List<NodeInputInfo> inputs) {
            this.inputs = inputs;
            return this;
        }

        public FlowBaseInfoBuilder ctime(Long ctime) {
            this.ctime = ctime;
            return this;
        }

        public FlowBaseInfoBuilder utime(Long utime) {
            this.utime = utime;
            return this;
        }

        public FlowBaseInfo build() {
            return new FlowBaseInfo(this.id, this.workSpaceId, this.name, this.creator, this.desc, this.state, this.publishStatus, this.runStatus, this.avatarUrl, this.inputs, this.ctime, this.utime);
        }

        public String toString() {
            return "FlowBaseInfo.FlowBaseInfoBuilder(id=" + this.id + ", workSpaceId=" + this.workSpaceId + ", name=" + this.name + ", creator=" + this.creator + ", desc=" + this.desc + ", state=" + this.state + ", publishStatus=" + this.publishStatus + ", runStatus=" + this.runStatus + ", avatarUrl=" + this.avatarUrl + ", inputs=" + this.inputs + ", ctime=" + this.ctime + ", utime=" + this.utime + ")";
        }
    }

    public FlowBaseInfo(Integer id, Long workSpaceId, String name, String creator, String desc, Integer state, Integer publishStatus, Integer runStatus, String avatarUrl, List<NodeInputInfo> inputs, Long ctime, Long utime) {
        /* 18 */
        this.id = id;
        this.workSpaceId = workSpaceId;
        this.name = name;
        this.creator = creator;
        this.desc = desc;
        this.state = state;
        this.publishStatus = publishStatus;
        this.runStatus = runStatus;
        this.avatarUrl = avatarUrl;
        this.inputs = inputs;
        this.ctime = ctime;
        this.utime = utime;
    }

    public FlowBaseInfo() {
    }

    public Integer getId() {
        /* 22 */
        return this.id;
    }

    public Long getWorkSpaceId() {
        /* 24 */
        return this.workSpaceId;
    }

    public String getName() {
        /* 26 */
        return this.name;
    }

    public String getCreator() {
        /* 28 */
        return this.creator;
    }

    public String getDesc() {
        /* 30 */
        return this.desc;
    }

    public Integer getState() {
        /* 33 */
        return this.state;
    }

    public Integer getPublishStatus() {
        /* 35 */
        return this.publishStatus;
    }


    public Integer getRunStatus() {
        /* 40 */
        return this.runStatus;
    }

    public String getAvatarUrl() {
        /* 43 */
        return this.avatarUrl;
    }

    public List<NodeInputInfo> getInputs() {
        /* 45 */
        return this.inputs;
    }

    public Long getCtime() {
        /* 47 */
        return this.ctime;
    }

    public Long getUtime() {
        /* 49 */
        return this.utime;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/flow/FlowBaseInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */