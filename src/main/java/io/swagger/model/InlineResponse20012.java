package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BQExecutionUpdateOutputModelCustomerCampaignProcedureInstanceRecord1;
import io.swagger.model.CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutionbqreferenceidupdateExecutionInstanceRecord;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse20012
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class InlineResponse20012   {
  @JsonProperty("customerCampaignProcedureInstanceRecord")
  private BQExecutionUpdateOutputModelCustomerCampaignProcedureInstanceRecord1 customerCampaignProcedureInstanceRecord = null;

  @JsonProperty("executionInstanceRecord")
  private CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutionbqreferenceidupdateExecutionInstanceRecord executionInstanceRecord = null;

  @JsonProperty("executionUpdateActionTaskReference")
  private String executionUpdateActionTaskReference = null;

  @JsonProperty("executionUpdateActionTaskRecord")
  private Object executionUpdateActionTaskRecord = null;

  @JsonProperty("updateResponseRecord")
  private Object updateResponseRecord = null;

  public InlineResponse20012 customerCampaignProcedureInstanceRecord(BQExecutionUpdateOutputModelCustomerCampaignProcedureInstanceRecord1 customerCampaignProcedureInstanceRecord) {
    this.customerCampaignProcedureInstanceRecord = customerCampaignProcedureInstanceRecord;
    return this;
  }

  /**
   * Get customerCampaignProcedureInstanceRecord
   * @return customerCampaignProcedureInstanceRecord
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BQExecutionUpdateOutputModelCustomerCampaignProcedureInstanceRecord1 getCustomerCampaignProcedureInstanceRecord() {
    return customerCampaignProcedureInstanceRecord;
  }

  public void setCustomerCampaignProcedureInstanceRecord(BQExecutionUpdateOutputModelCustomerCampaignProcedureInstanceRecord1 customerCampaignProcedureInstanceRecord) {
    this.customerCampaignProcedureInstanceRecord = customerCampaignProcedureInstanceRecord;
  }

  public InlineResponse20012 executionInstanceRecord(CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutionbqreferenceidupdateExecutionInstanceRecord executionInstanceRecord) {
    this.executionInstanceRecord = executionInstanceRecord;
    return this;
  }

  /**
   * Get executionInstanceRecord
   * @return executionInstanceRecord
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutionbqreferenceidupdateExecutionInstanceRecord getExecutionInstanceRecord() {
    return executionInstanceRecord;
  }

  public void setExecutionInstanceRecord(CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutionbqreferenceidupdateExecutionInstanceRecord executionInstanceRecord) {
    this.executionInstanceRecord = executionInstanceRecord;
  }

  public InlineResponse20012 executionUpdateActionTaskReference(String executionUpdateActionTaskReference) {
    this.executionUpdateActionTaskReference = executionUpdateActionTaskReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return executionUpdateActionTaskReference
  **/
  @ApiModelProperty(example = "EUATR726917", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call ")
  
    public String getExecutionUpdateActionTaskReference() {
    return executionUpdateActionTaskReference;
  }

  public void setExecutionUpdateActionTaskReference(String executionUpdateActionTaskReference) {
    this.executionUpdateActionTaskReference = executionUpdateActionTaskReference;
  }

  public InlineResponse20012 executionUpdateActionTaskRecord(Object executionUpdateActionTaskRecord) {
    this.executionUpdateActionTaskRecord = executionUpdateActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return executionUpdateActionTaskRecord
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record ")
  
    public Object getExecutionUpdateActionTaskRecord() {
    return executionUpdateActionTaskRecord;
  }

  public void setExecutionUpdateActionTaskRecord(Object executionUpdateActionTaskRecord) {
    this.executionUpdateActionTaskRecord = executionUpdateActionTaskRecord;
  }

  public InlineResponse20012 updateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response ")
  
    public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20012 inlineResponse20012 = (InlineResponse20012) o;
    return Objects.equals(this.customerCampaignProcedureInstanceRecord, inlineResponse20012.customerCampaignProcedureInstanceRecord) &&
        Objects.equals(this.executionInstanceRecord, inlineResponse20012.executionInstanceRecord) &&
        Objects.equals(this.executionUpdateActionTaskReference, inlineResponse20012.executionUpdateActionTaskReference) &&
        Objects.equals(this.executionUpdateActionTaskRecord, inlineResponse20012.executionUpdateActionTaskRecord) &&
        Objects.equals(this.updateResponseRecord, inlineResponse20012.updateResponseRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCampaignProcedureInstanceRecord, executionInstanceRecord, executionUpdateActionTaskReference, executionUpdateActionTaskRecord, updateResponseRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20012 {\n");
    
    sb.append("    customerCampaignProcedureInstanceRecord: ").append(toIndentedString(customerCampaignProcedureInstanceRecord)).append("\n");
    sb.append("    executionInstanceRecord: ").append(toIndentedString(executionInstanceRecord)).append("\n");
    sb.append("    executionUpdateActionTaskReference: ").append(toIndentedString(executionUpdateActionTaskReference)).append("\n");
    sb.append("    executionUpdateActionTaskRecord: ").append(toIndentedString(executionUpdateActionTaskRecord)).append("\n");
    sb.append("    updateResponseRecord: ").append(toIndentedString(updateResponseRecord)).append("\n");
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
