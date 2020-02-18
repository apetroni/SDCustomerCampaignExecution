package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SDCustomerCampaignExecutionConfigureOutputModelServiceDomainServiceConfigurationRecord1;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SDCustomerCampaignExecutionConfigureOutputModel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class SDCustomerCampaignExecutionConfigureOutputModel   {
  @JsonProperty("serviceDomainConfigurationActionTaskReference")
  private String serviceDomainConfigurationActionTaskReference = null;

  @JsonProperty("serviceDomainConfigurationActionTaskRecord")
  private Object serviceDomainConfigurationActionTaskRecord = null;

  @JsonProperty("serviceDomainServiceConfigurationRecord")
  private SDCustomerCampaignExecutionConfigureOutputModelServiceDomainServiceConfigurationRecord1 serviceDomainServiceConfigurationRecord = null;

  @JsonProperty("serviceDomainServicingSessionStatus")
  private String serviceDomainServicingSessionStatus = null;

  public SDCustomerCampaignExecutionConfigureOutputModel serviceDomainConfigurationActionTaskReference(String serviceDomainConfigurationActionTaskReference) {
    this.serviceDomainConfigurationActionTaskReference = serviceDomainConfigurationActionTaskReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call 
   * @return serviceDomainConfigurationActionTaskReference
  **/
  @ApiModelProperty(example = "SCATR765419", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call ")
  
    public String getServiceDomainConfigurationActionTaskReference() {
    return serviceDomainConfigurationActionTaskReference;
  }

  public void setServiceDomainConfigurationActionTaskReference(String serviceDomainConfigurationActionTaskReference) {
    this.serviceDomainConfigurationActionTaskReference = serviceDomainConfigurationActionTaskReference;
  }

  public SDCustomerCampaignExecutionConfigureOutputModel serviceDomainConfigurationActionTaskRecord(Object serviceDomainConfigurationActionTaskRecord) {
    this.serviceDomainConfigurationActionTaskRecord = serviceDomainConfigurationActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record 
   * @return serviceDomainConfigurationActionTaskRecord
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record ")
  
    public Object getServiceDomainConfigurationActionTaskRecord() {
    return serviceDomainConfigurationActionTaskRecord;
  }

  public void setServiceDomainConfigurationActionTaskRecord(Object serviceDomainConfigurationActionTaskRecord) {
    this.serviceDomainConfigurationActionTaskRecord = serviceDomainConfigurationActionTaskRecord;
  }

  public SDCustomerCampaignExecutionConfigureOutputModel serviceDomainServiceConfigurationRecord(SDCustomerCampaignExecutionConfigureOutputModelServiceDomainServiceConfigurationRecord1 serviceDomainServiceConfigurationRecord) {
    this.serviceDomainServiceConfigurationRecord = serviceDomainServiceConfigurationRecord;
    return this;
  }

  /**
   * Get serviceDomainServiceConfigurationRecord
   * @return serviceDomainServiceConfigurationRecord
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SDCustomerCampaignExecutionConfigureOutputModelServiceDomainServiceConfigurationRecord1 getServiceDomainServiceConfigurationRecord() {
    return serviceDomainServiceConfigurationRecord;
  }

  public void setServiceDomainServiceConfigurationRecord(SDCustomerCampaignExecutionConfigureOutputModelServiceDomainServiceConfigurationRecord1 serviceDomainServiceConfigurationRecord) {
    this.serviceDomainServiceConfigurationRecord = serviceDomainServiceConfigurationRecord;
  }

  public SDCustomerCampaignExecutionConfigureOutputModel serviceDomainServicingSessionStatus(String serviceDomainServicingSessionStatus) {
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
    SDCustomerCampaignExecutionConfigureOutputModel sdCustomerCampaignExecutionConfigureOutputModel = (SDCustomerCampaignExecutionConfigureOutputModel) o;
    return Objects.equals(this.serviceDomainConfigurationActionTaskReference, sdCustomerCampaignExecutionConfigureOutputModel.serviceDomainConfigurationActionTaskReference) &&
        Objects.equals(this.serviceDomainConfigurationActionTaskRecord, sdCustomerCampaignExecutionConfigureOutputModel.serviceDomainConfigurationActionTaskRecord) &&
        Objects.equals(this.serviceDomainServiceConfigurationRecord, sdCustomerCampaignExecutionConfigureOutputModel.serviceDomainServiceConfigurationRecord) &&
        Objects.equals(this.serviceDomainServicingSessionStatus, sdCustomerCampaignExecutionConfigureOutputModel.serviceDomainServicingSessionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDomainConfigurationActionTaskReference, serviceDomainConfigurationActionTaskRecord, serviceDomainServiceConfigurationRecord, serviceDomainServicingSessionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDCustomerCampaignExecutionConfigureOutputModel {\n");
    
    sb.append("    serviceDomainConfigurationActionTaskReference: ").append(toIndentedString(serviceDomainConfigurationActionTaskReference)).append("\n");
    sb.append("    serviceDomainConfigurationActionTaskRecord: ").append(toIndentedString(serviceDomainConfigurationActionTaskRecord)).append("\n");
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
