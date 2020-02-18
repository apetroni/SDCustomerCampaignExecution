package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SDCustomerCampaignExecutionFeedbackOutputModelServiceDomainFeedbackActionRecord1;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2001
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class InlineResponse2001   {
  @JsonProperty("serviceDomainFeedbackActionTaskReference")
  private String serviceDomainFeedbackActionTaskReference = null;

  @JsonProperty("serviceDomainFeedbackActionTaskRecord")
  private Object serviceDomainFeedbackActionTaskRecord = null;

  @JsonProperty("serviceDomainFeedbackActionRecord")
  private SDCustomerCampaignExecutionFeedbackOutputModelServiceDomainFeedbackActionRecord1 serviceDomainFeedbackActionRecord = null;

  public InlineResponse2001 serviceDomainFeedbackActionTaskReference(String serviceDomainFeedbackActionTaskReference) {
    this.serviceDomainFeedbackActionTaskReference = serviceDomainFeedbackActionTaskReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call 
   * @return serviceDomainFeedbackActionTaskReference
  **/
  @ApiModelProperty(example = "SFATR765157", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call ")
  
    public String getServiceDomainFeedbackActionTaskReference() {
    return serviceDomainFeedbackActionTaskReference;
  }

  public void setServiceDomainFeedbackActionTaskReference(String serviceDomainFeedbackActionTaskReference) {
    this.serviceDomainFeedbackActionTaskReference = serviceDomainFeedbackActionTaskReference;
  }

  public InlineResponse2001 serviceDomainFeedbackActionTaskRecord(Object serviceDomainFeedbackActionTaskRecord) {
    this.serviceDomainFeedbackActionTaskRecord = serviceDomainFeedbackActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record 
   * @return serviceDomainFeedbackActionTaskRecord
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record ")
  
    public Object getServiceDomainFeedbackActionTaskRecord() {
    return serviceDomainFeedbackActionTaskRecord;
  }

  public void setServiceDomainFeedbackActionTaskRecord(Object serviceDomainFeedbackActionTaskRecord) {
    this.serviceDomainFeedbackActionTaskRecord = serviceDomainFeedbackActionTaskRecord;
  }

  public InlineResponse2001 serviceDomainFeedbackActionRecord(SDCustomerCampaignExecutionFeedbackOutputModelServiceDomainFeedbackActionRecord1 serviceDomainFeedbackActionRecord) {
    this.serviceDomainFeedbackActionRecord = serviceDomainFeedbackActionRecord;
    return this;
  }

  /**
   * Get serviceDomainFeedbackActionRecord
   * @return serviceDomainFeedbackActionRecord
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SDCustomerCampaignExecutionFeedbackOutputModelServiceDomainFeedbackActionRecord1 getServiceDomainFeedbackActionRecord() {
    return serviceDomainFeedbackActionRecord;
  }

  public void setServiceDomainFeedbackActionRecord(SDCustomerCampaignExecutionFeedbackOutputModelServiceDomainFeedbackActionRecord1 serviceDomainFeedbackActionRecord) {
    this.serviceDomainFeedbackActionRecord = serviceDomainFeedbackActionRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001 inlineResponse2001 = (InlineResponse2001) o;
    return Objects.equals(this.serviceDomainFeedbackActionTaskReference, inlineResponse2001.serviceDomainFeedbackActionTaskReference) &&
        Objects.equals(this.serviceDomainFeedbackActionTaskRecord, inlineResponse2001.serviceDomainFeedbackActionTaskRecord) &&
        Objects.equals(this.serviceDomainFeedbackActionRecord, inlineResponse2001.serviceDomainFeedbackActionRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDomainFeedbackActionTaskReference, serviceDomainFeedbackActionTaskRecord, serviceDomainFeedbackActionRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001 {\n");
    
    sb.append("    serviceDomainFeedbackActionTaskReference: ").append(toIndentedString(serviceDomainFeedbackActionTaskReference)).append("\n");
    sb.append("    serviceDomainFeedbackActionTaskRecord: ").append(toIndentedString(serviceDomainFeedbackActionTaskRecord)).append("\n");
    sb.append("    serviceDomainFeedbackActionRecord: ").append(toIndentedString(serviceDomainFeedbackActionRecord)).append("\n");
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
