package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceAnalysis1;
import io.swagger.model.BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceRecord1;
import io.swagger.model.BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceReport1;
import io.swagger.model.BQCandidateSelectionRetrieveOutputModelCustomerCampaignProcedureInstanceRecord1;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQCandidateSelectionRetrieveOutputModel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class BQCandidateSelectionRetrieveOutputModel   {
  @JsonProperty("customerCampaignProcedureInstanceRecord")
  private BQCandidateSelectionRetrieveOutputModelCustomerCampaignProcedureInstanceRecord1 customerCampaignProcedureInstanceRecord = null;

  @JsonProperty("candidateSelectionInstanceRecord")
  private BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceRecord1 candidateSelectionInstanceRecord = null;

  @JsonProperty("candidateSelectionRetrieveActionTaskReference")
  private String candidateSelectionRetrieveActionTaskReference = null;

  @JsonProperty("candidateSelectionRetrieveActionTaskRecord")
  private Object candidateSelectionRetrieveActionTaskRecord = null;

  @JsonProperty("candidateSelectionRetrieveActionResponse")
  private String candidateSelectionRetrieveActionResponse = null;

  @JsonProperty("candidateSelectionInstanceReport")
  private BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceReport1 candidateSelectionInstanceReport = null;

  @JsonProperty("candidateSelectionInstanceAnalysis")
  private BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceAnalysis1 candidateSelectionInstanceAnalysis = null;

  public BQCandidateSelectionRetrieveOutputModel customerCampaignProcedureInstanceRecord(BQCandidateSelectionRetrieveOutputModelCustomerCampaignProcedureInstanceRecord1 customerCampaignProcedureInstanceRecord) {
    this.customerCampaignProcedureInstanceRecord = customerCampaignProcedureInstanceRecord;
    return this;
  }

  /**
   * Get customerCampaignProcedureInstanceRecord
   * @return customerCampaignProcedureInstanceRecord
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BQCandidateSelectionRetrieveOutputModelCustomerCampaignProcedureInstanceRecord1 getCustomerCampaignProcedureInstanceRecord() {
    return customerCampaignProcedureInstanceRecord;
  }

  public void setCustomerCampaignProcedureInstanceRecord(BQCandidateSelectionRetrieveOutputModelCustomerCampaignProcedureInstanceRecord1 customerCampaignProcedureInstanceRecord) {
    this.customerCampaignProcedureInstanceRecord = customerCampaignProcedureInstanceRecord;
  }

  public BQCandidateSelectionRetrieveOutputModel candidateSelectionInstanceRecord(BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceRecord1 candidateSelectionInstanceRecord) {
    this.candidateSelectionInstanceRecord = candidateSelectionInstanceRecord;
    return this;
  }

  /**
   * Get candidateSelectionInstanceRecord
   * @return candidateSelectionInstanceRecord
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceRecord1 getCandidateSelectionInstanceRecord() {
    return candidateSelectionInstanceRecord;
  }

  public void setCandidateSelectionInstanceRecord(BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceRecord1 candidateSelectionInstanceRecord) {
    this.candidateSelectionInstanceRecord = candidateSelectionInstanceRecord;
  }

  public BQCandidateSelectionRetrieveOutputModel candidateSelectionRetrieveActionTaskReference(String candidateSelectionRetrieveActionTaskReference) {
    this.candidateSelectionRetrieveActionTaskReference = candidateSelectionRetrieveActionTaskReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Candidate Selection instance retrieve service call 
   * @return candidateSelectionRetrieveActionTaskReference
  **/
  @ApiModelProperty(example = "CSRATR714699", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Candidate Selection instance retrieve service call ")
  
    public String getCandidateSelectionRetrieveActionTaskReference() {
    return candidateSelectionRetrieveActionTaskReference;
  }

  public void setCandidateSelectionRetrieveActionTaskReference(String candidateSelectionRetrieveActionTaskReference) {
    this.candidateSelectionRetrieveActionTaskReference = candidateSelectionRetrieveActionTaskReference;
  }

  public BQCandidateSelectionRetrieveOutputModel candidateSelectionRetrieveActionTaskRecord(Object candidateSelectionRetrieveActionTaskRecord) {
    this.candidateSelectionRetrieveActionTaskRecord = candidateSelectionRetrieveActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return candidateSelectionRetrieveActionTaskRecord
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record ")
  
    public Object getCandidateSelectionRetrieveActionTaskRecord() {
    return candidateSelectionRetrieveActionTaskRecord;
  }

  public void setCandidateSelectionRetrieveActionTaskRecord(Object candidateSelectionRetrieveActionTaskRecord) {
    this.candidateSelectionRetrieveActionTaskRecord = candidateSelectionRetrieveActionTaskRecord;
  }

  public BQCandidateSelectionRetrieveOutputModel candidateSelectionRetrieveActionResponse(String candidateSelectionRetrieveActionResponse) {
    this.candidateSelectionRetrieveActionResponse = candidateSelectionRetrieveActionResponse;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return candidateSelectionRetrieveActionResponse
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) ")
  
    public String getCandidateSelectionRetrieveActionResponse() {
    return candidateSelectionRetrieveActionResponse;
  }

  public void setCandidateSelectionRetrieveActionResponse(String candidateSelectionRetrieveActionResponse) {
    this.candidateSelectionRetrieveActionResponse = candidateSelectionRetrieveActionResponse;
  }

  public BQCandidateSelectionRetrieveOutputModel candidateSelectionInstanceReport(BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceReport1 candidateSelectionInstanceReport) {
    this.candidateSelectionInstanceReport = candidateSelectionInstanceReport;
    return this;
  }

  /**
   * Get candidateSelectionInstanceReport
   * @return candidateSelectionInstanceReport
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceReport1 getCandidateSelectionInstanceReport() {
    return candidateSelectionInstanceReport;
  }

  public void setCandidateSelectionInstanceReport(BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceReport1 candidateSelectionInstanceReport) {
    this.candidateSelectionInstanceReport = candidateSelectionInstanceReport;
  }

  public BQCandidateSelectionRetrieveOutputModel candidateSelectionInstanceAnalysis(BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceAnalysis1 candidateSelectionInstanceAnalysis) {
    this.candidateSelectionInstanceAnalysis = candidateSelectionInstanceAnalysis;
    return this;
  }

  /**
   * Get candidateSelectionInstanceAnalysis
   * @return candidateSelectionInstanceAnalysis
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceAnalysis1 getCandidateSelectionInstanceAnalysis() {
    return candidateSelectionInstanceAnalysis;
  }

  public void setCandidateSelectionInstanceAnalysis(BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceAnalysis1 candidateSelectionInstanceAnalysis) {
    this.candidateSelectionInstanceAnalysis = candidateSelectionInstanceAnalysis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQCandidateSelectionRetrieveOutputModel bqCandidateSelectionRetrieveOutputModel = (BQCandidateSelectionRetrieveOutputModel) o;
    return Objects.equals(this.customerCampaignProcedureInstanceRecord, bqCandidateSelectionRetrieveOutputModel.customerCampaignProcedureInstanceRecord) &&
        Objects.equals(this.candidateSelectionInstanceRecord, bqCandidateSelectionRetrieveOutputModel.candidateSelectionInstanceRecord) &&
        Objects.equals(this.candidateSelectionRetrieveActionTaskReference, bqCandidateSelectionRetrieveOutputModel.candidateSelectionRetrieveActionTaskReference) &&
        Objects.equals(this.candidateSelectionRetrieveActionTaskRecord, bqCandidateSelectionRetrieveOutputModel.candidateSelectionRetrieveActionTaskRecord) &&
        Objects.equals(this.candidateSelectionRetrieveActionResponse, bqCandidateSelectionRetrieveOutputModel.candidateSelectionRetrieveActionResponse) &&
        Objects.equals(this.candidateSelectionInstanceReport, bqCandidateSelectionRetrieveOutputModel.candidateSelectionInstanceReport) &&
        Objects.equals(this.candidateSelectionInstanceAnalysis, bqCandidateSelectionRetrieveOutputModel.candidateSelectionInstanceAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCampaignProcedureInstanceRecord, candidateSelectionInstanceRecord, candidateSelectionRetrieveActionTaskReference, candidateSelectionRetrieveActionTaskRecord, candidateSelectionRetrieveActionResponse, candidateSelectionInstanceReport, candidateSelectionInstanceAnalysis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQCandidateSelectionRetrieveOutputModel {\n");
    
    sb.append("    customerCampaignProcedureInstanceRecord: ").append(toIndentedString(customerCampaignProcedureInstanceRecord)).append("\n");
    sb.append("    candidateSelectionInstanceRecord: ").append(toIndentedString(candidateSelectionInstanceRecord)).append("\n");
    sb.append("    candidateSelectionRetrieveActionTaskReference: ").append(toIndentedString(candidateSelectionRetrieveActionTaskReference)).append("\n");
    sb.append("    candidateSelectionRetrieveActionTaskRecord: ").append(toIndentedString(candidateSelectionRetrieveActionTaskRecord)).append("\n");
    sb.append("    candidateSelectionRetrieveActionResponse: ").append(toIndentedString(candidateSelectionRetrieveActionResponse)).append("\n");
    sb.append("    candidateSelectionInstanceReport: ").append(toIndentedString(candidateSelectionInstanceReport)).append("\n");
    sb.append("    candidateSelectionInstanceAnalysis: ").append(toIndentedString(candidateSelectionInstanceAnalysis)).append("\n");
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
