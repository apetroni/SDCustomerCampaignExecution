package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutionbqreferenceidupdateCustomerCampaignProcedureInstanceRecord;
import io.swagger.model.CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutionbqreferenceidupdateExecutionInstanceRecord;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Body12
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class Body12   {
  @JsonProperty("customerCampaignProcedureInstanceRecord")
  private CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutionbqreferenceidupdateCustomerCampaignProcedureInstanceRecord customerCampaignProcedureInstanceRecord = null;

  @JsonProperty("customerCampaignProcedureInstanceReference")
  private String customerCampaignProcedureInstanceReference = null;

  @JsonProperty("executionInstanceReference")
  private String executionInstanceReference = null;

  @JsonProperty("executionInstanceRecord")
  private CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutionbqreferenceidupdateExecutionInstanceRecord executionInstanceRecord = null;

  @JsonProperty("executionUpdateActionTaskRecord")
  private Object executionUpdateActionTaskRecord = null;

  @JsonProperty("executionUpdateActionRequest")
  private String executionUpdateActionRequest = null;

  public Body12 customerCampaignProcedureInstanceRecord(CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutionbqreferenceidupdateCustomerCampaignProcedureInstanceRecord customerCampaignProcedureInstanceRecord) {
    this.customerCampaignProcedureInstanceRecord = customerCampaignProcedureInstanceRecord;
    return this;
  }

  /**
   * Get customerCampaignProcedureInstanceRecord
   * @return customerCampaignProcedureInstanceRecord
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutionbqreferenceidupdateCustomerCampaignProcedureInstanceRecord getCustomerCampaignProcedureInstanceRecord() {
    return customerCampaignProcedureInstanceRecord;
  }

  public void setCustomerCampaignProcedureInstanceRecord(CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutionbqreferenceidupdateCustomerCampaignProcedureInstanceRecord customerCampaignProcedureInstanceRecord) {
    this.customerCampaignProcedureInstanceRecord = customerCampaignProcedureInstanceRecord;
  }

  public Body12 customerCampaignProcedureInstanceReference(String customerCampaignProcedureInstanceReference) {
    this.customerCampaignProcedureInstanceReference = customerCampaignProcedureInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Campaign Procedure instance 
   * @return customerCampaignProcedureInstanceReference
  **/
  @ApiModelProperty(example = "CCPIR700471", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Campaign Procedure instance ")
  
    public String getCustomerCampaignProcedureInstanceReference() {
    return customerCampaignProcedureInstanceReference;
  }

  public void setCustomerCampaignProcedureInstanceReference(String customerCampaignProcedureInstanceReference) {
    this.customerCampaignProcedureInstanceReference = customerCampaignProcedureInstanceReference;
  }

  public Body12 executionInstanceReference(String executionInstanceReference) {
    this.executionInstanceReference = executionInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Execution instance 
   * @return executionInstanceReference
  **/
  @ApiModelProperty(example = "EIR714674", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Execution instance ")
  
    public String getExecutionInstanceReference() {
    return executionInstanceReference;
  }

  public void setExecutionInstanceReference(String executionInstanceReference) {
    this.executionInstanceReference = executionInstanceReference;
  }

  public Body12 executionInstanceRecord(CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutionbqreferenceidupdateExecutionInstanceRecord executionInstanceRecord) {
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

  public Body12 executionUpdateActionTaskRecord(Object executionUpdateActionTaskRecord) {
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

  public Body12 executionUpdateActionRequest(String executionUpdateActionRequest) {
    this.executionUpdateActionRequest = executionUpdateActionRequest;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return executionUpdateActionRequest
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request ")
  
    public String getExecutionUpdateActionRequest() {
    return executionUpdateActionRequest;
  }

  public void setExecutionUpdateActionRequest(String executionUpdateActionRequest) {
    this.executionUpdateActionRequest = executionUpdateActionRequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body12 body12 = (Body12) o;
    return Objects.equals(this.customerCampaignProcedureInstanceRecord, body12.customerCampaignProcedureInstanceRecord) &&
        Objects.equals(this.customerCampaignProcedureInstanceReference, body12.customerCampaignProcedureInstanceReference) &&
        Objects.equals(this.executionInstanceReference, body12.executionInstanceReference) &&
        Objects.equals(this.executionInstanceRecord, body12.executionInstanceRecord) &&
        Objects.equals(this.executionUpdateActionTaskRecord, body12.executionUpdateActionTaskRecord) &&
        Objects.equals(this.executionUpdateActionRequest, body12.executionUpdateActionRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCampaignProcedureInstanceRecord, customerCampaignProcedureInstanceReference, executionInstanceReference, executionInstanceRecord, executionUpdateActionTaskRecord, executionUpdateActionRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body12 {\n");
    
    sb.append("    customerCampaignProcedureInstanceRecord: ").append(toIndentedString(customerCampaignProcedureInstanceRecord)).append("\n");
    sb.append("    customerCampaignProcedureInstanceReference: ").append(toIndentedString(customerCampaignProcedureInstanceReference)).append("\n");
    sb.append("    executionInstanceReference: ").append(toIndentedString(executionInstanceReference)).append("\n");
    sb.append("    executionInstanceRecord: ").append(toIndentedString(executionInstanceRecord)).append("\n");
    sb.append("    executionUpdateActionTaskRecord: ").append(toIndentedString(executionUpdateActionTaskRecord)).append("\n");
    sb.append("    executionUpdateActionRequest: ").append(toIndentedString(executionUpdateActionRequest)).append("\n");
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
