package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BQAnalysisRetrieveInputModelAnalysisInstanceAnalysis1;
import io.swagger.model.BQAnalysisRetrieveInputModelAnalysisInstanceReport1;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQAnalysisRetrieveInputModel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class BQAnalysisRetrieveInputModel   {
  @JsonProperty("analysisRetrieveActionTaskRecord")
  private Object analysisRetrieveActionTaskRecord = null;

  @JsonProperty("analysisRetrieveActionRequest")
  private String analysisRetrieveActionRequest = null;

  @JsonProperty("analysisInstanceReport")
  private BQAnalysisRetrieveInputModelAnalysisInstanceReport1 analysisInstanceReport = null;

  @JsonProperty("analysisInstanceAnalysis")
  private BQAnalysisRetrieveInputModelAnalysisInstanceAnalysis1 analysisInstanceAnalysis = null;

  public BQAnalysisRetrieveInputModel analysisRetrieveActionTaskRecord(Object analysisRetrieveActionTaskRecord) {
    this.analysisRetrieveActionTaskRecord = analysisRetrieveActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return analysisRetrieveActionTaskRecord
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record ")
  
    public Object getAnalysisRetrieveActionTaskRecord() {
    return analysisRetrieveActionTaskRecord;
  }

  public void setAnalysisRetrieveActionTaskRecord(Object analysisRetrieveActionTaskRecord) {
    this.analysisRetrieveActionTaskRecord = analysisRetrieveActionTaskRecord;
  }

  public BQAnalysisRetrieveInputModel analysisRetrieveActionRequest(String analysisRetrieveActionRequest) {
    this.analysisRetrieveActionRequest = analysisRetrieveActionRequest;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return analysisRetrieveActionRequest
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) ")
  
    public String getAnalysisRetrieveActionRequest() {
    return analysisRetrieveActionRequest;
  }

  public void setAnalysisRetrieveActionRequest(String analysisRetrieveActionRequest) {
    this.analysisRetrieveActionRequest = analysisRetrieveActionRequest;
  }

  public BQAnalysisRetrieveInputModel analysisInstanceReport(BQAnalysisRetrieveInputModelAnalysisInstanceReport1 analysisInstanceReport) {
    this.analysisInstanceReport = analysisInstanceReport;
    return this;
  }

  /**
   * Get analysisInstanceReport
   * @return analysisInstanceReport
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BQAnalysisRetrieveInputModelAnalysisInstanceReport1 getAnalysisInstanceReport() {
    return analysisInstanceReport;
  }

  public void setAnalysisInstanceReport(BQAnalysisRetrieveInputModelAnalysisInstanceReport1 analysisInstanceReport) {
    this.analysisInstanceReport = analysisInstanceReport;
  }

  public BQAnalysisRetrieveInputModel analysisInstanceAnalysis(BQAnalysisRetrieveInputModelAnalysisInstanceAnalysis1 analysisInstanceAnalysis) {
    this.analysisInstanceAnalysis = analysisInstanceAnalysis;
    return this;
  }

  /**
   * Get analysisInstanceAnalysis
   * @return analysisInstanceAnalysis
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BQAnalysisRetrieveInputModelAnalysisInstanceAnalysis1 getAnalysisInstanceAnalysis() {
    return analysisInstanceAnalysis;
  }

  public void setAnalysisInstanceAnalysis(BQAnalysisRetrieveInputModelAnalysisInstanceAnalysis1 analysisInstanceAnalysis) {
    this.analysisInstanceAnalysis = analysisInstanceAnalysis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQAnalysisRetrieveInputModel bqAnalysisRetrieveInputModel = (BQAnalysisRetrieveInputModel) o;
    return Objects.equals(this.analysisRetrieveActionTaskRecord, bqAnalysisRetrieveInputModel.analysisRetrieveActionTaskRecord) &&
        Objects.equals(this.analysisRetrieveActionRequest, bqAnalysisRetrieveInputModel.analysisRetrieveActionRequest) &&
        Objects.equals(this.analysisInstanceReport, bqAnalysisRetrieveInputModel.analysisInstanceReport) &&
        Objects.equals(this.analysisInstanceAnalysis, bqAnalysisRetrieveInputModel.analysisInstanceAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analysisRetrieveActionTaskRecord, analysisRetrieveActionRequest, analysisInstanceReport, analysisInstanceAnalysis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQAnalysisRetrieveInputModel {\n");
    
    sb.append("    analysisRetrieveActionTaskRecord: ").append(toIndentedString(analysisRetrieveActionTaskRecord)).append("\n");
    sb.append("    analysisRetrieveActionRequest: ").append(toIndentedString(analysisRetrieveActionRequest)).append("\n");
    sb.append("    analysisInstanceReport: ").append(toIndentedString(analysisInstanceReport)).append("\n");
    sb.append("    analysisInstanceAnalysis: ").append(toIndentedString(analysisInstanceAnalysis)).append("\n");
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
