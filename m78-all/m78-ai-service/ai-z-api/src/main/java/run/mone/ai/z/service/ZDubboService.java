package run.mone.ai.z.service;

import com.xiaomi.youpin.infra.rpc.Result;
import java.util.List;
import run.mone.ai.z.dto.HistoryReq;
import run.mone.ai.z.dto.ZAnswer;
import run.mone.ai.z.dto.ZDataBaseInfo;
import run.mone.ai.z.dto.ZDataBaseList;
import run.mone.ai.z.dto.ZDataBaseListReq;
import run.mone.ai.z.dto.ZDataBaseSimple;
import run.mone.ai.z.dto.ZModelDTO;
import run.mone.ai.z.dto.ZPredict;
import run.mone.ai.z.dto.ZPrompt;
import run.mone.ai.z.dto.ZQuestion;
import run.mone.ai.z.dto.ZReq;
import run.mone.ai.z.dto.ZUserInfos;
import run.mone.ai.z.dto.ZUserPrivateReq;
import run.mone.ai.z.dto.sensitiveword.WordDto;

public interface ZDubboService {
  Result<Long> createZ(ZReq paramZReq);
  
  Result<Long> creatModel(ZModelDTO paramZModelDTO);
  
  Result<ZPredict> predict(Long paramLong, ZPredict paramZPredict);
  
  Result<List<ZPredict>> batchPredict(Long paramLong, List<ZPredict> paramList);
  
  Result<Long> createDataBase(ZDataBaseInfo paramZDataBaseInfo);
  
  Result<List<ZDataBaseInfo>> listDataBases(int paramInt);
  
  Result<ZDataBaseInfo> get(long paramLong);
  
  Result<String> prompt(ZPrompt paramZPrompt);
  
  Result<List<ZAnswer>> promptList(ZPrompt paramZPrompt);
  
  Result<String> contextPrompt(ZPrompt paramZPrompt);
  
  Result<String> test(Integer paramInteger);
  
  List<ZDataBaseSimple> list(ZDataBaseListReq paramZDataBaseListReq);
  
  Result<List<ZDataBaseSimple>> listWithPermission(ZDataBaseListReq paramZDataBaseListReq);
  
  Result<ZDataBaseList> listPage(String paramString, int paramInt, ZDataBaseListReq paramZDataBaseListReq);
  
  Result<Integer> update(String paramString, int paramInt, ZDataBaseSimple paramZDataBaseSimple);
  
  Result<Integer> updateUserLabel(ZUserPrivateReq paramZUserPrivateReq);
  
  long newPromptHistory(HistoryReq paramHistoryReq);
  
  Result<Boolean> syncVersion(ZUserInfos paramZUserInfos);
  
  Result<Integer> canCall(String paramString, long paramLong);
  
  Result<List<ZAnswer>> ask(ZQuestion paramZQuestion);
  
  Result<String> getToken(String paramString, int paramInt);
  
  Result<String> getOrGenToken(String paramString, int paramInt);
  
  String getUserName(String paramString);
  
  Boolean adminOrVIP(String paramString);
  
  Long getPoints(String paramString);
  
  String testTimeout(int paramInt);
  
  List<WordDto> getAvailableSensitiveWordConfigs();
  
  List<Long> getPromptIdsByUserWithPrivate(String paramString);
  
  List<Long> getPromptByUserWithTagAndLabel(String paramString1, String paramString2);
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/service/ZDubboService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */