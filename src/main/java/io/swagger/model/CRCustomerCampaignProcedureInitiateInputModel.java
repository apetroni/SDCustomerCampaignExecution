package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CustomercampaignexecutionsdreferenceidcustomercampaignprocedureinitiationCustomerCampaignProcedureInstanceRecord;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CRCustomerCampaignProcedureInitiateInputModel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class CRCustomerCampaignProcedureInitiateInputModel   {
  @JsonProperty("customerCampaignExecutionServicingSessionReference")
  private String customerCampaignExecutionServicingSessionReference = null;

  @JsonProperty("customerCampaignProcedureInitiateActionRecord")
  private Object customerCampaignProcedureInitiateActionRecord = null;

  @JsonProperty("customerCampaignProcedureInstanceStatus")
  private String customerCampaignProcedureInstanceStatus = null;

  @JsonProperty("customerCampaignProcedureInstanceRecord")
  private CustomercampaignexecutionsdreferenceidcustomercampaignprocedureinitiationCustomerCampaignProcedureInstanceRecord customerCampaignProcedureInstanceRecord = null;

  public CRCustomerCampaignProcedureInitiateInputModel customerCampaignExecutionServicingSessionReference(String customerCampaignExecutionServicingSessionReference) {
    this.customerCampaignExecutionServicingSessionReference = customerCampaignExecutionServicingSessionReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return customerCampaignExecutionServicingSessionReference
  **/
  @ApiModelProperty(example = "CCESSR796406", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session ")
  
    public String getCustomerCampaignExecutionServicingSessionReference() {
    return customerCampaignExecutionServicingSessionReference;
  }

  public void setCustomerCampaignExecutionServicingSessionReference(String customerCampaignExecutionServicingSessionReference) {
    this.customerCampaignExecutionServicingSessionReference = customerCampaignExecutionServicingSessionReference;
  }

  public CRCustomerCampaignProcedureInitiateInputModel customerCampaignProcedureInitiateActionRecord(Object customerCampaignProcedureInitiateActionRecord) {
    this.customerCampaignProcedureInitiateActionRecord = customerCampaignProcedureInitiateActionRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return customerCampaignProcedureInitiateActionRecord
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record ")
  
    public Object getCustomerCampaignProcedureInitiateActionRecord() {
    return customerCampaignProcedureInitiateActionRecord;
  }

  public void setCustomerCampaignProcedureInitiateActionRecord(Object customerCampaignProcedureInitiateActionRecord) {
    this.customerCampaignProcedureInitiateActionRecord = customerCampaignProcedureInitiateActionRecord;
  }

  public CRCustomerCampaignProcedureInitiateInputModel customerCampaignProcedureInstanceStatus(String customerCampaignProcedureInstanceStatus) {
    this.customerCampaignProcedureInstanceStatus = customerCampaignProcedureInstanceStatus;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Customer Campaign Procedure instance (e.g. initialised, pending, active) 
   * @return customerCampaignProcedureInstanceStatus
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Customer Campaign Procedure instance (e.g. initialised, pending, active) ")
  
    public String getCustomerCampaignProcedureInstanceStatus() {
    return customerCampaignProcedureInstanceStatus;
  }

  public void setCustomerCampaignProcedureInstanceStatus(String customerCampaignProcedureInstanceStatus) {
    this.customerCampaignProcedureInstanceStatus = customerCampaignProcedureInstanceStatus;
  }

  public CRCustomerCampaignProcedureInitiateInputModel customerCampaignProcedureInstanceRecord(CustomercampaignexecutionsdreferenceidcustomercampaignprocedureinitiationCustomerCampaignProcedureInstanceRecord customerCampaignProcedureInstanceRecord) {
    this.customerCampaignProcedureInstanceRecord = customerCampaignProcedureInstanceRecord;
    return this;
  }

  /**
   * Get customerCampaignProcedureInstanceRecord
   * @return customerCampaignProcedureInstanceRecord
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CustomercampaignexecutionsdreferenceidcustomercampaignprocedureinitiationCustomerCampaignProcedureInstanceRecord getCustomerCampaignProcedureInstanceRecord() {
    return customerCampaignProcedureInstanceRecord;
  }

  public void setCustomerCampaignProcedureInstanceRecord(CustomercampaignexecutionsdreferenceidcustomercampaignprocedureinitiationCustomerCampaignProcedureInstanceRecord customerCampaignProcedureInstanceRecord) {
    this.customerCampaignProcedureInstanceRecord = customerCampaignProcedureInstanceRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CRCustomerCampaignProcedureInitiateInputModel crCustomerCampaignProcedureInitiateInputModel = (CRCustomerCampaignProcedureInitiateInputModel) o;
    return Objects.equals(this.customerCampaignExecutionServicingSessionReference, crCustomerCampaignProcedureInitiateInputModel.customerCampaignExecutionServicingSessionReference) &&
        Objects.equals(this.customerCampaignProcedureInitiateActionRecord, crCustomerCampaignProcedureInitiateInputModel.customerCampaignProcedureInitiateActionRecord) &&
        Objects.equals(this.customerCampaignProcedureInstanceStatus, crCustomerCampaignProcedureInitiateInputModel.customerCampaignProcedureInstanceStatus) &&
        Objects.equals(this.customerCampaignProcedureInstanceRecord, crCustomerCampaignProcedureInitiateInputModel.customerCampaignProcedureInstanceRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCampaignExecutionServicingSessionReference, customerCampaignProcedureInitiateActionRecord, customerCampaignProcedureInstanceStatus, customerCampaignProcedureInstanceRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CRCustomerCampaignProcedureInitiateInputModel {\n");
    
    sb.append("    customerCampaignExecutionServicingSessionReference: ").append(toIndentedString(customerCampaignExecutionServicingSessionReference)).append("\n");
    sb.append("    customerCampaignProcedureInitiateActionRecord: ").append(toIndentedString(customerCampaignProcedureInitiateActionRecord)).append("\n");
    sb.append("    customerCampaignProcedureInstanceStatus: ").append(toIndentedString(customerCampaignProcedureInstanceStatus)).append("\n");
    sb.append("    customerCampaignProcedureInstanceRecord: ").append(toIndentedString(customerCampaignProcedureInstanceRecord)).append("\n");
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
