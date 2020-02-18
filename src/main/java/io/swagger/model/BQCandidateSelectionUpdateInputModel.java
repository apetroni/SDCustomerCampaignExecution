package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidcandidateselectionbqreferenceidupdateCandidateSelectionInstanceRecord;
import io.swagger.model.CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidcandidateselectionbqreferenceidupdateCustomerCampaignProcedureInstanceRecord;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQCandidateSelectionUpdateInputModel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class BQCandidateSelectionUpdateInputModel   {
  @JsonProperty("customerCampaignProcedureInstanceRecord")
  private CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidcandidateselectionbqreferenceidupdateCustomerCampaignProcedureInstanceRecord customerCampaignProcedureInstanceRecord = null;

  @JsonProperty("customerCampaignProcedureInstanceReference")
  private String customerCampaignProcedureInstanceReference = null;

  @JsonProperty("candidateSelectionInstanceReference")
  private String candidateSelectionInstanceReference = null;

  @JsonProperty("candidateSelectionInstanceRecord")
  private CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidcandidateselectionbqreferenceidupdateCandidateSelectionInstanceRecord candidateSelectionInstanceRecord = null;

  @JsonProperty("candidateSelectionUpdateActionTaskRecord")
  private Object candidateSelectionUpdateActionTaskRecord = null;

  @JsonProperty("candidateSelectionUpdateActionRequest")
  private String candidateSelectionUpdateActionRequest = null;

  public BQCandidateSelectionUpdateInputModel customerCampaignProcedureInstanceRecord(CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidcandidateselectionbqreferenceidupdateCustomerCampaignProcedureInstanceRecord customerCampaignProcedureInstanceRecord) {
    this.customerCampaignProcedureInstanceRecord = customerCampaignProcedureInstanceRecord;
    return this;
  }

  /**
   * Get customerCampaignProcedureInstanceRecord
   * @return customerCampaignProcedureInstanceRecord
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidcandidateselectionbqreferenceidupdateCustomerCampaignProcedureInstanceRecord getCustomerCampaignProcedureInstanceRecord() {
    return customerCampaignProcedureInstanceRecord;
  }

  public void setCustomerCampaignProcedureInstanceRecord(CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidcandidateselectionbqreferenceidupdateCustomerCampaignProcedureInstanceRecord customerCampaignProcedureInstanceRecord) {
    this.customerCampaignProcedureInstanceRecord = customerCampaignProcedureInstanceRecord;
  }

  public BQCandidateSelectionUpdateInputModel customerCampaignProcedureInstanceReference(String customerCampaignProcedureInstanceReference) {
    this.customerCampaignProcedureInstanceReference = customerCampaignProcedureInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Campaign Procedure instance 
   * @return customerCampaignProcedureInstanceReference
  **/
  @ApiModelProperty(example = "CCPIR759372", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Campaign Procedure instance ")
  
    public String getCustomerCampaignProcedureInstanceReference() {
    return customerCampaignProcedureInstanceReference;
  }

  public void setCustomerCampaignProcedureInstanceReference(String customerCampaignProcedureInstanceReference) {
    this.customerCampaignProcedureInstanceReference = customerCampaignProcedureInstanceReference;
  }

  public BQCandidateSelectionUpdateInputModel candidateSelectionInstanceReference(String candidateSelectionInstanceReference) {
    this.candidateSelectionInstanceReference = candidateSelectionInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Candidate Selection instance 
   * @return candidateSelectionInstanceReference
  **/
  @ApiModelProperty(example = "CSIR709210", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Candidate Selection instance ")
  
    public String getCandidateSelectionInstanceReference() {
    return candidateSelectionInstanceReference;
  }

  public void setCandidateSelectionInstanceReference(String candidateSelectionInstanceReference) {
    this.candidateSelectionInstanceReference = candidateSelectionInstanceReference;
  }

  public BQCandidateSelectionUpdateInputModel candidateSelectionInstanceRecord(CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidcandidateselectionbqreferenceidupdateCandidateSelectionInstanceRecord candidateSelectionInstanceRecord) {
    this.candidateSelectionInstanceRecord = candidateSelectionInstanceRecord;
    return this;
  }

  /**
   * Get candidateSelectionInstanceRecord
   * @return candidateSelectionInstanceRecord
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidcandidateselectionbqreferenceidupdateCandidateSelectionInstanceRecord getCandidateSelectionInstanceRecord() {
    return candidateSelectionInstanceRecord;
  }

  public void setCandidateSelectionInstanceRecord(CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidcandidateselectionbqreferenceidupdateCandidateSelectionInstanceRecord candidateSelectionInstanceRecord) {
    this.candidateSelectionInstanceRecord = candidateSelectionInstanceRecord;
  }

  public BQCandidateSelectionUpdateInputModel candidateSelectionUpdateActionTaskRecord(Object candidateSelectionUpdateActionTaskRecord) {
    this.candidateSelectionUpdateActionTaskRecord = candidateSelectionUpdateActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return candidateSelectionUpdateActionTaskRecord
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record ")
  
    public Object getCandidateSelectionUpdateActionTaskRecord() {
    return candidateSelectionUpdateActionTaskRecord;
  }

  public void setCandidateSelectionUpdateActionTaskRecord(Object candidateSelectionUpdateActionTaskRecord) {
    this.candidateSelectionUpdateActionTaskRecord = candidateSelectionUpdateActionTaskRecord;
  }

  public BQCandidateSelectionUpdateInputModel candidateSelectionUpdateActionRequest(String candidateSelectionUpdateActionRequest) {
    this.candidateSelectionUpdateActionRequest = candidateSelectionUpdateActionRequest;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return candidateSelectionUpdateActionRequest
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request ")
  
    public String getCandidateSelectionUpdateActionRequest() {
    return candidateSelectionUpdateActionRequest;
  }

  public void setCandidateSelectionUpdateActionRequest(String candidateSelectionUpdateActionRequest) {
    this.candidateSelectionUpdateActionRequest = candidateSelectionUpdateActionRequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQCandidateSelectionUpdateInputModel bqCandidateSelectionUpdateInputModel = (BQCandidateSelectionUpdateInputModel) o;
    return Objects.equals(this.customerCampaignProcedureInstanceRecord, bqCandidateSelectionUpdateInputModel.customerCampaignProcedureInstanceRecord) &&
        Objects.equals(this.customerCampaignProcedureInstanceReference, bqCandidateSelectionUpdateInputModel.customerCampaignProcedureInstanceReference) &&
        Objects.equals(this.candidateSelectionInstanceReference, bqCandidateSelectionUpdateInputModel.candidateSelectionInstanceReference) &&
        Objects.equals(this.candidateSelectionInstanceRecord, bqCandidateSelectionUpdateInputModel.candidateSelectionInstanceRecord) &&
        Objects.equals(this.candidateSelectionUpdateActionTaskRecord, bqCandidateSelectionUpdateInputModel.candidateSelectionUpdateActionTaskRecord) &&
        Objects.equals(this.candidateSelectionUpdateActionRequest, bqCandidateSelectionUpdateInputModel.candidateSelectionUpdateActionRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCampaignProcedureInstanceRecord, customerCampaignProcedureInstanceReference, candidateSelectionInstanceReference, candidateSelectionInstanceRecord, candidateSelectionUpdateActionTaskRecord, candidateSelectionUpdateActionRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQCandidateSelectionUpdateInputModel {\n");
    
    sb.append("    customerCampaignProcedureInstanceRecord: ").append(toIndentedString(customerCampaignProcedureInstanceRecord)).append("\n");
    sb.append("    customerCampaignProcedureInstanceReference: ").append(toIndentedString(customerCampaignProcedureInstanceReference)).append("\n");
    sb.append("    candidateSelectionInstanceReference: ").append(toIndentedString(candidateSelectionInstanceReference)).append("\n");
    sb.append("    candidateSelectionInstanceRecord: ").append(toIndentedString(candidateSelectionInstanceRecord)).append("\n");
    sb.append("    candidateSelectionUpdateActionTaskRecord: ").append(toIndentedString(candidateSelectionUpdateActionTaskRecord)).append("\n");
    sb.append("    candidateSelectionUpdateActionRequest: ").append(toIndentedString(candidateSelectionUpdateActionRequest)).append("\n");
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
