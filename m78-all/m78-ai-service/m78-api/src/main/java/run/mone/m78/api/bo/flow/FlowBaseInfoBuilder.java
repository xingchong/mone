package run.mone.m78.api.bo.flow;

import java.util.List;

public class FlowBaseInfoBuilder {
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

    /* 17 */
    public FlowBaseInfoBuilder id(Integer id) {
        this.id = id;
        return this;
    }

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


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/flow/FlowBaseInfo$FlowBaseInfoBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */