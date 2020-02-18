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
 * BQExecutionRetrieveOutputModelExecutionInstanceAnalysis
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class BQExecutionRetrieveOutputModelExecutionInstanceAnalysis   {
  @JsonProperty("executionInstanceAnalysisRecord")
  private Object executionInstanceAnalysisRecord = null;

  @JsonProperty("executionInstanceAnalysisReportType")
  private String executionInstanceAnalysisReportType = null;

  @JsonProperty("executionInstanceAnalysisParameters")
  private String executionInstanceAnalysisParameters = null;

  @JsonProperty("executionInstanceAnalysisReport")
  private Object executionInstanceAnalysisReport = null;

  public BQExecutionRetrieveOutputModelExecutionInstanceAnalysis executionInstanceAnalysisRecord(Object executionInstanceAnalysisRecord) {
    this.executionInstanceAnalysisRecord = executionInstanceAnalysisRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return executionInstanceAnalysisRecord
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected ")
  
    public Object getExecutionInstanceAnalysisRecord() {
    return executionInstanceAnalysisRecord;
  }

  public void setExecutionInstanceAnalysisRecord(Object executionInstanceAnalysisRecord) {
    this.executionInstanceAnalysisRecord = executionInstanceAnalysisRecord;
  }

  public BQExecutionRetrieveOutputModelExecutionInstanceAnalysis executionInstanceAnalysisReportType(String executionInstanceAnalysisReportType) {
    this.executionInstanceAnalysisReportType = executionInstanceAnalysisReportType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return executionInstanceAnalysisReportType
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available ")
  
    public String getExecutionInstanceAnalysisReportType() {
    return executionInstanceAnalysisReportType;
  }

  public void setExecutionInstanceAnalysisReportType(String executionInstanceAnalysisReportType) {
    this.executionInstanceAnalysisReportType = executionInstanceAnalysisReportType;
  }

  public BQExecutionRetrieveOutputModelExecutionInstanceAnalysis executionInstanceAnalysisParameters(String executionInstanceAnalysisParameters) {
    this.executionInstanceAnalysisParameters = executionInstanceAnalysisParameters;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return executionInstanceAnalysisParameters
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) ")
  
    public String getExecutionInstanceAnalysisParameters() {
    return executionInstanceAnalysisParameters;
  }

  public void setExecutionInstanceAnalysisParameters(String executionInstanceAnalysisParameters) {
    this.executionInstanceAnalysisParameters = executionInstanceAnalysisParameters;
  }

  public BQExecutionRetrieveOutputModelExecutionInstanceAnalysis executionInstanceAnalysisReport(Object executionInstanceAnalysisReport) {
    this.executionInstanceAnalysisReport = executionInstanceAnalysisReport;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return executionInstanceAnalysisReport
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate ")
  
    public Object getExecutionInstanceAnalysisReport() {
    return executionInstanceAnalysisReport;
  }

  public void setExecutionInstanceAnalysisReport(Object executionInstanceAnalysisReport) {
    this.executionInstanceAnalysisReport = executionInstanceAnalysisReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQExecutionRetrieveOutputModelExecutionInstanceAnalysis bqExecutionRetrieveOutputModelExecutionInstanceAnalysis = (BQExecutionRetrieveOutputModelExecutionInstanceAnalysis) o;
    return Objects.equals(this.executionInstanceAnalysisRecord, bqExecutionRetrieveOutputModelExecutionInstanceAnalysis.executionInstanceAnalysisRecord) &&
        Objects.equals(this.executionInstanceAnalysisReportType, bqExecutionRetrieveOutputModelExecutionInstanceAnalysis.executionInstanceAnalysisReportType) &&
        Objects.equals(this.executionInstanceAnalysisParameters, bqExecutionRetrieveOutputModelExecutionInstanceAnalysis.executionInstanceAnalysisParameters) &&
        Objects.equals(this.executionInstanceAnalysisReport, bqExecutionRetrieveOutputModelExecutionInstanceAnalysis.executionInstanceAnalysisReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(executionInstanceAnalysisRecord, executionInstanceAnalysisReportType, executionInstanceAnalysisParameters, executionInstanceAnalysisReport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQExecutionRetrieveOutputModelExecutionInstanceAnalysis {\n");
    
    sb.append("    executionInstanceAnalysisRecord: ").append(toIndentedString(executionInstanceAnalysisRecord)).append("\n");
    sb.append("    executionInstanceAnalysisReportType: ").append(toIndentedString(executionInstanceAnalysisReportType)).append("\n");
    sb.append("    executionInstanceAnalysisParameters: ").append(toIndentedString(executionInstanceAnalysisParameters)).append("\n");
    sb.append("    executionInstanceAnalysisReport: ").append(toIndentedString(executionInstanceAnalysisReport)).append("\n");
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
