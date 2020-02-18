package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexchangeCustomerCampaignProcedureExchangeActionRequest;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQCandidateSelectionExchangeInputModel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class BQCandidateSelectionExchangeInputModel   {
  @JsonProperty("customerCampaignProcedureInstanceReference")
  private String customerCampaignProcedureInstanceReference = null;

  @JsonProperty("candidateSelectionInstanceReference")
  private String candidateSelectionInstanceReference = null;

  @JsonProperty("candidateSelectionExchangeActionTaskRecord")
  private Object candidateSelectionExchangeActionTaskRecord = null;

  @JsonProperty("candidateSelectionExchangeActionRequest")
  private CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexchangeCustomerCampaignProcedureExchangeActionRequest candidateSelectionExchangeActionRequest = null;

  public BQCandidateSelectionExchangeInputModel customerCampaignProcedureInstanceReference(String customerCampaignProcedureInstanceReference) {
    this.customerCampaignProcedureInstanceReference = customerCampaignProcedureInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Campaign Procedure instance 
   * @return customerCampaignProcedureInstanceReference
  **/
  @ApiModelProperty(example = "CCPIR726846", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Campaign Procedure instance ")
  
    public String getCustomerCampaignProcedureInstanceReference() {
    return customerCampaignProcedureInstanceReference;
  }

  public void setCustomerCampaignProcedureInstanceReference(String customerCampaignProcedureInstanceReference) {
    this.customerCampaignProcedureInstanceReference = customerCampaignProcedureInstanceReference;
  }

  public BQCandidateSelectionExchangeInputModel candidateSelectionInstanceReference(String candidateSelectionInstanceReference) {
    this.candidateSelectionInstanceReference = candidateSelectionInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Candidate Selection instance 
   * @return candidateSelectionInstanceReference
  **/
  @ApiModelProperty(example = "CSIR780329", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Candidate Selection instance ")
  
    public String getCandidateSelectionInstanceReference() {
    return candidateSelectionInstanceReference;
  }

  public void setCandidateSelectionInstanceReference(String candidateSelectionInstanceReference) {
    this.candidateSelectionInstanceReference = candidateSelectionInstanceReference;
  }

  public BQCandidateSelectionExchangeInputModel candidateSelectionExchangeActionTaskRecord(Object candidateSelectionExchangeActionTaskRecord) {
    this.candidateSelectionExchangeActionTaskRecord = candidateSelectionExchangeActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return candidateSelectionExchangeActionTaskRecord
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record ")
  
    public Object getCandidateSelectionExchangeActionTaskRecord() {
    return candidateSelectionExchangeActionTaskRecord;
  }

  public void setCandidateSelectionExchangeActionTaskRecord(Object candidateSelectionExchangeActionTaskRecord) {
    this.candidateSelectionExchangeActionTaskRecord = candidateSelectionExchangeActionTaskRecord;
  }

  public BQCandidateSelectionExchangeInputModel candidateSelectionExchangeActionRequest(CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexchangeCustomerCampaignProcedureExchangeActionRequest candidateSelectionExchangeActionRequest) {
    this.candidateSelectionExchangeActionRequest = candidateSelectionExchangeActionRequest;
    return this;
  }

  /**
   * Get candidateSelectionExchangeActionRequest
   * @return candidateSelectionExchangeActionRequest
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexchangeCustomerCampaignProcedureExchangeActionRequest getCandidateSelectionExchangeActionRequest() {
    return candidateSelectionExchangeActionRequest;
  }

  public void setCandidateSelectionExchangeActionRequest(CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexchangeCustomerCampaignProcedureExchangeActionRequest candidateSelectionExchangeActionRequest) {
    this.candidateSelectionExchangeActionRequest = candidateSelectionExchangeActionRequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQCandidateSelectionExchangeInputModel bqCandidateSelectionExchangeInputModel = (BQCandidateSelectionExchangeInputModel) o;
    return Objects.equals(this.customerCampaignProcedureInstanceReference, bqCandidateSelectionExchangeInputModel.customerCampaignProcedureInstanceReference) &&
        Objects.equals(this.candidateSelectionInstanceReference, bqCandidateSelectionExchangeInputModel.candidateSelectionInstanceReference) &&
        Objects.equals(this.candidateSelectionExchangeActionTaskRecord, bqCandidateSelectionExchangeInputModel.candidateSelectionExchangeActionTaskRecord) &&
        Objects.equals(this.candidateSelectionExchangeActionRequest, bqCandidateSelectionExchangeInputModel.candidateSelectionExchangeActionRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCampaignProcedureInstanceReference, candidateSelectionInstanceReference, candidateSelectionExchangeActionTaskRecord, candidateSelectionExchangeActionRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQCandidateSelectionExchangeInputModel {\n");
    
    sb.append("    customerCampaignProcedureInstanceReference: ").append(toIndentedString(customerCampaignProcedureInstanceReference)).append("\n");
    sb.append("    candidateSelectionInstanceReference: ").append(toIndentedString(candidateSelectionInstanceReference)).append("\n");
    sb.append("    candidateSelectionExchangeActionTaskRecord: ").append(toIndentedString(candidateSelectionExchangeActionTaskRecord)).append("\n");
    sb.append("    candidateSelectionExchangeActionRequest: ").append(toIndentedString(candidateSelectionExchangeActionRequest)).append("\n");
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
