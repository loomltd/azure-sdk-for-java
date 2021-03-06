/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties that define a Step group in a rollout.
 */
public class StepGroup {
    /**
     * The name of the step group.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The list of step group names on which this step group depends on.
     */
    @JsonProperty(value = "dependsOnStepGroups")
    private List<String> dependsOnStepGroups;

    /**
     * The list of steps to be run before deploying the target.
     */
    @JsonProperty(value = "preDeploymentSteps")
    private List<PrePostStep> preDeploymentSteps;

    /**
     * The resource Id of service unit to be deployed. The service unit should
     * be from the service topology referenced in targetServiceTopologyId.
     */
    @JsonProperty(value = "deploymentTargetId", required = true)
    private String deploymentTargetId;

    /**
     * The list of steps to be run after deploying the target.
     */
    @JsonProperty(value = "postDeploymentSteps")
    private List<PrePostStep> postDeploymentSteps;

    /**
     * Get the name of the step group.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the step group.
     *
     * @param name the name value to set
     * @return the StepGroup object itself.
     */
    public StepGroup withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the list of step group names on which this step group depends on.
     *
     * @return the dependsOnStepGroups value
     */
    public List<String> dependsOnStepGroups() {
        return this.dependsOnStepGroups;
    }

    /**
     * Set the list of step group names on which this step group depends on.
     *
     * @param dependsOnStepGroups the dependsOnStepGroups value to set
     * @return the StepGroup object itself.
     */
    public StepGroup withDependsOnStepGroups(List<String> dependsOnStepGroups) {
        this.dependsOnStepGroups = dependsOnStepGroups;
        return this;
    }

    /**
     * Get the list of steps to be run before deploying the target.
     *
     * @return the preDeploymentSteps value
     */
    public List<PrePostStep> preDeploymentSteps() {
        return this.preDeploymentSteps;
    }

    /**
     * Set the list of steps to be run before deploying the target.
     *
     * @param preDeploymentSteps the preDeploymentSteps value to set
     * @return the StepGroup object itself.
     */
    public StepGroup withPreDeploymentSteps(List<PrePostStep> preDeploymentSteps) {
        this.preDeploymentSteps = preDeploymentSteps;
        return this;
    }

    /**
     * Get the resource Id of service unit to be deployed. The service unit should be from the service topology referenced in targetServiceTopologyId.
     *
     * @return the deploymentTargetId value
     */
    public String deploymentTargetId() {
        return this.deploymentTargetId;
    }

    /**
     * Set the resource Id of service unit to be deployed. The service unit should be from the service topology referenced in targetServiceTopologyId.
     *
     * @param deploymentTargetId the deploymentTargetId value to set
     * @return the StepGroup object itself.
     */
    public StepGroup withDeploymentTargetId(String deploymentTargetId) {
        this.deploymentTargetId = deploymentTargetId;
        return this;
    }

    /**
     * Get the list of steps to be run after deploying the target.
     *
     * @return the postDeploymentSteps value
     */
    public List<PrePostStep> postDeploymentSteps() {
        return this.postDeploymentSteps;
    }

    /**
     * Set the list of steps to be run after deploying the target.
     *
     * @param postDeploymentSteps the postDeploymentSteps value to set
     * @return the StepGroup object itself.
     */
    public StepGroup withPostDeploymentSteps(List<PrePostStep> postDeploymentSteps) {
        this.postDeploymentSteps = postDeploymentSteps;
        return this;
    }

}
