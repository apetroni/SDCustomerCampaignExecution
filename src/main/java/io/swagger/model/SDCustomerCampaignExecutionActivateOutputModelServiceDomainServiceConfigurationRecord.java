package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CustomercampaignexecutionactivationServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup;
import io.swagger.model.SDCustomerCampaignExecutionActivateOutputModelServiceDomainServiceConfigurationRecord1ServiceDomainServiceAgreement;
import io.swagger.model.SDCustomerCampaignExecutionActivateOutputModelServiceDomainServiceConfigurationRecord1ServiceDomainServiceSubscription;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SDCustomerCampaignExecutionActivateOutputModelServiceDomainServiceConfigurationRecord
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class SDCustomerCampaignExecutionActivateOutputModelServiceDomainServiceConfigurationRecord   {
  @JsonProperty("serviceDomainServiceConfigurationSettingReference")
  private String serviceDomainServiceConfigurationSettingReference = null;

  @JsonProperty("serviceDomainServiceConfigurationSettingDescription")
  private String serviceDomainServiceConfigurationSettingDescription = null;

  @JsonProperty("serviceDomainServiceConfigurationSetup")
  private CustomercampaignexecutionactivationServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup serviceDomainServiceConfigurationSetup = null;

  @JsonProperty("serviceDomainServiceSubscription")
  private SDCustomerCampaignExecutionActivateOutputModelServiceDomainServiceConfigurationRecord1ServiceDomainServiceSubscription serviceDomainServiceSubscription = null;

  @JsonProperty("serviceDomainServiceAgreement")
  private SDCustomerCampaignExecutionActivateOutputModelServiceDomainServiceConfigurationRecord1ServiceDomainServiceAgreement serviceDomainServiceAgreement = null;

  @JsonProperty("serviceDomainServiceStatus")
  private String serviceDomainServiceStatus = null;

  public SDCustomerCampaignExecutionActivateOutputModelServiceDomainServiceConfigurationRecord serviceDomainServiceConfigurationSettingReference(String serviceDomainServiceConfigurationSettingReference) {
    this.serviceDomainServiceConfigurationSettingReference = serviceDomainServiceConfigurationSettingReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return serviceDomainServiceConfigurationSettingReference
  **/
  @ApiModelProperty(example = "700761", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service ")
  
    public String getServiceDomainServiceConfigurationSettingReference() {
    return serviceDomainServiceConfigurationSettingReference;
  }

  public void setServiceDomainServiceConfigurationSettingReference(String serviceDomainServiceConfigurationSettingReference) {
    this.serviceDomainServiceConfigurationSettingReference = serviceDomainServiceConfigurationSettingReference;
  }

  public SDCustomerCampaignExecutionActivateOutputModelServiceDomainServiceConfigurationRecord serviceDomainServiceConfigurationSettingDescription(String serviceDomainServiceConfigurationSettingDescription) {
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

  public SDCustomerCampaignExecutionActivateOutputModelServiceDomainServiceConfigurationRecord serviceDomainServiceConfigurationSetup(CustomercampaignexecutionactivationServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup serviceDomainServiceConfigurationSetup) {
    this.serviceDomainServiceConfigurationSetup = serviceDomainServiceConfigurationSetup;
    return this;
  }

  /**
   * Get serviceDomainServiceConfigurationSetup
   * @return serviceDomainServiceConfigurationSetup
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CustomercampaignexecutionactivationServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup getServiceDomainServiceConfigurationSetup() {
    return serviceDomainServiceConfigurationSetup;
  }

  public void setServiceDomainServiceConfigurationSetup(CustomercampaignexecutionactivationServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup serviceDomainServiceConfigurationSetup) {
    this.serviceDomainServiceConfigurationSetup = serviceDomainServiceConfigurationSetup;
  }

  public SDCustomerCampaignExecutionActivateOutputModelServiceDomainServiceConfigurationRecord serviceDomainServiceSubscription(SDCustomerCampaignExecutionActivateOutputModelServiceDomainServiceConfigurationRecord1ServiceDomainServiceSubscription serviceDomainServiceSubscription) {
    this.serviceDomainServiceSubscription = serviceDomainServiceSubscription;
    return this;
  }

  /**
   * Get serviceDomainServiceSubscription
   * @return serviceDomainServiceSubscription
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SDCustomerCampaignExecutionActivateOutputModelServiceDomainServiceConfigurationRecord1ServiceDomainServiceSubscription getServiceDomainServiceSubscription() {
    return serviceDomainServiceSubscription;
  }

  public void setServiceDomainServiceSubscription(SDCustomerCampaignExecutionActivateOutputModelServiceDomainServiceConfigurationRecord1ServiceDomainServiceSubscription serviceDomainServiceSubscription) {
    this.serviceDomainServiceSubscription = serviceDomainServiceSubscription;
  }

  public SDCustomerCampaignExecutionActivateOutputModelServiceDomainServiceConfigurationRecord serviceDomainServiceAgreement(SDCustomerCampaignExecutionActivateOutputModelServiceDomainServiceConfigurationRecord1ServiceDomainServiceAgreement serviceDomainServiceAgreement) {
    this.serviceDomainServiceAgreement = serviceDomainServiceAgreement;
    return this;
  }

  /**
   * Get serviceDomainServiceAgreement
   * @return serviceDomainServiceAgreement
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SDCustomerCampaignExecutionActivateOutputModelServiceDomainServiceConfigurationRecord1ServiceDomainServiceAgreement getServiceDomainServiceAgreement() {
    return serviceDomainServiceAgreement;
  }

  public void setServiceDomainServiceAgreement(SDCustomerCampaignExecutionActivateOutputModelServiceDomainServiceConfigurationRecord1ServiceDomainServiceAgreement serviceDomainServiceAgreement) {
    this.serviceDomainServiceAgreement = serviceDomainServiceAgreement;
  }

  public SDCustomerCampaignExecutionActivateOutputModelServiceDomainServiceConfigurationRecord serviceDomainServiceStatus(String serviceDomainServiceStatus) {
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
    SDCustomerCampaignExecutionActivateOutputModelServiceDomainServiceConfigurationRecord sdCustomerCampaignExecutionActivateOutputModelServiceDomainServiceConfigurationRecord = (SDCustomerCampaignExecutionActivateOutputModelServiceDomainServiceConfigurationRecord) o;
    return Objects.equals(this.serviceDomainServiceConfigurationSettingReference, sdCustomerCampaignExecutionActivateOutputModelServiceDomainServiceConfigurationRecord.serviceDomainServiceConfigurationSettingReference) &&
        Objects.equals(this.serviceDomainServiceConfigurationSettingDescription, sdCustomerCampaignExecutionActivateOutputModelServiceDomainServiceConfigurationRecord.serviceDomainServiceConfigurationSettingDescription) &&
        Objects.equals(this.serviceDomainServiceConfigurationSetup, sdCustomerCampaignExecutionActivateOutputModelServiceDomainServiceConfigurationRecord.serviceDomainServiceConfigurationSetup) &&
        Objects.equals(this.serviceDomainServiceSubscription, sdCustomerCampaignExecutionActivateOutputModelServiceDomainServiceConfigurationRecord.serviceDomainServiceSubscription) &&
        Objects.equals(this.serviceDomainServiceAgreement, sdCustomerCampaignExecutionActivateOutputModelServiceDomainServiceConfigurationRecord.serviceDomainServiceAgreement) &&
        Objects.equals(this.serviceDomainServiceStatus, sdCustomerCampaignExecutionActivateOutputModelServiceDomainServiceConfigurationRecord.serviceDomainServiceStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDomainServiceConfigurationSettingReference, serviceDomainServiceConfigurationSettingDescription, serviceDomainServiceConfigurationSetup, serviceDomainServiceSubscription, serviceDomainServiceAgreement, serviceDomainServiceStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDCustomerCampaignExecutionActivateOutputModelServiceDomainServiceConfigurationRecord {\n");
    
    sb.append("    serviceDomainServiceConfigurationSettingReference: ").append(toIndentedString(serviceDomainServiceConfigurationSettingReference)).append("\n");
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
