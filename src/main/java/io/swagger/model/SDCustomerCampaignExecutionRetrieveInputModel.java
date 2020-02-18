package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SDCustomerCampaignExecutionRetrieveInputModelServiceDomainOfferedService1;
import io.swagger.model.SDCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecord1;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SDCustomerCampaignExecutionRetrieveInputModel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class SDCustomerCampaignExecutionRetrieveInputModel   {
  @JsonProperty("serviceDomainRetrieveActionTaskRecord")
  private Object serviceDomainRetrieveActionTaskRecord = null;

  @JsonProperty("serviceDomainRetrieveActionRequest")
  private String serviceDomainRetrieveActionRequest = null;

  @JsonProperty("serviceDomainRetrieveActionRecord")
  private SDCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecord1 serviceDomainRetrieveActionRecord = null;

  @JsonProperty("serviceDomainOfferedService")
  private SDCustomerCampaignExecutionRetrieveInputModelServiceDomainOfferedService1 serviceDomainOfferedService = null;

  public SDCustomerCampaignExecutionRetrieveInputModel serviceDomainRetrieveActionTaskRecord(Object serviceDomainRetrieveActionTaskRecord) {
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

  public SDCustomerCampaignExecutionRetrieveInputModel serviceDomainRetrieveActionRequest(String serviceDomainRetrieveActionRequest) {
    this.serviceDomainRetrieveActionRequest = serviceDomainRetrieveActionRequest;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return serviceDomainRetrieveActionRequest
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) ")
  
    public String getServiceDomainRetrieveActionRequest() {
    return serviceDomainRetrieveActionRequest;
  }

  public void setServiceDomainRetrieveActionRequest(String serviceDomainRetrieveActionRequest) {
    this.serviceDomainRetrieveActionRequest = serviceDomainRetrieveActionRequest;
  }

  public SDCustomerCampaignExecutionRetrieveInputModel serviceDomainRetrieveActionRecord(SDCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecord1 serviceDomainRetrieveActionRecord) {
    this.serviceDomainRetrieveActionRecord = serviceDomainRetrieveActionRecord;
    return this;
  }

  /**
   * Get serviceDomainRetrieveActionRecord
   * @return serviceDomainRetrieveActionRecord
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SDCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecord1 getServiceDomainRetrieveActionRecord() {
    return serviceDomainRetrieveActionRecord;
  }

  public void setServiceDomainRetrieveActionRecord(SDCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecord1 serviceDomainRetrieveActionRecord) {
    this.serviceDomainRetrieveActionRecord = serviceDomainRetrieveActionRecord;
  }

  public SDCustomerCampaignExecutionRetrieveInputModel serviceDomainOfferedService(SDCustomerCampaignExecutionRetrieveInputModelServiceDomainOfferedService1 serviceDomainOfferedService) {
    this.serviceDomainOfferedService = serviceDomainOfferedService;
    return this;
  }

  /**
   * Get serviceDomainOfferedService
   * @return serviceDomainOfferedService
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SDCustomerCampaignExecutionRetrieveInputModelServiceDomainOfferedService1 getServiceDomainOfferedService() {
    return serviceDomainOfferedService;
  }

  public void setServiceDomainOfferedService(SDCustomerCampaignExecutionRetrieveInputModelServiceDomainOfferedService1 serviceDomainOfferedService) {
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
    SDCustomerCampaignExecutionRetrieveInputModel sdCustomerCampaignExecutionRetrieveInputModel = (SDCustomerCampaignExecutionRetrieveInputModel) o;
    return Objects.equals(this.serviceDomainRetrieveActionTaskRecord, sdCustomerCampaignExecutionRetrieveInputModel.serviceDomainRetrieveActionTaskRecord) &&
        Objects.equals(this.serviceDomainRetrieveActionRequest, sdCustomerCampaignExecutionRetrieveInputModel.serviceDomainRetrieveActionRequest) &&
        Objects.equals(this.serviceDomainRetrieveActionRecord, sdCustomerCampaignExecutionRetrieveInputModel.serviceDomainRetrieveActionRecord) &&
        Objects.equals(this.serviceDomainOfferedService, sdCustomerCampaignExecutionRetrieveInputModel.serviceDomainOfferedService);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDomainRetrieveActionTaskRecord, serviceDomainRetrieveActionRequest, serviceDomainRetrieveActionRecord, serviceDomainOfferedService);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDCustomerCampaignExecutionRetrieveInputModel {\n");
    
    sb.append("    serviceDomainRetrieveActionTaskRecord: ").append(toIndentedString(serviceDomainRetrieveActionTaskRecord)).append("\n");
    sb.append("    serviceDomainRetrieveActionRequest: ").append(toIndentedString(serviceDomainRetrieveActionRequest)).append("\n");
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
