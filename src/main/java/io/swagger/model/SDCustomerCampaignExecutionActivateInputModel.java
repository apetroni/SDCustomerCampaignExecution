package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CustomercampaignexecutionactivationServiceDomainServiceConfigurationRecord;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SDCustomerCampaignExecutionActivateInputModel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class SDCustomerCampaignExecutionActivateInputModel   {
  @JsonProperty("serviceDomainActivationActionTaskRecord")
  private Object serviceDomainActivationActionTaskRecord = null;

  @JsonProperty("serviceDomainCenterReference")
  private String serviceDomainCenterReference = null;

  @JsonProperty("serviceDomainServiceReference")
  private String serviceDomainServiceReference = null;

  @JsonProperty("serviceDomainServiceConfigurationRecord")
  private CustomercampaignexecutionactivationServiceDomainServiceConfigurationRecord serviceDomainServiceConfigurationRecord = null;

  public SDCustomerCampaignExecutionActivateInputModel serviceDomainActivationActionTaskRecord(Object serviceDomainActivationActionTaskRecord) {
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

  public SDCustomerCampaignExecutionActivateInputModel serviceDomainCenterReference(String serviceDomainCenterReference) {
    this.serviceDomainCenterReference = serviceDomainCenterReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit 
   * @return serviceDomainCenterReference
  **/
  @ApiModelProperty(example = "SCR793499", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit ")
  
    public String getServiceDomainCenterReference() {
    return serviceDomainCenterReference;
  }

  public void setServiceDomainCenterReference(String serviceDomainCenterReference) {
    this.serviceDomainCenterReference = serviceDomainCenterReference;
  }

  public SDCustomerCampaignExecutionActivateInputModel serviceDomainServiceReference(String serviceDomainServiceReference) {
    this.serviceDomainServiceReference = serviceDomainServiceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return serviceDomainServiceReference
  **/
  @ApiModelProperty(example = "CPASSR703914", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center ")
  
    public String getServiceDomainServiceReference() {
    return serviceDomainServiceReference;
  }

  public void setServiceDomainServiceReference(String serviceDomainServiceReference) {
    this.serviceDomainServiceReference = serviceDomainServiceReference;
  }

  public SDCustomerCampaignExecutionActivateInputModel serviceDomainServiceConfigurationRecord(CustomercampaignexecutionactivationServiceDomainServiceConfigurationRecord serviceDomainServiceConfigurationRecord) {
    this.serviceDomainServiceConfigurationRecord = serviceDomainServiceConfigurationRecord;
    return this;
  }

  /**
   * Get serviceDomainServiceConfigurationRecord
   * @return serviceDomainServiceConfigurationRecord
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CustomercampaignexecutionactivationServiceDomainServiceConfigurationRecord getServiceDomainServiceConfigurationRecord() {
    return serviceDomainServiceConfigurationRecord;
  }

  public void setServiceDomainServiceConfigurationRecord(CustomercampaignexecutionactivationServiceDomainServiceConfigurationRecord serviceDomainServiceConfigurationRecord) {
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
    SDCustomerCampaignExecutionActivateInputModel sdCustomerCampaignExecutionActivateInputModel = (SDCustomerCampaignExecutionActivateInputModel) o;
    return Objects.equals(this.serviceDomainActivationActionTaskRecord, sdCustomerCampaignExecutionActivateInputModel.serviceDomainActivationActionTaskRecord) &&
        Objects.equals(this.serviceDomainCenterReference, sdCustomerCampaignExecutionActivateInputModel.serviceDomainCenterReference) &&
        Objects.equals(this.serviceDomainServiceReference, sdCustomerCampaignExecutionActivateInputModel.serviceDomainServiceReference) &&
        Objects.equals(this.serviceDomainServiceConfigurationRecord, sdCustomerCampaignExecutionActivateInputModel.serviceDomainServiceConfigurationRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDomainActivationActionTaskRecord, serviceDomainCenterReference, serviceDomainServiceReference, serviceDomainServiceConfigurationRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDCustomerCampaignExecutionActivateInputModel {\n");
    
    sb.append("    serviceDomainActivationActionTaskRecord: ").append(toIndentedString(serviceDomainActivationActionTaskRecord)).append("\n");
    sb.append("    serviceDomainCenterReference: ").append(toIndentedString(serviceDomainCenterReference)).append("\n");
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
