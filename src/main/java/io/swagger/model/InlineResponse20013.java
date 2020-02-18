package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutionbqreferenceidrequisitionExecutionInstanceRecord;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse20013
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class InlineResponse20013   {
  @JsonProperty("executionInstanceRecord")
  private CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutionbqreferenceidrequisitionExecutionInstanceRecord executionInstanceRecord = null;

  @JsonProperty("executionRequestActionTaskReference")
  private String executionRequestActionTaskReference = null;

  @JsonProperty("executionRequestActionTaskRecord")
  private Object executionRequestActionTaskRecord = null;

  @JsonProperty("executionRequestRecordReference")
  private String executionRequestRecordReference = null;

  @JsonProperty("requestResponseRecord")
  private Object requestResponseRecord = null;

  public InlineResponse20013 executionInstanceRecord(CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutionbqreferenceidrequisitionExecutionInstanceRecord executionInstanceRecord) {
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

  public InlineResponse20013 executionRequestActionTaskReference(String executionRequestActionTaskReference) {
    this.executionRequestActionTaskReference = executionRequestActionTaskReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Execution instance request service call 
   * @return executionRequestActionTaskReference
  **/
  @ApiModelProperty(example = "ERATR767380", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Execution instance request service call ")
  
    public String getExecutionRequestActionTaskReference() {
    return executionRequestActionTaskReference;
  }

  public void setExecutionRequestActionTaskReference(String executionRequestActionTaskReference) {
    this.executionRequestActionTaskReference = executionRequestActionTaskReference;
  }

  public InlineResponse20013 executionRequestActionTaskRecord(Object executionRequestActionTaskRecord) {
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

  public InlineResponse20013 executionRequestRecordReference(String executionRequestRecordReference) {
    this.executionRequestRecordReference = executionRequestRecordReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Execution service request record 
   * @return executionRequestRecordReference
  **/
  @ApiModelProperty(example = "ERRR753184", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Execution service request record ")
  
    public String getExecutionRequestRecordReference() {
    return executionRequestRecordReference;
  }

  public void setExecutionRequestRecordReference(String executionRequestRecordReference) {
    this.executionRequestRecordReference = executionRequestRecordReference;
  }

  public InlineResponse20013 requestResponseRecord(Object requestResponseRecord) {
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
    InlineResponse20013 inlineResponse20013 = (InlineResponse20013) o;
    return Objects.equals(this.executionInstanceRecord, inlineResponse20013.executionInstanceRecord) &&
        Objects.equals(this.executionRequestActionTaskReference, inlineResponse20013.executionRequestActionTaskReference) &&
        Objects.equals(this.executionRequestActionTaskRecord, inlineResponse20013.executionRequestActionTaskRecord) &&
        Objects.equals(this.executionRequestRecordReference, inlineResponse20013.executionRequestRecordReference) &&
        Objects.equals(this.requestResponseRecord, inlineResponse20013.requestResponseRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(executionInstanceRecord, executionRequestActionTaskReference, executionRequestActionTaskRecord, executionRequestRecordReference, requestResponseRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20013 {\n");
    
    sb.append("    executionInstanceRecord: ").append(toIndentedString(executionInstanceRecord)).append("\n");
    sb.append("    executionRequestActionTaskReference: ").append(toIndentedString(executionRequestActionTaskReference)).append("\n");
    sb.append("    executionRequestActionTaskRecord: ").append(toIndentedString(executionRequestActionTaskRecord)).append("\n");
    sb.append("    executionRequestRecordReference: ").append(toIndentedString(executionRequestRecordReference)).append("\n");
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
