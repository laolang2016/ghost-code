package com.laolang.ghost.code.ghost.code.workspace.controller;

import com.laolang.ghost.code.framework.common.domain.R;
import com.laolang.ghost.code.ghost.code.workspace.logic.WorkspaceHomeLogic;
import com.laolang.ghost.code.ghost.code.workspace.rsp.WorkspaceHomeOverviewRsp;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("ghost/code/workspace")
@RestController
public class WorkspaceHomeController {

    private final WorkspaceHomeLogic workspaceHomeLogic;

    @PostMapping("overview")
    public R<WorkspaceHomeOverviewRsp> overview(){
        return R.ok(workspaceHomeLogic.overview());
    }

}
