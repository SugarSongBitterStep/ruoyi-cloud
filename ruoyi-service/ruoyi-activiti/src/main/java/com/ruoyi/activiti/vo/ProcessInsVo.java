package com.ruoyi.activiti.vo;

import lombok.Data;
import org.activiti.engine.runtime.ProcessInstance;

/**
 * <p>File：ProcessInsVo.java</p>
 * <p>Title: 流程实例视图</p>
 * <p>Description:</p>
 * <p>Copyright: Copyright (c) 2020 2020年1月6日 下午1:29:16</p>
 * <p>Company: zmrit.com </p>
 *
 * @author zmr
 * @version 1.0
 */
@Data
public class ProcessInsVo {
    private final String id;

    private final String name;

    private final String key;

    private final Integer version;

    private final String description;

    private final String businessKey;

    private String tableId;

    private final String parentId;

    private final String procDefId;

    private final String procInstId;

    private final String actId;

    private final Boolean isSuspended;

    private final String tenantId;

    private final String deployId;

    private String currTaskName;

    private String routeName;

    private String applyer;

    public ProcessInsVo(ProcessInstance pi) {
        this.id = pi.getId();
        this.name = pi.getName();
        this.key = pi.getProcessDefinitionKey();
        this.version = pi.getProcessDefinitionVersion();
        this.description = pi.getDescription();
        this.businessKey = pi.getBusinessKey();
        this.parentId = pi.getParentId();
        this.procDefId = pi.getProcessDefinitionId();
        this.procInstId = pi.getProcessInstanceId();
        this.actId = pi.getActivityId();
        this.isSuspended = pi.isSuspended();
        this.tenantId = pi.getTenantId();
        this.deployId = pi.getDeploymentId();
    }
}
