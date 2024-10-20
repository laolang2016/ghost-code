package com.laolang.ghost.code.ghost.code.workspace.rsp;

import lombok.Data;

@Data
public class WorkspaceHomeOverviewRsp {

    private Integer todoCount;
    private Integer unAuditCount;
    private Integer unRemindCount;
}
