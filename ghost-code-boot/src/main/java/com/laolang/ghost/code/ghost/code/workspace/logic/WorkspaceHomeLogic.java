package com.laolang.ghost.code.ghost.code.workspace.logic;

import com.laolang.ghost.code.ghost.code.workspace.properties.WorkspaceProperties;
import com.laolang.ghost.code.ghost.code.workspace.rsp.WorkspaceHomeOverviewRsp;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class WorkspaceHomeLogic {

    private final WorkspaceProperties workspaceProperties;

    public WorkspaceHomeOverviewRsp overview() {
        log.info("showDemo:{}", workspaceProperties.getShowDemo());

        WorkspaceHomeOverviewRsp rsp = new WorkspaceHomeOverviewRsp();
        rsp.setTodoCount(0);
        rsp.setUnAuditCount(0);
        rsp.setUnRemindCount(0);
        return rsp;
    }
}
