package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BQExecutionInitiateOutputModelCustomerCampaignProcedureInstanceRecord1;
import io.swagger.model.BQExecutionInitiateOutputModelExecutionInstanceRecord1;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQExecutionInitiateOutputModel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class BQExecutionInitiateOutputModel   {
  @JsonProperty("customerCampaignProcedureInstanceRecord")
  private BQExecutionInitiateOutputModelCustomerCampaignProcedureInstanceRecord1 customerCampaignProcedureInstanceRecord = null;

  @JsonProperty("executionInstanceReference")
  private String executionInstanceReference = null;

  @JsonProperty("executionInitiateActionReference")
  private String executionInitiateActionReference = null;

  @JsonProperty("executionInitiateActionRecord")
  private Object executionInitiateActionRecord = null;

  @JsonProperty("executionInstanceStatus")
  private String executionInstanceStatus = null;

  @JsonProperty("executionInstanceRecord")
  private BQExecutionInitiateOutputModelExecutionInstanceRecord1 executionInstanceRecord = null;

  public BQExecutionInitiateOutputModel customerCampaignProcedureInstanceRecord(BQExecutionInitiateOutputModelCustomerCampaignProcedureInstanceRecord1 customerCampaignProcedureInstanceRecord) {
    this.customerCampaignProcedureInstanceRecord = customerCampaignProcedureInstanceRecord;
    return this;
  }

  /**
   * Get customerCampaignProcedureInstanceRecord
   * @return customerCampaignProcedureInstanceRecord
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BQExecutionInitiateOutputModelCustomerCampaignProcedureInstanceRecord1 getCustomerCampaignProcedureInstanceRecord() {
    return customerCampaignProcedureInstanceRecord;
  }

  public void setCustomerCampaignProcedureInstanceRecord(BQExecutionInitiateOutputModelCustomerCampaignProcedureInstanceRecord1 customerCampaignProcedureInstanceRecord) {
    this.customerCampaignProcedureInstanceRecord = customerCampaignProcedureInstanceRecord;
  }

  public BQExecutionInitiateOutputModel executionInstanceReference(String executionInstanceReference) {
    this.executionInstanceReference = executionInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Execution instance 
   * @return executionInstanceReference
  **/
  @ApiModelProperty(example = "EIR782908", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Execution instance ")
  
    public String getExecutionInstanceReference() {
    return executionInstanceReference;
  }

  public void setExecutionInstanceReference(String executionInstanceReference) {
    this.executionInstanceReference = executionInstanceReference;
  }

  public BQExecutionInitiateOutputModel executionInitiateActionReference(String executionInitiateActionReference) {
    this.executionInitiateActionReference = executionInitiateActionReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return executionInitiateActionReference
  **/
  @ApiModelProperty(example = "EIAR724258", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call ")
  
    public String getExecutionInitiateActionReference() {
    return executionInitiateActionReference;
  }

  public void setExecutionInitiateActionReference(String executionInitiateActionReference) {
    this.executionInitiateActionReference = executionInitiateActionReference;
  }

  public BQExecutionInitiateOutputModel executionInitiateActionRecord(Object executionInitiateActionRecord) {
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

  public BQExecutionInitiateOutputModel executionInstanceStatus(String executionInstanceStatus) {
    this.executionInstanceStatus = executionInstanceStatus;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Execution instance (e.g. initialised, pending, active) 
   * @return executionInstanceStatus
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Execution instance (e.g. initialised, pending, active) ")
  
    public String getExecutionInstanceStatus() {
    return executionInstanceStatus;
  }

  public void setExecutionInstanceStatus(String executionInstanceStatus) {
    this.executionInstanceStatus = executionInstanceStatus;
  }

  public BQExecutionInitiateOutputModel executionInstanceRecord(BQExecutionInitiateOutputModelExecutionInstanceRecord1 executionInstanceRecord) {
    this.executionInstanceRecord = executionInstanceRecord;
    return this;
  }

  /**
   * Get executionInstanceRecord
   * @return executionInstanceRecord
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BQExecutionInitiateOutputModelExecutionInstanceRecord1 getExecutionInstanceRecord() {
    return executionInstanceRecord;
  }

  public void setExecutionInstanceRecord(BQExecutionInitiateOutputModelExecutionInstanceRecord1 executionInstanceRecord) {
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
    BQExecutionInitiateOutputModel bqExecutionInitiateOutputModel = (BQExecutionInitiateOutputModel) o;
    return Objects.equals(this.customerCampaignProcedureInstanceRecord, bqExecutionInitiateOutputModel.customerCampaignProcedureInstanceRecord) &&
        Objects.equals(this.executionInstanceReference, bqExecutionInitiateOutputModel.executionInstanceReference) &&
        Objects.equals(this.executionInitiateActionReference, bqExecutionInitiateOutputModel.executionInitiateActionReference) &&
        Objects.equals(this.executionInitiateActionRecord, bqExecutionInitiateOutputModel.executionInitiateActionRecord) &&
        Objects.equals(this.executionInstanceStatus, bqExecutionInitiateOutputModel.executionInstanceStatus) &&
        Objects.equals(this.executionInstanceRecord, bqExecutionInitiateOutputModel.executionInstanceRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCampaignProcedureInstanceRecord, executionInstanceReference, executionInitiateActionReference, executionInitiateActionRecord, executionInstanceStatus, executionInstanceRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQExecutionInitiateOutputModel {\n");
    
    sb.append("    customerCampaignProcedureInstanceRecord: ").append(toIndentedString(customerCampaignProcedureInstanceRecord)).append("\n");
    sb.append("    executionInstanceReference: ").append(toIndentedString(executionInstanceReference)).append("\n");
    sb.append("    executionInitiateActionReference: ").append(toIndentedString(executionInitiateActionReference)).append("\n");
    sb.append("    executionInitiateActionRecord: ").append(toIndentedString(executionInitiateActionRecord)).append("\n");
    sb.append("    executionInstanceStatus: ").append(toIndentedString(executionInstanceStatus)).append("\n");
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
