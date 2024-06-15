
package run.mone.m78.api.bo.flow;


import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class SyncFlowStatus implements Serializable {
    private String flowRecordId;
    private Map<Integer, SyncNodeInput> nodeInputsMap;
    private Map<Integer, SyncNodeOutput> nodeOutputsMap;
    private int endFlowStatus;
    private boolean end;
    private EndFlowOutput endFlowOutput;
    private long timestamp;
    private long durationTime;
    private String messageType;
    private Map<String, String> meta;


    /* 18 */
    public void setFlowRecordId(String flowRecordId) {
        this.flowRecordId = flowRecordId;
    }

    public void setNodeInputsMap(Map<Integer, SyncNodeInput> nodeInputsMap) {
        this.nodeInputsMap = nodeInputsMap;
    }

    public void setNodeOutputsMap(Map<Integer, SyncNodeOutput> nodeOutputsMap) {
        this.nodeOutputsMap = nodeOutputsMap;
    }

    public void setEndFlowStatus(int endFlowStatus) {
        this.endFlowStatus = endFlowStatus;
    }

    public void setEnd(boolean end) {
        this.end = end;
    }

    public void setEndFlowOutput(EndFlowOutput endFlowOutput) {
        this.endFlowOutput = endFlowOutput;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public void setDurationTime(long durationTime) {
        this.durationTime = durationTime;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public void setMeta(Map<String, String> meta) {
        this.meta = meta;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof SyncFlowStatus)) return false;
        SyncFlowStatus other = (SyncFlowStatus) o;
        if (!other.canEqual(this)) return false;
        if (getEndFlowStatus() != other.getEndFlowStatus()) return false;
        if (isEnd() != other.isEnd()) return false;
        if (getTimestamp() != other.getTimestamp()) return false;
        if (getDurationTime() != other.getDurationTime()) return false;
        Object this$flowRecordId = getFlowRecordId(), other$flowRecordId = other.getFlowRecordId();
        if ((this$flowRecordId == null) ? (other$flowRecordId != null) : !this$flowRecordId.equals(other$flowRecordId))
            return false;
        Object this$nodeInputsMap = (Object) getNodeInputsMap(), other$nodeInputsMap = (Object) other.getNodeInputsMap();
        if ((this$nodeInputsMap == null) ? (other$nodeInputsMap != null) : !this$nodeInputsMap.equals(other$nodeInputsMap))
            return false;
        Object this$nodeOutputsMap = (Object) getNodeOutputsMap(), other$nodeOutputsMap = (Object) other.getNodeOutputsMap();
        if ((this$nodeOutputsMap == null) ? (other$nodeOutputsMap != null) : !this$nodeOutputsMap.equals(other$nodeOutputsMap))
            return false;
        Object this$endFlowOutput = getEndFlowOutput(), other$endFlowOutput = other.getEndFlowOutput();
        if ((this$endFlowOutput == null) ? (other$endFlowOutput != null) : !this$endFlowOutput.equals(other$endFlowOutput))
            return false;
        Object this$messageType = getMessageType(), other$messageType = other.getMessageType();
        if ((this$messageType == null) ? (other$messageType != null) : !this$messageType.equals(other$messageType))
            return false;
        Object this$meta = (Object) getMeta(), other$meta = (Object) other.getMeta();
        return !((this$meta == null) ? (other$meta != null) : !this$meta.equals(other$meta));
    }

    protected boolean canEqual(Object other) {
        return other instanceof SyncFlowStatus;
    }

    public int hashCode() {
        int result = 1;
        result = result * 59 + getEndFlowStatus();
        result = result * 59 + (isEnd() ? 79 : 97);
        long $timestamp = getTimestamp();
        result = result * 59 + (int) ($timestamp >>> 32L ^ $timestamp);
        long $durationTime = getDurationTime();
        result = result * 59 + (int) ($durationTime >>> 32L ^ $durationTime);
        Object $flowRecordId = getFlowRecordId();
        result = result * 59 + (($flowRecordId == null) ? 43 : $flowRecordId.hashCode());
        Object $nodeInputsMap = (Object) getNodeInputsMap();
        result = result * 59 + (($nodeInputsMap == null) ? 43 : $nodeInputsMap.hashCode());
        Object $nodeOutputsMap = (Object) getNodeOutputsMap();
        result = result * 59 + (($nodeOutputsMap == null) ? 43 : $nodeOutputsMap.hashCode());
        Object $endFlowOutput = getEndFlowOutput();
        result = result * 59 + (($endFlowOutput == null) ? 43 : $endFlowOutput.hashCode());
        Object $messageType = getMessageType();
        result = result * 59 + (($messageType == null) ? 43 : $messageType.hashCode());
        Object $meta = (Object) getMeta();
        return result * 59 + (($meta == null) ? 43 : $meta.hashCode());
    }

    public String toString() {
        return "SyncFlowStatus(flowRecordId=" + getFlowRecordId() + ", nodeInputsMap=" + getNodeInputsMap() + ", nodeOutputsMap=" + getNodeOutputsMap() + ", endFlowStatus=" + getEndFlowStatus() + ", end=" + isEnd() + ", endFlowOutput=" + getEndFlowOutput() + ", timestamp=" + getTimestamp() + ", durationTime=" + getDurationTime() + ", messageType=" + getMessageType() + ", meta=" + getMeta() + ")";
    }

    /* 19 */
    public static Map<Integer, SyncNodeInput> $default$nodeInputsMap() {
        return new ConcurrentHashMap<>();
    }

    public static Map<Integer, SyncNodeOutput> $default$nodeOutputsMap() {
        return new ConcurrentHashMap<>();
    }

    public static String $default$messageType() {
        return "FLOW_EXECUTE_STATUS";
    }

    public static Map<String, String> $default$meta() {
        return new HashMap<>();
    }

    SyncFlowStatus(String flowRecordId, Map<Integer, SyncNodeInput> nodeInputsMap, Map<Integer, SyncNodeOutput> nodeOutputsMap, int endFlowStatus, boolean end, EndFlowOutput endFlowOutput, long timestamp, long durationTime, String messageType, Map<String, String> meta) {
        this.flowRecordId = flowRecordId;
        this.nodeInputsMap = nodeInputsMap;
        this.nodeOutputsMap = nodeOutputsMap;
        this.endFlowStatus = endFlowStatus;
        this.end = end;
        this.endFlowOutput = endFlowOutput;
        this.timestamp = timestamp;
        this.durationTime = durationTime;
        this.messageType = messageType;
        this.meta = meta;
    }

    public static SyncFlowStatusBuilder builder() {
        return new SyncFlowStatusBuilder();
    }

    public static class SyncFlowStatusBuilder {
        private String flowRecordId;
        private boolean nodeInputsMap$set;
        private Map<Integer, SyncFlowStatus.SyncNodeInput> nodeInputsMap$value;
        private boolean nodeOutputsMap$set;
        private Map<Integer, SyncFlowStatus.SyncNodeOutput> nodeOutputsMap$value;
        private int endFlowStatus;
        private boolean end;

        public SyncFlowStatusBuilder flowRecordId(String flowRecordId) {
            this.flowRecordId = flowRecordId;
            return this;
        }

        private SyncFlowStatus.EndFlowOutput endFlowOutput;
        private long timestamp;
        private long durationTime;
        private boolean messageType$set;
        private String messageType$value;
        private boolean meta$set;
        private Map<String, String> meta$value;

        public SyncFlowStatusBuilder nodeInputsMap(Map<Integer, SyncFlowStatus.SyncNodeInput> nodeInputsMap) {
            this.nodeInputsMap$value = nodeInputsMap;
            this.nodeInputsMap$set = true;
            return this;
        }

        public SyncFlowStatusBuilder nodeOutputsMap(Map<Integer, SyncFlowStatus.SyncNodeOutput> nodeOutputsMap) {
            this.nodeOutputsMap$value = nodeOutputsMap;
            this.nodeOutputsMap$set = true;
            return this;
        }

        public SyncFlowStatusBuilder endFlowStatus(int endFlowStatus) {
            this.endFlowStatus = endFlowStatus;
            return this;
        }

        public SyncFlowStatusBuilder end(boolean end) {
            this.end = end;
            return this;
        }

        public SyncFlowStatusBuilder endFlowOutput(SyncFlowStatus.EndFlowOutput endFlowOutput) {
            this.endFlowOutput = endFlowOutput;
            return this;
        }

        public SyncFlowStatusBuilder timestamp(long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public SyncFlowStatusBuilder durationTime(long durationTime) {
            this.durationTime = durationTime;
            return this;
        }

        public SyncFlowStatusBuilder messageType(String messageType) {
            this.messageType$value = messageType;
            this.messageType$set = true;
            return this;
        }

        public SyncFlowStatusBuilder meta(Map<String, String> meta) {
            this.meta$value = meta;
            this.meta$set = true;
            return this;
        }

        public SyncFlowStatus build() {
            Map<Integer, SyncFlowStatus.SyncNodeInput> nodeInputsMap$value = this.nodeInputsMap$value;
            if (!this.nodeInputsMap$set) nodeInputsMap$value = SyncFlowStatus.$default$nodeInputsMap();
            Map<Integer, SyncFlowStatus.SyncNodeOutput> nodeOutputsMap$value = this.nodeOutputsMap$value;
            if (!this.nodeOutputsMap$set) nodeOutputsMap$value = SyncFlowStatus.$default$nodeOutputsMap();
            String messageType$value = this.messageType$value;
            if (!this.messageType$set) messageType$value = SyncFlowStatus.$default$messageType();
            Map<String, String> meta$value = this.meta$value;
            if (!this.meta$set) meta$value = SyncFlowStatus.$default$meta();
            return new SyncFlowStatus(this.flowRecordId, nodeInputsMap$value, nodeOutputsMap$value, this.endFlowStatus, this.end, this.endFlowOutput, this.timestamp, this.durationTime, messageType$value, meta$value);
        }

        public String toString() {
            return "SyncFlowStatus.SyncFlowStatusBuilder(flowRecordId=" + this.flowRecordId + ", nodeInputsMap$value=" + this.nodeInputsMap$value + ", nodeOutputsMap$value=" + this.nodeOutputsMap$value + ", endFlowStatus=" + this.endFlowStatus + ", end=" + this.end + ", endFlowOutput=" + this.endFlowOutput + ", timestamp=" + this.timestamp + ", durationTime=" + this.durationTime + ", messageType$value=" + this.messageType$value + ", meta$value=" + this.meta$value + ")";
        }

    }

    public String getFlowRecordId() {
        /* 21 */
        return this.flowRecordId;

    }


    public Map<Integer, SyncNodeInput> getNodeInputsMap() {
        /* 24 */
        return this.nodeInputsMap;

    }


    public Map<Integer, SyncNodeOutput> getNodeOutputsMap() {
        /* 27 */
        return this.nodeOutputsMap;

    }

    /* 29 */
    public int getEndFlowStatus() {
        return this.endFlowStatus;
    }

    /* 30 */
    public boolean isEnd() {
        return this.end;
    }

    /* 31 */
    public EndFlowOutput getEndFlowOutput() {
        return this.endFlowOutput;
    }

    /* 32 */
    public long getTimestamp() {
        return this.timestamp;
    }

    public long getDurationTime() {
        /* 33 */
        return this.durationTime;

    }


    public String getMessageType() {
        /* 36 */
        return this.messageType;

    }


    public Map<String, String> getMeta() {
        /* 39 */
        return this.meta;

    }

    public static class SyncNodeInput implements Serializable {
        private int nodeId;
        private List<SyncFlowStatus.SyncNodeInputDetail> inputDetails;

        /* 41 */
        public void setNodeId(int nodeId) {
            this.nodeId = nodeId;
        }

        public void setInputDetails(List<SyncFlowStatus.SyncNodeInputDetail> inputDetails) {
            this.inputDetails = inputDetails;
        }

        public boolean equals(Object o) {
            if (o == this) return true;
            if (!(o instanceof SyncNodeInput)) return false;
            SyncNodeInput other = (SyncNodeInput) o;
            if (!other.canEqual(this)) return false;
            if (getNodeId() != other.getNodeId()) return false;
            Object this$inputDetails = (Object) getInputDetails(), other$inputDetails = (Object) other.getInputDetails();
            return !((this$inputDetails == null) ? (other$inputDetails != null) : !this$inputDetails.equals(other$inputDetails));
        }

        protected boolean canEqual(Object other) {
            return other instanceof SyncNodeInput;
        }

        public int hashCode() {
            int result = 1;
            result = result * 59 + getNodeId();
            Object $inputDetails = (Object) getInputDetails();
            return result * 59 + (($inputDetails == null) ? 43 : $inputDetails.hashCode());
        }

        public String toString() {
            return "SyncFlowStatus.SyncNodeInput(nodeId=" + getNodeId() + ", inputDetails=" + getInputDetails() + ")";
        }

        /* 42 */     SyncNodeInput(int nodeId, List<SyncFlowStatus.SyncNodeInputDetail> inputDetails) {
            this.nodeId = nodeId;
            this.inputDetails = inputDetails;
        }

        public static SyncNodeInputBuilder builder() {
            return new SyncNodeInputBuilder();
        }

        public static class SyncNodeInputBuilder {
            private int nodeId;
            private List<SyncFlowStatus.SyncNodeInputDetail> inputDetails;

            public SyncNodeInputBuilder nodeId(int nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            public SyncNodeInputBuilder inputDetails(List<SyncFlowStatus.SyncNodeInputDetail> inputDetails) {
                this.inputDetails = inputDetails;
                return this;
            }

            public SyncFlowStatus.SyncNodeInput build() {
                return new SyncFlowStatus.SyncNodeInput(this.nodeId, this.inputDetails);
            }

            public String toString() {
                return "SyncFlowStatus.SyncNodeInput.SyncNodeInputBuilder(nodeId=" + this.nodeId + ", inputDetails=" + this.inputDetails + ")";
            }

        }

        /* 44 */
        public int getNodeId() {
            return this.nodeId;
        }

        public List<SyncFlowStatus.SyncNodeInputDetail> getInputDetails() {
            /* 45 */
            return this.inputDetails;

        }
    }

    public static class SyncNodeInputDetail implements Serializable {
        private String name;
        private String value;
        private String valueType;
        private String operator;
        private String name2;
        private String value2;
        private String type2;

        /* 48 */
        public void setName(String name) {
            this.name = name;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public void setValueType(String valueType) {
            this.valueType = valueType;
        }

        public void setOperator(String operator) {
            this.operator = operator;
        }

        public void setName2(String name2) {
            this.name2 = name2;
        }

        public void setValue2(String value2) {
            this.value2 = value2;
        }

        public void setType2(String type2) {
            this.type2 = type2;
        }

        public boolean equals(Object o) {
            if (o == this) return true;
            if (!(o instanceof SyncNodeInputDetail)) return false;
            SyncNodeInputDetail other = (SyncNodeInputDetail) o;
            if (!other.canEqual(this)) return false;
            Object this$name = getName(), other$name = other.getName();
            if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;
            Object this$value = getValue(), other$value = other.getValue();
            if ((this$value == null) ? (other$value != null) : !this$value.equals(other$value)) return false;
            Object this$valueType = getValueType(), other$valueType = other.getValueType();
            if ((this$valueType == null) ? (other$valueType != null) : !this$valueType.equals(other$valueType))
                return false;
            Object this$operator = getOperator(), other$operator = other.getOperator();
            if ((this$operator == null) ? (other$operator != null) : !this$operator.equals(other$operator))
                return false;
            Object this$name2 = getName2(), other$name2 = other.getName2();
            if ((this$name2 == null) ? (other$name2 != null) : !this$name2.equals(other$name2)) return false;
            Object this$value2 = getValue2(), other$value2 = other.getValue2();
            if ((this$value2 == null) ? (other$value2 != null) : !this$value2.equals(other$value2)) return false;
            Object this$type2 = getType2(), other$type2 = other.getType2();
            return !((this$type2 == null) ? (other$type2 != null) : !this$type2.equals(other$type2));
        }

        protected boolean canEqual(Object other) {
            return other instanceof SyncNodeInputDetail;
        }

        public int hashCode() {
            int result = 1;
            Object $name = getName();
            result = result * 59 + (($name == null) ? 43 : $name.hashCode());
            Object $value = getValue();
            result = result * 59 + (($value == null) ? 43 : $value.hashCode());
            Object $valueType = getValueType();
            result = result * 59 + (($valueType == null) ? 43 : $valueType.hashCode());
            Object $operator = getOperator();
            result = result * 59 + (($operator == null) ? 43 : $operator.hashCode());
            Object $name2 = getName2();
            result = result * 59 + (($name2 == null) ? 43 : $name2.hashCode());
            Object $value2 = getValue2();
            result = result * 59 + (($value2 == null) ? 43 : $value2.hashCode());
            Object $type2 = getType2();
            return result * 59 + (($type2 == null) ? 43 : $type2.hashCode());
        }

        public String toString() {
            return "SyncFlowStatus.SyncNodeInputDetail(name=" + getName() + ", value=" + getValue() + ", valueType=" + getValueType() + ", operator=" + getOperator() + ", name2=" + getName2() + ", value2=" + getValue2() + ", type2=" + getType2() + ")";
        }

        /* 49 */     SyncNodeInputDetail(String name, String value, String valueType, String operator, String name2, String value2, String type2) {
            this.name = name;
            this.value = value;
            this.valueType = valueType;
            this.operator = operator;
            this.name2 = name2;
            this.value2 = value2;
            this.type2 = type2;
        }

        public static SyncNodeInputDetailBuilder builder() {
            return new SyncNodeInputDetailBuilder();
        }

        public static class SyncNodeInputDetailBuilder {
            private String name;
            private String value;
            private String valueType;
            private String operator;
            private String name2;
            private String value2;
            private String type2;

            public SyncNodeInputDetailBuilder name(String name) {
                this.name = name;
                return this;
            }

            public SyncNodeInputDetailBuilder value(String value) {
                this.value = value;
                return this;
            }

            public SyncNodeInputDetailBuilder valueType(String valueType) {
                this.valueType = valueType;
                return this;
            }

            public SyncNodeInputDetailBuilder operator(String operator) {
                this.operator = operator;
                return this;
            }

            public SyncNodeInputDetailBuilder name2(String name2) {
                this.name2 = name2;
                return this;
            }

            public SyncNodeInputDetailBuilder value2(String value2) {
                this.value2 = value2;
                return this;
            }

            public SyncNodeInputDetailBuilder type2(String type2) {
                this.type2 = type2;
                return this;
            }

            public SyncFlowStatus.SyncNodeInputDetail build() {
                return new SyncFlowStatus.SyncNodeInputDetail(this.name, this.value, this.valueType, this.operator, this.name2, this.value2, this.type2);
            }

            public String toString() {
                return "SyncFlowStatus.SyncNodeInputDetail.SyncNodeInputDetailBuilder(name=" + this.name + ", value=" + this.value + ", valueType=" + this.valueType + ", operator=" + this.operator + ", name2=" + this.name2 + ", value2=" + this.value2 + ", type2=" + this.type2 + ")";
            }

        }

        /* 51 */
        public String getName() {
            return this.name;
        }

        public String getValue() {
            /* 52 */
            return this.value;

        }

        /* 54 */
        public String getValueType() {
            return this.valueType;
        }

        /* 55 */
        public String getOperator() {
            return this.operator;
        }

        /* 56 */
        public String getName2() {
            return this.name2;
        }

        /* 57 */
        public String getValue2() {
            return this.value2;
        }

        public String getType2() {
            /* 58 */
            return this.type2;

        }
    }

    public static class SyncNodeOutput implements Serializable {
        private int nodeId;
        private String nodeName;
        private int status;
        private String errorInfo;
        private long durationTime;
        private List<SyncFlowStatus.SyncNodeOutputDetail> outputDetails;

        /* 61 */
        public void setNodeId(int nodeId) {
            this.nodeId = nodeId;
        }

        public void setNodeName(String nodeName) {
            this.nodeName = nodeName;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public void setErrorInfo(String errorInfo) {
            this.errorInfo = errorInfo;
        }

        public void setDurationTime(long durationTime) {
            this.durationTime = durationTime;
        }

        public void setOutputDetails(List<SyncFlowStatus.SyncNodeOutputDetail> outputDetails) {
            this.outputDetails = outputDetails;
        }

        public boolean equals(Object o) {
            if (o == this) return true;
            if (!(o instanceof SyncNodeOutput)) return false;
            SyncNodeOutput other = (SyncNodeOutput) o;
            if (!other.canEqual(this)) return false;
            if (getNodeId() != other.getNodeId()) return false;
            if (getStatus() != other.getStatus()) return false;
            if (getDurationTime() != other.getDurationTime()) return false;
            Object this$nodeName = getNodeName(), other$nodeName = other.getNodeName();
            if ((this$nodeName == null) ? (other$nodeName != null) : !this$nodeName.equals(other$nodeName))
                return false;
            Object this$errorInfo = getErrorInfo(), other$errorInfo = other.getErrorInfo();
            if ((this$errorInfo == null) ? (other$errorInfo != null) : !this$errorInfo.equals(other$errorInfo))
                return false;
            Object this$outputDetails = (Object) getOutputDetails(), other$outputDetails = (Object) other.getOutputDetails();
            return !((this$outputDetails == null) ? (other$outputDetails != null) : !this$outputDetails.equals(other$outputDetails));
        }

        protected boolean canEqual(Object other) {
            return other instanceof SyncNodeOutput;
        }

        public int hashCode() {
            int result = 1;
            result = result * 59 + getNodeId();
            result = result * 59 + getStatus();
            long $durationTime = getDurationTime();
            result = result * 59 + (int) ($durationTime >>> 32L ^ $durationTime);
            Object $nodeName = getNodeName();
            result = result * 59 + (($nodeName == null) ? 43 : $nodeName.hashCode());
            Object $errorInfo = getErrorInfo();
            result = result * 59 + (($errorInfo == null) ? 43 : $errorInfo.hashCode());
            Object $outputDetails = (Object) getOutputDetails();
            return result * 59 + (($outputDetails == null) ? 43 : $outputDetails.hashCode());
        }

        public String toString() {
            return "SyncFlowStatus.SyncNodeOutput(nodeId=" + getNodeId() + ", nodeName=" + getNodeName() + ", status=" + getStatus() + ", errorInfo=" + getErrorInfo() + ", durationTime=" + getDurationTime() + ", outputDetails=" + getOutputDetails() + ")";
        }

        /* 62 */     SyncNodeOutput(int nodeId, String nodeName, int status, String errorInfo, long durationTime, List<SyncFlowStatus.SyncNodeOutputDetail> outputDetails) {
            this.nodeId = nodeId;
            this.nodeName = nodeName;
            this.status = status;
            this.errorInfo = errorInfo;
            this.durationTime = durationTime;
            this.outputDetails = outputDetails;
        }

        public static SyncNodeOutputBuilder builder() {
            return new SyncNodeOutputBuilder();
        }

        public static class SyncNodeOutputBuilder {
            private int nodeId;
            private String nodeName;
            private int status;
            private String errorInfo;
            private long durationTime;
            private List<SyncFlowStatus.SyncNodeOutputDetail> outputDetails;

            public SyncNodeOutputBuilder nodeId(int nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            public SyncNodeOutputBuilder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            public SyncNodeOutputBuilder status(int status) {
                this.status = status;
                return this;
            }

            public SyncNodeOutputBuilder errorInfo(String errorInfo) {
                this.errorInfo = errorInfo;
                return this;
            }

            public SyncNodeOutputBuilder durationTime(long durationTime) {
                this.durationTime = durationTime;
                return this;
            }

            public SyncNodeOutputBuilder outputDetails(List<SyncFlowStatus.SyncNodeOutputDetail> outputDetails) {
                this.outputDetails = outputDetails;
                return this;
            }

            public SyncFlowStatus.SyncNodeOutput build() {
                return new SyncFlowStatus.SyncNodeOutput(this.nodeId, this.nodeName, this.status, this.errorInfo, this.durationTime, this.outputDetails);
            }

            public String toString() {
                return "SyncFlowStatus.SyncNodeOutput.SyncNodeOutputBuilder(nodeId=" + this.nodeId + ", nodeName=" + this.nodeName + ", status=" + this.status + ", errorInfo=" + this.errorInfo + ", durationTime=" + this.durationTime + ", outputDetails=" + this.outputDetails + ")";
            }

        }

        /* 64 */
        public int getNodeId() {
            return this.nodeId;
        }

        public String getNodeName() {
            /* 65 */
            return this.nodeName;

        }

        /* 67 */
        public int getStatus() {
            return this.status;
        }

        /* 68 */
        public String getErrorInfo() {
            return this.errorInfo;
        }

        /* 69 */
        public long getDurationTime() {
            return this.durationTime;
        }

        public List<SyncFlowStatus.SyncNodeOutputDetail> getOutputDetails() {
            /* 70 */
            return this.outputDetails;

        }
    }

    public static class SyncNodeOutputDetail implements Serializable {
        private String name;
        private String value;
        private String valueType;

        /* 73 */
        public void setName(String name) {
            this.name = name;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public void setValueType(String valueType) {
            this.valueType = valueType;
        }

        public boolean equals(Object o) {
            if (o == this) return true;
            if (!(o instanceof SyncNodeOutputDetail)) return false;
            SyncNodeOutputDetail other = (SyncNodeOutputDetail) o;
            if (!other.canEqual(this)) return false;
            Object this$name = getName(), other$name = other.getName();
            if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;
            Object this$value = getValue(), other$value = other.getValue();
            if ((this$value == null) ? (other$value != null) : !this$value.equals(other$value)) return false;
            Object this$valueType = getValueType(), other$valueType = other.getValueType();
            return !((this$valueType == null) ? (other$valueType != null) : !this$valueType.equals(other$valueType));
        }

        protected boolean canEqual(Object other) {
            return other instanceof SyncNodeOutputDetail;
        }

        public int hashCode() {
            int result = 1;
            Object $name = getName();
            result = result * 59 + (($name == null) ? 43 : $name.hashCode());
            Object $value = getValue();
            result = result * 59 + (($value == null) ? 43 : $value.hashCode());
            Object $valueType = getValueType();
            return result * 59 + (($valueType == null) ? 43 : $valueType.hashCode());
        }

        public String toString() {
            return "SyncFlowStatus.SyncNodeOutputDetail(name=" + getName() + ", value=" + getValue() + ", valueType=" + getValueType() + ")";
        }

        /* 74 */     SyncNodeOutputDetail(String name, String value, String valueType) {
            this.name = name;
            this.value = value;
            this.valueType = valueType;
        }

        public static SyncNodeOutputDetailBuilder builder() {
            return new SyncNodeOutputDetailBuilder();
        }

        public static class SyncNodeOutputDetailBuilder {
            private String name;
            private String value;
            private String valueType;

            public SyncNodeOutputDetailBuilder name(String name) {
                this.name = name;
                return this;
            }

            public SyncNodeOutputDetailBuilder value(String value) {
                this.value = value;
                return this;
            }

            public SyncNodeOutputDetailBuilder valueType(String valueType) {
                this.valueType = valueType;
                return this;
            }

            public SyncFlowStatus.SyncNodeOutputDetail build() {
                return new SyncFlowStatus.SyncNodeOutputDetail(this.name, this.value, this.valueType);
            }

            public String toString() {
                return "SyncFlowStatus.SyncNodeOutputDetail.SyncNodeOutputDetailBuilder(name=" + this.name + ", value=" + this.value + ", valueType=" + this.valueType + ")";
            }

        }

        /* 76 */
        public String getName() {
            return this.name;
        }

        public String getValue() {
            /* 77 */
            return this.value;

        }

        public String getValueType() {
            /* 79 */
            return this.valueType;

        }
    }

    public static class EndFlowOutput implements Serializable {
        private String answerContent;
        private List<SyncFlowStatus.EndFlowOutputDetail> endFlowOutputDetails;

        /* 82 */
        public void setAnswerContent(String answerContent) {
            this.answerContent = answerContent;
        }

        public void setEndFlowOutputDetails(List<SyncFlowStatus.EndFlowOutputDetail> endFlowOutputDetails) {
            this.endFlowOutputDetails = endFlowOutputDetails;
        }

        public boolean equals(Object o) {
            if (o == this) return true;
            if (!(o instanceof EndFlowOutput)) return false;
            EndFlowOutput other = (EndFlowOutput) o;
            if (!other.canEqual(this)) return false;
            Object this$answerContent = getAnswerContent(), other$answerContent = other.getAnswerContent();
            if ((this$answerContent == null) ? (other$answerContent != null) : !this$answerContent.equals(other$answerContent))
                return false;
            Object this$endFlowOutputDetails = (Object) getEndFlowOutputDetails(), other$endFlowOutputDetails = (Object) other.getEndFlowOutputDetails();
            return !((this$endFlowOutputDetails == null) ? (other$endFlowOutputDetails != null) : !this$endFlowOutputDetails.equals(other$endFlowOutputDetails));
        }

        protected boolean canEqual(Object other) {
            return other instanceof EndFlowOutput;
        }

        public int hashCode() {
            int result = 1;
            Object $answerContent = getAnswerContent();
            result = result * 59 + (($answerContent == null) ? 43 : $answerContent.hashCode());
            Object $endFlowOutputDetails = (Object) getEndFlowOutputDetails();
            return result * 59 + (($endFlowOutputDetails == null) ? 43 : $endFlowOutputDetails.hashCode());
        }

        public String toString() {
            return "SyncFlowStatus.EndFlowOutput(answerContent=" + getAnswerContent() + ", endFlowOutputDetails=" + getEndFlowOutputDetails() + ")";
        }

        /* 83 */     EndFlowOutput(String answerContent, List<SyncFlowStatus.EndFlowOutputDetail> endFlowOutputDetails) {
            this.answerContent = answerContent;
            this.endFlowOutputDetails = endFlowOutputDetails;
        }

        public static EndFlowOutputBuilder builder() {
            return new EndFlowOutputBuilder();
        }

        public static class EndFlowOutputBuilder {
            private String answerContent;
            private List<SyncFlowStatus.EndFlowOutputDetail> endFlowOutputDetails;

            public EndFlowOutputBuilder answerContent(String answerContent) {
                this.answerContent = answerContent;
                return this;
            }

            public EndFlowOutputBuilder endFlowOutputDetails(List<SyncFlowStatus.EndFlowOutputDetail> endFlowOutputDetails) {
                this.endFlowOutputDetails = endFlowOutputDetails;
                return this;
            }

            public SyncFlowStatus.EndFlowOutput build() {
                return new SyncFlowStatus.EndFlowOutput(this.answerContent, this.endFlowOutputDetails);
            }

            public String toString() {
                return "SyncFlowStatus.EndFlowOutput.EndFlowOutputBuilder(answerContent=" + this.answerContent + ", endFlowOutputDetails=" + this.endFlowOutputDetails + ")";
            }

        }

        /* 85 */
        public String getAnswerContent() {
            return this.answerContent;
        }

        public List<SyncFlowStatus.EndFlowOutputDetail> getEndFlowOutputDetails() {
            /* 86 */
            return this.endFlowOutputDetails;

        }
    }

    public static class EndFlowOutputDetail {
        private String name;
        private String value;
        private String valueType;

        /* 89 */
        public void setName(String name) {
            this.name = name;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public void setValueType(String valueType) {
            this.valueType = valueType;
        }

        public boolean equals(Object o) {
            if (o == this) return true;
            if (!(o instanceof EndFlowOutputDetail)) return false;
            EndFlowOutputDetail other = (EndFlowOutputDetail) o;
            if (!other.canEqual(this)) return false;
            Object this$name = getName(), other$name = other.getName();
            if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;
            Object this$value = getValue(), other$value = other.getValue();
            if ((this$value == null) ? (other$value != null) : !this$value.equals(other$value)) return false;
            Object this$valueType = getValueType(), other$valueType = other.getValueType();
            return !((this$valueType == null) ? (other$valueType != null) : !this$valueType.equals(other$valueType));
        }

        protected boolean canEqual(Object other) {
            return other instanceof EndFlowOutputDetail;
        }

        public int hashCode() {
            int result = 1;
            Object $name = getName();
            result = result * 59 + (($name == null) ? 43 : $name.hashCode());
            Object $value = getValue();
            result = result * 59 + (($value == null) ? 43 : $value.hashCode());
            Object $valueType = getValueType();
            return result * 59 + (($valueType == null) ? 43 : $valueType.hashCode());
        }

        public String toString() {
            return "SyncFlowStatus.EndFlowOutputDetail(name=" + getName() + ", value=" + getValue() + ", valueType=" + getValueType() + ")";
        }

        /* 90 */
        public static EndFlowOutputDetailBuilder builder() {
            return new EndFlowOutputDetailBuilder();
        }

        public static class EndFlowOutputDetailBuilder {
            private String name;
            private String value;
            private String valueType;

            public EndFlowOutputDetailBuilder name(String name) {
                this.name = name;
                return this;
            }

            public EndFlowOutputDetailBuilder value(String value) {
                this.value = value;
                return this;
            }

            public EndFlowOutputDetailBuilder valueType(String valueType) {
                this.valueType = valueType;
                return this;
            }

            public SyncFlowStatus.EndFlowOutputDetail build() {
                return new SyncFlowStatus.EndFlowOutputDetail(this.name, this.value, this.valueType);
            }

            public String toString() {
                return "SyncFlowStatus.EndFlowOutputDetail.EndFlowOutputDetailBuilder(name=" + this.name + ", value=" + this.value + ", valueType=" + this.valueType + ")";
            }

        }

        public EndFlowOutputDetail() {
        }

        public EndFlowOutputDetail(String name, String value, String valueType) {
            /* 92 */
            this.name = name;
            this.value = value;
            this.valueType = valueType;

        }

        /* 94 */
        public String getName() {
            return this.name;
        }

        public String getValue() {
            /* 95 */
            return this.value;

        }

        public String getValueType() {
            /* 97 */
            return this.valueType;

        }
    }


}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/flow/SyncFlowStatus.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */