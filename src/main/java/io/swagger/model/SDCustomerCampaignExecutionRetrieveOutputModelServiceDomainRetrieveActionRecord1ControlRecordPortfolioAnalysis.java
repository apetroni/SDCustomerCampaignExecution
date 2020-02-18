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
 * SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis   {
  @JsonProperty("controlRecordPortfolioAnalysisReference")
  private String controlRecordPortfolioAnalysisReference = null;

  @JsonProperty("controlRecordPortfolioAnalysisResult")
  private String controlRecordPortfolioAnalysisResult = null;

  @JsonProperty("controlRecordPortfolioAnalysisReportType")
  private String controlRecordPortfolioAnalysisReportType = null;

  @JsonProperty("controlRecordAnalysisReport")
  private Object controlRecordAnalysisReport = null;

  public SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis controlRecordPortfolioAnalysisReference(String controlRecordPortfolioAnalysisReference) {
    this.controlRecordPortfolioAnalysisReference = controlRecordPortfolioAnalysisReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record portfolio analysis view maintained by the service center 
   * @return controlRecordPortfolioAnalysisReference
  **/
  @ApiModelProperty(example = "739764", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record portfolio analysis view maintained by the service center ")
  
    public String getControlRecordPortfolioAnalysisReference() {
    return controlRecordPortfolioAnalysisReference;
  }

  public void setControlRecordPortfolioAnalysisReference(String controlRecordPortfolioAnalysisReference) {
    this.controlRecordPortfolioAnalysisReference = controlRecordPortfolioAnalysisReference;
  }

  public SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis controlRecordPortfolioAnalysisResult(String controlRecordPortfolioAnalysisResult) {
    this.controlRecordPortfolioAnalysisResult = controlRecordPortfolioAnalysisResult;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The results of the portfolio analysis that can be on-going, periodic and actual and projected (can be unstructured data) 
   * @return controlRecordPortfolioAnalysisResult
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The results of the portfolio analysis that can be on-going, periodic and actual and projected (can be unstructured data) ")
  
    public String getControlRecordPortfolioAnalysisResult() {
    return controlRecordPortfolioAnalysisResult;
  }

  public void setControlRecordPortfolioAnalysisResult(String controlRecordPortfolioAnalysisResult) {
    this.controlRecordPortfolioAnalysisResult = controlRecordPortfolioAnalysisResult;
  }

  public SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis controlRecordPortfolioAnalysisReportType(String controlRecordPortfolioAnalysisReportType) {
    this.controlRecordPortfolioAnalysisReportType = controlRecordPortfolioAnalysisReportType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external portfolio analysis report available 
   * @return controlRecordPortfolioAnalysisReportType
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external portfolio analysis report available ")
  
    public String getControlRecordPortfolioAnalysisReportType() {
    return controlRecordPortfolioAnalysisReportType;
  }

  public void setControlRecordPortfolioAnalysisReportType(String controlRecordPortfolioAnalysisReportType) {
    this.controlRecordPortfolioAnalysisReportType = controlRecordPortfolioAnalysisReportType;
  }

  public SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis controlRecordAnalysisReport(Object controlRecordAnalysisReport) {
    this.controlRecordAnalysisReport = controlRecordAnalysisReport;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return controlRecordAnalysisReport
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate ")
  
    public Object getControlRecordAnalysisReport() {
    return controlRecordAnalysisReport;
  }

  public void setControlRecordAnalysisReport(Object controlRecordAnalysisReport) {
    this.controlRecordAnalysisReport = controlRecordAnalysisReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis sdCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis = (SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis) o;
    return Objects.equals(this.controlRecordPortfolioAnalysisReference, sdCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis.controlRecordPortfolioAnalysisReference) &&
        Objects.equals(this.controlRecordPortfolioAnalysisResult, sdCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis.controlRecordPortfolioAnalysisResult) &&
        Objects.equals(this.controlRecordPortfolioAnalysisReportType, sdCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis.controlRecordPortfolioAnalysisReportType) &&
        Objects.equals(this.controlRecordAnalysisReport, sdCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis.controlRecordAnalysisReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controlRecordPortfolioAnalysisReference, controlRecordPortfolioAnalysisResult, controlRecordPortfolioAnalysisReportType, controlRecordAnalysisReport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis {\n");
    
    sb.append("    controlRecordPortfolioAnalysisReference: ").append(toIndentedString(controlRecordPortfolioAnalysisReference)).append("\n");
    sb.append("    controlRecordPortfolioAnalysisResult: ").append(toIndentedString(controlRecordPortfolioAnalysisResult)).append("\n");
    sb.append("    controlRecordPortfolioAnalysisReportType: ").append(toIndentedString(controlRecordPortfolioAnalysisReportType)).append("\n");
    sb.append("    controlRecordAnalysisReport: ").append(toIndentedString(controlRecordAnalysisReport)).append("\n");
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
