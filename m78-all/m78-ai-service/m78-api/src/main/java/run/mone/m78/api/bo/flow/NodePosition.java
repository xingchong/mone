package run.mone.m78.api.bo.flow;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NodePosition implements Serializable {
    private String x;
    private String y;
}

//    public void setX(String x) {
//        /* 44 */
//        this.x = x;
//    }
//
//    public void setY(String y) {
//        this.y = y;
//    }
//
//    public boolean equals(Object o) {
//        if (o == this) return true;
//        if (!(o instanceof NodePosition)) return false;
//        NodePosition other = (NodePosition) o;
//        if (!other.canEqual(this)) return false;
//        Object this$x = getX(), other$x = other.getX();
//        if ((this$x == null) ? (other$x != null) : !this$x.equals(other$x)) return false;
//        Object this$y = getY(), other$y = other.getY();
//        return !((this$y == null) ? (other$y != null) : !this$y.equals(other$y));
//    }
//
//    protected boolean canEqual(Object other) {
//        return other instanceof NodePosition;
//    }
//
//    public int hashCode() {
//        int result = 1;
//        Object $x = getX();
//        result = result * 59 + (($x == null) ? 43 : $x.hashCode());
//        Object $y = getY();
//        return result * 59 + (($y == null) ? 43 : $y.hashCode());
//    }
//
//    public String toString() {
//        return "NodeInfo.NodePosition(x=" + getX() + ", y=" + getY() + ")";
//    }
//
//    /* 46 */
//    public String getX() {
//        return this.x;
//    }
//
//    public String getY() {
//        /* 47 */
//        return this.y;
//    }
//}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/flow/NodeInfo$NodePosition.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */