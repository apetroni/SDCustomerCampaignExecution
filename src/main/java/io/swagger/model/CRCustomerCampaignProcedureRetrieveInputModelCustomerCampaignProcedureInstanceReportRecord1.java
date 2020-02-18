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
 * CRCustomerCampaignProcedureRetrieveInputModelCustomerCampaignProcedureInstanceReportRecord1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class CRCustomerCampaignProcedureRetrieveInputModelCustomerCampaignProcedureInstanceReportRecord1   {
  @JsonProperty("customerCampaignProcedureInstanceReportReference")
  private String customerCampaignProcedureInstanceReportReference = null;

  @JsonProperty("customerCampaignProcedureInstanceReportType")
  private String customerCampaignProcedureInstanceReportType = null;

  @JsonProperty("customerCampaignProcedureInstanceReportParameters")
  private String customerCampaignProcedureInstanceReportParameters = null;

  public CRCustomerCampaignProcedureRetrieveInputModelCustomerCampaignProcedureInstanceReportRecord1 customerCampaignProcedureInstanceReportReference(String customerCampaignProcedureInstanceReportReference) {
    this.customerCampaignProcedureInstanceReportReference = customerCampaignProcedureInstanceReportReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return customerCampaignProcedureInstanceReportReference
  **/
  @ApiModelProperty(example = "769897", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report ")
  
    public String getCustomerCampaignProcedureInstanceReportReference() {
    return customerCampaignProcedureInstanceReportReference;
  }

  public void setCustomerCampaignProcedureInstanceReportReference(String customerCampaignProcedureInstanceReportReference) {
    this.customerCampaignProcedureInstanceReportReference = customerCampaignProcedureInstanceReportReference;
  }

  public CRCustomerCampaignProcedureRetrieveInputModelCustomerCampaignProcedureInstanceReportRecord1 customerCampaignProcedureInstanceReportType(String customerCampaignProcedureInstanceReportType) {
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

  public CRCustomerCampaignProcedureRetrieveInputModelCustomerCampaignProcedureInstanceReportRecord1 customerCampaignProcedureInstanceReportParameters(String customerCampaignProcedureInstanceReportParameters) {
    this.customerCampaignProcedureInstanceReportParameters = customerCampaignProcedureInstanceReportParameters;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return customerCampaignProcedureInstanceReportParameters
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) ")
  
    public String getCustomerCampaignProcedureInstanceReportParameters() {
    return customerCampaignProcedureInstanceReportParameters;
  }

  public void setCustomerCampaignProcedureInstanceReportParameters(String customerCampaignProcedureInstanceReportParameters) {
    this.customerCampaignProcedureInstanceReportParameters = customerCampaignProcedureInstanceReportParameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CRCustomerCampaignProcedureRetrieveInputModelCustomerCampaignProcedureInstanceReportRecord1 crCustomerCampaignProcedureRetrieveInputModelCustomerCampaignProcedureInstanceReportRecord1 = (CRCustomerCampaignProcedureRetrieveInputModelCustomerCampaignProcedureInstanceReportRecord1) o;
    return Objects.equals(this.customerCampaignProcedureInstanceReportReference, crCustomerCampaignProcedureRetrieveInputModelCustomerCampaignProcedureInstanceReportRecord1.customerCampaignProcedureInstanceReportReference) &&
        Objects.equals(this.customerCampaignProcedureInstanceReportType, crCustomerCampaignProcedureRetrieveInputModelCustomerCampaignProcedureInstanceReportRecord1.customerCampaignProcedureInstanceReportType) &&
        Objects.equals(this.customerCampaignProcedureInstanceReportParameters, crCustomerCampaignProcedureRetrieveInputModelCustomerCampaignProcedureInstanceReportRecord1.customerCampaignProcedureInstanceReportParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCampaignProcedureInstanceReportReference, customerCampaignProcedureInstanceReportType, customerCampaignProcedureInstanceReportParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CRCustomerCampaignProcedureRetrieveInputModelCustomerCampaignProcedureInstanceReportRecord1 {\n");
    
    sb.append("    customerCampaignProcedureInstanceReportReference: ").append(toIndentedString(customerCampaignProcedureInstanceReportReference)).append("\n");
    sb.append("    customerCampaignProcedureInstanceReportType: ").append(toIndentedString(customerCampaignProcedureInstanceReportType)).append("\n");
    sb.append("    customerCampaignProcedureInstanceReportParameters: ").append(toIndentedString(customerCampaignProcedureInstanceReportParameters)).append("\n");
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
