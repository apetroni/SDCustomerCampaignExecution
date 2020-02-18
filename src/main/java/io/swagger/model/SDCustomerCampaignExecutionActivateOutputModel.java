package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SDCustomerCampaignExecutionActivateOutputModelServiceDomainServiceConfigurationRecord1;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SDCustomerCampaignExecutionActivateOutputModel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class SDCustomerCampaignExecutionActivateOutputModel   {
  @JsonProperty("serviceDomainActivationActionTaskReference")
  private String serviceDomainActivationActionTaskReference = null;

  @JsonProperty("serviceDomainActivationActionTaskRecord")
  private Object serviceDomainActivationActionTaskRecord = null;

  @JsonProperty("serviceDomainServicingSessionReference")
  private String serviceDomainServicingSessionReference = null;

  @JsonProperty("serviceDomainServicingSessionRecord")
  private Object serviceDomainServicingSessionRecord = null;

  @JsonProperty("serviceDomainServiceConfigurationRecord")
  private SDCustomerCampaignExecutionActivateOutputModelServiceDomainServiceConfigurationRecord1 serviceDomainServiceConfigurationRecord = null;

  @JsonProperty("serviceDomainServicingSessionStatus")
  private String serviceDomainServicingSessionStatus = null;

  public SDCustomerCampaignExecutionActivateOutputModel serviceDomainActivationActionTaskReference(String serviceDomainActivationActionTaskReference) {
    this.serviceDomainActivationActionTaskReference = serviceDomainActivationActionTaskReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call 
   * @return serviceDomainActivationActionTaskReference
  **/
  @ApiModelProperty(example = "SAATR758836", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call ")
  
    public String getServiceDomainActivationActionTaskReference() {
    return serviceDomainActivationActionTaskReference;
  }

  public void setServiceDomainActivationActionTaskReference(String serviceDomainActivationActionTaskReference) {
    this.serviceDomainActivationActionTaskReference = serviceDomainActivationActionTaskReference;
  }

  public SDCustomerCampaignExecutionActivateOutputModel serviceDomainActivationActionTaskRecord(Object serviceDomainActivationActionTaskRecord) {
    this.serviceDomainActivationActionTaskRecord = serviceDomainActivationActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return serviceDomainActivationActionTaskRecord
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record ")
  
    public Object getServiceDomainActivationActionTaskRecord() {
    return serviceDomainActivationActionTaskRecord;
  }

  public void setServiceDomainActivationActionTaskRecord(Object serviceDomainActivationActionTaskRecord) {
    this.serviceDomainActivationActionTaskRecord = serviceDomainActivationActionTaskRecord;
  }

  public SDCustomerCampaignExecutionActivateOutputModel serviceDomainServicingSessionReference(String serviceDomainServicingSessionReference) {
    this.serviceDomainServicingSessionReference = serviceDomainServicingSessionReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return serviceDomainServicingSessionReference
  **/
  @ApiModelProperty(example = "SSSR783215", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session ")
  
    public String getServiceDomainServicingSessionReference() {
    return serviceDomainServicingSessionReference;
  }

  public void setServiceDomainServicingSessionReference(String serviceDomainServicingSessionReference) {
    this.serviceDomainServicingSessionReference = serviceDomainServicingSessionReference;
  }

  public SDCustomerCampaignExecutionActivateOutputModel serviceDomainServicingSessionRecord(Object serviceDomainServicingSessionRecord) {
    this.serviceDomainServicingSessionRecord = serviceDomainServicingSessionRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session 
   * @return serviceDomainServicingSessionRecord
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session ")
  
    public Object getServiceDomainServicingSessionRecord() {
    return serviceDomainServicingSessionRecord;
  }

  public void setServiceDomainServicingSessionRecord(Object serviceDomainServicingSessionRecord) {
    this.serviceDomainServicingSessionRecord = serviceDomainServicingSessionRecord;
  }

  public SDCustomerCampaignExecutionActivateOutputModel serviceDomainServiceConfigurationRecord(SDCustomerCampaignExecutionActivateOutputModelServiceDomainServiceConfigurationRecord1 serviceDomainServiceConfigurationRecord) {
    this.serviceDomainServiceConfigurationRecord = serviceDomainServiceConfigurationRecord;
    return this;
  }

  /**
   * Get serviceDomainServiceConfigurationRecord
   * @return serviceDomainServiceConfigurationRecord
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SDCustomerCampaignExecutionActivateOutputModelServiceDomainServiceConfigurationRecord1 getServiceDomainServiceConfigurationRecord() {
    return serviceDomainServiceConfigurationRecord;
  }

  public void setServiceDomainServiceConfigurationRecord(SDCustomerCampaignExecutionActivateOutputModelServiceDomainServiceConfigurationRecord1 serviceDomainServiceConfigurationRecord) {
    this.serviceDomainServiceConfigurationRecord = serviceDomainServiceConfigurationRecord;
  }

  public SDCustomerCampaignExecutionActivateOutputModel serviceDomainServicingSessionStatus(String serviceDomainServicingSessionStatus) {
    this.serviceDomainServicingSessionStatus = serviceDomainServicingSessionStatus;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return serviceDomainServicingSessionStatus
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session ")
  
    public String getServiceDomainServicingSessionStatus() {
    return serviceDomainServicingSessionStatus;
  }

  public void setServiceDomainServicingSessionStatus(String serviceDomainServicingSessionStatus) {
    this.serviceDomainServicingSessionStatus = serviceDomainServicingSessionStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SDCustomerCampaignExecutionActivateOutputModel sdCustomerCampaignExecutionActivateOutputModel = (SDCustomerCampaignExecutionActivateOutputModel) o;
    return Objects.equals(this.serviceDomainActivationActionTaskReference, sdCustomerCampaignExecutionActivateOutputModel.serviceDomainActivationActionTaskReference) &&
        Objects.equals(this.serviceDomainActivationActionTaskRecord, sdCustomerCampaignExecutionActivateOutputModel.serviceDomainActivationActionTaskRecord) &&
        Objects.equals(this.serviceDomainServicingSessionReference, sdCustomerCampaignExecutionActivateOutputModel.serviceDomainServicingSessionReference) &&
        Objects.equals(this.serviceDomainServicingSessionRecord, sdCustomerCampaignExecutionActivateOutputModel.serviceDomainServicingSessionRecord) &&
        Objects.equals(this.serviceDomainServiceConfigurationRecord, sdCustomerCampaignExecutionActivateOutputModel.serviceDomainServiceConfigurationRecord) &&
        Objects.equals(this.serviceDomainServicingSessionStatus, sdCustomerCampaignExecutionActivateOutputModel.serviceDomainServicingSessionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDomainActivationActionTaskReference, serviceDomainActivationActionTaskRecord, serviceDomainServicingSessionReference, serviceDomainServicingSessionRecord, serviceDomainServiceConfigurationRecord, serviceDomainServicingSessionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDCustomerCampaignExecutionActivateOutputModel {\n");
    
    sb.append("    serviceDomainActivationActionTaskReference: ").append(toIndentedString(serviceDomainActivationActionTaskReference)).append("\n");
    sb.append("    serviceDomainActivationActionTaskRecord: ").append(toIndentedString(serviceDomainActivationActionTaskRecord)).append("\n");
    sb.append("    serviceDomainServicingSessionReference: ").append(toIndentedString(serviceDomainServicingSessionReference)).append("\n");
    sb.append("    serviceDomainServicingSessionRecord: ").append(toIndentedString(serviceDomainServicingSessionRecord)).append("\n");
    sb.append("    serviceDomainServiceConfigurationRecord: ").append(toIndentedString(serviceDomainServiceConfigurationRecord)).append("\n");
    sb.append("    serviceDomainServicingSessionStatus: ").append(toIndentedString(serviceDomainServicingSessionStatus)).append("\n");
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
