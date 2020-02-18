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
 * CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceReportRecord
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceReportRecord   {
  @JsonProperty("customerCampaignProcedureInstanceReportData")
  private String customerCampaignProcedureInstanceReportData = null;

  @JsonProperty("customerCampaignProcedureInstanceReportType")
  private String customerCampaignProcedureInstanceReportType = null;

  @JsonProperty("customerCampaignProcedureInstanceReport")
  private Object customerCampaignProcedureInstanceReport = null;

  public CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceReportRecord customerCampaignProcedureInstanceReportData(String customerCampaignProcedureInstanceReportData) {
    this.customerCampaignProcedureInstanceReportData = customerCampaignProcedureInstanceReportData;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return customerCampaignProcedureInstanceReportData
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected ")
  
    public String getCustomerCampaignProcedureInstanceReportData() {
    return customerCampaignProcedureInstanceReportData;
  }

  public void setCustomerCampaignProcedureInstanceReportData(String customerCampaignProcedureInstanceReportData) {
    this.customerCampaignProcedureInstanceReportData = customerCampaignProcedureInstanceReportData;
  }

  public CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceReportRecord customerCampaignProcedureInstanceReportType(String customerCampaignProcedureInstanceReportType) {
    this.customerCampaignProcedureInstanceReportType = customerCampaignProcedureInstanceReportType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return customerCampaignProcedureInstanceReportType
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available ")
  
    public String getCustomerCampaignProcedureInstanceReportType() {
    return customerCampaignProcedureInstanceReportType;
  }

  public void setCustomerCampaignProcedureInstanceReportType(String customerCampaignProcedureInstanceReportType) {
    this.customerCampaignProcedureInstanceReportType = customerCampaignProcedureInstanceReportType;
  }

  public CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceReportRecord customerCampaignProcedureInstanceReport(Object customerCampaignProcedureInstanceReport) {
    this.customerCampaignProcedureInstanceReport = customerCampaignProcedureInstanceReport;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return customerCampaignProcedureInstanceReport
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate ")
  
    public Object getCustomerCampaignProcedureInstanceReport() {
    return customerCampaignProcedureInstanceReport;
  }

  public void setCustomerCampaignProcedureInstanceReport(Object customerCampaignProcedureInstanceReport) {
    this.customerCampaignProcedureInstanceReport = customerCampaignProcedureInstanceReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceReportRecord crCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceReportRecord = (CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceReportRecord) o;
    return Objects.equals(this.customerCampaignProcedureInstanceReportData, crCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceReportRecord.customerCampaignProcedureInstanceReportData) &&
        Objects.equals(this.customerCampaignProcedureInstanceReportType, crCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceReportRecord.customerCampaignProcedureInstanceReportType) &&
        Objects.equals(this.customerCampaignProcedureInstanceReport, crCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceReportRecord.customerCampaignProcedureInstanceReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCampaignProcedureInstanceReportData, customerCampaignProcedureInstanceReportType, customerCampaignProcedureInstanceReport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceReportRecord {\n");
    
    sb.append("    customerCampaignProcedureInstanceReportData: ").append(toIndentedString(customerCampaignProcedureInstanceReportData)).append("\n");
    sb.append("    customerCampaignProcedureInstanceReportType: ").append(toIndentedString(customerCampaignProcedureInstanceReportType)).append("\n");
    sb.append("    customerCampaignProcedureInstanceReport: ").append(toIndentedString(customerCampaignProcedureInstanceReport)).append("\n");
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
