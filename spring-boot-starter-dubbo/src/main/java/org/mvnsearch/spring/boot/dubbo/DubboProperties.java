package org.mvnsearch.spring.boot.dubbo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * dubbo properties
 *
 * @author linux_china
 */
@ConfigurationProperties(prefix = "spring.dubbo")
public class DubboProperties {
    private String app;
    private String registry;
    private String protocol = "dubbo";
    private Integer port = 20800;
    private String scan;

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getRegistry() {
        return registry;
    }

    public void setRegistry(String registry) {
        this.registry = registry;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getScan() {
        return scan;
    }

    public void setScan(String scan) {
        this.scan = scan;
    }
}
