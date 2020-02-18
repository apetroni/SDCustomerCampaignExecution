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
 * BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceReport1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceReport1   {
  @JsonProperty("candidateSelectionInstanceReportRecord")
  private Object candidateSelectionInstanceReportRecord = null;

  @JsonProperty("candidateSelectionInstanceReportType")
  private String candidateSelectionInstanceReportType = null;

  @JsonProperty("candidateSelectionInstanceReportParameters")
  private String candidateSelectionInstanceReportParameters = null;

  @JsonProperty("candidateSelectionInstanceReport")
  private Object candidateSelectionInstanceReport = null;

  public BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceReport1 candidateSelectionInstanceReportRecord(Object candidateSelectionInstanceReportRecord) {
    this.candidateSelectionInstanceReportRecord = candidateSelectionInstanceReportRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return candidateSelectionInstanceReportRecord
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected ")
  
    public Object getCandidateSelectionInstanceReportRecord() {
    return candidateSelectionInstanceReportRecord;
  }

  public void setCandidateSelectionInstanceReportRecord(Object candidateSelectionInstanceReportRecord) {
    this.candidateSelectionInstanceReportRecord = candidateSelectionInstanceReportRecord;
  }

  public BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceReport1 candidateSelectionInstanceReportType(String candidateSelectionInstanceReportType) {
    this.candidateSelectionInstanceReportType = candidateSelectionInstanceReportType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return candidateSelectionInstanceReportType
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available ")
  
    public String getCandidateSelectionInstanceReportType() {
    return candidateSelectionInstanceReportType;
  }

  public void setCandidateSelectionInstanceReportType(String candidateSelectionInstanceReportType) {
    this.candidateSelectionInstanceReportType = candidateSelectionInstanceReportType;
  }

  public BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceReport1 candidateSelectionInstanceReportParameters(String candidateSelectionInstanceReportParameters) {
    this.candidateSelectionInstanceReportParameters = candidateSelectionInstanceReportParameters;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return candidateSelectionInstanceReportParameters
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) ")
  
    public String getCandidateSelectionInstanceReportParameters() {
    return candidateSelectionInstanceReportParameters;
  }

  public void setCandidateSelectionInstanceReportParameters(String candidateSelectionInstanceReportParameters) {
    this.candidateSelectionInstanceReportParameters = candidateSelectionInstanceReportParameters;
  }

  public BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceReport1 candidateSelectionInstanceReport(Object candidateSelectionInstanceReport) {
    this.candidateSelectionInstanceReport = candidateSelectionInstanceReport;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return candidateSelectionInstanceReport
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate ")
  
    public Object getCandidateSelectionInstanceReport() {
    return candidateSelectionInstanceReport;
  }

  public void setCandidateSelectionInstanceReport(Object candidateSelectionInstanceReport) {
    this.candidateSelectionInstanceReport = candidateSelectionInstanceReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceReport1 bqCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceReport1 = (BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceReport1) o;
    return Objects.equals(this.candidateSelectionInstanceReportRecord, bqCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceReport1.candidateSelectionInstanceReportRecord) &&
        Objects.equals(this.candidateSelectionInstanceReportType, bqCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceReport1.candidateSelectionInstanceReportType) &&
        Objects.equals(this.candidateSelectionInstanceReportParameters, bqCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceReport1.candidateSelectionInstanceReportParameters) &&
        Objects.equals(this.candidateSelectionInstanceReport, bqCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceReport1.candidateSelectionInstanceReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(candidateSelectionInstanceReportRecord, candidateSelectionInstanceReportType, candidateSelectionInstanceReportParameters, candidateSelectionInstanceReport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceReport1 {\n");
    
    sb.append("    candidateSelectionInstanceReportRecord: ").append(toIndentedString(candidateSelectionInstanceReportRecord)).append("\n");
    sb.append("    candidateSelectionInstanceReportType: ").append(toIndentedString(candidateSelectionInstanceReportType)).append("\n");
    sb.append("    candidateSelectionInstanceReportParameters: ").append(toIndentedString(candidateSelectionInstanceReportParameters)).append("\n");
    sb.append("    candidateSelectionInstanceReport: ").append(toIndentedString(candidateSelectionInstanceReport)).append("\n");
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
