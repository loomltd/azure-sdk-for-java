/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_03_30;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a virtual machine scale set virtual machine profile.
 */
public class VirtualMachineScaleSetVMProfile {
    /**
     * Specifies the operating system settings for the virtual machines in the
     * scale set.
     */
    @JsonProperty(value = "osProfile")
    private VirtualMachineScaleSetOSProfile osProfile;

    /**
     * Specifies the storage settings for the virtual machine disks.
     */
    @JsonProperty(value = "storageProfile")
    private VirtualMachineScaleSetStorageProfile storageProfile;

    /**
     * Specifies properties of the network interfaces of the virtual machines
     * in the scale set.
     */
    @JsonProperty(value = "networkProfile")
    private VirtualMachineScaleSetNetworkProfile networkProfile;

    /**
     * Specifies the boot diagnostic settings state.
     * &lt;br&gt;&lt;br&gt;Minimum api-version: 2015-06-15.
     */
    @JsonProperty(value = "diagnosticsProfile")
    private DiagnosticsProfile diagnosticsProfile;

    /**
     * Specifies a collection of settings for extensions installed on virtual
     * machines in the scale set.
     */
    @JsonProperty(value = "extensionProfile")
    private VirtualMachineScaleSetExtensionProfile extensionProfile;

    /**
     * Specifies that the image or disk that is being used was licensed
     * on-premises. This element is only used for images that contain the
     * Windows Server operating system. &lt;br&gt;&lt;br&gt; Possible values
     * are: &lt;br&gt;&lt;br&gt; Windows_Client &lt;br&gt;&lt;br&gt;
     * Windows_Server &lt;br&gt;&lt;br&gt; If this element is included in a
     * request for an update, the value must match the initial value. This
     * value cannot be updated. &lt;br&gt;&lt;br&gt; For more information, see
     * [Azure Hybrid Use Benefit for Windows
     * Server](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-hybrid-use-benefit-licensing?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json)
     * &lt;br&gt;&lt;br&gt; Minimum api-version: 2015-06-15.
     */
    @JsonProperty(value = "licenseType")
    private String licenseType;

    /**
     * Get the osProfile value.
     *
     * @return the osProfile value
     */
    public VirtualMachineScaleSetOSProfile osProfile() {
        return this.osProfile;
    }

    /**
     * Set the osProfile value.
     *
     * @param osProfile the osProfile value to set
     * @return the VirtualMachineScaleSetVMProfile object itself.
     */
    public VirtualMachineScaleSetVMProfile withOsProfile(VirtualMachineScaleSetOSProfile osProfile) {
        this.osProfile = osProfile;
        return this;
    }

    /**
     * Get the storageProfile value.
     *
     * @return the storageProfile value
     */
    public VirtualMachineScaleSetStorageProfile storageProfile() {
        return this.storageProfile;
    }

    /**
     * Set the storageProfile value.
     *
     * @param storageProfile the storageProfile value to set
     * @return the VirtualMachineScaleSetVMProfile object itself.
     */
    public VirtualMachineScaleSetVMProfile withStorageProfile(VirtualMachineScaleSetStorageProfile storageProfile) {
        this.storageProfile = storageProfile;
        return this;
    }

    /**
     * Get the networkProfile value.
     *
     * @return the networkProfile value
     */
    public VirtualMachineScaleSetNetworkProfile networkProfile() {
        return this.networkProfile;
    }

    /**
     * Set the networkProfile value.
     *
     * @param networkProfile the networkProfile value to set
     * @return the VirtualMachineScaleSetVMProfile object itself.
     */
    public VirtualMachineScaleSetVMProfile withNetworkProfile(VirtualMachineScaleSetNetworkProfile networkProfile) {
        this.networkProfile = networkProfile;
        return this;
    }

    /**
     * Get the diagnosticsProfile value.
     *
     * @return the diagnosticsProfile value
     */
    public DiagnosticsProfile diagnosticsProfile() {
        return this.diagnosticsProfile;
    }

    /**
     * Set the diagnosticsProfile value.
     *
     * @param diagnosticsProfile the diagnosticsProfile value to set
     * @return the VirtualMachineScaleSetVMProfile object itself.
     */
    public VirtualMachineScaleSetVMProfile withDiagnosticsProfile(DiagnosticsProfile diagnosticsProfile) {
        this.diagnosticsProfile = diagnosticsProfile;
        return this;
    }

    /**
     * Get the extensionProfile value.
     *
     * @return the extensionProfile value
     */
    public VirtualMachineScaleSetExtensionProfile extensionProfile() {
        return this.extensionProfile;
    }

    /**
     * Set the extensionProfile value.
     *
     * @param extensionProfile the extensionProfile value to set
     * @return the VirtualMachineScaleSetVMProfile object itself.
     */
    public VirtualMachineScaleSetVMProfile withExtensionProfile(VirtualMachineScaleSetExtensionProfile extensionProfile) {
        this.extensionProfile = extensionProfile;
        return this;
    }

    /**
     * Get the licenseType value.
     *
     * @return the licenseType value
     */
    public String licenseType() {
        return this.licenseType;
    }

    /**
     * Set the licenseType value.
     *
     * @param licenseType the licenseType value to set
     * @return the VirtualMachineScaleSetVMProfile object itself.
     */
    public VirtualMachineScaleSetVMProfile withLicenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }

}