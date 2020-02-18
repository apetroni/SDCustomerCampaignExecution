package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainOfferedService1ServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord   {
  @JsonProperty("serviceDomainServiceType")
  private String serviceDomainServiceType = null;

  @JsonProperty("serviceDomainServiceVersion")
  private String serviceDomainServiceVersion = null;

  @JsonProperty("serviceDomainServiceDescription")
  private String serviceDomainServiceDescription = null;

  @JsonProperty("serviceDomainServicePoliciesandGuidelines")
  private SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainOfferedService1ServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines serviceDomainServicePoliciesandGuidelines = null;

  @JsonProperty("serviceDomainServiceSchedule")
  private String serviceDomainServiceSchedule = null;

  public SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord serviceDomainServiceType(String serviceDomainServiceType) {
    this.serviceDomainServiceType = serviceDomainServiceType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return serviceDomainServiceType
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered ")
  
    public String getServiceDomainServiceType() {
    return serviceDomainServiceType;
  }

  public void setServiceDomainServiceType(String serviceDomainServiceType) {
    this.serviceDomainServiceType = serviceDomainServiceType;
  }

  public SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord serviceDomainServiceVersion(String serviceDomainServiceVersion) {
    this.serviceDomainServiceVersion = serviceDomainServiceVersion;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return serviceDomainServiceVersion
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate ")
  
    public String getServiceDomainServiceVersion() {
    return serviceDomainServiceVersion;
  }

  public void setServiceDomainServiceVersion(String serviceDomainServiceVersion) {
    this.serviceDomainServiceVersion = serviceDomainServiceVersion;
  }

  public SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord serviceDomainServiceDescription(String serviceDomainServiceDescription) {
    this.serviceDomainServiceDescription = serviceDomainServiceDescription;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  
   * @return serviceDomainServiceDescription
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  ")
  
    public String getServiceDomainServiceDescription() {
    return serviceDomainServiceDescription;
  }

  public void setServiceDomainServiceDescription(String serviceDomainServiceDescription) {
    this.serviceDomainServiceDescription = serviceDomainServiceDescription;
  }

  public SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord serviceDomainServicePoliciesandGuidelines(SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainOfferedService1ServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines serviceDomainServicePoliciesandGuidelines) {
    this.serviceDomainServicePoliciesandGuidelines = serviceDomainServicePoliciesandGuidelines;
    return this;
  }

  /**
   * Get serviceDomainServicePoliciesandGuidelines
   * @return serviceDomainServicePoliciesandGuidelines
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainOfferedService1ServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines getServiceDomainServicePoliciesandGuidelines() {
    return serviceDomainServicePoliciesandGuidelines;
  }

  public void setServiceDomainServicePoliciesandGuidelines(SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainOfferedService1ServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines serviceDomainServicePoliciesandGuidelines) {
    this.serviceDomainServicePoliciesandGuidelines = serviceDomainServicePoliciesandGuidelines;
  }

  public SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord serviceDomainServiceSchedule(String serviceDomainServiceSchedule) {
    this.serviceDomainServiceSchedule = serviceDomainServiceSchedule;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return serviceDomainServiceSchedule
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available ")
  
    public String getServiceDomainServiceSchedule() {
    return serviceDomainServiceSchedule;
  }

  public void setServiceDomainServiceSchedule(String serviceDomainServiceSchedule) {
    this.serviceDomainServiceSchedule = serviceDomainServiceSchedule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord sdCustomerCampaignExecutionRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord = (SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord) o;
    return Objects.equals(this.serviceDomainServiceType, sdCustomerCampaignExecutionRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord.serviceDomainServiceType) &&
        Objects.equals(this.serviceDomainServiceVersion, sdCustomerCampaignExecutionRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord.serviceDomainServiceVersion) &&
        Objects.equals(this.serviceDomainServiceDescription, sdCustomerCampaignExecutionRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord.serviceDomainServiceDescription) &&
        Objects.equals(this.serviceDomainServicePoliciesandGuidelines, sdCustomerCampaignExecutionRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord.serviceDomainServicePoliciesandGuidelines) &&
        Objects.equals(this.serviceDomainServiceSchedule, sdCustomerCampaignExecutionRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord.serviceDomainServiceSchedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDomainServiceType, serviceDomainServiceVersion, serviceDomainServiceDescription, serviceDomainServicePoliciesandGuidelines, serviceDomainServiceSchedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord {\n");
    
    sb.append("    serviceDomainServiceType: ").append(toIndentedString(serviceDomainServiceType)).append("\n");
    sb.append("    serviceDomainServiceVersion: ").append(toIndentedString(serviceDomainServiceVersion)).append("\n");
    sb.append("    serviceDomainServiceDescription: ").append(toIndentedString(serviceDomainServiceDescription)).append("\n");
    sb.append("    serviceDomainServicePoliciesandGuidelines: ").append(toIndentedString(serviceDomainServicePoliciesandGuidelines)).append("\n");
    sb.append("    serviceDomainServiceSchedule: ").append(toIndentedString(serviceDomainServiceSchedule)).append("\n");
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
