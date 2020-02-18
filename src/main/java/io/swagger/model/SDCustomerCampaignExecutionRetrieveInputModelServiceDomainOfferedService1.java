package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SDCustomerCampaignExecutionRetrieveInputModelServiceDomainOfferedService1ServiceDomainServiceRecord;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SDCustomerCampaignExecutionRetrieveInputModelServiceDomainOfferedService1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class SDCustomerCampaignExecutionRetrieveInputModelServiceDomainOfferedService1   {
  @JsonProperty("serviceDomainServiceReference")
  private String serviceDomainServiceReference = null;

  @JsonProperty("serviceDomainServiceRecord")
  private SDCustomerCampaignExecutionRetrieveInputModelServiceDomainOfferedService1ServiceDomainServiceRecord serviceDomainServiceRecord = null;

  public SDCustomerCampaignExecutionRetrieveInputModelServiceDomainOfferedService1 serviceDomainServiceReference(String serviceDomainServiceReference) {
    this.serviceDomainServiceReference = serviceDomainServiceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return serviceDomainServiceReference
  **/
  @ApiModelProperty(example = "776158", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center ")
  
    public String getServiceDomainServiceReference() {
    return serviceDomainServiceReference;
  }

  public void setServiceDomainServiceReference(String serviceDomainServiceReference) {
    this.serviceDomainServiceReference = serviceDomainServiceReference;
  }

  public SDCustomerCampaignExecutionRetrieveInputModelServiceDomainOfferedService1 serviceDomainServiceRecord(SDCustomerCampaignExecutionRetrieveInputModelServiceDomainOfferedService1ServiceDomainServiceRecord serviceDomainServiceRecord) {
    this.serviceDomainServiceRecord = serviceDomainServiceRecord;
    return this;
  }

  /**
   * Get serviceDomainServiceRecord
   * @return serviceDomainServiceRecord
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SDCustomerCampaignExecutionRetrieveInputModelServiceDomainOfferedService1ServiceDomainServiceRecord getServiceDomainServiceRecord() {
    return serviceDomainServiceRecord;
  }

  public void setServiceDomainServiceRecord(SDCustomerCampaignExecutionRetrieveInputModelServiceDomainOfferedService1ServiceDomainServiceRecord serviceDomainServiceRecord) {
    this.serviceDomainServiceRecord = serviceDomainServiceRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SDCustomerCampaignExecutionRetrieveInputModelServiceDomainOfferedService1 sdCustomerCampaignExecutionRetrieveInputModelServiceDomainOfferedService1 = (SDCustomerCampaignExecutionRetrieveInputModelServiceDomainOfferedService1) o;
    return Objects.equals(this.serviceDomainServiceReference, sdCustomerCampaignExecutionRetrieveInputModelServiceDomainOfferedService1.serviceDomainServiceReference) &&
        Objects.equals(this.serviceDomainServiceRecord, sdCustomerCampaignExecutionRetrieveInputModelServiceDomainOfferedService1.serviceDomainServiceRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDomainServiceReference, serviceDomainServiceRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDCustomerCampaignExecutionRetrieveInputModelServiceDomainOfferedService1 {\n");
    
    sb.append("    serviceDomainServiceReference: ").append(toIndentedString(serviceDomainServiceReference)).append("\n");
    sb.append("    serviceDomainServiceRecord: ").append(toIndentedString(serviceDomainServiceRecord)).append("\n");
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
