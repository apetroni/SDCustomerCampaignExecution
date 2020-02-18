package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BQExecutionRetrieveInputModelExecutionInstanceAnalysis1;
import io.swagger.model.BQExecutionRetrieveInputModelExecutionInstanceReport1;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQExecutionRetrieveInputModel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class BQExecutionRetrieveInputModel   {
  @JsonProperty("executionRetrieveActionTaskRecord")
  private Object executionRetrieveActionTaskRecord = null;

  @JsonProperty("executionRetrieveActionRequest")
  private String executionRetrieveActionRequest = null;

  @JsonProperty("executionInstanceReport")
  private BQExecutionRetrieveInputModelExecutionInstanceReport1 executionInstanceReport = null;

  @JsonProperty("executionInstanceAnalysis")
  private BQExecutionRetrieveInputModelExecutionInstanceAnalysis1 executionInstanceAnalysis = null;

  public BQExecutionRetrieveInputModel executionRetrieveActionTaskRecord(Object executionRetrieveActionTaskRecord) {
    this.executionRetrieveActionTaskRecord = executionRetrieveActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return executionRetrieveActionTaskRecord
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record ")
  
    public Object getExecutionRetrieveActionTaskRecord() {
    return executionRetrieveActionTaskRecord;
  }

  public void setExecutionRetrieveActionTaskRecord(Object executionRetrieveActionTaskRecord) {
    this.executionRetrieveActionTaskRecord = executionRetrieveActionTaskRecord;
  }

  public BQExecutionRetrieveInputModel executionRetrieveActionRequest(String executionRetrieveActionRequest) {
    this.executionRetrieveActionRequest = executionRetrieveActionRequest;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return executionRetrieveActionRequest
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) ")
  
    public String getExecutionRetrieveActionRequest() {
    return executionRetrieveActionRequest;
  }

  public void setExecutionRetrieveActionRequest(String executionRetrieveActionRequest) {
    this.executionRetrieveActionRequest = executionRetrieveActionRequest;
  }

  public BQExecutionRetrieveInputModel executionInstanceReport(BQExecutionRetrieveInputModelExecutionInstanceReport1 executionInstanceReport) {
    this.executionInstanceReport = executionInstanceReport;
    return this;
  }

  /**
   * Get executionInstanceReport
   * @return executionInstanceReport
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BQExecutionRetrieveInputModelExecutionInstanceReport1 getExecutionInstanceReport() {
    return executionInstanceReport;
  }

  public void setExecutionInstanceReport(BQExecutionRetrieveInputModelExecutionInstanceReport1 executionInstanceReport) {
    this.executionInstanceReport = executionInstanceReport;
  }

  public BQExecutionRetrieveInputModel executionInstanceAnalysis(BQExecutionRetrieveInputModelExecutionInstanceAnalysis1 executionInstanceAnalysis) {
    this.executionInstanceAnalysis = executionInstanceAnalysis;
    return this;
  }

  /**
   * Get executionInstanceAnalysis
   * @return executionInstanceAnalysis
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BQExecutionRetrieveInputModelExecutionInstanceAnalysis1 getExecutionInstanceAnalysis() {
    return executionInstanceAnalysis;
  }

  public void setExecutionInstanceAnalysis(BQExecutionRetrieveInputModelExecutionInstanceAnalysis1 executionInstanceAnalysis) {
    this.executionInstanceAnalysis = executionInstanceAnalysis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQExecutionRetrieveInputModel bqExecutionRetrieveInputModel = (BQExecutionRetrieveInputModel) o;
    return Objects.equals(this.executionRetrieveActionTaskRecord, bqExecutionRetrieveInputModel.executionRetrieveActionTaskRecord) &&
        Objects.equals(this.executionRetrieveActionRequest, bqExecutionRetrieveInputModel.executionRetrieveActionRequest) &&
        Objects.equals(this.executionInstanceReport, bqExecutionRetrieveInputModel.executionInstanceReport) &&
        Objects.equals(this.executionInstanceAnalysis, bqExecutionRetrieveInputModel.executionInstanceAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(executionRetrieveActionTaskRecord, executionRetrieveActionRequest, executionInstanceReport, executionInstanceAnalysis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQExecutionRetrieveInputModel {\n");
    
    sb.append("    executionRetrieveActionTaskRecord: ").append(toIndentedString(executionRetrieveActionTaskRecord)).append("\n");
    sb.append("    executionRetrieveActionRequest: ").append(toIndentedString(executionRetrieveActionRequest)).append("\n");
    sb.append("    executionInstanceReport: ").append(toIndentedString(executionInstanceReport)).append("\n");
    sb.append("    executionInstanceAnalysis: ").append(toIndentedString(executionInstanceAnalysis)).append("\n");
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
