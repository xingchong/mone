package run.mone.m78.api.bo.document;

import java.util.List;
import java.util.Map;


public class DocModificationBuilder {
    private String documentId;
    private List<Map<String, Object>> rowData;
    private List<Long> rowIds;
    private List<String> columnNames;
    private List<ColumnModification> updateColumnNames;

    public DocModificationBuilder documentId(String documentId) {
        /* 17 */
        this.documentId = documentId;
        return this;
    }

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


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/document/DocModification$DocModificationBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */