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
 * InlineResponse2006
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class InlineResponse2006   {
  @JsonProperty("customerCampaignProcedureExecuteActionTaskReference")
  private String customerCampaignProcedureExecuteActionTaskReference = null;

  @JsonProperty("customerCampaignProcedureExecuteActionTaskRecord")
  private Object customerCampaignProcedureExecuteActionTaskRecord = null;

  @JsonProperty("executeRecordReference")
  private String executeRecordReference = null;

  @JsonProperty("executeResponseRecord")
  private Object executeResponseRecord = null;

  public InlineResponse2006 customerCampaignProcedureExecuteActionTaskReference(String customerCampaignProcedureExecuteActionTaskReference) {
    this.customerCampaignProcedureExecuteActionTaskReference = customerCampaignProcedureExecuteActionTaskReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Campaign Procedure instance execute service call 
   * @return customerCampaignProcedureExecuteActionTaskReference
  **/
  @ApiModelProperty(example = "CCPEATR733401", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Campaign Procedure instance execute service call ")
  
    public String getCustomerCampaignProcedureExecuteActionTaskReference() {
    return customerCampaignProcedureExecuteActionTaskReference;
  }

  public void setCustomerCampaignProcedureExecuteActionTaskReference(String customerCampaignProcedureExecuteActionTaskReference) {
    this.customerCampaignProcedureExecuteActionTaskReference = customerCampaignProcedureExecuteActionTaskReference;
  }

  public InlineResponse2006 customerCampaignProcedureExecuteActionTaskRecord(Object customerCampaignProcedureExecuteActionTaskRecord) {
    this.customerCampaignProcedureExecuteActionTaskRecord = customerCampaignProcedureExecuteActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return customerCampaignProcedureExecuteActionTaskRecord
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record ")
  
    public Object getCustomerCampaignProcedureExecuteActionTaskRecord() {
    return customerCampaignProcedureExecuteActionTaskRecord;
  }

  public void setCustomerCampaignProcedureExecuteActionTaskRecord(Object customerCampaignProcedureExecuteActionTaskRecord) {
    this.customerCampaignProcedureExecuteActionTaskRecord = customerCampaignProcedureExecuteActionTaskRecord;
  }

  public InlineResponse2006 executeRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/
  @ApiModelProperty(example = "ERR745186", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record ")
  
    public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }

  public InlineResponse2006 executeResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response ")
  
    public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2006 inlineResponse2006 = (InlineResponse2006) o;
    return Objects.equals(this.customerCampaignProcedureExecuteActionTaskReference, inlineResponse2006.customerCampaignProcedureExecuteActionTaskReference) &&
        Objects.equals(this.customerCampaignProcedureExecuteActionTaskRecord, inlineResponse2006.customerCampaignProcedureExecuteActionTaskRecord) &&
        Objects.equals(this.executeRecordReference, inlineResponse2006.executeRecordReference) &&
        Objects.equals(this.executeResponseRecord, inlineResponse2006.executeResponseRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCampaignProcedureExecuteActionTaskReference, customerCampaignProcedureExecuteActionTaskRecord, executeRecordReference, executeResponseRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2006 {\n");
    
    sb.append("    customerCampaignProcedureExecuteActionTaskReference: ").append(toIndentedString(customerCampaignProcedureExecuteActionTaskReference)).append("\n");
    sb.append("    customerCampaignProcedureExecuteActionTaskRecord: ").append(toIndentedString(customerCampaignProcedureExecuteActionTaskRecord)).append("\n");
    sb.append("    executeRecordReference: ").append(toIndentedString(executeRecordReference)).append("\n");
    sb.append("    executeResponseRecord: ").append(toIndentedString(executeResponseRecord)).append("\n");
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
