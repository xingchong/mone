package run.mone.m78.api.bo.document;

import java.util.List;
import java.util.Map;

public class DocModification {
    private String documentId;
    private List<Map<String, Object>> rowData;
    private List<Long> rowIds;
    private List<String> columnNames;
    private List<ColumnModification> updateColumnNames;

    public DocModification() {
    }

    public DocModification(String documentId, List<Map<String, Object>> rowData, List<Long> rowIds, List<String> columnNames, List<ColumnModification> updateColumnNames) {
        /* 16 */
        this.documentId = documentId;
        this.rowData = rowData;
        this.rowIds = rowIds;
        this.columnNames = columnNames;
        this.updateColumnNames = updateColumnNames;
        /* 17 */
    }

    public static DocModificationBuilder builder() {
        return new DocModificationBuilder();
    }

    public static class DocModificationBuilder {
        private String documentId;
        private List<Map<String, Object>> rowData;

        public DocModificationBuilder documentId(String documentId) {
            this.documentId = documentId;
            return this;
        }

        private List<Long> rowIds;
        private List<String> columnNames;
        private List<ColumnModification> updateColumnNames;

        public DocModificationBuilder rowData(List<Map<String, Object>> rowData) {
            this.rowData = rowData;
            return this;
        }

        public DocModificationBuilder rowIds(List<Long> rowIds) {
            this.rowIds = rowIds;
            return this;
        }

        public DocModificationBuilder columnNames(List<String> columnNames) {
            this.columnNames = columnNames;
            return this;
        }

        public DocModificationBuilder updateColumnNames(List<ColumnModification> updateColumnNames) {
            this.updateColumnNames = updateColumnNames;
            return this;
        }

        public DocModification build() {
            return new DocModification(this.documentId, this.rowData, this.rowIds, this.columnNames, this.updateColumnNames);
        }

        public String toString() {
            return "DocModification.DocModificationBuilder(documentId=" + this.documentId + ", rowData=" + this.rowData + ", rowIds=" + this.rowIds + ", columnNames=" + this.columnNames + ", updateColumnNames=" + this.updateColumnNames + ")";
        }
    }

    /* 18 */
    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public void setRowData(List<Map<String, Object>> rowData) {
        this.rowData = rowData;
    }

    public void setRowIds(List<Long> rowIds) {
        this.rowIds = rowIds;
    }

    public void setColumnNames(List<String> columnNames) {
        this.columnNames = columnNames;
    }

    public void setUpdateColumnNames(List<ColumnModification> updateColumnNames) {
        this.updateColumnNames = updateColumnNames;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof DocModification)) return false;
        DocModification other = (DocModification) o;
        if (!other.canEqual(this)) return false;
        Object this$documentId = getDocumentId(), other$documentId = other.getDocumentId();
        if ((this$documentId == null) ? (other$documentId != null) : !this$documentId.equals(other$documentId))
            return false;
        Object this$rowData = (Object) getRowData(), other$rowData = (Object) other.getRowData();
        if ((this$rowData == null) ? (other$rowData != null) : !this$rowData.equals(other$rowData)) return false;
        Object this$rowIds = (Object) getRowIds(), other$rowIds = (Object) other.getRowIds();
        if ((this$rowIds == null) ? (other$rowIds != null) : !this$rowIds.equals(other$rowIds)) return false;
        Object this$columnNames = (Object) getColumnNames(), other$columnNames = (Object) other.getColumnNames();
        if ((this$columnNames == null) ? (other$columnNames != null) : !this$columnNames.equals(other$columnNames))
            return false;
        Object this$updateColumnNames = (Object) getUpdateColumnNames(), other$updateColumnNames = (Object) other.getUpdateColumnNames();
        return !((this$updateColumnNames == null) ? (other$updateColumnNames != null) : !this$updateColumnNames.equals(other$updateColumnNames));
    }

    protected boolean canEqual(Object other) {
        return other instanceof DocModification;
    }

    public int hashCode() {
        int result = 1;
        Object $documentId = getDocumentId();
        result = result * 59 + (($documentId == null) ? 43 : $documentId.hashCode());
        Object $rowData = (Object) getRowData();
        result = result * 59 + (($rowData == null) ? 43 : $rowData.hashCode());
        Object $rowIds = (Object) getRowIds();
        result = result * 59 + (($rowIds == null) ? 43 : $rowIds.hashCode());
        Object $columnNames = (Object) getColumnNames();
        result = result * 59 + (($columnNames == null) ? 43 : $columnNames.hashCode());
        Object $updateColumnNames = (Object) getUpdateColumnNames();
        return result * 59 + (($updateColumnNames == null) ? 43 : $updateColumnNames.hashCode());
    }

    public String toString() {
        return "DocModification(documentId=" + getDocumentId() + ", rowData=" + getRowData() + ", rowIds=" + getRowIds() + ", columnNames=" + getColumnNames() + ", updateColumnNames=" + getUpdateColumnNames() + ")";
    }

    public String getDocumentId() {
        /* 21 */
        return this.documentId;
    }

    public List<Map<String, Object>> getRowData() {
        /* 23 */
        return this.rowData;
    }

    public List<Long> getRowIds() {
        /* 25 */
        return this.rowIds;
    }

    public List<String> getColumnNames() {
        /* 27 */
        return this.columnNames;
    }

    public List<ColumnModification> getUpdateColumnNames() {
        /* 29 */
        return this.updateColumnNames;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/document/DocModification.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */