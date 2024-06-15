package run.mone.m78.api;

import com.xiaomi.data.push.common.Health;
import com.xiaomi.youpin.infra.rpc.Result;

public interface DubboHealthProvider {
  Result<Health> health();
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/DubboHealthProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */