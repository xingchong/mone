package run.mone.m78.api.bo.flow;

import java.io.Serializable;
import java.util.List;


public class NodeInfo implements Serializable {
    private int id;
    private String nodeType;
    private NodeMetaInfo nodeMetaInfo;
    private List<NodeInputInfo> inputs;
    private List<NodeOutputInfo> outputs;
    private List<NodeInputInfo> batchInfo;
    private String coreSetting;
    private String batchType;

    /* 13 */
    public void setId(int id) {
        this.id = id;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public void setNodeMetaInfo(NodeMetaInfo nodeMetaInfo) {
        this.nodeMetaInfo = nodeMetaInfo;
    }

    public void setInputs(List<NodeInputInfo> inputs) {
        this.inputs = inputs;
    }

    public void setOutputs(List<NodeOutputInfo> outputs) {
        this.outputs = outputs;
    }

    public void setBatchInfo(List<NodeInputInfo> batchInfo) {
        this.batchInfo = batchInfo;
    }

    public void setCoreSetting(String coreSetting) {
        this.coreSetting = coreSetting;
    }

    public void setBatchType(String batchType) {
        this.batchType = batchType;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof NodeInfo)) return false;
        NodeInfo other = (NodeInfo) o;
        if (!other.canEqual(this)) return false;
        if (getId() != other.getId()) return false;
        Object this$nodeType = getNodeType(), other$nodeType = other.getNodeType();
        if ((this$nodeType == null) ? (other$nodeType != null) : !this$nodeType.equals(other$nodeType)) return false;
        Object this$nodeMetaInfo = getNodeMetaInfo(), other$nodeMetaInfo = other.getNodeMetaInfo();
        if ((this$nodeMetaInfo == null) ? (other$nodeMetaInfo != null) : !this$nodeMetaInfo.equals(other$nodeMetaInfo))
            return false;
        Object this$inputs = (Object) getInputs(), other$inputs = (Object) other.getInputs();
        if ((this$inputs == null) ? (other$inputs != null) : !this$inputs.equals(other$inputs)) return false;
        Object this$outputs = (Object) getOutputs(), other$outputs = (Object) other.getOutputs();
        if ((this$outputs == null) ? (other$outputs != null) : !this$outputs.equals(other$outputs)) return false;
        Object this$batchInfo = (Object) getBatchInfo(), other$batchInfo = (Object) other.getBatchInfo();
        if ((this$batchInfo == null) ? (other$batchInfo != null) : !this$batchInfo.equals(other$batchInfo))
            return false;
        Object this$coreSetting = getCoreSetting(), other$coreSetting = other.getCoreSetting();
        if ((this$coreSetting == null) ? (other$coreSetting != null) : !this$coreSetting.equals(other$coreSetting))
            return false;
        Object this$batchType = getBatchType(), other$batchType = other.getBatchType();
        return !((this$batchType == null) ? (other$batchType != null) : !this$batchType.equals(other$batchType));
    }

    protected boolean canEqual(Object other) {
        return other instanceof NodeInfo;
    }

    public int hashCode() {
        int result = 1;
        result = result * 59 + getId();
        Object $nodeType = getNodeType();
        result = result * 59 + (($nodeType == null) ? 43 : $nodeType.hashCode());
        Object $nodeMetaInfo = getNodeMetaInfo();
        result = result * 59 + (($nodeMetaInfo == null) ? 43 : $nodeMetaInfo.hashCode());
        Object $inputs = (Object) getInputs();
        result = result * 59 + (($inputs == null) ? 43 : $inputs.hashCode());
        Object $outputs = (Object) getOutputs();
        result = result * 59 + (($outputs == null) ? 43 : $outputs.hashCode());
        Object $batchInfo = (Object) getBatchInfo();
        result = result * 59 + (($batchInfo == null) ? 43 : $batchInfo.hashCode());
        Object $coreSetting = getCoreSetting();
        result = result * 59 + (($coreSetting == null) ? 43 : $coreSetting.hashCode());
        Object $batchType = getBatchType();
        return result * 59 + (($batchType == null) ? 43 : $batchType.hashCode());
    }

    public String toString() {
        return "NodeInfo(id=" + getId() + ", nodeType=" + getNodeType() + ", nodeMetaInfo=" + getNodeMetaInfo() + ", inputs=" + getInputs() + ", outputs=" + getOutputs() + ", batchInfo=" + getBatchInfo() + ", coreSetting=" + getCoreSetting() + ", batchType=" + getBatchType() + ")";
    }

    public int getId() {
        /* 15 */
        return this.id;
    }

    public String getNodeType() {
        /* 19 */
        return this.nodeType;
    }

    public NodeMetaInfo getNodeMetaInfo() {
        /* 21 */
        return this.nodeMetaInfo;
    }

    public List<NodeInputInfo> getInputs() {
        /* 23 */
        return this.inputs;
    }

    public List<NodeOutputInfo> getOutputs() {
        /* 25 */
        return this.outputs;
    }

    public List<NodeInputInfo> getBatchInfo() {
        /* 27 */
        return this.batchInfo;
    }

    public String getCoreSetting() {
        /* 29 */
        return this.coreSetting;
    }

    public String getBatchType() {
        /* 32 */
        return this.batchType;
    }

    public static class NodeMetaInfo implements Serializable {
        /* 34 */     private String nodeName;
        private String desc;

        public void setNodeName(String nodeName) {
            this.nodeName = nodeName;
        }

        private NodeInfo.NodePosition nodePosition;
        private String extraInfo;

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
            if ((this$nodeName == null) ? (other$nodeName != null) : !this$nodeName.equals(other$nodeName))
                return false;
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

    public static class NodePosition implements Serializable {
        private String x;
        private String y;

        /* 44 */
        public void setX(String x) {
            this.x = x;
        }

        public void setY(String y) {
            this.y = y;
        }

        public boolean equals(Object o) {
            if (o == this) return true;
            if (!(o instanceof NodePosition)) return false;
            NodePosition other = (NodePosition) o;
            if (!other.canEqual(this)) return false;
            Object this$x = getX(), other$x = other.getX();
            if ((this$x == null) ? (other$x != null) : !this$x.equals(other$x)) return false;
            Object this$y = getY(), other$y = other.getY();
            return !((this$y == null) ? (other$y != null) : !this$y.equals(other$y));
        }

        protected boolean canEqual(Object other) {
            return other instanceof NodePosition;
        }

        public int hashCode() {
            int result = 1;
            Object $x = getX();
            result = result * 59 + (($x == null) ? 43 : $x.hashCode());
            Object $y = getY();
            return result * 59 + (($y == null) ? 43 : $y.hashCode());
        }

        public String toString() {
            return "NodeInfo.NodePosition(x=" + getX() + ", y=" + getY() + ")";
        }

        /* 46 */
        public String getX() {
            return this.x;
        }

        public String getY() {
            /* 47 */
            return this.y;
        }
    }

}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/flow/NodeInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */