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
 * BQExecutionRetrieveOutputModelExecutionInstanceReport1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class BQExecutionRetrieveOutputModelExecutionInstanceReport1   {
  @JsonProperty("executionInstanceReportRecord")
  private Object executionInstanceReportRecord = null;

  @JsonProperty("executionInstanceReportType")
  private String executionInstanceReportType = null;

  @JsonProperty("executionInstanceReportParameters")
  private String executionInstanceReportParameters = null;

  @JsonProperty("executionInstanceReport")
  private Object executionInstanceReport = null;

  public BQExecutionRetrieveOutputModelExecutionInstanceReport1 executionInstanceReportRecord(Object executionInstanceReportRecord) {
    this.executionInstanceReportRecord = executionInstanceReportRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return executionInstanceReportRecord
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected ")
  
    public Object getExecutionInstanceReportRecord() {
    return executionInstanceReportRecord;
  }

  public void setExecutionInstanceReportRecord(Object executionInstanceReportRecord) {
    this.executionInstanceReportRecord = executionInstanceReportRecord;
  }

  public BQExecutionRetrieveOutputModelExecutionInstanceReport1 executionInstanceReportType(String executionInstanceReportType) {
    this.executionInstanceReportType = executionInstanceReportType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return executionInstanceReportType
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available ")
  
    public String getExecutionInstanceReportType() {
    return executionInstanceReportType;
  }

  public void setExecutionInstanceReportType(String executionInstanceReportType) {
    this.executionInstanceReportType = executionInstanceReportType;
  }

  public BQExecutionRetrieveOutputModelExecutionInstanceReport1 executionInstanceReportParameters(String executionInstanceReportParameters) {
    this.executionInstanceReportParameters = executionInstanceReportParameters;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return executionInstanceReportParameters
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) ")
  
    public String getExecutionInstanceReportParameters() {
    return executionInstanceReportParameters;
  }

  public void setExecutionInstanceReportParameters(String executionInstanceReportParameters) {
    this.executionInstanceReportParameters = executionInstanceReportParameters;
  }

  public BQExecutionRetrieveOutputModelExecutionInstanceReport1 executionInstanceReport(Object executionInstanceReport) {
    this.executionInstanceReport = executionInstanceReport;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return executionInstanceReport
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate ")
  
    public Object getExecutionInstanceReport() {
    return executionInstanceReport;
  }

  public void setExecutionInstanceReport(Object executionInstanceReport) {
    this.executionInstanceReport = executionInstanceReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQExecutionRetrieveOutputModelExecutionInstanceReport1 bqExecutionRetrieveOutputModelExecutionInstanceReport1 = (BQExecutionRetrieveOutputModelExecutionInstanceReport1) o;
    return Objects.equals(this.executionInstanceReportRecord, bqExecutionRetrieveOutputModelExecutionInstanceReport1.executionInstanceReportRecord) &&
        Objects.equals(this.executionInstanceReportType, bqExecutionRetrieveOutputModelExecutionInstanceReport1.executionInstanceReportType) &&
        Objects.equals(this.executionInstanceReportParameters, bqExecutionRetrieveOutputModelExecutionInstanceReport1.executionInstanceReportParameters) &&
        Objects.equals(this.executionInstanceReport, bqExecutionRetrieveOutputModelExecutionInstanceReport1.executionInstanceReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(executionInstanceReportRecord, executionInstanceReportType, executionInstanceReportParameters, executionInstanceReport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQExecutionRetrieveOutputModelExecutionInstanceReport1 {\n");
    
    sb.append("    executionInstanceReportRecord: ").append(toIndentedString(executionInstanceReportRecord)).append("\n");
    sb.append("    executionInstanceReportType: ").append(toIndentedString(executionInstanceReportType)).append("\n");
    sb.append("    executionInstanceReportParameters: ").append(toIndentedString(executionInstanceReportParameters)).append("\n");
    sb.append("    executionInstanceReport: ").append(toIndentedString(executionInstanceReport)).append("\n");
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
