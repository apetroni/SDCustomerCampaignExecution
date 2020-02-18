package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidanalysisbqreferenceidupdateCustomerCampaignProcedureInstanceRecord;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQAnalysisUpdateInputModel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class BQAnalysisUpdateInputModel   {
  @JsonProperty("customerCampaignProcedureInstanceRecord")
  private CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidanalysisbqreferenceidupdateCustomerCampaignProcedureInstanceRecord customerCampaignProcedureInstanceRecord = null;

  @JsonProperty("customerCampaignProcedureInstanceReference")
  private String customerCampaignProcedureInstanceReference = null;

  @JsonProperty("analysisInstanceReference")
  private String analysisInstanceReference = null;

  @JsonProperty("analysisUpdateActionTaskRecord")
  private Object analysisUpdateActionTaskRecord = null;

  @JsonProperty("analysisUpdateActionRequest")
  private String analysisUpdateActionRequest = null;

  public BQAnalysisUpdateInputModel customerCampaignProcedureInstanceRecord(CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidanalysisbqreferenceidupdateCustomerCampaignProcedureInstanceRecord customerCampaignProcedureInstanceRecord) {
    this.customerCampaignProcedureInstanceRecord = customerCampaignProcedureInstanceRecord;
    return this;
  }

  /**
   * Get customerCampaignProcedureInstanceRecord
   * @return customerCampaignProcedureInstanceRecord
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidanalysisbqreferenceidupdateCustomerCampaignProcedureInstanceRecord getCustomerCampaignProcedureInstanceRecord() {
    return customerCampaignProcedureInstanceRecord;
  }

  public void setCustomerCampaignProcedureInstanceRecord(CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidanalysisbqreferenceidupdateCustomerCampaignProcedureInstanceRecord customerCampaignProcedureInstanceRecord) {
    this.customerCampaignProcedureInstanceRecord = customerCampaignProcedureInstanceRecord;
  }

  public BQAnalysisUpdateInputModel customerCampaignProcedureInstanceReference(String customerCampaignProcedureInstanceReference) {
    this.customerCampaignProcedureInstanceReference = customerCampaignProcedureInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Campaign Procedure instance 
   * @return customerCampaignProcedureInstanceReference
  **/
  @ApiModelProperty(example = "CCPIR752155", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Campaign Procedure instance ")
  
    public String getCustomerCampaignProcedureInstanceReference() {
    return customerCampaignProcedureInstanceReference;
  }

  public void setCustomerCampaignProcedureInstanceReference(String customerCampaignProcedureInstanceReference) {
    this.customerCampaignProcedureInstanceReference = customerCampaignProcedureInstanceReference;
  }

  public BQAnalysisUpdateInputModel analysisInstanceReference(String analysisInstanceReference) {
    this.analysisInstanceReference = analysisInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Analysis instance 
   * @return analysisInstanceReference
  **/
  @ApiModelProperty(example = "AIR796163", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Analysis instance ")
  
    public String getAnalysisInstanceReference() {
    return analysisInstanceReference;
  }

  public void setAnalysisInstanceReference(String analysisInstanceReference) {
    this.analysisInstanceReference = analysisInstanceReference;
  }

  public BQAnalysisUpdateInputModel analysisUpdateActionTaskRecord(Object analysisUpdateActionTaskRecord) {
    this.analysisUpdateActionTaskRecord = analysisUpdateActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return analysisUpdateActionTaskRecord
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record ")
  
    public Object getAnalysisUpdateActionTaskRecord() {
    return analysisUpdateActionTaskRecord;
  }

  public void setAnalysisUpdateActionTaskRecord(Object analysisUpdateActionTaskRecord) {
    this.analysisUpdateActionTaskRecord = analysisUpdateActionTaskRecord;
  }

  public BQAnalysisUpdateInputModel analysisUpdateActionRequest(String analysisUpdateActionRequest) {
    this.analysisUpdateActionRequest = analysisUpdateActionRequest;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return analysisUpdateActionRequest
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request ")
  
    public String getAnalysisUpdateActionRequest() {
    return analysisUpdateActionRequest;
  }

  public void setAnalysisUpdateActionRequest(String analysisUpdateActionRequest) {
    this.analysisUpdateActionRequest = analysisUpdateActionRequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQAnalysisUpdateInputModel bqAnalysisUpdateInputModel = (BQAnalysisUpdateInputModel) o;
    return Objects.equals(this.customerCampaignProcedureInstanceRecord, bqAnalysisUpdateInputModel.customerCampaignProcedureInstanceRecord) &&
        Objects.equals(this.customerCampaignProcedureInstanceReference, bqAnalysisUpdateInputModel.customerCampaignProcedureInstanceReference) &&
        Objects.equals(this.analysisInstanceReference, bqAnalysisUpdateInputModel.analysisInstanceReference) &&
        Objects.equals(this.analysisUpdateActionTaskRecord, bqAnalysisUpdateInputModel.analysisUpdateActionTaskRecord) &&
        Objects.equals(this.analysisUpdateActionRequest, bqAnalysisUpdateInputModel.analysisUpdateActionRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCampaignProcedureInstanceRecord, customerCampaignProcedureInstanceReference, analysisInstanceReference, analysisUpdateActionTaskRecord, analysisUpdateActionRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQAnalysisUpdateInputModel {\n");
    
    sb.append("    customerCampaignProcedureInstanceRecord: ").append(toIndentedString(customerCampaignProcedureInstanceRecord)).append("\n");
    sb.append("    customerCampaignProcedureInstanceReference: ").append(toIndentedString(customerCampaignProcedureInstanceReference)).append("\n");
    sb.append("    analysisInstanceReference: ").append(toIndentedString(analysisInstanceReference)).append("\n");
    sb.append("    analysisUpdateActionTaskRecord: ").append(toIndentedString(analysisUpdateActionTaskRecord)).append("\n");
    sb.append("    analysisUpdateActionRequest: ").append(toIndentedString(analysisUpdateActionRequest)).append("\n");
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
