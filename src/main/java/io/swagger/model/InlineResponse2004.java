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
 * InlineResponse2004
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class InlineResponse2004   {
  @JsonProperty("customerCampaignProcedureControlActionTaskReference")
  private String customerCampaignProcedureControlActionTaskReference = null;

  @JsonProperty("customerCampaignProcedureControlActionTaskRecord")
  private Object customerCampaignProcedureControlActionTaskRecord = null;

  @JsonProperty("customerCampaignProcedureControlActionResponse")
  private String customerCampaignProcedureControlActionResponse = null;

  public InlineResponse2004 customerCampaignProcedureControlActionTaskReference(String customerCampaignProcedureControlActionTaskReference) {
    this.customerCampaignProcedureControlActionTaskReference = customerCampaignProcedureControlActionTaskReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Campaign Procedure instance control processing service call 
   * @return customerCampaignProcedureControlActionTaskReference
  **/
  @ApiModelProperty(example = "CCPCATR772896", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Campaign Procedure instance control processing service call ")
  
    public String getCustomerCampaignProcedureControlActionTaskReference() {
    return customerCampaignProcedureControlActionTaskReference;
  }

  public void setCustomerCampaignProcedureControlActionTaskReference(String customerCampaignProcedureControlActionTaskReference) {
    this.customerCampaignProcedureControlActionTaskReference = customerCampaignProcedureControlActionTaskReference;
  }

  public InlineResponse2004 customerCampaignProcedureControlActionTaskRecord(Object customerCampaignProcedureControlActionTaskRecord) {
    this.customerCampaignProcedureControlActionTaskRecord = customerCampaignProcedureControlActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return customerCampaignProcedureControlActionTaskRecord
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record ")
  
    public Object getCustomerCampaignProcedureControlActionTaskRecord() {
    return customerCampaignProcedureControlActionTaskRecord;
  }

  public void setCustomerCampaignProcedureControlActionTaskRecord(Object customerCampaignProcedureControlActionTaskRecord) {
    this.customerCampaignProcedureControlActionTaskRecord = customerCampaignProcedureControlActionTaskRecord;
  }

  public InlineResponse2004 customerCampaignProcedureControlActionResponse(String customerCampaignProcedureControlActionResponse) {
    this.customerCampaignProcedureControlActionResponse = customerCampaignProcedureControlActionResponse;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return customerCampaignProcedureControlActionResponse
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response ")
  
    public String getCustomerCampaignProcedureControlActionResponse() {
    return customerCampaignProcedureControlActionResponse;
  }

  public void setCustomerCampaignProcedureControlActionResponse(String customerCampaignProcedureControlActionResponse) {
    this.customerCampaignProcedureControlActionResponse = customerCampaignProcedureControlActionResponse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2004 inlineResponse2004 = (InlineResponse2004) o;
    return Objects.equals(this.customerCampaignProcedureControlActionTaskReference, inlineResponse2004.customerCampaignProcedureControlActionTaskReference) &&
        Objects.equals(this.customerCampaignProcedureControlActionTaskRecord, inlineResponse2004.customerCampaignProcedureControlActionTaskRecord) &&
        Objects.equals(this.customerCampaignProcedureControlActionResponse, inlineResponse2004.customerCampaignProcedureControlActionResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCampaignProcedureControlActionTaskReference, customerCampaignProcedureControlActionTaskRecord, customerCampaignProcedureControlActionResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2004 {\n");
    
    sb.append("    customerCampaignProcedureControlActionTaskReference: ").append(toIndentedString(customerCampaignProcedureControlActionTaskReference)).append("\n");
    sb.append("    customerCampaignProcedureControlActionTaskRecord: ").append(toIndentedString(customerCampaignProcedureControlActionTaskRecord)).append("\n");
    sb.append("    customerCampaignProcedureControlActionResponse: ").append(toIndentedString(customerCampaignProcedureControlActionResponse)).append("\n");
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
