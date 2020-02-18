package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CustomercampaignexecutionsdreferenceidconfigurationServiceDomainServiceConfigurationRecord;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SDCustomerCampaignExecutionConfigureInputModel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class SDCustomerCampaignExecutionConfigureInputModel   {
  @JsonProperty("serviceDomainConfigurationActionTaskRecord")
  private Object serviceDomainConfigurationActionTaskRecord = null;

  @JsonProperty("serviceDomainServicingSessionReference")
  private String serviceDomainServicingSessionReference = null;

  @JsonProperty("serviceDomainServiceReference")
  private String serviceDomainServiceReference = null;

  @JsonProperty("serviceDomainServiceConfigurationRecord")
  private CustomercampaignexecutionsdreferenceidconfigurationServiceDomainServiceConfigurationRecord serviceDomainServiceConfigurationRecord = null;

  public SDCustomerCampaignExecutionConfigureInputModel serviceDomainConfigurationActionTaskRecord(Object serviceDomainConfigurationActionTaskRecord) {
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

  public SDCustomerCampaignExecutionConfigureInputModel serviceDomainServicingSessionReference(String serviceDomainServicingSessionReference) {
    this.serviceDomainServicingSessionReference = serviceDomainServicingSessionReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return serviceDomainServicingSessionReference
  **/
  @ApiModelProperty(example = "SSSR764367", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session ")
  
    public String getServiceDomainServicingSessionReference() {
    return serviceDomainServicingSessionReference;
  }

  public void setServiceDomainServicingSessionReference(String serviceDomainServicingSessionReference) {
    this.serviceDomainServicingSessionReference = serviceDomainServicingSessionReference;
  }

  public SDCustomerCampaignExecutionConfigureInputModel serviceDomainServiceReference(String serviceDomainServiceReference) {
    this.serviceDomainServiceReference = serviceDomainServiceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return serviceDomainServiceReference
  **/
  @ApiModelProperty(example = "CPASSR744740", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center ")
  
    public String getServiceDomainServiceReference() {
    return serviceDomainServiceReference;
  }

  public void setServiceDomainServiceReference(String serviceDomainServiceReference) {
    this.serviceDomainServiceReference = serviceDomainServiceReference;
  }

  public SDCustomerCampaignExecutionConfigureInputModel serviceDomainServiceConfigurationRecord(CustomercampaignexecutionsdreferenceidconfigurationServiceDomainServiceConfigurationRecord serviceDomainServiceConfigurationRecord) {
    this.serviceDomainServiceConfigurationRecord = serviceDomainServiceConfigurationRecord;
    return this;
  }

  /**
   * Get serviceDomainServiceConfigurationRecord
   * @return serviceDomainServiceConfigurationRecord
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CustomercampaignexecutionsdreferenceidconfigurationServiceDomainServiceConfigurationRecord getServiceDomainServiceConfigurationRecord() {
    return serviceDomainServiceConfigurationRecord;
  }

  public void setServiceDomainServiceConfigurationRecord(CustomercampaignexecutionsdreferenceidconfigurationServiceDomainServiceConfigurationRecord serviceDomainServiceConfigurationRecord) {
    this.serviceDomainServiceConfigurationRecord = serviceDomainServiceConfigurationRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SDCustomerCampaignExecutionConfigureInputModel sdCustomerCampaignExecutionConfigureInputModel = (SDCustomerCampaignExecutionConfigureInputModel) o;
    return Objects.equals(this.serviceDomainConfigurationActionTaskRecord, sdCustomerCampaignExecutionConfigureInputModel.serviceDomainConfigurationActionTaskRecord) &&
        Objects.equals(this.serviceDomainServicingSessionReference, sdCustomerCampaignExecutionConfigureInputModel.serviceDomainServicingSessionReference) &&
        Objects.equals(this.serviceDomainServiceReference, sdCustomerCampaignExecutionConfigureInputModel.serviceDomainServiceReference) &&
        Objects.equals(this.serviceDomainServiceConfigurationRecord, sdCustomerCampaignExecutionConfigureInputModel.serviceDomainServiceConfigurationRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDomainConfigurationActionTaskRecord, serviceDomainServicingSessionReference, serviceDomainServiceReference, serviceDomainServiceConfigurationRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDCustomerCampaignExecutionConfigureInputModel {\n");
    
    sb.append("    serviceDomainConfigurationActionTaskRecord: ").append(toIndentedString(serviceDomainConfigurationActionTaskRecord)).append("\n");
    sb.append("    serviceDomainServicingSessionReference: ").append(toIndentedString(serviceDomainServicingSessionReference)).append("\n");
    sb.append("    serviceDomainServiceReference: ").append(toIndentedString(serviceDomainServiceReference)).append("\n");
    sb.append("    serviceDomainServiceConfigurationRecord: ").append(toIndentedString(serviceDomainServiceConfigurationRecord)).append("\n");
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
