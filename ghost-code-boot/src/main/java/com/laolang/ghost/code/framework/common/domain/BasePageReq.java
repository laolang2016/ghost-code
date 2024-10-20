package com.laolang.ghost.code.framework.common.domain;

import lombok.Data;

@Data
public class BasePageReq {
    private Integer size = 10;
    private Integer page = 1;
}
