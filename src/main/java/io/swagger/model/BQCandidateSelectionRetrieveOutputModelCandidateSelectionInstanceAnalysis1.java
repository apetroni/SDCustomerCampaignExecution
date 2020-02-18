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
 * BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceAnalysis1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceAnalysis1   {
  @JsonProperty("candidateSelectionInstanceAnalysisRecord")
  private Object candidateSelectionInstanceAnalysisRecord = null;

  @JsonProperty("candidateSelectionInstanceAnalysisReportType")
  private String candidateSelectionInstanceAnalysisReportType = null;

  @JsonProperty("candidateSelectionInstanceAnalysisParameters")
  private String candidateSelectionInstanceAnalysisParameters = null;

  @JsonProperty("candidateSelectionInstanceAnalysisReport")
  private Object candidateSelectionInstanceAnalysisReport = null;

  public BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceAnalysis1 candidateSelectionInstanceAnalysisRecord(Object candidateSelectionInstanceAnalysisRecord) {
    this.candidateSelectionInstanceAnalysisRecord = candidateSelectionInstanceAnalysisRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return candidateSelectionInstanceAnalysisRecord
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected ")
  
    public Object getCandidateSelectionInstanceAnalysisRecord() {
    return candidateSelectionInstanceAnalysisRecord;
  }

  public void setCandidateSelectionInstanceAnalysisRecord(Object candidateSelectionInstanceAnalysisRecord) {
    this.candidateSelectionInstanceAnalysisRecord = candidateSelectionInstanceAnalysisRecord;
  }

  public BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceAnalysis1 candidateSelectionInstanceAnalysisReportType(String candidateSelectionInstanceAnalysisReportType) {
    this.candidateSelectionInstanceAnalysisReportType = candidateSelectionInstanceAnalysisReportType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return candidateSelectionInstanceAnalysisReportType
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available ")
  
    public String getCandidateSelectionInstanceAnalysisReportType() {
    return candidateSelectionInstanceAnalysisReportType;
  }

  public void setCandidateSelectionInstanceAnalysisReportType(String candidateSelectionInstanceAnalysisReportType) {
    this.candidateSelectionInstanceAnalysisReportType = candidateSelectionInstanceAnalysisReportType;
  }

  public BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceAnalysis1 candidateSelectionInstanceAnalysisParameters(String candidateSelectionInstanceAnalysisParameters) {
    this.candidateSelectionInstanceAnalysisParameters = candidateSelectionInstanceAnalysisParameters;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return candidateSelectionInstanceAnalysisParameters
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) ")
  
    public String getCandidateSelectionInstanceAnalysisParameters() {
    return candidateSelectionInstanceAnalysisParameters;
  }

  public void setCandidateSelectionInstanceAnalysisParameters(String candidateSelectionInstanceAnalysisParameters) {
    this.candidateSelectionInstanceAnalysisParameters = candidateSelectionInstanceAnalysisParameters;
  }

  public BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceAnalysis1 candidateSelectionInstanceAnalysisReport(Object candidateSelectionInstanceAnalysisReport) {
    this.candidateSelectionInstanceAnalysisReport = candidateSelectionInstanceAnalysisReport;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return candidateSelectionInstanceAnalysisReport
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate ")
  
    public Object getCandidateSelectionInstanceAnalysisReport() {
    return candidateSelectionInstanceAnalysisReport;
  }

  public void setCandidateSelectionInstanceAnalysisReport(Object candidateSelectionInstanceAnalysisReport) {
    this.candidateSelectionInstanceAnalysisReport = candidateSelectionInstanceAnalysisReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceAnalysis1 bqCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceAnalysis1 = (BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceAnalysis1) o;
    return Objects.equals(this.candidateSelectionInstanceAnalysisRecord, bqCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceAnalysis1.candidateSelectionInstanceAnalysisRecord) &&
        Objects.equals(this.candidateSelectionInstanceAnalysisReportType, bqCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceAnalysis1.candidateSelectionInstanceAnalysisReportType) &&
        Objects.equals(this.candidateSelectionInstanceAnalysisParameters, bqCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceAnalysis1.candidateSelectionInstanceAnalysisParameters) &&
        Objects.equals(this.candidateSelectionInstanceAnalysisReport, bqCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceAnalysis1.candidateSelectionInstanceAnalysisReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(candidateSelectionInstanceAnalysisRecord, candidateSelectionInstanceAnalysisReportType, candidateSelectionInstanceAnalysisParameters, candidateSelectionInstanceAnalysisReport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceAnalysis1 {\n");
    
    sb.append("    candidateSelectionInstanceAnalysisRecord: ").append(toIndentedString(candidateSelectionInstanceAnalysisRecord)).append("\n");
    sb.append("    candidateSelectionInstanceAnalysisReportType: ").append(toIndentedString(candidateSelectionInstanceAnalysisReportType)).append("\n");
    sb.append("    candidateSelectionInstanceAnalysisParameters: ").append(toIndentedString(candidateSelectionInstanceAnalysisParameters)).append("\n");
    sb.append("    candidateSelectionInstanceAnalysisReport: ").append(toIndentedString(candidateSelectionInstanceAnalysisReport)).append("\n");
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
