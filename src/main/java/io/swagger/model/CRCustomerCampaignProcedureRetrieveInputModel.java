package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CRCustomerCampaignProcedureRetrieveInputModelCustomerCampaignProcedureInstanceAnalysis1;
import io.swagger.model.CRCustomerCampaignProcedureRetrieveInputModelCustomerCampaignProcedureInstanceReportRecord1;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CRCustomerCampaignProcedureRetrieveInputModel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class CRCustomerCampaignProcedureRetrieveInputModel   {
  @JsonProperty("customerCampaignProcedureRetrieveActionTaskRecord")
  private Object customerCampaignProcedureRetrieveActionTaskRecord = null;

  @JsonProperty("customerCampaignProcedureRetrieveActionRequest")
  private String customerCampaignProcedureRetrieveActionRequest = null;

  @JsonProperty("customerCampaignProcedureInstanceReportRecord")
  private CRCustomerCampaignProcedureRetrieveInputModelCustomerCampaignProcedureInstanceReportRecord1 customerCampaignProcedureInstanceReportRecord = null;

  @JsonProperty("customerCampaignProcedureInstanceAnalysis")
  private CRCustomerCampaignProcedureRetrieveInputModelCustomerCampaignProcedureInstanceAnalysis1 customerCampaignProcedureInstanceAnalysis = null;

  public CRCustomerCampaignProcedureRetrieveInputModel customerCampaignProcedureRetrieveActionTaskRecord(Object customerCampaignProcedureRetrieveActionTaskRecord) {
    this.customerCampaignProcedureRetrieveActionTaskRecord = customerCampaignProcedureRetrieveActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return customerCampaignProcedureRetrieveActionTaskRecord
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record ")
  
    public Object getCustomerCampaignProcedureRetrieveActionTaskRecord() {
    return customerCampaignProcedureRetrieveActionTaskRecord;
  }

  public void setCustomerCampaignProcedureRetrieveActionTaskRecord(Object customerCampaignProcedureRetrieveActionTaskRecord) {
    this.customerCampaignProcedureRetrieveActionTaskRecord = customerCampaignProcedureRetrieveActionTaskRecord;
  }

  public CRCustomerCampaignProcedureRetrieveInputModel customerCampaignProcedureRetrieveActionRequest(String customerCampaignProcedureRetrieveActionRequest) {
    this.customerCampaignProcedureRetrieveActionRequest = customerCampaignProcedureRetrieveActionRequest;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return customerCampaignProcedureRetrieveActionRequest
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) ")
  
    public String getCustomerCampaignProcedureRetrieveActionRequest() {
    return customerCampaignProcedureRetrieveActionRequest;
  }

  public void setCustomerCampaignProcedureRetrieveActionRequest(String customerCampaignProcedureRetrieveActionRequest) {
    this.customerCampaignProcedureRetrieveActionRequest = customerCampaignProcedureRetrieveActionRequest;
  }

  public CRCustomerCampaignProcedureRetrieveInputModel customerCampaignProcedureInstanceReportRecord(CRCustomerCampaignProcedureRetrieveInputModelCustomerCampaignProcedureInstanceReportRecord1 customerCampaignProcedureInstanceReportRecord) {
    this.customerCampaignProcedureInstanceReportRecord = customerCampaignProcedureInstanceReportRecord;
    return this;
  }

  /**
   * Get customerCampaignProcedureInstanceReportRecord
   * @return customerCampaignProcedureInstanceReportRecord
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CRCustomerCampaignProcedureRetrieveInputModelCustomerCampaignProcedureInstanceReportRecord1 getCustomerCampaignProcedureInstanceReportRecord() {
    return customerCampaignProcedureInstanceReportRecord;
  }

  public void setCustomerCampaignProcedureInstanceReportRecord(CRCustomerCampaignProcedureRetrieveInputModelCustomerCampaignProcedureInstanceReportRecord1 customerCampaignProcedureInstanceReportRecord) {
    this.customerCampaignProcedureInstanceReportRecord = customerCampaignProcedureInstanceReportRecord;
  }

  public CRCustomerCampaignProcedureRetrieveInputModel customerCampaignProcedureInstanceAnalysis(CRCustomerCampaignProcedureRetrieveInputModelCustomerCampaignProcedureInstanceAnalysis1 customerCampaignProcedureInstanceAnalysis) {
    this.customerCampaignProcedureInstanceAnalysis = customerCampaignProcedureInstanceAnalysis;
    return this;
  }

  /**
   * Get customerCampaignProcedureInstanceAnalysis
   * @return customerCampaignProcedureInstanceAnalysis
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CRCustomerCampaignProcedureRetrieveInputModelCustomerCampaignProcedureInstanceAnalysis1 getCustomerCampaignProcedureInstanceAnalysis() {
    return customerCampaignProcedureInstanceAnalysis;
  }

  public void setCustomerCampaignProcedureInstanceAnalysis(CRCustomerCampaignProcedureRetrieveInputModelCustomerCampaignProcedureInstanceAnalysis1 customerCampaignProcedureInstanceAnalysis) {
    this.customerCampaignProcedureInstanceAnalysis = customerCampaignProcedureInstanceAnalysis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CRCustomerCampaignProcedureRetrieveInputModel crCustomerCampaignProcedureRetrieveInputModel = (CRCustomerCampaignProcedureRetrieveInputModel) o;
    return Objects.equals(this.customerCampaignProcedureRetrieveActionTaskRecord, crCustomerCampaignProcedureRetrieveInputModel.customerCampaignProcedureRetrieveActionTaskRecord) &&
        Objects.equals(this.customerCampaignProcedureRetrieveActionRequest, crCustomerCampaignProcedureRetrieveInputModel.customerCampaignProcedureRetrieveActionRequest) &&
        Objects.equals(this.customerCampaignProcedureInstanceReportRecord, crCustomerCampaignProcedureRetrieveInputModel.customerCampaignProcedureInstanceReportRecord) &&
        Objects.equals(this.customerCampaignProcedureInstanceAnalysis, crCustomerCampaignProcedureRetrieveInputModel.customerCampaignProcedureInstanceAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCampaignProcedureRetrieveActionTaskRecord, customerCampaignProcedureRetrieveActionRequest, customerCampaignProcedureInstanceReportRecord, customerCampaignProcedureInstanceAnalysis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CRCustomerCampaignProcedureRetrieveInputModel {\n");
    
    sb.append("    customerCampaignProcedureRetrieveActionTaskRecord: ").append(toIndentedString(customerCampaignProcedureRetrieveActionTaskRecord)).append("\n");
    sb.append("    customerCampaignProcedureRetrieveActionRequest: ").append(toIndentedString(customerCampaignProcedureRetrieveActionRequest)).append("\n");
    sb.append("    customerCampaignProcedureInstanceReportRecord: ").append(toIndentedString(customerCampaignProcedureInstanceReportRecord)).append("\n");
    sb.append("    customerCampaignProcedureInstanceAnalysis: ").append(toIndentedString(customerCampaignProcedureInstanceAnalysis)).append("\n");
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
