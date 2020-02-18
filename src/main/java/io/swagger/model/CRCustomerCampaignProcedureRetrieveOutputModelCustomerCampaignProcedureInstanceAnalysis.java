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
 * CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceAnalysis
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceAnalysis   {
  @JsonProperty("customerCampaignProcedureInstanceAnalysisData")
  private String customerCampaignProcedureInstanceAnalysisData = null;

  @JsonProperty("customerCampaignProcedureInstanceAnalysisReportType")
  private String customerCampaignProcedureInstanceAnalysisReportType = null;

  @JsonProperty("customerCampaignProcedureInstanceAnalysisReport")
  private Object customerCampaignProcedureInstanceAnalysisReport = null;

  public CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceAnalysis customerCampaignProcedureInstanceAnalysisData(String customerCampaignProcedureInstanceAnalysisData) {
    this.customerCampaignProcedureInstanceAnalysisData = customerCampaignProcedureInstanceAnalysisData;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return customerCampaignProcedureInstanceAnalysisData
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected ")
  
    public String getCustomerCampaignProcedureInstanceAnalysisData() {
    return customerCampaignProcedureInstanceAnalysisData;
  }

  public void setCustomerCampaignProcedureInstanceAnalysisData(String customerCampaignProcedureInstanceAnalysisData) {
    this.customerCampaignProcedureInstanceAnalysisData = customerCampaignProcedureInstanceAnalysisData;
  }

  public CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceAnalysis customerCampaignProcedureInstanceAnalysisReportType(String customerCampaignProcedureInstanceAnalysisReportType) {
    this.customerCampaignProcedureInstanceAnalysisReportType = customerCampaignProcedureInstanceAnalysisReportType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return customerCampaignProcedureInstanceAnalysisReportType
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available ")
  
    public String getCustomerCampaignProcedureInstanceAnalysisReportType() {
    return customerCampaignProcedureInstanceAnalysisReportType;
  }

  public void setCustomerCampaignProcedureInstanceAnalysisReportType(String customerCampaignProcedureInstanceAnalysisReportType) {
    this.customerCampaignProcedureInstanceAnalysisReportType = customerCampaignProcedureInstanceAnalysisReportType;
  }

  public CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceAnalysis customerCampaignProcedureInstanceAnalysisReport(Object customerCampaignProcedureInstanceAnalysisReport) {
    this.customerCampaignProcedureInstanceAnalysisReport = customerCampaignProcedureInstanceAnalysisReport;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return customerCampaignProcedureInstanceAnalysisReport
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate ")
  
    public Object getCustomerCampaignProcedureInstanceAnalysisReport() {
    return customerCampaignProcedureInstanceAnalysisReport;
  }

  public void setCustomerCampaignProcedureInstanceAnalysisReport(Object customerCampaignProcedureInstanceAnalysisReport) {
    this.customerCampaignProcedureInstanceAnalysisReport = customerCampaignProcedureInstanceAnalysisReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceAnalysis crCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceAnalysis = (CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceAnalysis) o;
    return Objects.equals(this.customerCampaignProcedureInstanceAnalysisData, crCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceAnalysis.customerCampaignProcedureInstanceAnalysisData) &&
        Objects.equals(this.customerCampaignProcedureInstanceAnalysisReportType, crCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceAnalysis.customerCampaignProcedureInstanceAnalysisReportType) &&
        Objects.equals(this.customerCampaignProcedureInstanceAnalysisReport, crCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceAnalysis.customerCampaignProcedureInstanceAnalysisReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCampaignProcedureInstanceAnalysisData, customerCampaignProcedureInstanceAnalysisReportType, customerCampaignProcedureInstanceAnalysisReport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceAnalysis {\n");
    
    sb.append("    customerCampaignProcedureInstanceAnalysisData: ").append(toIndentedString(customerCampaignProcedureInstanceAnalysisData)).append("\n");
    sb.append("    customerCampaignProcedureInstanceAnalysisReportType: ").append(toIndentedString(customerCampaignProcedureInstanceAnalysisReportType)).append("\n");
    sb.append("    customerCampaignProcedureInstanceAnalysisReport: ").append(toIndentedString(customerCampaignProcedureInstanceAnalysisReport)).append("\n");
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
