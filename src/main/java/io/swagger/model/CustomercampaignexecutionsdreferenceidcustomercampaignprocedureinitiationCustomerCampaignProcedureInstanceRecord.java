package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CustomercampaignexecutionsdreferenceidcustomercampaignprocedureinitiationCustomerCampaignProcedureInstanceRecordCustomerCampaignConsumablesInventory;
import io.swagger.model.CustomercampaignexecutionsdreferenceidcustomercampaignprocedureinitiationCustomerCampaignProcedureInstanceRecordDateType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CustomercampaignexecutionsdreferenceidcustomercampaignprocedureinitiationCustomerCampaignProcedureInstanceRecord
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class CustomercampaignexecutionsdreferenceidcustomercampaignprocedureinitiationCustomerCampaignProcedureInstanceRecord   {
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

  public CustomercampaignexecutionsdreferenceidcustomercampaignprocedureinitiationCustomerCampaignProcedureInstanceRecord customerCampaignType(String customerCampaignType) {
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

  public CustomercampaignexecutionsdreferenceidcustomercampaignprocedureinitiationCustomerCampaignProcedureInstanceRecord customerCampaignDescription(String customerCampaignDescription) {
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

  public CustomercampaignexecutionsdreferenceidcustomercampaignprocedureinitiationCustomerCampaignProcedureInstanceRecord employeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the business unit responsible for the campaign execution 
   * @return employeeBusinessUnitReference
  **/
  @ApiModelProperty(example = "726890", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the business unit responsible for the campaign execution ")
  
    public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }

  public CustomercampaignexecutionsdreferenceidcustomercampaignprocedureinitiationCustomerCampaignProcedureInstanceRecord customerCampaignProcedureSetup(String customerCampaignProcedureSetup) {
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

  public CustomercampaignexecutionsdreferenceidcustomercampaignprocedureinitiationCustomerCampaignProcedureInstanceRecord customerCampaignProcedureVersionNumber(String customerCampaignProcedureVersionNumber) {
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

  public CustomercampaignexecutionsdreferenceidcustomercampaignprocedureinitiationCustomerCampaignProcedureInstanceRecord customerCampaignSchedule(String customerCampaignSchedule) {
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

  public CustomercampaignexecutionsdreferenceidcustomercampaignprocedureinitiationCustomerCampaignProcedureInstanceRecord customerCampaignConsumablesInventory(CustomercampaignexecutionsdreferenceidcustomercampaignprocedureinitiationCustomerCampaignProcedureInstanceRecordCustomerCampaignConsumablesInventory customerCampaignConsumablesInventory) {
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

  public CustomercampaignexecutionsdreferenceidcustomercampaignprocedureinitiationCustomerCampaignProcedureInstanceRecord dateType(CustomercampaignexecutionsdreferenceidcustomercampaignprocedureinitiationCustomerCampaignProcedureInstanceRecordDateType dateType) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomercampaignexecutionsdreferenceidcustomercampaignprocedureinitiationCustomerCampaignProcedureInstanceRecord customercampaignexecutionsdreferenceidcustomercampaignprocedureinitiationCustomerCampaignProcedureInstanceRecord = (CustomercampaignexecutionsdreferenceidcustomercampaignprocedureinitiationCustomerCampaignProcedureInstanceRecord) o;
    return Objects.equals(this.customerCampaignType, customercampaignexecutionsdreferenceidcustomercampaignprocedureinitiationCustomerCampaignProcedureInstanceRecord.customerCampaignType) &&
        Objects.equals(this.customerCampaignDescription, customercampaignexecutionsdreferenceidcustomercampaignprocedureinitiationCustomerCampaignProcedureInstanceRecord.customerCampaignDescription) &&
        Objects.equals(this.employeeBusinessUnitReference, customercampaignexecutionsdreferenceidcustomercampaignprocedureinitiationCustomerCampaignProcedureInstanceRecord.employeeBusinessUnitReference) &&
        Objects.equals(this.customerCampaignProcedureSetup, customercampaignexecutionsdreferenceidcustomercampaignprocedureinitiationCustomerCampaignProcedureInstanceRecord.customerCampaignProcedureSetup) &&
        Objects.equals(this.customerCampaignProcedureVersionNumber, customercampaignexecutionsdreferenceidcustomercampaignprocedureinitiationCustomerCampaignProcedureInstanceRecord.customerCampaignProcedureVersionNumber) &&
        Objects.equals(this.customerCampaignSchedule, customercampaignexecutionsdreferenceidcustomercampaignprocedureinitiationCustomerCampaignProcedureInstanceRecord.customerCampaignSchedule) &&
        Objects.equals(this.customerCampaignConsumablesInventory, customercampaignexecutionsdreferenceidcustomercampaignprocedureinitiationCustomerCampaignProcedureInstanceRecord.customerCampaignConsumablesInventory) &&
        Objects.equals(this.dateType, customercampaignexecutionsdreferenceidcustomercampaignprocedureinitiationCustomerCampaignProcedureInstanceRecord.dateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCampaignType, customerCampaignDescription, employeeBusinessUnitReference, customerCampaignProcedureSetup, customerCampaignProcedureVersionNumber, customerCampaignSchedule, customerCampaignConsumablesInventory, dateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomercampaignexecutionsdreferenceidcustomercampaignprocedureinitiationCustomerCampaignProcedureInstanceRecord {\n");
    
    sb.append("    customerCampaignType: ").append(toIndentedString(customerCampaignType)).append("\n");
    sb.append("    customerCampaignDescription: ").append(toIndentedString(customerCampaignDescription)).append("\n");
    sb.append("    employeeBusinessUnitReference: ").append(toIndentedString(employeeBusinessUnitReference)).append("\n");
    sb.append("    customerCampaignProcedureSetup: ").append(toIndentedString(customerCampaignProcedureSetup)).append("\n");
    sb.append("    customerCampaignProcedureVersionNumber: ").append(toIndentedString(customerCampaignProcedureVersionNumber)).append("\n");
    sb.append("    customerCampaignSchedule: ").append(toIndentedString(customerCampaignSchedule)).append("\n");
    sb.append("    customerCampaignConsumablesInventory: ").append(toIndentedString(customerCampaignConsumablesInventory)).append("\n");
    sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
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
