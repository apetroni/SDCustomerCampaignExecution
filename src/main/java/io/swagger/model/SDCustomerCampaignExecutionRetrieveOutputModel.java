package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainOfferedService1;
import io.swagger.model.SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SDCustomerCampaignExecutionRetrieveOutputModel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class SDCustomerCampaignExecutionRetrieveOutputModel   {
  @JsonProperty("serviceDomainRetrieveActionTaskReference")
  private String serviceDomainRetrieveActionTaskReference = null;

  @JsonProperty("serviceDomainRetrieveActionTaskRecord")
  private Object serviceDomainRetrieveActionTaskRecord = null;

  @JsonProperty("serviceDomainRetrieveActionResponse")
  private String serviceDomainRetrieveActionResponse = null;

  @JsonProperty("serviceDomainRetrieveActionRecord")
  private SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1 serviceDomainRetrieveActionRecord = null;

  @JsonProperty("serviceDomainOfferedService")
  private SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainOfferedService1 serviceDomainOfferedService = null;

  public SDCustomerCampaignExecutionRetrieveOutputModel serviceDomainRetrieveActionTaskReference(String serviceDomainRetrieveActionTaskReference) {
    this.serviceDomainRetrieveActionTaskReference = serviceDomainRetrieveActionTaskReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call 
   * @return serviceDomainRetrieveActionTaskReference
  **/
  @ApiModelProperty(example = "SRATR795161", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call ")
  
    public String getServiceDomainRetrieveActionTaskReference() {
    return serviceDomainRetrieveActionTaskReference;
  }

  public void setServiceDomainRetrieveActionTaskReference(String serviceDomainRetrieveActionTaskReference) {
    this.serviceDomainRetrieveActionTaskReference = serviceDomainRetrieveActionTaskReference;
  }

  public SDCustomerCampaignExecutionRetrieveOutputModel serviceDomainRetrieveActionTaskRecord(Object serviceDomainRetrieveActionTaskRecord) {
    this.serviceDomainRetrieveActionTaskRecord = serviceDomainRetrieveActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return serviceDomainRetrieveActionTaskRecord
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record ")
  
    public Object getServiceDomainRetrieveActionTaskRecord() {
    return serviceDomainRetrieveActionTaskRecord;
  }

  public void setServiceDomainRetrieveActionTaskRecord(Object serviceDomainRetrieveActionTaskRecord) {
    this.serviceDomainRetrieveActionTaskRecord = serviceDomainRetrieveActionTaskRecord;
  }

  public SDCustomerCampaignExecutionRetrieveOutputModel serviceDomainRetrieveActionResponse(String serviceDomainRetrieveActionResponse) {
    this.serviceDomainRetrieveActionResponse = serviceDomainRetrieveActionResponse;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return serviceDomainRetrieveActionResponse
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) ")
  
    public String getServiceDomainRetrieveActionResponse() {
    return serviceDomainRetrieveActionResponse;
  }

  public void setServiceDomainRetrieveActionResponse(String serviceDomainRetrieveActionResponse) {
    this.serviceDomainRetrieveActionResponse = serviceDomainRetrieveActionResponse;
  }

  public SDCustomerCampaignExecutionRetrieveOutputModel serviceDomainRetrieveActionRecord(SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1 serviceDomainRetrieveActionRecord) {
    this.serviceDomainRetrieveActionRecord = serviceDomainRetrieveActionRecord;
    return this;
  }

  /**
   * Get serviceDomainRetrieveActionRecord
   * @return serviceDomainRetrieveActionRecord
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1 getServiceDomainRetrieveActionRecord() {
    return serviceDomainRetrieveActionRecord;
  }

  public void setServiceDomainRetrieveActionRecord(SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1 serviceDomainRetrieveActionRecord) {
    this.serviceDomainRetrieveActionRecord = serviceDomainRetrieveActionRecord;
  }

  public SDCustomerCampaignExecutionRetrieveOutputModel serviceDomainOfferedService(SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainOfferedService1 serviceDomainOfferedService) {
    this.serviceDomainOfferedService = serviceDomainOfferedService;
    return this;
  }

  /**
   * Get serviceDomainOfferedService
   * @return serviceDomainOfferedService
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainOfferedService1 getServiceDomainOfferedService() {
    return serviceDomainOfferedService;
  }

  public void setServiceDomainOfferedService(SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainOfferedService1 serviceDomainOfferedService) {
    this.serviceDomainOfferedService = serviceDomainOfferedService;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SDCustomerCampaignExecutionRetrieveOutputModel sdCustomerCampaignExecutionRetrieveOutputModel = (SDCustomerCampaignExecutionRetrieveOutputModel) o;
    return Objects.equals(this.serviceDomainRetrieveActionTaskReference, sdCustomerCampaignExecutionRetrieveOutputModel.serviceDomainRetrieveActionTaskReference) &&
        Objects.equals(this.serviceDomainRetrieveActionTaskRecord, sdCustomerCampaignExecutionRetrieveOutputModel.serviceDomainRetrieveActionTaskRecord) &&
        Objects.equals(this.serviceDomainRetrieveActionResponse, sdCustomerCampaignExecutionRetrieveOutputModel.serviceDomainRetrieveActionResponse) &&
        Objects.equals(this.serviceDomainRetrieveActionRecord, sdCustomerCampaignExecutionRetrieveOutputModel.serviceDomainRetrieveActionRecord) &&
        Objects.equals(this.serviceDomainOfferedService, sdCustomerCampaignExecutionRetrieveOutputModel.serviceDomainOfferedService);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDomainRetrieveActionTaskReference, serviceDomainRetrieveActionTaskRecord, serviceDomainRetrieveActionResponse, serviceDomainRetrieveActionRecord, serviceDomainOfferedService);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDCustomerCampaignExecutionRetrieveOutputModel {\n");
    
    sb.append("    serviceDomainRetrieveActionTaskReference: ").append(toIndentedString(serviceDomainRetrieveActionTaskReference)).append("\n");
    sb.append("    serviceDomainRetrieveActionTaskRecord: ").append(toIndentedString(serviceDomainRetrieveActionTaskRecord)).append("\n");
    sb.append("    serviceDomainRetrieveActionResponse: ").append(toIndentedString(serviceDomainRetrieveActionResponse)).append("\n");
    sb.append("    serviceDomainRetrieveActionRecord: ").append(toIndentedString(serviceDomainRetrieveActionRecord)).append("\n");
    sb.append("    serviceDomainOfferedService: ").append(toIndentedString(serviceDomainOfferedService)).append("\n");
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
