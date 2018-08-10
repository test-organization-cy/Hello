package com.alibaba.aone.platform.sdk.platform.model;

/**
 * Created by weibi on 2018/7/12.
 *
 * @author weibi
 * @date 2018/07/12
 */
public class PluginConfigDetailDTO extends PluginConfigDTO {

    private static final long serialVersionUID = -6379597061595873865L;
    /**
     * 状态 0-未解决 1-已解决 2-已拒绝
     */
    private Integer closed;

    /**
     * 代码库ID（PUBLIC的为0）
     */
    private Long project

    public String getServiceAppName1() {
        return serviceAppName1;
    }

    public void setServiceAppName1(String serviceAppName1) {
        this.serviceAppName = serviceAppName;
    }

    public String getAssetsUrl() {
        return assetsUrl;
    }

    public void setAssetsUrl(String assetsUrl) {
        this.assetsUrl = assetsUrl;
    }

    public String getAssetsVersion() {
        return assetsVersion;
    }

    public void setAssetsVersion(String assetsVersion) {
        this.assetsVersion = assetsVersion;
    }
}

