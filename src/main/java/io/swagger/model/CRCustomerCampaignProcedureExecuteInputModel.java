package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutionExecuteRecordType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CRCustomerCampaignProcedureExecuteInputModel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class CRCustomerCampaignProcedureExecuteInputModel   {
  @JsonProperty("customerCampaignExecutionServicingSessionReference")
  private String customerCampaignExecutionServicingSessionReference = null;

  @JsonProperty("customerCampaignProcedureInstanceReference")
  private String customerCampaignProcedureInstanceReference = null;

  @JsonProperty("customerCampaignProcedureExecuteActionTaskRecord")
  private Object customerCampaignProcedureExecuteActionTaskRecord = null;

  @JsonProperty("executeRecordType")
  private CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutionExecuteRecordType executeRecordType = null;

  public CRCustomerCampaignProcedureExecuteInputModel customerCampaignExecutionServicingSessionReference(String customerCampaignExecutionServicingSessionReference) {
    this.customerCampaignExecutionServicingSessionReference = customerCampaignExecutionServicingSessionReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return customerCampaignExecutionServicingSessionReference
  **/
  @ApiModelProperty(example = "CCESSR783739", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session ")
  
    public String getCustomerCampaignExecutionServicingSessionReference() {
    return customerCampaignExecutionServicingSessionReference;
  }

  public void setCustomerCampaignExecutionServicingSessionReference(String customerCampaignExecutionServicingSessionReference) {
    this.customerCampaignExecutionServicingSessionReference = customerCampaignExecutionServicingSessionReference;
  }

  public CRCustomerCampaignProcedureExecuteInputModel customerCampaignProcedureInstanceReference(String customerCampaignProcedureInstanceReference) {
    this.customerCampaignProcedureInstanceReference = customerCampaignProcedureInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Campaign Procedure instance 
   * @return customerCampaignProcedureInstanceReference
  **/
  @ApiModelProperty(example = "CCPIR749709", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Campaign Procedure instance ")
  
    public String getCustomerCampaignProcedureInstanceReference() {
    return customerCampaignProcedureInstanceReference;
  }

  public void setCustomerCampaignProcedureInstanceReference(String customerCampaignProcedureInstanceReference) {
    this.customerCampaignProcedureInstanceReference = customerCampaignProcedureInstanceReference;
  }

  public CRCustomerCampaignProcedureExecuteInputModel customerCampaignProcedureExecuteActionTaskRecord(Object customerCampaignProcedureExecuteActionTaskRecord) {
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

  public CRCustomerCampaignProcedureExecuteInputModel executeRecordType(CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutionExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
    return this;
  }

  /**
   * Get executeRecordType
   * @return executeRecordType
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutionExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutionExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CRCustomerCampaignProcedureExecuteInputModel crCustomerCampaignProcedureExecuteInputModel = (CRCustomerCampaignProcedureExecuteInputModel) o;
    return Objects.equals(this.customerCampaignExecutionServicingSessionReference, crCustomerCampaignProcedureExecuteInputModel.customerCampaignExecutionServicingSessionReference) &&
        Objects.equals(this.customerCampaignProcedureInstanceReference, crCustomerCampaignProcedureExecuteInputModel.customerCampaignProcedureInstanceReference) &&
        Objects.equals(this.customerCampaignProcedureExecuteActionTaskRecord, crCustomerCampaignProcedureExecuteInputModel.customerCampaignProcedureExecuteActionTaskRecord) &&
        Objects.equals(this.executeRecordType, crCustomerCampaignProcedureExecuteInputModel.executeRecordType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCampaignExecutionServicingSessionReference, customerCampaignProcedureInstanceReference, customerCampaignProcedureExecuteActionTaskRecord, executeRecordType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CRCustomerCampaignProcedureExecuteInputModel {\n");
    
    sb.append("    customerCampaignExecutionServicingSessionReference: ").append(toIndentedString(customerCampaignExecutionServicingSessionReference)).append("\n");
    sb.append("    customerCampaignProcedureInstanceReference: ").append(toIndentedString(customerCampaignProcedureInstanceReference)).append("\n");
    sb.append("    customerCampaignProcedureExecuteActionTaskRecord: ").append(toIndentedString(customerCampaignProcedureExecuteActionTaskRecord)).append("\n");
    sb.append("    executeRecordType: ").append(toIndentedString(executeRecordType)).append("\n");
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
