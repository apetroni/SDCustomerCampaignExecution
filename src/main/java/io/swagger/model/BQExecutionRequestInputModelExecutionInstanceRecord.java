package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQExecutionRequestInputModelExecutionInstanceRecord
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class BQExecutionRequestInputModelExecutionInstanceRecord   {
  @JsonProperty("customerCampaignProcedureWorkTaskType")
  private String customerCampaignProcedureWorkTaskType = null;

  @JsonProperty("customerCampaignProcedureWorkTaskDescription")
  private String customerCampaignProcedureWorkTaskDescription = null;

  @JsonProperty("customerCampaignProcedureWorkTaskWorkProducts")
  private String customerCampaignProcedureWorkTaskWorkProducts = null;

  @JsonProperty("documentDirectoryEntryInstanceReference")
  private String documentDirectoryEntryInstanceReference = null;

  @JsonProperty("customerCampaignProcedureWorkTaskResult")
  private String customerCampaignProcedureWorkTaskResult = null;

  @JsonProperty("customerCampaignProcedureWorkTaskDateTime")
  private String customerCampaignProcedureWorkTaskDateTime = null;

  public BQExecutionRequestInputModelExecutionInstanceRecord customerCampaignProcedureWorkTaskType(String customerCampaignProcedureWorkTaskType) {
    this.customerCampaignProcedureWorkTaskType = customerCampaignProcedureWorkTaskType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of work task (e.g. execute campaign in contact center) 
   * @return customerCampaignProcedureWorkTaskType
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of work task (e.g. execute campaign in contact center) ")
  
    public String getCustomerCampaignProcedureWorkTaskType() {
    return customerCampaignProcedureWorkTaskType;
  }

  public void setCustomerCampaignProcedureWorkTaskType(String customerCampaignProcedureWorkTaskType) {
    this.customerCampaignProcedureWorkTaskType = customerCampaignProcedureWorkTaskType;
  }

  public BQExecutionRequestInputModelExecutionInstanceRecord customerCampaignProcedureWorkTaskDescription(String customerCampaignProcedureWorkTaskDescription) {
    this.customerCampaignProcedureWorkTaskDescription = customerCampaignProcedureWorkTaskDescription;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the task performed, includes summary of activities as necessary for reference 
   * @return customerCampaignProcedureWorkTaskDescription
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the task performed, includes summary of activities as necessary for reference ")
  
    public String getCustomerCampaignProcedureWorkTaskDescription() {
    return customerCampaignProcedureWorkTaskDescription;
  }

  public void setCustomerCampaignProcedureWorkTaskDescription(String customerCampaignProcedureWorkTaskDescription) {
    this.customerCampaignProcedureWorkTaskDescription = customerCampaignProcedureWorkTaskDescription;
  }

  public BQExecutionRequestInputModelExecutionInstanceRecord customerCampaignProcedureWorkTaskWorkProducts(String customerCampaignProcedureWorkTaskWorkProducts) {
    this.customerCampaignProcedureWorkTaskWorkProducts = customerCampaignProcedureWorkTaskWorkProducts;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: File of consolidated notes, forms and documents for the work task 
   * @return customerCampaignProcedureWorkTaskWorkProducts
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: File of consolidated notes, forms and documents for the work task ")
  
    public String getCustomerCampaignProcedureWorkTaskWorkProducts() {
    return customerCampaignProcedureWorkTaskWorkProducts;
  }

  public void setCustomerCampaignProcedureWorkTaskWorkProducts(String customerCampaignProcedureWorkTaskWorkProducts) {
    this.customerCampaignProcedureWorkTaskWorkProducts = customerCampaignProcedureWorkTaskWorkProducts;
  }

  public BQExecutionRequestInputModelExecutionInstanceRecord documentDirectoryEntryInstanceReference(String documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to associated documents 
   * @return documentDirectoryEntryInstanceReference
  **/
  @ApiModelProperty(example = "777789", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to associated documents ")
  
    public String getDocumentDirectoryEntryInstanceReference() {
    return documentDirectoryEntryInstanceReference;
  }

  public void setDocumentDirectoryEntryInstanceReference(String documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
  }

  public BQExecutionRequestInputModelExecutionInstanceRecord customerCampaignProcedureWorkTaskResult(String customerCampaignProcedureWorkTaskResult) {
    this.customerCampaignProcedureWorkTaskResult = customerCampaignProcedureWorkTaskResult;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the outcome or result of the work task - can be the identification of a lead/opportunity 
   * @return customerCampaignProcedureWorkTaskResult
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the outcome or result of the work task - can be the identification of a lead/opportunity ")
  
    public String getCustomerCampaignProcedureWorkTaskResult() {
    return customerCampaignProcedureWorkTaskResult;
  }

  public void setCustomerCampaignProcedureWorkTaskResult(String customerCampaignProcedureWorkTaskResult) {
    this.customerCampaignProcedureWorkTaskResult = customerCampaignProcedureWorkTaskResult;
  }

  public BQExecutionRequestInputModelExecutionInstanceRecord customerCampaignProcedureWorkTaskDateTime(String customerCampaignProcedureWorkTaskDateTime) {
    this.customerCampaignProcedureWorkTaskDateTime = customerCampaignProcedureWorkTaskDateTime;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date-time the customer campaign execution task is processed 
   * @return customerCampaignProcedureWorkTaskDateTime
  **/
  @ApiModelProperty(example = "09-22-2018", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date-time the customer campaign execution task is processed ")
  
    public String getCustomerCampaignProcedureWorkTaskDateTime() {
    return customerCampaignProcedureWorkTaskDateTime;
  }

  public void setCustomerCampaignProcedureWorkTaskDateTime(String customerCampaignProcedureWorkTaskDateTime) {
    this.customerCampaignProcedureWorkTaskDateTime = customerCampaignProcedureWorkTaskDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQExecutionRequestInputModelExecutionInstanceRecord bqExecutionRequestInputModelExecutionInstanceRecord = (BQExecutionRequestInputModelExecutionInstanceRecord) o;
    return Objects.equals(this.customerCampaignProcedureWorkTaskType, bqExecutionRequestInputModelExecutionInstanceRecord.customerCampaignProcedureWorkTaskType) &&
        Objects.equals(this.customerCampaignProcedureWorkTaskDescription, bqExecutionRequestInputModelExecutionInstanceRecord.customerCampaignProcedureWorkTaskDescription) &&
        Objects.equals(this.customerCampaignProcedureWorkTaskWorkProducts, bqExecutionRequestInputModelExecutionInstanceRecord.customerCampaignProcedureWorkTaskWorkProducts) &&
        Objects.equals(this.documentDirectoryEntryInstanceReference, bqExecutionRequestInputModelExecutionInstanceRecord.documentDirectoryEntryInstanceReference) &&
        Objects.equals(this.customerCampaignProcedureWorkTaskResult, bqExecutionRequestInputModelExecutionInstanceRecord.customerCampaignProcedureWorkTaskResult) &&
        Objects.equals(this.customerCampaignProcedureWorkTaskDateTime, bqExecutionRequestInputModelExecutionInstanceRecord.customerCampaignProcedureWorkTaskDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCampaignProcedureWorkTaskType, customerCampaignProcedureWorkTaskDescription, customerCampaignProcedureWorkTaskWorkProducts, documentDirectoryEntryInstanceReference, customerCampaignProcedureWorkTaskResult, customerCampaignProcedureWorkTaskDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQExecutionRequestInputModelExecutionInstanceRecord {\n");
    
    sb.append("    customerCampaignProcedureWorkTaskType: ").append(toIndentedString(customerCampaignProcedureWorkTaskType)).append("\n");
    sb.append("    customerCampaignProcedureWorkTaskDescription: ").append(toIndentedString(customerCampaignProcedureWorkTaskDescription)).append("\n");
    sb.append("    customerCampaignProcedureWorkTaskWorkProducts: ").append(toIndentedString(customerCampaignProcedureWorkTaskWorkProducts)).append("\n");
    sb.append("    documentDirectoryEntryInstanceReference: ").append(toIndentedString(documentDirectoryEntryInstanceReference)).append("\n");
    sb.append("    customerCampaignProcedureWorkTaskResult: ").append(toIndentedString(customerCampaignProcedureWorkTaskResult)).append("\n");
    sb.append("    customerCampaignProcedureWorkTaskDateTime: ").append(toIndentedString(customerCampaignProcedureWorkTaskDateTime)).append("\n");
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
