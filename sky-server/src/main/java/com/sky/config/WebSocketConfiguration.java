package com.sky.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * WebSocket配置类，用于注册WebSocket的Bean
 * 这个配置类通过创建和注册 ServerEndpointExporter Bean，为你的Spring Boot应用程序设置了WebSocket基础设施。
 * 这个Bean确保你的WebSocket端点能够被Spring正确地注册和管理。
 * 这在你想要在应用程序中实现实时、双向通信的WebSocket功能时是一个必要的步骤
 */
@Configuration
public class WebSocketConfiguration {

    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }

}
