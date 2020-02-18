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
 * BQAnalysisRetrieveOutputModelAnalysisInstanceAnalysis
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class BQAnalysisRetrieveOutputModelAnalysisInstanceAnalysis   {
  @JsonProperty("analysisInstanceAnalysisRecord")
  private Object analysisInstanceAnalysisRecord = null;

  @JsonProperty("analysisInstanceAnalysisReportType")
  private String analysisInstanceAnalysisReportType = null;

  @JsonProperty("analysisInstanceAnalysisParameters")
  private String analysisInstanceAnalysisParameters = null;

  @JsonProperty("analysisInstanceAnalysisReport")
  private Object analysisInstanceAnalysisReport = null;

  public BQAnalysisRetrieveOutputModelAnalysisInstanceAnalysis analysisInstanceAnalysisRecord(Object analysisInstanceAnalysisRecord) {
    this.analysisInstanceAnalysisRecord = analysisInstanceAnalysisRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return analysisInstanceAnalysisRecord
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected ")
  
    public Object getAnalysisInstanceAnalysisRecord() {
    return analysisInstanceAnalysisRecord;
  }

  public void setAnalysisInstanceAnalysisRecord(Object analysisInstanceAnalysisRecord) {
    this.analysisInstanceAnalysisRecord = analysisInstanceAnalysisRecord;
  }

  public BQAnalysisRetrieveOutputModelAnalysisInstanceAnalysis analysisInstanceAnalysisReportType(String analysisInstanceAnalysisReportType) {
    this.analysisInstanceAnalysisReportType = analysisInstanceAnalysisReportType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return analysisInstanceAnalysisReportType
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available ")
  
    public String getAnalysisInstanceAnalysisReportType() {
    return analysisInstanceAnalysisReportType;
  }

  public void setAnalysisInstanceAnalysisReportType(String analysisInstanceAnalysisReportType) {
    this.analysisInstanceAnalysisReportType = analysisInstanceAnalysisReportType;
  }

  public BQAnalysisRetrieveOutputModelAnalysisInstanceAnalysis analysisInstanceAnalysisParameters(String analysisInstanceAnalysisParameters) {
    this.analysisInstanceAnalysisParameters = analysisInstanceAnalysisParameters;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return analysisInstanceAnalysisParameters
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) ")
  
    public String getAnalysisInstanceAnalysisParameters() {
    return analysisInstanceAnalysisParameters;
  }

  public void setAnalysisInstanceAnalysisParameters(String analysisInstanceAnalysisParameters) {
    this.analysisInstanceAnalysisParameters = analysisInstanceAnalysisParameters;
  }

  public BQAnalysisRetrieveOutputModelAnalysisInstanceAnalysis analysisInstanceAnalysisReport(Object analysisInstanceAnalysisReport) {
    this.analysisInstanceAnalysisReport = analysisInstanceAnalysisReport;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return analysisInstanceAnalysisReport
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate ")
  
    public Object getAnalysisInstanceAnalysisReport() {
    return analysisInstanceAnalysisReport;
  }

  public void setAnalysisInstanceAnalysisReport(Object analysisInstanceAnalysisReport) {
    this.analysisInstanceAnalysisReport = analysisInstanceAnalysisReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQAnalysisRetrieveOutputModelAnalysisInstanceAnalysis bqAnalysisRetrieveOutputModelAnalysisInstanceAnalysis = (BQAnalysisRetrieveOutputModelAnalysisInstanceAnalysis) o;
    return Objects.equals(this.analysisInstanceAnalysisRecord, bqAnalysisRetrieveOutputModelAnalysisInstanceAnalysis.analysisInstanceAnalysisRecord) &&
        Objects.equals(this.analysisInstanceAnalysisReportType, bqAnalysisRetrieveOutputModelAnalysisInstanceAnalysis.analysisInstanceAnalysisReportType) &&
        Objects.equals(this.analysisInstanceAnalysisParameters, bqAnalysisRetrieveOutputModelAnalysisInstanceAnalysis.analysisInstanceAnalysisParameters) &&
        Objects.equals(this.analysisInstanceAnalysisReport, bqAnalysisRetrieveOutputModelAnalysisInstanceAnalysis.analysisInstanceAnalysisReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analysisInstanceAnalysisRecord, analysisInstanceAnalysisReportType, analysisInstanceAnalysisParameters, analysisInstanceAnalysisReport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQAnalysisRetrieveOutputModelAnalysisInstanceAnalysis {\n");
    
    sb.append("    analysisInstanceAnalysisRecord: ").append(toIndentedString(analysisInstanceAnalysisRecord)).append("\n");
    sb.append("    analysisInstanceAnalysisReportType: ").append(toIndentedString(analysisInstanceAnalysisReportType)).append("\n");
    sb.append("    analysisInstanceAnalysisParameters: ").append(toIndentedString(analysisInstanceAnalysisParameters)).append("\n");
    sb.append("    analysisInstanceAnalysisReport: ").append(toIndentedString(analysisInstanceAnalysisReport)).append("\n");
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
