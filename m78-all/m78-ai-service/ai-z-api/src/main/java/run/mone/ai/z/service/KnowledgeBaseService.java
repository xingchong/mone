package run.mone.ai.z.service;

import com.xiaomi.youpin.infra.rpc.Result;
import java.util.List;
import java.util.Map;
import org.springframework.web.multipart.MultipartFile;
import run.mone.ai.z.dto.ZKnowledgeBaseAnswer;
import run.mone.ai.z.dto.ZKnowledgeBaseDTO;
import run.mone.ai.z.dto.ZKnowledgeBaseFileBlockDTO;
import run.mone.ai.z.dto.ZKnowledgeBaseFilesDTO;
import run.mone.ai.z.dto.ZKnowledgeReq;
import run.mone.ai.z.dto.ZKnowledgeRes;

public interface KnowledgeBaseService {
  Result<ZKnowledgeBaseDTO> create(ZKnowledgeBaseDTO paramZKnowledgeBaseDTO);
  
  Result<Boolean> edit(ZKnowledgeBaseDTO paramZKnowledgeBaseDTO);
  
  Result<Boolean> delete(Long paramLong, String paramString);
  
  Result<List<ZKnowledgeBaseDTO>> listMyKnowledgeBase(String paramString);
  
  Result<List<ZKnowledgeBaseDTO>> listMyKnowledgeBase(String paramString, Map<String, String> paramMap);
  
  Result<ZKnowledgeBaseDTO> getKnowledgeBase(Long paramLong, String paramString);
  
  Result<List<ZKnowledgeBaseDTO>> getKnowledgeBaseByIds(List<Long> paramList);
  
  Result<List<ZKnowledgeBaseFilesDTO>> embeddingFileKnowledge(List<ZKnowledgeBaseFilesDTO> paramList, String paramString);
  
  Result<ZKnowledgeBaseAnswer> summaryInKnowledgeBase(ZKnowledgeReq paramZKnowledgeReq);
  
  Result<List<ZKnowledgeRes>> querySimilarKnowledge(ZKnowledgeReq paramZKnowledgeReq);
  
  Result<List<ZKnowledgeBaseFilesDTO>> listKnowledgeBaseFiles(Long paramLong, List<Long> paramList, String paramString);
  
  Result<List<ZKnowledgeBaseFilesDTO>> listKnowledgeBaseFilesWithContent(Long paramLong, List<Long> paramList, String paramString);
  
  Result<List<ZKnowledgeBaseFileBlockDTO>> listKnowledgeBaseFileBlocks(Long paramLong1, Long paramLong2, String paramString);
  
  Result<ZKnowledgeBaseFileBlockDTO> addOrUpdateKnowledgeBaseFileBlock(Long paramLong, String paramString, ZKnowledgeBaseFileBlockDTO paramZKnowledgeBaseFileBlockDTO);
  
  Result<Boolean> deleteKnowledgeBaseFileBlock(Long paramLong1, String paramString1, Long paramLong2, String paramString2);
  
  Result<Void> deleteFileInKnowledgeBase(Long paramLong, List<Long> paramList, String paramString);
  
  Map<String, String> getOSSPolicy(Long paramLong, String paramString);
  
  Result<String> fileServerUploadFile(MultipartFile paramMultipartFile);
  
  Result<String> getFileContent(Long paramLong, List<Long> paramList, String paramString);
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/service/KnowledgeBaseService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */