  package run.mone.m78.api.bo.flow;

  import java.io.Serializable;

  public class FlowQryParam implements Serializable {
    private Long workSpaceId;
    private String userName;
    private String name;

    public void setWorkSpaceId(Long workSpaceId) {
/* 11 */     this.workSpaceId = workSpaceId; } private Integer publishStatus; private String orderFieldName; private boolean needDetail; private String scale; public void setUserName(String userName) { this.userName = userName; } public void setName(String name) { this.name = name; } public void setPublishStatus(Integer publishStatus) { this.publishStatus = publishStatus; } public void setOrderFieldName(String orderFieldName) { this.orderFieldName = orderFieldName; } public void setNeedDetail(boolean needDetail) { this.needDetail = needDetail; } public void setScale(String scale) { this.scale = scale; } public void setPageNum(Integer pageNum) { this.pageNum = pageNum; } public void setPageSize(Integer pageSize) { this.pageSize = pageSize; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof FlowQryParam)) return false;  FlowQryParam other = (FlowQryParam)o; if (!other.canEqual(this)) return false;  if (isNeedDetail() != other.isNeedDetail()) return false;  Object this$workSpaceId = getWorkSpaceId(), other$workSpaceId = other.getWorkSpaceId(); if ((this$workSpaceId == null) ? (other$workSpaceId != null) : !this$workSpaceId.equals(other$workSpaceId)) return false;  Object this$publishStatus = getPublishStatus(), other$publishStatus = other.getPublishStatus(); if ((this$publishStatus == null) ? (other$publishStatus != null) : !this$publishStatus.equals(other$publishStatus)) return false;  Object this$pageNum = getPageNum(), other$pageNum = other.getPageNum(); if ((this$pageNum == null) ? (other$pageNum != null) : !this$pageNum.equals(other$pageNum)) return false;  Object this$pageSize = getPageSize(), other$pageSize = other.getPageSize(); if ((this$pageSize == null) ? (other$pageSize != null) : !this$pageSize.equals(other$pageSize)) return false;  Object this$userName = getUserName(), other$userName = other.getUserName(); if ((this$userName == null) ? (other$userName != null) : !this$userName.equals(other$userName)) return false;  Object this$name = getName(), other$name = other.getName(); if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;  Object this$orderFieldName = getOrderFieldName(), other$orderFieldName = other.getOrderFieldName(); if ((this$orderFieldName == null) ? (other$orderFieldName != null) : !this$orderFieldName.equals(other$orderFieldName)) return false;  Object this$scale = getScale(), other$scale = other.getScale(); return !((this$scale == null) ? (other$scale != null) : !this$scale.equals(other$scale)); } protected boolean canEqual(Object other) { return other instanceof FlowQryParam; } public int hashCode() {  int  result = 1; result = result * 59 + (isNeedDetail() ? 79 : 97); Object $workSpaceId = getWorkSpaceId(); result = result * 59 + (($workSpaceId == null) ? 43 : $workSpaceId.hashCode()); Object $publishStatus = getPublishStatus(); result = result * 59 + (($publishStatus == null) ? 43 : $publishStatus.hashCode()); Object $pageNum = getPageNum(); result = result * 59 + (($pageNum == null) ? 43 : $pageNum.hashCode()); Object $pageSize = getPageSize(); result = result * 59 + (($pageSize == null) ? 43 : $pageSize.hashCode()); Object $userName = getUserName(); result = result * 59 + (($userName == null) ? 43 : $userName.hashCode()); Object $name = getName(); result = result * 59 + (($name == null) ? 43 : $name.hashCode()); Object $orderFieldName = getOrderFieldName(); result = result * 59 + (($orderFieldName == null) ? 43 : $orderFieldName.hashCode()); Object $scale = getScale(); return result * 59 + (($scale == null) ? 43 : $scale.hashCode()); } public String toString() { return "FlowQryParam(workSpaceId=" + getWorkSpaceId() + ", userName=" + getUserName() + ", name=" + getName() + ", publishStatus=" + getPublishStatus() + ", orderFieldName=" + getOrderFieldName() + ", needDetail=" + isNeedDetail() + ", scale=" + getScale() + ", pageNum=" + getPageNum() + ", pageSize=" + getPageSize() + ")"; }

    public Long getWorkSpaceId() {
/* 14 */     return this.workSpaceId;
    } public String getUserName() {
/* 16 */     return this.userName;
    } public String getName() {
/* 18 */     return this.name;
    }
    public Integer getPublishStatus() {
/* 21 */     return this.publishStatus;
    }
    public String getOrderFieldName() {
/* 24 */     return this.orderFieldName;
    } public boolean isNeedDetail() {
/* 26 */     return this.needDetail;
    }
    public String getScale() {
/* 29 */     return this.scale;
    }
/* 31 */   private Integer pageNum = Integer.valueOf(1); public Integer getPageNum() { return this.pageNum; }

/* 33 */   private Integer pageSize = Integer.valueOf(2147483647); public Integer getPageSize() { return this.pageSize; }

  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/flow/FlowQryParam.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */