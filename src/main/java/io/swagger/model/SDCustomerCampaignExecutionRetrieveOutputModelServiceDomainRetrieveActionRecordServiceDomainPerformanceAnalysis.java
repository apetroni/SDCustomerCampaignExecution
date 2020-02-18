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
 * SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis   {
  @JsonProperty("performanceAnalysisReference")
  private String performanceAnalysisReference = null;

  @JsonProperty("performanceAnalysisResult")
  private String performanceAnalysisResult = null;

  @JsonProperty("performanceAnalysisReportType")
  private String performanceAnalysisReportType = null;

  @JsonProperty("performanceAnalysisReport")
  private Object performanceAnalysisReport = null;

  public SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis performanceAnalysisReference(String performanceAnalysisReference) {
    this.performanceAnalysisReference = performanceAnalysisReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the internal performance analysis view maintained by the service center 
   * @return performanceAnalysisReference
  **/
  @ApiModelProperty(example = "761670", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the internal performance analysis view maintained by the service center ")
  
    public String getPerformanceAnalysisReference() {
    return performanceAnalysisReference;
  }

  public void setPerformanceAnalysisReference(String performanceAnalysisReference) {
    this.performanceAnalysisReference = performanceAnalysisReference;
  }

  public SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis performanceAnalysisResult(String performanceAnalysisResult) {
    this.performanceAnalysisResult = performanceAnalysisResult;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The results of the performance analysis that can be on-going or periodic 
   * @return performanceAnalysisResult
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The results of the performance analysis that can be on-going or periodic ")
  
    public String getPerformanceAnalysisResult() {
    return performanceAnalysisResult;
  }

  public void setPerformanceAnalysisResult(String performanceAnalysisResult) {
    this.performanceAnalysisResult = performanceAnalysisResult;
  }

  public SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis performanceAnalysisReportType(String performanceAnalysisReportType) {
    this.performanceAnalysisReportType = performanceAnalysisReportType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of performance analysis report available 
   * @return performanceAnalysisReportType
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of performance analysis report available ")
  
    public String getPerformanceAnalysisReportType() {
    return performanceAnalysisReportType;
  }

  public void setPerformanceAnalysisReportType(String performanceAnalysisReportType) {
    this.performanceAnalysisReportType = performanceAnalysisReportType;
  }

  public SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis performanceAnalysisReport(Object performanceAnalysisReport) {
    this.performanceAnalysisReport = performanceAnalysisReport;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The performance analysis report in any suitable form including selection filters where appropriate 
   * @return performanceAnalysisReport
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The performance analysis report in any suitable form including selection filters where appropriate ")
  
    public Object getPerformanceAnalysisReport() {
    return performanceAnalysisReport;
  }

  public void setPerformanceAnalysisReport(Object performanceAnalysisReport) {
    this.performanceAnalysisReport = performanceAnalysisReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis sdCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis = (SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis) o;
    return Objects.equals(this.performanceAnalysisReference, sdCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis.performanceAnalysisReference) &&
        Objects.equals(this.performanceAnalysisResult, sdCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis.performanceAnalysisResult) &&
        Objects.equals(this.performanceAnalysisReportType, sdCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis.performanceAnalysisReportType) &&
        Objects.equals(this.performanceAnalysisReport, sdCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis.performanceAnalysisReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(performanceAnalysisReference, performanceAnalysisResult, performanceAnalysisReportType, performanceAnalysisReport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis {\n");
    
    sb.append("    performanceAnalysisReference: ").append(toIndentedString(performanceAnalysisReference)).append("\n");
    sb.append("    performanceAnalysisResult: ").append(toIndentedString(performanceAnalysisResult)).append("\n");
    sb.append("    performanceAnalysisReportType: ").append(toIndentedString(performanceAnalysisReportType)).append("\n");
    sb.append("    performanceAnalysisReport: ").append(toIndentedString(performanceAnalysisReport)).append("\n");
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
