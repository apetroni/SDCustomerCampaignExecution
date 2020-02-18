package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CustomercampaignexecutionsdreferenceidconfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceAgreement;
import io.swagger.model.CustomercampaignexecutionsdreferenceidconfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup;
import io.swagger.model.CustomercampaignexecutionsdreferenceidconfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceSubscription;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SDCustomerCampaignExecutionConfigureOutputModelServiceDomainServiceConfigurationRecord
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class SDCustomerCampaignExecutionConfigureOutputModelServiceDomainServiceConfigurationRecord   {
  @JsonProperty("serviceDomainServiceConfigurationSettingDescription")
  private String serviceDomainServiceConfigurationSettingDescription = null;

  @JsonProperty("serviceDomainServiceConfigurationSetup")
  private CustomercampaignexecutionsdreferenceidconfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup serviceDomainServiceConfigurationSetup = null;

  @JsonProperty("serviceDomainServiceSubscription")
  private CustomercampaignexecutionsdreferenceidconfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceSubscription serviceDomainServiceSubscription = null;

  @JsonProperty("serviceDomainServiceAgreement")
  private CustomercampaignexecutionsdreferenceidconfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceAgreement serviceDomainServiceAgreement = null;

  @JsonProperty("serviceDomainServiceStatus")
  private String serviceDomainServiceStatus = null;

  public SDCustomerCampaignExecutionConfigureOutputModelServiceDomainServiceConfigurationRecord serviceDomainServiceConfigurationSettingDescription(String serviceDomainServiceConfigurationSettingDescription) {
    this.serviceDomainServiceConfigurationSettingDescription = serviceDomainServiceConfigurationSettingDescription;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return serviceDomainServiceConfigurationSettingDescription
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact ")
  
    public String getServiceDomainServiceConfigurationSettingDescription() {
    return serviceDomainServiceConfigurationSettingDescription;
  }

  public void setServiceDomainServiceConfigurationSettingDescription(String serviceDomainServiceConfigurationSettingDescription) {
    this.serviceDomainServiceConfigurationSettingDescription = serviceDomainServiceConfigurationSettingDescription;
  }

  public SDCustomerCampaignExecutionConfigureOutputModelServiceDomainServiceConfigurationRecord serviceDomainServiceConfigurationSetup(CustomercampaignexecutionsdreferenceidconfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup serviceDomainServiceConfigurationSetup) {
    this.serviceDomainServiceConfigurationSetup = serviceDomainServiceConfigurationSetup;
    return this;
  }

  /**
   * Get serviceDomainServiceConfigurationSetup
   * @return serviceDomainServiceConfigurationSetup
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CustomercampaignexecutionsdreferenceidconfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup getServiceDomainServiceConfigurationSetup() {
    return serviceDomainServiceConfigurationSetup;
  }

  public void setServiceDomainServiceConfigurationSetup(CustomercampaignexecutionsdreferenceidconfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup serviceDomainServiceConfigurationSetup) {
    this.serviceDomainServiceConfigurationSetup = serviceDomainServiceConfigurationSetup;
  }

  public SDCustomerCampaignExecutionConfigureOutputModelServiceDomainServiceConfigurationRecord serviceDomainServiceSubscription(CustomercampaignexecutionsdreferenceidconfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceSubscription serviceDomainServiceSubscription) {
    this.serviceDomainServiceSubscription = serviceDomainServiceSubscription;
    return this;
  }

  /**
   * Get serviceDomainServiceSubscription
   * @return serviceDomainServiceSubscription
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CustomercampaignexecutionsdreferenceidconfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceSubscription getServiceDomainServiceSubscription() {
    return serviceDomainServiceSubscription;
  }

  public void setServiceDomainServiceSubscription(CustomercampaignexecutionsdreferenceidconfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceSubscription serviceDomainServiceSubscription) {
    this.serviceDomainServiceSubscription = serviceDomainServiceSubscription;
  }

  public SDCustomerCampaignExecutionConfigureOutputModelServiceDomainServiceConfigurationRecord serviceDomainServiceAgreement(CustomercampaignexecutionsdreferenceidconfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceAgreement serviceDomainServiceAgreement) {
    this.serviceDomainServiceAgreement = serviceDomainServiceAgreement;
    return this;
  }

  /**
   * Get serviceDomainServiceAgreement
   * @return serviceDomainServiceAgreement
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CustomercampaignexecutionsdreferenceidconfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceAgreement getServiceDomainServiceAgreement() {
    return serviceDomainServiceAgreement;
  }

  public void setServiceDomainServiceAgreement(CustomercampaignexecutionsdreferenceidconfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceAgreement serviceDomainServiceAgreement) {
    this.serviceDomainServiceAgreement = serviceDomainServiceAgreement;
  }

  public SDCustomerCampaignExecutionConfigureOutputModelServiceDomainServiceConfigurationRecord serviceDomainServiceStatus(String serviceDomainServiceStatus) {
    this.serviceDomainServiceStatus = serviceDomainServiceStatus;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return serviceDomainServiceStatus
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) ")
  
    public String getServiceDomainServiceStatus() {
    return serviceDomainServiceStatus;
  }

  public void setServiceDomainServiceStatus(String serviceDomainServiceStatus) {
    this.serviceDomainServiceStatus = serviceDomainServiceStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SDCustomerCampaignExecutionConfigureOutputModelServiceDomainServiceConfigurationRecord sdCustomerCampaignExecutionConfigureOutputModelServiceDomainServiceConfigurationRecord = (SDCustomerCampaignExecutionConfigureOutputModelServiceDomainServiceConfigurationRecord) o;
    return Objects.equals(this.serviceDomainServiceConfigurationSettingDescription, sdCustomerCampaignExecutionConfigureOutputModelServiceDomainServiceConfigurationRecord.serviceDomainServiceConfigurationSettingDescription) &&
        Objects.equals(this.serviceDomainServiceConfigurationSetup, sdCustomerCampaignExecutionConfigureOutputModelServiceDomainServiceConfigurationRecord.serviceDomainServiceConfigurationSetup) &&
        Objects.equals(this.serviceDomainServiceSubscription, sdCustomerCampaignExecutionConfigureOutputModelServiceDomainServiceConfigurationRecord.serviceDomainServiceSubscription) &&
        Objects.equals(this.serviceDomainServiceAgreement, sdCustomerCampaignExecutionConfigureOutputModelServiceDomainServiceConfigurationRecord.serviceDomainServiceAgreement) &&
        Objects.equals(this.serviceDomainServiceStatus, sdCustomerCampaignExecutionConfigureOutputModelServiceDomainServiceConfigurationRecord.serviceDomainServiceStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDomainServiceConfigurationSettingDescription, serviceDomainServiceConfigurationSetup, serviceDomainServiceSubscription, serviceDomainServiceAgreement, serviceDomainServiceStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDCustomerCampaignExecutionConfigureOutputModelServiceDomainServiceConfigurationRecord {\n");
    
    sb.append("    serviceDomainServiceConfigurationSettingDescription: ").append(toIndentedString(serviceDomainServiceConfigurationSettingDescription)).append("\n");
    sb.append("    serviceDomainServiceConfigurationSetup: ").append(toIndentedString(serviceDomainServiceConfigurationSetup)).append("\n");
    sb.append("    serviceDomainServiceSubscription: ").append(toIndentedString(serviceDomainServiceSubscription)).append("\n");
    sb.append("    serviceDomainServiceAgreement: ").append(toIndentedString(serviceDomainServiceAgreement)).append("\n");
    sb.append("    serviceDomainServiceStatus: ").append(toIndentedString(serviceDomainServiceStatus)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
