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
 * Body9
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class Body9   {
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

  public Body9 customerCampaignProcedureInstanceRecord(CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidcandidateselectionbqreferenceidupdateCustomerCampaignProcedureInstanceRecord customerCampaignProcedureInstanceRecord) {
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

  public Body9 customerCampaignProcedureInstanceReference(String customerCampaignProcedureInstanceReference) {
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

  public Body9 candidateSelectionInstanceReference(String candidateSelectionInstanceReference) {
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

  public Body9 candidateSelectionInstanceRecord(CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidcandidateselectionbqreferenceidupdateCandidateSelectionInstanceRecord candidateSelectionInstanceRecord) {
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

  public Body9 candidateSelectionUpdateActionTaskRecord(Object candidateSelectionUpdateActionTaskRecord) {
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

  public Body9 candidateSelectionUpdateActionRequest(String candidateSelectionUpdateActionRequest) {
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
    Body9 body9 = (Body9) o;
    return Objects.equals(this.customerCampaignProcedureInstanceRecord, body9.customerCampaignProcedureInstanceRecord) &&
        Objects.equals(this.customerCampaignProcedureInstanceReference, body9.customerCampaignProcedureInstanceReference) &&
        Objects.equals(this.candidateSelectionInstanceReference, body9.candidateSelectionInstanceReference) &&
        Objects.equals(this.candidateSelectionInstanceRecord, body9.candidateSelectionInstanceRecord) &&
        Objects.equals(this.candidateSelectionUpdateActionTaskRecord, body9.candidateSelectionUpdateActionTaskRecord) &&
        Objects.equals(this.candidateSelectionUpdateActionRequest, body9.candidateSelectionUpdateActionRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCampaignProcedureInstanceRecord, customerCampaignProcedureInstanceReference, candidateSelectionInstanceReference, candidateSelectionInstanceRecord, candidateSelectionUpdateActionTaskRecord, candidateSelectionUpdateActionRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body9 {\n");
    
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
