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
 * SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1ServiceDomainActivityAnalysis
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1ServiceDomainActivityAnalysis   {
  @JsonProperty("activityAnalysisReference")
  private String activityAnalysisReference = null;

  @JsonProperty("activityAnalysisResult")
  private String activityAnalysisResult = null;

  @JsonProperty("activityAnalysisReportType")
  private String activityAnalysisReportType = null;

  @JsonProperty("activityAnalysisReport")
  private Object activityAnalysisReport = null;

  public SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1ServiceDomainActivityAnalysis activityAnalysisReference(String activityAnalysisReference) {
    this.activityAnalysisReference = activityAnalysisReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the internal activity analysis view maintained by the service center 
   * @return activityAnalysisReference
  **/
  @ApiModelProperty(example = "730230", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the internal activity analysis view maintained by the service center ")
  
    public String getActivityAnalysisReference() {
    return activityAnalysisReference;
  }

  public void setActivityAnalysisReference(String activityAnalysisReference) {
    this.activityAnalysisReference = activityAnalysisReference;
  }

  public SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1ServiceDomainActivityAnalysis activityAnalysisResult(String activityAnalysisResult) {
    this.activityAnalysisResult = activityAnalysisResult;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The results of the activity analysis that can be on-going, periodic and actual and projected 
   * @return activityAnalysisResult
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The results of the activity analysis that can be on-going, periodic and actual and projected ")
  
    public String getActivityAnalysisResult() {
    return activityAnalysisResult;
  }

  public void setActivityAnalysisResult(String activityAnalysisResult) {
    this.activityAnalysisResult = activityAnalysisResult;
  }

  public SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1ServiceDomainActivityAnalysis activityAnalysisReportType(String activityAnalysisReportType) {
    this.activityAnalysisReportType = activityAnalysisReportType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of activity analysis report available 
   * @return activityAnalysisReportType
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of activity analysis report available ")
  
    public String getActivityAnalysisReportType() {
    return activityAnalysisReportType;
  }

  public void setActivityAnalysisReportType(String activityAnalysisReportType) {
    this.activityAnalysisReportType = activityAnalysisReportType;
  }

  public SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1ServiceDomainActivityAnalysis activityAnalysisReport(Object activityAnalysisReport) {
    this.activityAnalysisReport = activityAnalysisReport;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activity analysis report in any suitable form including selection filters where appropriate 
   * @return activityAnalysisReport
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activity analysis report in any suitable form including selection filters where appropriate ")
  
    public Object getActivityAnalysisReport() {
    return activityAnalysisReport;
  }

  public void setActivityAnalysisReport(Object activityAnalysisReport) {
    this.activityAnalysisReport = activityAnalysisReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1ServiceDomainActivityAnalysis sdCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1ServiceDomainActivityAnalysis = (SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1ServiceDomainActivityAnalysis) o;
    return Objects.equals(this.activityAnalysisReference, sdCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1ServiceDomainActivityAnalysis.activityAnalysisReference) &&
        Objects.equals(this.activityAnalysisResult, sdCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1ServiceDomainActivityAnalysis.activityAnalysisResult) &&
        Objects.equals(this.activityAnalysisReportType, sdCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1ServiceDomainActivityAnalysis.activityAnalysisReportType) &&
        Objects.equals(this.activityAnalysisReport, sdCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1ServiceDomainActivityAnalysis.activityAnalysisReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityAnalysisReference, activityAnalysisResult, activityAnalysisReportType, activityAnalysisReport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1ServiceDomainActivityAnalysis {\n");
    
    sb.append("    activityAnalysisReference: ").append(toIndentedString(activityAnalysisReference)).append("\n");
    sb.append("    activityAnalysisResult: ").append(toIndentedString(activityAnalysisResult)).append("\n");
    sb.append("    activityAnalysisReportType: ").append(toIndentedString(activityAnalysisReportType)).append("\n");
    sb.append("    activityAnalysisReport: ").append(toIndentedString(activityAnalysisReport)).append("\n");
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
