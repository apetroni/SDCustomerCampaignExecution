package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2007
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class InlineResponse2007   {
  @JsonProperty("customerCampaignProcedureRequestActionTaskReference")
  private String customerCampaignProcedureRequestActionTaskReference = null;

  @JsonProperty("customerCampaignProcedureRequestActionTaskRecord")
  private Object customerCampaignProcedureRequestActionTaskRecord = null;

  @JsonProperty("requestRecordReference")
  private String requestRecordReference = null;

  @JsonProperty("requestResponseRecord")
  private Object requestResponseRecord = null;

  public InlineResponse2007 customerCampaignProcedureRequestActionTaskReference(String customerCampaignProcedureRequestActionTaskReference) {
    this.customerCampaignProcedureRequestActionTaskReference = customerCampaignProcedureRequestActionTaskReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Campaign Procedure instance request service call 
   * @return customerCampaignProcedureRequestActionTaskReference
  **/
  @ApiModelProperty(example = "CCPRATR730820", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Campaign Procedure instance request service call ")
  
    public String getCustomerCampaignProcedureRequestActionTaskReference() {
    return customerCampaignProcedureRequestActionTaskReference;
  }

  public void setCustomerCampaignProcedureRequestActionTaskReference(String customerCampaignProcedureRequestActionTaskReference) {
    this.customerCampaignProcedureRequestActionTaskReference = customerCampaignProcedureRequestActionTaskReference;
  }

  public InlineResponse2007 customerCampaignProcedureRequestActionTaskRecord(Object customerCampaignProcedureRequestActionTaskRecord) {
    this.customerCampaignProcedureRequestActionTaskRecord = customerCampaignProcedureRequestActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return customerCampaignProcedureRequestActionTaskRecord
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record ")
  
    public Object getCustomerCampaignProcedureRequestActionTaskRecord() {
    return customerCampaignProcedureRequestActionTaskRecord;
  }

  public void setCustomerCampaignProcedureRequestActionTaskRecord(Object customerCampaignProcedureRequestActionTaskRecord) {
    this.customerCampaignProcedureRequestActionTaskRecord = customerCampaignProcedureRequestActionTaskRecord;
  }

  public InlineResponse2007 requestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/
  @ApiModelProperty(example = "RRR724122", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record ")
  
    public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }

  public InlineResponse2007 requestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response ")
  
    public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2007 inlineResponse2007 = (InlineResponse2007) o;
    return Objects.equals(this.customerCampaignProcedureRequestActionTaskReference, inlineResponse2007.customerCampaignProcedureRequestActionTaskReference) &&
        Objects.equals(this.customerCampaignProcedureRequestActionTaskRecord, inlineResponse2007.customerCampaignProcedureRequestActionTaskRecord) &&
        Objects.equals(this.requestRecordReference, inlineResponse2007.requestRecordReference) &&
        Objects.equals(this.requestResponseRecord, inlineResponse2007.requestResponseRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCampaignProcedureRequestActionTaskReference, customerCampaignProcedureRequestActionTaskRecord, requestRecordReference, requestResponseRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2007 {\n");
    
    sb.append("    customerCampaignProcedureRequestActionTaskReference: ").append(toIndentedString(customerCampaignProcedureRequestActionTaskReference)).append("\n");
    sb.append("    customerCampaignProcedureRequestActionTaskRecord: ").append(toIndentedString(customerCampaignProcedureRequestActionTaskRecord)).append("\n");
    sb.append("    requestRecordReference: ").append(toIndentedString(requestRecordReference)).append("\n");
    sb.append("    requestResponseRecord: ").append(toIndentedString(requestResponseRecord)).append("\n");
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
