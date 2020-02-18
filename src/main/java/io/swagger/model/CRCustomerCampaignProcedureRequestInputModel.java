package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidrequisitionRequestRecordType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CRCustomerCampaignProcedureRequestInputModel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class CRCustomerCampaignProcedureRequestInputModel   {
  @JsonProperty("customerCampaignExecutionServicingSessionReference")
  private String customerCampaignExecutionServicingSessionReference = null;

  @JsonProperty("customerCampaignProcedureInstanceReference")
  private String customerCampaignProcedureInstanceReference = null;

  @JsonProperty("customerCampaignProcedureRequestActionTaskRecord")
  private Object customerCampaignProcedureRequestActionTaskRecord = null;

  @JsonProperty("requestRecordType")
  private CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidrequisitionRequestRecordType requestRecordType = null;

  public CRCustomerCampaignProcedureRequestInputModel customerCampaignExecutionServicingSessionReference(String customerCampaignExecutionServicingSessionReference) {
    this.customerCampaignExecutionServicingSessionReference = customerCampaignExecutionServicingSessionReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return customerCampaignExecutionServicingSessionReference
  **/
  @ApiModelProperty(example = "CCESSR796188", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session ")
  
    public String getCustomerCampaignExecutionServicingSessionReference() {
    return customerCampaignExecutionServicingSessionReference;
  }

  public void setCustomerCampaignExecutionServicingSessionReference(String customerCampaignExecutionServicingSessionReference) {
    this.customerCampaignExecutionServicingSessionReference = customerCampaignExecutionServicingSessionReference;
  }

  public CRCustomerCampaignProcedureRequestInputModel customerCampaignProcedureInstanceReference(String customerCampaignProcedureInstanceReference) {
    this.customerCampaignProcedureInstanceReference = customerCampaignProcedureInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Campaign Procedure instance 
   * @return customerCampaignProcedureInstanceReference
  **/
  @ApiModelProperty(example = "CCPIR771767", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Campaign Procedure instance ")
  
    public String getCustomerCampaignProcedureInstanceReference() {
    return customerCampaignProcedureInstanceReference;
  }

  public void setCustomerCampaignProcedureInstanceReference(String customerCampaignProcedureInstanceReference) {
    this.customerCampaignProcedureInstanceReference = customerCampaignProcedureInstanceReference;
  }

  public CRCustomerCampaignProcedureRequestInputModel customerCampaignProcedureRequestActionTaskRecord(Object customerCampaignProcedureRequestActionTaskRecord) {
    this.customerCampaignProcedureRequestActionTaskRecord = customerCampaignProcedureRequestActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return customerCampaignProcedureRequestActionTaskRecord
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record ")
  
    public Object getCustomerCampaignProcedureRequestActionTaskRecord() {
    return customerCampaignProcedureRequestActionTaskRecord;
  }

  public void setCustomerCampaignProcedureRequestActionTaskRecord(Object customerCampaignProcedureRequestActionTaskRecord) {
    this.customerCampaignProcedureRequestActionTaskRecord = customerCampaignProcedureRequestActionTaskRecord;
  }

  public CRCustomerCampaignProcedureRequestInputModel requestRecordType(CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidrequisitionRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
    return this;
  }

  /**
   * Get requestRecordType
   * @return requestRecordType
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidrequisitionRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidrequisitionRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CRCustomerCampaignProcedureRequestInputModel crCustomerCampaignProcedureRequestInputModel = (CRCustomerCampaignProcedureRequestInputModel) o;
    return Objects.equals(this.customerCampaignExecutionServicingSessionReference, crCustomerCampaignProcedureRequestInputModel.customerCampaignExecutionServicingSessionReference) &&
        Objects.equals(this.customerCampaignProcedureInstanceReference, crCustomerCampaignProcedureRequestInputModel.customerCampaignProcedureInstanceReference) &&
        Objects.equals(this.customerCampaignProcedureRequestActionTaskRecord, crCustomerCampaignProcedureRequestInputModel.customerCampaignProcedureRequestActionTaskRecord) &&
        Objects.equals(this.requestRecordType, crCustomerCampaignProcedureRequestInputModel.requestRecordType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCampaignExecutionServicingSessionReference, customerCampaignProcedureInstanceReference, customerCampaignProcedureRequestActionTaskRecord, requestRecordType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CRCustomerCampaignProcedureRequestInputModel {\n");
    
    sb.append("    customerCampaignExecutionServicingSessionReference: ").append(toIndentedString(customerCampaignExecutionServicingSessionReference)).append("\n");
    sb.append("    customerCampaignProcedureInstanceReference: ").append(toIndentedString(customerCampaignProcedureInstanceReference)).append("\n");
    sb.append("    customerCampaignProcedureRequestActionTaskRecord: ").append(toIndentedString(customerCampaignProcedureRequestActionTaskRecord)).append("\n");
    sb.append("    requestRecordType: ").append(toIndentedString(requestRecordType)).append("\n");
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
