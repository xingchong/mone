package run.mone.ai.z.service;

import com.xiaomi.youpin.infra.rpc.Result;

public interface DubboHealthService {
  Result<String> health();
  
  void testVoid();
  
  String testVoidStr();
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/service/DubboHealthService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */