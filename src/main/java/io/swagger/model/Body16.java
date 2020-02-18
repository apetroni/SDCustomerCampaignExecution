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
 * Body16
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class Body16   {
  @JsonProperty("customerCampaignProcedureInstanceReference")
  private String customerCampaignProcedureInstanceReference = null;

  @JsonProperty("analysisInstanceReference")
  private String analysisInstanceReference = null;

  @JsonProperty("analysisRequestActionTaskRecord")
  private Object analysisRequestActionTaskRecord = null;

  @JsonProperty("requestRecordType")
  private CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidrequisitionRequestRecordType requestRecordType = null;

  public Body16 customerCampaignProcedureInstanceReference(String customerCampaignProcedureInstanceReference) {
    this.customerCampaignProcedureInstanceReference = customerCampaignProcedureInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Campaign Procedure instance 
   * @return customerCampaignProcedureInstanceReference
  **/
  @ApiModelProperty(example = "CCPIR771679", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Campaign Procedure instance ")
  
    public String getCustomerCampaignProcedureInstanceReference() {
    return customerCampaignProcedureInstanceReference;
  }

  public void setCustomerCampaignProcedureInstanceReference(String customerCampaignProcedureInstanceReference) {
    this.customerCampaignProcedureInstanceReference = customerCampaignProcedureInstanceReference;
  }

  public Body16 analysisInstanceReference(String analysisInstanceReference) {
    this.analysisInstanceReference = analysisInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Analysis instance 
   * @return analysisInstanceReference
  **/
  @ApiModelProperty(example = "AIR791093", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Analysis instance ")
  
    public String getAnalysisInstanceReference() {
    return analysisInstanceReference;
  }

  public void setAnalysisInstanceReference(String analysisInstanceReference) {
    this.analysisInstanceReference = analysisInstanceReference;
  }

  public Body16 analysisRequestActionTaskRecord(Object analysisRequestActionTaskRecord) {
    this.analysisRequestActionTaskRecord = analysisRequestActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return analysisRequestActionTaskRecord
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record ")
  
    public Object getAnalysisRequestActionTaskRecord() {
    return analysisRequestActionTaskRecord;
  }

  public void setAnalysisRequestActionTaskRecord(Object analysisRequestActionTaskRecord) {
    this.analysisRequestActionTaskRecord = analysisRequestActionTaskRecord;
  }

  public Body16 requestRecordType(CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidrequisitionRequestRecordType requestRecordType) {
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
    Body16 body16 = (Body16) o;
    return Objects.equals(this.customerCampaignProcedureInstanceReference, body16.customerCampaignProcedureInstanceReference) &&
        Objects.equals(this.analysisInstanceReference, body16.analysisInstanceReference) &&
        Objects.equals(this.analysisRequestActionTaskRecord, body16.analysisRequestActionTaskRecord) &&
        Objects.equals(this.requestRecordType, body16.requestRecordType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCampaignProcedureInstanceReference, analysisInstanceReference, analysisRequestActionTaskRecord, requestRecordType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body16 {\n");
    
    sb.append("    customerCampaignProcedureInstanceReference: ").append(toIndentedString(customerCampaignProcedureInstanceReference)).append("\n");
    sb.append("    analysisInstanceReference: ").append(toIndentedString(analysisInstanceReference)).append("\n");
    sb.append("    analysisRequestActionTaskRecord: ").append(toIndentedString(analysisRequestActionTaskRecord)).append("\n");
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
