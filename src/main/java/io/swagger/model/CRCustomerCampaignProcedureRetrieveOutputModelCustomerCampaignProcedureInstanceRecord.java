package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceRecord1CustomerCampaignProcedureResult;
import io.swagger.model.CustomercampaignexecutionsdreferenceidcustomercampaignprocedureinitiationCustomerCampaignProcedureInstanceRecordCustomerCampaignConsumablesInventory;
import io.swagger.model.CustomercampaignexecutionsdreferenceidcustomercampaignprocedureinitiationCustomerCampaignProcedureInstanceRecordDateType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceRecord
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceRecord   {
  @JsonProperty("customerCampaignType")
  private String customerCampaignType = null;

  @JsonProperty("customerCampaignDescription")
  private String customerCampaignDescription = null;

  @JsonProperty("employeeBusinessUnitReference")
  private String employeeBusinessUnitReference = null;

  @JsonProperty("customerCampaignProcedureSetup")
  private String customerCampaignProcedureSetup = null;

  @JsonProperty("customerCampaignProcedureVersionNumber")
  private String customerCampaignProcedureVersionNumber = null;

  @JsonProperty("customerCampaignSchedule")
  private String customerCampaignSchedule = null;

  @JsonProperty("customerCampaignConsumablesInventory")
  private CustomercampaignexecutionsdreferenceidcustomercampaignprocedureinitiationCustomerCampaignProcedureInstanceRecordCustomerCampaignConsumablesInventory customerCampaignConsumablesInventory = null;

  @JsonProperty("dateType")
  private CustomercampaignexecutionsdreferenceidcustomercampaignprocedureinitiationCustomerCampaignProcedureInstanceRecordDateType dateType = null;

  @JsonProperty("customerCampaignProcedureResult")
  private CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceRecord1CustomerCampaignProcedureResult customerCampaignProcedureResult = null;

  public CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceRecord customerCampaignType(String customerCampaignType) {
    this.customerCampaignType = customerCampaignType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type or category of customer campaign (e.g. cross-sell, up-sell, retention) 
   * @return customerCampaignType
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type or category of customer campaign (e.g. cross-sell, up-sell, retention) ")
  
    public String getCustomerCampaignType() {
    return customerCampaignType;
  }

  public void setCustomerCampaignType(String customerCampaignType) {
    this.customerCampaignType = customerCampaignType;
  }

  public CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceRecord customerCampaignDescription(String customerCampaignDescription) {
    this.customerCampaignDescription = customerCampaignDescription;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A description of the campaign that clarifies the intended context/use of the campaign, the mechanisms employed and the intended/anticipated response/impact 
   * @return customerCampaignDescription
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A description of the campaign that clarifies the intended context/use of the campaign, the mechanisms employed and the intended/anticipated response/impact ")
  
    public String getCustomerCampaignDescription() {
    return customerCampaignDescription;
  }

  public void setCustomerCampaignDescription(String customerCampaignDescription) {
    this.customerCampaignDescription = customerCampaignDescription;
  }

  public CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceRecord employeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the business unit responsible for the campaign execution 
   * @return employeeBusinessUnitReference
  **/
  @ApiModelProperty(example = "771908", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the business unit responsible for the campaign execution ")
  
    public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }

  public CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceRecord customerCampaignProcedureSetup(String customerCampaignProcedureSetup) {
    this.customerCampaignProcedureSetup = customerCampaignProcedureSetup;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the deployment set-up/configuration of the campaign for reference 
   * @return customerCampaignProcedureSetup
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the deployment set-up/configuration of the campaign for reference ")
  
    public String getCustomerCampaignProcedureSetup() {
    return customerCampaignProcedureSetup;
  }

  public void setCustomerCampaignProcedureSetup(String customerCampaignProcedureSetup) {
    this.customerCampaignProcedureSetup = customerCampaignProcedureSetup;
  }

  public CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceRecord customerCampaignProcedureVersionNumber(String customerCampaignProcedureVersionNumber) {
    this.customerCampaignProcedureVersionNumber = customerCampaignProcedureVersionNumber;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The customer campaign version number used in the event 
   * @return customerCampaignProcedureVersionNumber
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The customer campaign version number used in the event ")
  
    public String getCustomerCampaignProcedureVersionNumber() {
    return customerCampaignProcedureVersionNumber;
  }

  public void setCustomerCampaignProcedureVersionNumber(String customerCampaignProcedureVersionNumber) {
    this.customerCampaignProcedureVersionNumber = customerCampaignProcedureVersionNumber;
  }

  public CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceRecord customerCampaignSchedule(String customerCampaignSchedule) {
    this.customerCampaignSchedule = customerCampaignSchedule;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The campaign processing schedule, covering candidate selection, execution, flow-up and analysis activities. Note this can be an ongoing campaign where worksteps continue in parallel 
   * @return customerCampaignSchedule
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The campaign processing schedule, covering candidate selection, execution, flow-up and analysis activities. Note this can be an ongoing campaign where worksteps continue in parallel ")
  
    public String getCustomerCampaignSchedule() {
    return customerCampaignSchedule;
  }

  public void setCustomerCampaignSchedule(String customerCampaignSchedule) {
    this.customerCampaignSchedule = customerCampaignSchedule;
  }

  public CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceRecord customerCampaignConsumablesInventory(CustomercampaignexecutionsdreferenceidcustomercampaignprocedureinitiationCustomerCampaignProcedureInstanceRecordCustomerCampaignConsumablesInventory customerCampaignConsumablesInventory) {
    this.customerCampaignConsumablesInventory = customerCampaignConsumablesInventory;
    return this;
  }

  /**
   * Get customerCampaignConsumablesInventory
   * @return customerCampaignConsumablesInventory
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CustomercampaignexecutionsdreferenceidcustomercampaignprocedureinitiationCustomerCampaignProcedureInstanceRecordCustomerCampaignConsumablesInventory getCustomerCampaignConsumablesInventory() {
    return customerCampaignConsumablesInventory;
  }

  public void setCustomerCampaignConsumablesInventory(CustomercampaignexecutionsdreferenceidcustomercampaignprocedureinitiationCustomerCampaignProcedureInstanceRecordCustomerCampaignConsumablesInventory customerCampaignConsumablesInventory) {
    this.customerCampaignConsumablesInventory = customerCampaignConsumablesInventory;
  }

  public CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceRecord dateType(CustomercampaignexecutionsdreferenceidcustomercampaignprocedureinitiationCustomerCampaignProcedureInstanceRecordDateType dateType) {
    this.dateType = dateType;
    return this;
  }

  /**
   * Get dateType
   * @return dateType
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CustomercampaignexecutionsdreferenceidcustomercampaignprocedureinitiationCustomerCampaignProcedureInstanceRecordDateType getDateType() {
    return dateType;
  }

  public void setDateType(CustomercampaignexecutionsdreferenceidcustomercampaignprocedureinitiationCustomerCampaignProcedureInstanceRecordDateType dateType) {
    this.dateType = dateType;
  }

  public CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceRecord customerCampaignProcedureResult(CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceRecord1CustomerCampaignProcedureResult customerCampaignProcedureResult) {
    this.customerCampaignProcedureResult = customerCampaignProcedureResult;
    return this;
  }

  /**
   * Get customerCampaignProcedureResult
   * @return customerCampaignProcedureResult
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceRecord1CustomerCampaignProcedureResult getCustomerCampaignProcedureResult() {
    return customerCampaignProcedureResult;
  }

  public void setCustomerCampaignProcedureResult(CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceRecord1CustomerCampaignProcedureResult customerCampaignProcedureResult) {
    this.customerCampaignProcedureResult = customerCampaignProcedureResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceRecord crCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceRecord = (CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceRecord) o;
    return Objects.equals(this.customerCampaignType, crCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceRecord.customerCampaignType) &&
        Objects.equals(this.customerCampaignDescription, crCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceRecord.customerCampaignDescription) &&
        Objects.equals(this.employeeBusinessUnitReference, crCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceRecord.employeeBusinessUnitReference) &&
        Objects.equals(this.customerCampaignProcedureSetup, crCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceRecord.customerCampaignProcedureSetup) &&
        Objects.equals(this.customerCampaignProcedureVersionNumber, crCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceRecord.customerCampaignProcedureVersionNumber) &&
        Objects.equals(this.customerCampaignSchedule, crCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceRecord.customerCampaignSchedule) &&
        Objects.equals(this.customerCampaignConsumablesInventory, crCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceRecord.customerCampaignConsumablesInventory) &&
        Objects.equals(this.dateType, crCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceRecord.dateType) &&
        Objects.equals(this.customerCampaignProcedureResult, crCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceRecord.customerCampaignProcedureResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCampaignType, customerCampaignDescription, employeeBusinessUnitReference, customerCampaignProcedureSetup, customerCampaignProcedureVersionNumber, customerCampaignSchedule, customerCampaignConsumablesInventory, dateType, customerCampaignProcedureResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceRecord {\n");
    
    sb.append("    customerCampaignType: ").append(toIndentedString(customerCampaignType)).append("\n");
    sb.append("    customerCampaignDescription: ").append(toIndentedString(customerCampaignDescription)).append("\n");
    sb.append("    employeeBusinessUnitReference: ").append(toIndentedString(employeeBusinessUnitReference)).append("\n");
    sb.append("    customerCampaignProcedureSetup: ").append(toIndentedString(customerCampaignProcedureSetup)).append("\n");
    sb.append("    customerCampaignProcedureVersionNumber: ").append(toIndentedString(customerCampaignProcedureVersionNumber)).append("\n");
    sb.append("    customerCampaignSchedule: ").append(toIndentedString(customerCampaignSchedule)).append("\n");
    sb.append("    customerCampaignConsumablesInventory: ").append(toIndentedString(customerCampaignConsumablesInventory)).append("\n");
    sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
    sb.append("    customerCampaignProcedureResult: ").append(toIndentedString(customerCampaignProcedureResult)).append("\n");
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
