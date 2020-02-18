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
 * BQAnalysisRetrieveOutputModelAnalysisInstanceReport1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class BQAnalysisRetrieveOutputModelAnalysisInstanceReport1   {
  @JsonProperty("analysisInstanceReportRecord")
  private Object analysisInstanceReportRecord = null;

  @JsonProperty("analysisInstanceReportType")
  private String analysisInstanceReportType = null;

  @JsonProperty("analysisInstanceReportParameters")
  private String analysisInstanceReportParameters = null;

  @JsonProperty("analysisInstanceReport")
  private Object analysisInstanceReport = null;

  public BQAnalysisRetrieveOutputModelAnalysisInstanceReport1 analysisInstanceReportRecord(Object analysisInstanceReportRecord) {
    this.analysisInstanceReportRecord = analysisInstanceReportRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return analysisInstanceReportRecord
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected ")
  
    public Object getAnalysisInstanceReportRecord() {
    return analysisInstanceReportRecord;
  }

  public void setAnalysisInstanceReportRecord(Object analysisInstanceReportRecord) {
    this.analysisInstanceReportRecord = analysisInstanceReportRecord;
  }

  public BQAnalysisRetrieveOutputModelAnalysisInstanceReport1 analysisInstanceReportType(String analysisInstanceReportType) {
    this.analysisInstanceReportType = analysisInstanceReportType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return analysisInstanceReportType
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available ")
  
    public String getAnalysisInstanceReportType() {
    return analysisInstanceReportType;
  }

  public void setAnalysisInstanceReportType(String analysisInstanceReportType) {
    this.analysisInstanceReportType = analysisInstanceReportType;
  }

  public BQAnalysisRetrieveOutputModelAnalysisInstanceReport1 analysisInstanceReportParameters(String analysisInstanceReportParameters) {
    this.analysisInstanceReportParameters = analysisInstanceReportParameters;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return analysisInstanceReportParameters
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) ")
  
    public String getAnalysisInstanceReportParameters() {
    return analysisInstanceReportParameters;
  }

  public void setAnalysisInstanceReportParameters(String analysisInstanceReportParameters) {
    this.analysisInstanceReportParameters = analysisInstanceReportParameters;
  }

  public BQAnalysisRetrieveOutputModelAnalysisInstanceReport1 analysisInstanceReport(Object analysisInstanceReport) {
    this.analysisInstanceReport = analysisInstanceReport;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return analysisInstanceReport
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate ")
  
    public Object getAnalysisInstanceReport() {
    return analysisInstanceReport;
  }

  public void setAnalysisInstanceReport(Object analysisInstanceReport) {
    this.analysisInstanceReport = analysisInstanceReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQAnalysisRetrieveOutputModelAnalysisInstanceReport1 bqAnalysisRetrieveOutputModelAnalysisInstanceReport1 = (BQAnalysisRetrieveOutputModelAnalysisInstanceReport1) o;
    return Objects.equals(this.analysisInstanceReportRecord, bqAnalysisRetrieveOutputModelAnalysisInstanceReport1.analysisInstanceReportRecord) &&
        Objects.equals(this.analysisInstanceReportType, bqAnalysisRetrieveOutputModelAnalysisInstanceReport1.analysisInstanceReportType) &&
        Objects.equals(this.analysisInstanceReportParameters, bqAnalysisRetrieveOutputModelAnalysisInstanceReport1.analysisInstanceReportParameters) &&
        Objects.equals(this.analysisInstanceReport, bqAnalysisRetrieveOutputModelAnalysisInstanceReport1.analysisInstanceReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analysisInstanceReportRecord, analysisInstanceReportType, analysisInstanceReportParameters, analysisInstanceReport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQAnalysisRetrieveOutputModelAnalysisInstanceReport1 {\n");
    
    sb.append("    analysisInstanceReportRecord: ").append(toIndentedString(analysisInstanceReportRecord)).append("\n");
    sb.append("    analysisInstanceReportType: ").append(toIndentedString(analysisInstanceReportType)).append("\n");
    sb.append("    analysisInstanceReportParameters: ").append(toIndentedString(analysisInstanceReportParameters)).append("\n");
    sb.append("    analysisInstanceReport: ").append(toIndentedString(analysisInstanceReport)).append("\n");
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
