package run.mone.ai.z.service;

import com.xiaomi.youpin.infra.rpc.Result;
import java.util.List;
import java.util.Map;
import run.mone.ai.z.dto.ZModelDTO;
import run.mone.ai.z.dto.ZModelListReq;
import run.mone.ai.z.dto.ZPageList;

public interface ZModelDubboService {
  Result<List<Map<String, Object>>> typesEnum();
  
  Result<List<String>> ownershipEnum();
  
  Result<ZPageList<ZModelDTO>> list(ZModelListReq paramZModelListReq);
  
  Result<ZPageList<ZModelDTO>> listInner(ZModelListReq paramZModelListReq);
  
  Result<Long> create(ZModelDTO paramZModelDTO);
  
  Result<ZModelDTO> get(ZModelDTO paramZModelDTO);
  
  Result<Integer> update(ZModelDTO paramZModelDTO);
  
  Result<Integer> delete(ZModelDTO paramZModelDTO);
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/service/ZModelDubboService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */