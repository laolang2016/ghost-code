package com.laolang.ghost.code.ghost.code.workspace.properties;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Data
@RefreshScope
@Component
@ConfigurationProperties(prefix = "workspace")
public class WorkspaceProperties {

    private Boolean showDemo;
}
