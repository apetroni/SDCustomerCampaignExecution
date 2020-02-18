package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutionbqreferenceidrequisitionExecutionInstanceRecord;
import io.swagger.model.CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidrequisitionRequestRecordType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQExecutionRequestInputModel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class BQExecutionRequestInputModel   {
  @JsonProperty("customerCampaignProcedureInstanceReference")
  private String customerCampaignProcedureInstanceReference = null;

  @JsonProperty("executionInstanceReference")
  private String executionInstanceReference = null;

  @JsonProperty("executionInstanceRecord")
  private CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutionbqreferenceidrequisitionExecutionInstanceRecord executionInstanceRecord = null;

  @JsonProperty("executionRequestActionTaskRecord")
  private Object executionRequestActionTaskRecord = null;

  @JsonProperty("requestRecordType")
  private CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidrequisitionRequestRecordType requestRecordType = null;

  public BQExecutionRequestInputModel customerCampaignProcedureInstanceReference(String customerCampaignProcedureInstanceReference) {
    this.customerCampaignProcedureInstanceReference = customerCampaignProcedureInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Campaign Procedure instance 
   * @return customerCampaignProcedureInstanceReference
  **/
  @ApiModelProperty(example = "CCPIR796263", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Campaign Procedure instance ")
  
    public String getCustomerCampaignProcedureInstanceReference() {
    return customerCampaignProcedureInstanceReference;
  }

  public void setCustomerCampaignProcedureInstanceReference(String customerCampaignProcedureInstanceReference) {
    this.customerCampaignProcedureInstanceReference = customerCampaignProcedureInstanceReference;
  }

  public BQExecutionRequestInputModel executionInstanceReference(String executionInstanceReference) {
    this.executionInstanceReference = executionInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Execution instance 
   * @return executionInstanceReference
  **/
  @ApiModelProperty(example = "EIR773233", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Execution instance ")
  
    public String getExecutionInstanceReference() {
    return executionInstanceReference;
  }

  public void setExecutionInstanceReference(String executionInstanceReference) {
    this.executionInstanceReference = executionInstanceReference;
  }

  public BQExecutionRequestInputModel executionInstanceRecord(CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutionbqreferenceidrequisitionExecutionInstanceRecord executionInstanceRecord) {
    this.executionInstanceRecord = executionInstanceRecord;
    return this;
  }

  /**
   * Get executionInstanceRecord
   * @return executionInstanceRecord
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutionbqreferenceidrequisitionExecutionInstanceRecord getExecutionInstanceRecord() {
    return executionInstanceRecord;
  }

  public void setExecutionInstanceRecord(CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutionbqreferenceidrequisitionExecutionInstanceRecord executionInstanceRecord) {
    this.executionInstanceRecord = executionInstanceRecord;
  }

  public BQExecutionRequestInputModel executionRequestActionTaskRecord(Object executionRequestActionTaskRecord) {
    this.executionRequestActionTaskRecord = executionRequestActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return executionRequestActionTaskRecord
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record ")
  
    public Object getExecutionRequestActionTaskRecord() {
    return executionRequestActionTaskRecord;
  }

  public void setExecutionRequestActionTaskRecord(Object executionRequestActionTaskRecord) {
    this.executionRequestActionTaskRecord = executionRequestActionTaskRecord;
  }

  public BQExecutionRequestInputModel requestRecordType(CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidrequisitionRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
    return this;
  }

  /**
   * Get requestRecordType
   * @return requestRecordType
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidrequisitionRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidrequisitionRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQExecutionRequestInputModel bqExecutionRequestInputModel = (BQExecutionRequestInputModel) o;
    return Objects.equals(this.customerCampaignProcedureInstanceReference, bqExecutionRequestInputModel.customerCampaignProcedureInstanceReference) &&
        Objects.equals(this.executionInstanceReference, bqExecutionRequestInputModel.executionInstanceReference) &&
        Objects.equals(this.executionInstanceRecord, bqExecutionRequestInputModel.executionInstanceRecord) &&
        Objects.equals(this.executionRequestActionTaskRecord, bqExecutionRequestInputModel.executionRequestActionTaskRecord) &&
        Objects.equals(this.requestRecordType, bqExecutionRequestInputModel.requestRecordType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCampaignProcedureInstanceReference, executionInstanceReference, executionInstanceRecord, executionRequestActionTaskRecord, requestRecordType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQExecutionRequestInputModel {\n");
    
    sb.append("    customerCampaignProcedureInstanceReference: ").append(toIndentedString(customerCampaignProcedureInstanceReference)).append("\n");
    sb.append("    executionInstanceReference: ").append(toIndentedString(executionInstanceReference)).append("\n");
    sb.append("    executionInstanceRecord: ").append(toIndentedString(executionInstanceRecord)).append("\n");
    sb.append("    executionRequestActionTaskRecord: ").append(toIndentedString(executionRequestActionTaskRecord)).append("\n");
    sb.append("    requestRecordType: ").append(toIndentedString(requestRecordType)).append("\n");
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
