package run.mone.m78.api;

import com.xiaomi.youpin.infra.rpc.Result;
import java.util.List;
import run.mone.m78.api.bo.gitlab.GitLabReq;
import run.mone.m78.api.bo.gitlab.GitTreeItem;

public interface GitLabService {
  Result<String> getFileContent(GitLabReq paramGitLabReq);
  
  Result<String> parseProjectJavaFile(GitLabReq paramGitLabReq);
  
  Result<List<GitTreeItem>> getProjectStructureTree(GitLabReq paramGitLabReq);
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/GitLabService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */