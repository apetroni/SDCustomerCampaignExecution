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
 * CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutioninitiationExecutionInstanceRecord
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutioninitiationExecutionInstanceRecord   {
  @JsonProperty("customerCampaignProcedureWorkTaskType")
  private String customerCampaignProcedureWorkTaskType = null;

  @JsonProperty("documentDirectoryEntryInstanceReference")
  private String documentDirectoryEntryInstanceReference = null;

  public CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutioninitiationExecutionInstanceRecord customerCampaignProcedureWorkTaskType(String customerCampaignProcedureWorkTaskType) {
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

  public CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutioninitiationExecutionInstanceRecord documentDirectoryEntryInstanceReference(String documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to associated documents 
   * @return documentDirectoryEntryInstanceReference
  **/
  @ApiModelProperty(example = "700980", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to associated documents ")
  
    public String getDocumentDirectoryEntryInstanceReference() {
    return documentDirectoryEntryInstanceReference;
  }

  public void setDocumentDirectoryEntryInstanceReference(String documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutioninitiationExecutionInstanceRecord customercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutioninitiationExecutionInstanceRecord = (CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutioninitiationExecutionInstanceRecord) o;
    return Objects.equals(this.customerCampaignProcedureWorkTaskType, customercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutioninitiationExecutionInstanceRecord.customerCampaignProcedureWorkTaskType) &&
        Objects.equals(this.documentDirectoryEntryInstanceReference, customercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutioninitiationExecutionInstanceRecord.documentDirectoryEntryInstanceReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCampaignProcedureWorkTaskType, documentDirectoryEntryInstanceReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexecutioninitiationExecutionInstanceRecord {\n");
    
    sb.append("    customerCampaignProcedureWorkTaskType: ").append(toIndentedString(customerCampaignProcedureWorkTaskType)).append("\n");
    sb.append("    documentDirectoryEntryInstanceReference: ").append(toIndentedString(documentDirectoryEntryInstanceReference)).append("\n");
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
