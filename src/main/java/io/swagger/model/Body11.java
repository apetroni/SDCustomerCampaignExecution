package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutioninitiationCustomerCampaignProcedureInstanceRecord;
import io.swagger.model.CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutioninitiationExecutionInstanceRecord;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Body11
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class Body11   {
  @JsonProperty("customerCampaignProcedureInstanceRecord")
  private CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutioninitiationCustomerCampaignProcedureInstanceRecord customerCampaignProcedureInstanceRecord = null;

  @JsonProperty("customerCampaignProcedureInstanceReference")
  private String customerCampaignProcedureInstanceReference = null;

  @JsonProperty("executionInitiateActionRecord")
  private Object executionInitiateActionRecord = null;

  @JsonProperty("executionInstanceRecord")
  private CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutioninitiationExecutionInstanceRecord executionInstanceRecord = null;

  public Body11 customerCampaignProcedureInstanceRecord(CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutioninitiationCustomerCampaignProcedureInstanceRecord customerCampaignProcedureInstanceRecord) {
    this.customerCampaignProcedureInstanceRecord = customerCampaignProcedureInstanceRecord;
    return this;
  }

  /**
   * Get customerCampaignProcedureInstanceRecord
   * @return customerCampaignProcedureInstanceRecord
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutioninitiationCustomerCampaignProcedureInstanceRecord getCustomerCampaignProcedureInstanceRecord() {
    return customerCampaignProcedureInstanceRecord;
  }

  public void setCustomerCampaignProcedureInstanceRecord(CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutioninitiationCustomerCampaignProcedureInstanceRecord customerCampaignProcedureInstanceRecord) {
    this.customerCampaignProcedureInstanceRecord = customerCampaignProcedureInstanceRecord;
  }

  public Body11 customerCampaignProcedureInstanceReference(String customerCampaignProcedureInstanceReference) {
    this.customerCampaignProcedureInstanceReference = customerCampaignProcedureInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Campaign Procedure instance 
   * @return customerCampaignProcedureInstanceReference
  **/
  @ApiModelProperty(example = "CCPIR765216", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Campaign Procedure instance ")
  
    public String getCustomerCampaignProcedureInstanceReference() {
    return customerCampaignProcedureInstanceReference;
  }

  public void setCustomerCampaignProcedureInstanceReference(String customerCampaignProcedureInstanceReference) {
    this.customerCampaignProcedureInstanceReference = customerCampaignProcedureInstanceReference;
  }

  public Body11 executionInitiateActionRecord(Object executionInitiateActionRecord) {
    this.executionInitiateActionRecord = executionInitiateActionRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return executionInitiateActionRecord
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record ")
  
    public Object getExecutionInitiateActionRecord() {
    return executionInitiateActionRecord;
  }

  public void setExecutionInitiateActionRecord(Object executionInitiateActionRecord) {
    this.executionInitiateActionRecord = executionInitiateActionRecord;
  }

  public Body11 executionInstanceRecord(CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutioninitiationExecutionInstanceRecord executionInstanceRecord) {
    this.executionInstanceRecord = executionInstanceRecord;
    return this;
  }

  /**
   * Get executionInstanceRecord
   * @return executionInstanceRecord
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutioninitiationExecutionInstanceRecord getExecutionInstanceRecord() {
    return executionInstanceRecord;
  }

  public void setExecutionInstanceRecord(CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutioninitiationExecutionInstanceRecord executionInstanceRecord) {
    this.executionInstanceRecord = executionInstanceRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body11 body11 = (Body11) o;
    return Objects.equals(this.customerCampaignProcedureInstanceRecord, body11.customerCampaignProcedureInstanceRecord) &&
        Objects.equals(this.customerCampaignProcedureInstanceReference, body11.customerCampaignProcedureInstanceReference) &&
        Objects.equals(this.executionInitiateActionRecord, body11.executionInitiateActionRecord) &&
        Objects.equals(this.executionInstanceRecord, body11.executionInstanceRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCampaignProcedureInstanceRecord, customerCampaignProcedureInstanceReference, executionInitiateActionRecord, executionInstanceRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body11 {\n");
    
    sb.append("    customerCampaignProcedureInstanceRecord: ").append(toIndentedString(customerCampaignProcedureInstanceRecord)).append("\n");
    sb.append("    customerCampaignProcedureInstanceReference: ").append(toIndentedString(customerCampaignProcedureInstanceReference)).append("\n");
    sb.append("    executionInitiateActionRecord: ").append(toIndentedString(executionInitiateActionRecord)).append("\n");
    sb.append("    executionInstanceRecord: ").append(toIndentedString(executionInstanceRecord)).append("\n");
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
