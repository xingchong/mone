package run.mone.m78.api.bo.plugins;

import java.io.Serializable;
import java.util.List;
import java.util.Map;


public class BotPluginMeta
        implements Serializable {
    private static final long serialVersionUID = -8187551393789090633L;
    private String desc;
    private Map<String, String> http_headers;
    private String http_method;
    private List<BotPluginDTO.BotPluginMetaParam> input;
    private List<BotPluginDTO.BotPluginMetaParam> output;
    private String display;
    private int resContentType;

    public BotPluginMeta() {
    }

    public BotPluginMeta(String desc, Map<String, String> http_headers, String http_method, List<BotPluginDTO.BotPluginMetaParam> input, List<BotPluginDTO.BotPluginMetaParam> output, String display, int resContentType) {
        /* 74 */
        this.desc = desc;
        this.http_headers = http_headers;
        this.http_method = http_method;
        this.input = input;
        this.output = output;
        this.display = display;
        this.resContentType = resContentType;
        /* 75 */
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setHttp_headers(Map<String, String> http_headers) {
        this.http_headers = http_headers;
    }

    public void setHttp_method(String http_method) {
        this.http_method = http_method;
    }

    public void setInput(List<BotPluginDTO.BotPluginMetaParam> input) {
        this.input = input;
    }

    public void setOutput(List<BotPluginDTO.BotPluginMetaParam> output) {
        this.output = output;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public void setResContentType(int resContentType) {
        this.resContentType = resContentType;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof BotPluginMeta)) return false;
        BotPluginMeta other = (BotPluginMeta) o;
        if (!other.canEqual(this)) return false;
        if (getResContentType() != other.getResContentType()) return false;
        Object this$desc = getDesc(), other$desc = other.getDesc();
        if ((this$desc == null) ? (other$desc != null) : !this$desc.equals(other$desc)) return false;
        Object this$http_headers = (Object) getHttp_headers(), other$http_headers = (Object) other.getHttp_headers();
        if ((this$http_headers == null) ? (other$http_headers != null) : !this$http_headers.equals(other$http_headers))
            return false;
        Object this$http_method = getHttp_method(), other$http_method = other.getHttp_method();
        if ((this$http_method == null) ? (other$http_method != null) : !this$http_method.equals(other$http_method))
            return false;
        Object this$input = (Object) getInput(), other$input = (Object) other.getInput();
        if ((this$input == null) ? (other$input != null) : !this$input.equals(other$input)) return false;
        Object this$output = (Object) getOutput(), other$output = (Object) other.getOutput();
        if ((this$output == null) ? (other$output != null) : !this$output.equals(other$output)) return false;
        Object this$display = getDisplay(), other$display = other.getDisplay();
        return !((this$display == null) ? (other$display != null) : !this$display.equals(other$display));
    }

    protected boolean canEqual(Object other) {
        return other instanceof BotPluginMeta;
    }

    public int hashCode() {
        int result = 1;
        result = result * 59 + getResContentType();
        Object $desc = getDesc();
        result = result * 59 + (($desc == null) ? 43 : $desc.hashCode());
        Object $http_headers = (Object) getHttp_headers();
        result = result * 59 + (($http_headers == null) ? 43 : $http_headers.hashCode());
        Object $http_method = getHttp_method();
        result = result * 59 + (($http_method == null) ? 43 : $http_method.hashCode());
        Object $input = (Object) getInput();
        result = result * 59 + (($input == null) ? 43 : $input.hashCode());
        Object $output = (Object) getOutput();
        result = result * 59 + (($output == null) ? 43 : $output.hashCode());
        Object $display = getDisplay();
        return result * 59 + (($display == null) ? 43 : $display.hashCode());
    }

    public String toString() {
        return "BotPluginDTO.BotPluginMeta(desc=" + getDesc() + ", http_headers=" + getHttp_headers() + ", http_method=" + getHttp_method() + ", input=" + getInput() + ", output=" + getOutput() + ", display=" + getDisplay() + ", resContentType=" + getResContentType() + ")";
    }

    /* 76 */
    public static BotPluginMetaBuilder builder() {
        return new BotPluginMetaBuilder();
    }

    public static class BotPluginMetaBuilder {
        private String desc;
        private Map<String, String> http_headers;
        private String http_method;

        public BotPluginMetaBuilder desc(String desc) {
            this.desc = desc;
            return this;
        }

        private List<BotPluginDTO.BotPluginMetaParam> input;
        private List<BotPluginDTO.BotPluginMetaParam> output;
        private String display;
        private int resContentType;

        public BotPluginMetaBuilder http_headers(Map<String, String> http_headers) {
            this.http_headers = http_headers;
            return this;
        }

        public BotPluginMetaBuilder http_method(String http_method) {
            this.http_method = http_method;
            return this;
        }

        public BotPluginMetaBuilder input(List<BotPluginDTO.BotPluginMetaParam> input) {
            this.input = input;
            return this;
        }

        public BotPluginMetaBuilder output(List<BotPluginDTO.BotPluginMetaParam> output) {
            this.output = output;
            return this;
        }

        public BotPluginMetaBuilder display(String display) {
            this.display = display;
            return this;
        }

        public BotPluginMetaBuilder resContentType(int resContentType) {
            this.resContentType = resContentType;
            return this;
        }

        public BotPluginDTO.BotPluginMeta build() {
            return new BotPluginDTO.BotPluginMeta(this.desc, this.http_headers, this.http_method, this.input, this.output, this.display, this.resContentType);
        }

        public String toString() {
            return "BotPluginDTO.BotPluginMeta.BotPluginMetaBuilder(desc=" + this.desc + ", http_headers=" + this.http_headers + ", http_method=" + this.http_method + ", input=" + this.input + ", output=" + this.output + ", display=" + this.display + ", resContentType=" + this.resContentType + ")";
        }
    }


    public String getDesc() {
        /* 81 */
        return this.desc;
        /* 82 */
    }

    public Map<String, String> getHttp_headers() {
        return this.http_headers;
    }

    /* 83 */
    public String getHttp_method() {
        return this.http_method;
    }

    /* 84 */
    public List<BotPluginDTO.BotPluginMetaParam> getInput() {
        return this.input;
    }

    /* 85 */
    public List<BotPluginDTO.BotPluginMetaParam> getOutput() {
        return this.output;
    }

    public String getDisplay() {
        /* 86 */
        return this.display;
    }

    public int getResContentType() {
        /* 90 */
        return this.resContentType;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/plugins/BotPluginDTO$BotPluginMeta.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */