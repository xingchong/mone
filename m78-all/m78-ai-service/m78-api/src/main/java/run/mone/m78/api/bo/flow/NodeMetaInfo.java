package run.mone.m78.api.bo.flow;

import java.io.Serializable;


public class NodeMetaInfo implements Serializable {
    private String nodeName;
    private String desc;
    private NodeInfo.NodePosition nodePosition;
    private String extraInfo;

    public void setNodeName(String nodeName) {
        /* 34 */
        this.nodeName = nodeName;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setNodePosition(NodeInfo.NodePosition nodePosition) {
        this.nodePosition = nodePosition;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof NodeMetaInfo)) return false;
        NodeMetaInfo other = (NodeMetaInfo) o;
        if (!other.canEqual(this)) return false;
        Object this$nodeName = getNodeName(), other$nodeName = other.getNodeName();
        if ((this$nodeName == null) ? (other$nodeName != null) : !this$nodeName.equals(other$nodeName)) return false;
        Object this$desc = getDesc(), other$desc = other.getDesc();
        if ((this$desc == null) ? (other$desc != null) : !this$desc.equals(other$desc)) return false;
        Object this$nodePosition = getNodePosition(), other$nodePosition = other.getNodePosition();
        if ((this$nodePosition == null) ? (other$nodePosition != null) : !this$nodePosition.equals(other$nodePosition))
            return false;
        Object this$extraInfo = getExtraInfo(), other$extraInfo = other.getExtraInfo();
        return !((this$extraInfo == null) ? (other$extraInfo != null) : !this$extraInfo.equals(other$extraInfo));
    }

    protected boolean canEqual(Object other) {
        return other instanceof NodeMetaInfo;
    }

    public int hashCode() {
        int result = 1;
        Object $nodeName = getNodeName();
        result = result * 59 + (($nodeName == null) ? 43 : $nodeName.hashCode());
        Object $desc = getDesc();
        result = result * 59 + (($desc == null) ? 43 : $desc.hashCode());
        Object $nodePosition = getNodePosition();
        result = result * 59 + (($nodePosition == null) ? 43 : $nodePosition.hashCode());
        Object $extraInfo = getExtraInfo();
        return result * 59 + (($extraInfo == null) ? 43 : $extraInfo.hashCode());
    }

    public String toString() {
        return "NodeInfo.NodeMetaInfo(nodeName=" + getNodeName() + ", desc=" + getDesc() + ", nodePosition=" + getNodePosition() + ", extraInfo=" + getExtraInfo() + ")";
    }

    /* 36 */
    public String getNodeName() {
        return this.nodeName;
    }

    /* 37 */
    public String getDesc() {
        return this.desc;
    }

    public NodeInfo.NodePosition getNodePosition() {
        /* 38 */
        return this.nodePosition;
    }

    public String getExtraInfo() {
        /* 40 */
        return this.extraInfo;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/flow/NodeInfo$NodeMetaInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */