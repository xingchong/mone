package run.mone.m78.api;

import com.xiaomi.youpin.infra.rpc.Result;
import run.mone.m78.api.bo.code.CodeDTO;

public interface CodeProvider {
  Result<CodeDTO> getCodeDetailById(Long paramLong);
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/CodeProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */