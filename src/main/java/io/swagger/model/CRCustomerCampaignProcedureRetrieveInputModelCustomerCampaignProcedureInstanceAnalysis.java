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
 * CRCustomerCampaignProcedureRetrieveInputModelCustomerCampaignProcedureInstanceAnalysis
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class CRCustomerCampaignProcedureRetrieveInputModelCustomerCampaignProcedureInstanceAnalysis   {
  @JsonProperty("customerCampaignProcedureInstanceAnalysisReference")
  private String customerCampaignProcedureInstanceAnalysisReference = null;

  @JsonProperty("customerCampaignProcedureInstanceAnalysisReportType")
  private String customerCampaignProcedureInstanceAnalysisReportType = null;

  @JsonProperty("customerCampaignProcedureInstanceAnalysisParameters")
  private String customerCampaignProcedureInstanceAnalysisParameters = null;

  public CRCustomerCampaignProcedureRetrieveInputModelCustomerCampaignProcedureInstanceAnalysis customerCampaignProcedureInstanceAnalysisReference(String customerCampaignProcedureInstanceAnalysisReference) {
    this.customerCampaignProcedureInstanceAnalysisReference = customerCampaignProcedureInstanceAnalysisReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return customerCampaignProcedureInstanceAnalysisReference
  **/
  @ApiModelProperty(example = "717514", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view ")
  
    public String getCustomerCampaignProcedureInstanceAnalysisReference() {
    return customerCampaignProcedureInstanceAnalysisReference;
  }

  public void setCustomerCampaignProcedureInstanceAnalysisReference(String customerCampaignProcedureInstanceAnalysisReference) {
    this.customerCampaignProcedureInstanceAnalysisReference = customerCampaignProcedureInstanceAnalysisReference;
  }

  public CRCustomerCampaignProcedureRetrieveInputModelCustomerCampaignProcedureInstanceAnalysis customerCampaignProcedureInstanceAnalysisReportType(String customerCampaignProcedureInstanceAnalysisReportType) {
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

  public CRCustomerCampaignProcedureRetrieveInputModelCustomerCampaignProcedureInstanceAnalysis customerCampaignProcedureInstanceAnalysisParameters(String customerCampaignProcedureInstanceAnalysisParameters) {
    this.customerCampaignProcedureInstanceAnalysisParameters = customerCampaignProcedureInstanceAnalysisParameters;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return customerCampaignProcedureInstanceAnalysisParameters
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) ")
  
    public String getCustomerCampaignProcedureInstanceAnalysisParameters() {
    return customerCampaignProcedureInstanceAnalysisParameters;
  }

  public void setCustomerCampaignProcedureInstanceAnalysisParameters(String customerCampaignProcedureInstanceAnalysisParameters) {
    this.customerCampaignProcedureInstanceAnalysisParameters = customerCampaignProcedureInstanceAnalysisParameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CRCustomerCampaignProcedureRetrieveInputModelCustomerCampaignProcedureInstanceAnalysis crCustomerCampaignProcedureRetrieveInputModelCustomerCampaignProcedureInstanceAnalysis = (CRCustomerCampaignProcedureRetrieveInputModelCustomerCampaignProcedureInstanceAnalysis) o;
    return Objects.equals(this.customerCampaignProcedureInstanceAnalysisReference, crCustomerCampaignProcedureRetrieveInputModelCustomerCampaignProcedureInstanceAnalysis.customerCampaignProcedureInstanceAnalysisReference) &&
        Objects.equals(this.customerCampaignProcedureInstanceAnalysisReportType, crCustomerCampaignProcedureRetrieveInputModelCustomerCampaignProcedureInstanceAnalysis.customerCampaignProcedureInstanceAnalysisReportType) &&
        Objects.equals(this.customerCampaignProcedureInstanceAnalysisParameters, crCustomerCampaignProcedureRetrieveInputModelCustomerCampaignProcedureInstanceAnalysis.customerCampaignProcedureInstanceAnalysisParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCampaignProcedureInstanceAnalysisReference, customerCampaignProcedureInstanceAnalysisReportType, customerCampaignProcedureInstanceAnalysisParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CRCustomerCampaignProcedureRetrieveInputModelCustomerCampaignProcedureInstanceAnalysis {\n");
    
    sb.append("    customerCampaignProcedureInstanceAnalysisReference: ").append(toIndentedString(customerCampaignProcedureInstanceAnalysisReference)).append("\n");
    sb.append("    customerCampaignProcedureInstanceAnalysisReportType: ").append(toIndentedString(customerCampaignProcedureInstanceAnalysisReportType)).append("\n");
    sb.append("    customerCampaignProcedureInstanceAnalysisParameters: ").append(toIndentedString(customerCampaignProcedureInstanceAnalysisParameters)).append("\n");
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
