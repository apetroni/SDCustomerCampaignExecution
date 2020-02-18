package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BQCandidateSelectionRetrieveInputModelCandidateSelectionInstanceAnalysis1;
import io.swagger.model.BQCandidateSelectionRetrieveInputModelCandidateSelectionInstanceReport1;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQCandidateSelectionRetrieveInputModel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class BQCandidateSelectionRetrieveInputModel   {
  @JsonProperty("candidateSelectionRetrieveActionTaskRecord")
  private Object candidateSelectionRetrieveActionTaskRecord = null;

  @JsonProperty("candidateSelectionRetrieveActionRequest")
  private String candidateSelectionRetrieveActionRequest = null;

  @JsonProperty("candidateSelectionInstanceReport")
  private BQCandidateSelectionRetrieveInputModelCandidateSelectionInstanceReport1 candidateSelectionInstanceReport = null;

  @JsonProperty("candidateSelectionInstanceAnalysis")
  private BQCandidateSelectionRetrieveInputModelCandidateSelectionInstanceAnalysis1 candidateSelectionInstanceAnalysis = null;

  public BQCandidateSelectionRetrieveInputModel candidateSelectionRetrieveActionTaskRecord(Object candidateSelectionRetrieveActionTaskRecord) {
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

  public BQCandidateSelectionRetrieveInputModel candidateSelectionRetrieveActionRequest(String candidateSelectionRetrieveActionRequest) {
    this.candidateSelectionRetrieveActionRequest = candidateSelectionRetrieveActionRequest;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return candidateSelectionRetrieveActionRequest
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) ")
  
    public String getCandidateSelectionRetrieveActionRequest() {
    return candidateSelectionRetrieveActionRequest;
  }

  public void setCandidateSelectionRetrieveActionRequest(String candidateSelectionRetrieveActionRequest) {
    this.candidateSelectionRetrieveActionRequest = candidateSelectionRetrieveActionRequest;
  }

  public BQCandidateSelectionRetrieveInputModel candidateSelectionInstanceReport(BQCandidateSelectionRetrieveInputModelCandidateSelectionInstanceReport1 candidateSelectionInstanceReport) {
    this.candidateSelectionInstanceReport = candidateSelectionInstanceReport;
    return this;
  }

  /**
   * Get candidateSelectionInstanceReport
   * @return candidateSelectionInstanceReport
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BQCandidateSelectionRetrieveInputModelCandidateSelectionInstanceReport1 getCandidateSelectionInstanceReport() {
    return candidateSelectionInstanceReport;
  }

  public void setCandidateSelectionInstanceReport(BQCandidateSelectionRetrieveInputModelCandidateSelectionInstanceReport1 candidateSelectionInstanceReport) {
    this.candidateSelectionInstanceReport = candidateSelectionInstanceReport;
  }

  public BQCandidateSelectionRetrieveInputModel candidateSelectionInstanceAnalysis(BQCandidateSelectionRetrieveInputModelCandidateSelectionInstanceAnalysis1 candidateSelectionInstanceAnalysis) {
    this.candidateSelectionInstanceAnalysis = candidateSelectionInstanceAnalysis;
    return this;
  }

  /**
   * Get candidateSelectionInstanceAnalysis
   * @return candidateSelectionInstanceAnalysis
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BQCandidateSelectionRetrieveInputModelCandidateSelectionInstanceAnalysis1 getCandidateSelectionInstanceAnalysis() {
    return candidateSelectionInstanceAnalysis;
  }

  public void setCandidateSelectionInstanceAnalysis(BQCandidateSelectionRetrieveInputModelCandidateSelectionInstanceAnalysis1 candidateSelectionInstanceAnalysis) {
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
    BQCandidateSelectionRetrieveInputModel bqCandidateSelectionRetrieveInputModel = (BQCandidateSelectionRetrieveInputModel) o;
    return Objects.equals(this.candidateSelectionRetrieveActionTaskRecord, bqCandidateSelectionRetrieveInputModel.candidateSelectionRetrieveActionTaskRecord) &&
        Objects.equals(this.candidateSelectionRetrieveActionRequest, bqCandidateSelectionRetrieveInputModel.candidateSelectionRetrieveActionRequest) &&
        Objects.equals(this.candidateSelectionInstanceReport, bqCandidateSelectionRetrieveInputModel.candidateSelectionInstanceReport) &&
        Objects.equals(this.candidateSelectionInstanceAnalysis, bqCandidateSelectionRetrieveInputModel.candidateSelectionInstanceAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(candidateSelectionRetrieveActionTaskRecord, candidateSelectionRetrieveActionRequest, candidateSelectionInstanceReport, candidateSelectionInstanceAnalysis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQCandidateSelectionRetrieveInputModel {\n");
    
    sb.append("    candidateSelectionRetrieveActionTaskRecord: ").append(toIndentedString(candidateSelectionRetrieveActionTaskRecord)).append("\n");
    sb.append("    candidateSelectionRetrieveActionRequest: ").append(toIndentedString(candidateSelectionRetrieveActionRequest)).append("\n");
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
