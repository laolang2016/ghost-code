package com.laolang.ghost.code.ghost.code.workspace.logic;

import com.laolang.ghost.code.ghost.code.workspace.rsp.WorkspaceHomeOverviewRsp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class WorkspaceHomeLogic {
    public WorkspaceHomeOverviewRsp overview() {
        WorkspaceHomeOverviewRsp rsp = new WorkspaceHomeOverviewRsp();
        rsp.setTodoCount(0);
        rsp.setUnAuditCount(0);
        rsp.setUnRemindCount(0);
        return rsp;
    }
}
