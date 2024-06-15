package run.mone.m78.api;

import java.util.List;
import run.mone.m78.api.bo.im.ExecuteBotReqDTO;
import run.mone.m78.api.bo.im.HasBotReqDTO;
import run.mone.m78.api.bo.im.IMRecordDTO;
import run.mone.m78.api.bo.im.M78IMRelationDTO;

public interface IMRecordProvider {
  List<M78IMRelationDTO> hasBot(HasBotReqDTO paramHasBotReqDTO);
  
  IMRecordDTO get(IMRecordDTO paramIMRecordDTO);
  
  Boolean add(IMRecordDTO paramIMRecordDTO);
  
  Boolean delete(IMRecordDTO paramIMRecordDTO);
  
  String executeBot(ExecuteBotReqDTO paramExecuteBotReqDTO);
  
  String executeBot(String paramString1, Long paramLong, String paramString2, String paramString3);
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/IMRecordProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */