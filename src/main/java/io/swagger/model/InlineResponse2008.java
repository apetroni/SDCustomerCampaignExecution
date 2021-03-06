package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceAnalysis1;
import io.swagger.model.CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceRecord1;
import io.swagger.model.CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceReportRecord1;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2008
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class InlineResponse2008   {
  @JsonProperty("customerCampaignProcedureInstanceRecord")
  private CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceRecord1 customerCampaignProcedureInstanceRecord = null;

  @JsonProperty("customerCampaignProcedureRetrieveActionTaskReference")
  private String customerCampaignProcedureRetrieveActionTaskReference = null;

  @JsonProperty("customerCampaignProcedureRetrieveActionTaskRecord")
  private Object customerCampaignProcedureRetrieveActionTaskRecord = null;

  @JsonProperty("customerCampaignProcedureRetrieveActionResponse")
  private String customerCampaignProcedureRetrieveActionResponse = null;

  @JsonProperty("customerCampaignProcedureInstanceReportRecord")
  private CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceReportRecord1 customerCampaignProcedureInstanceReportRecord = null;

  @JsonProperty("customerCampaignProcedureInstanceAnalysis")
  private CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceAnalysis1 customerCampaignProcedureInstanceAnalysis = null;

  public InlineResponse2008 customerCampaignProcedureInstanceRecord(CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceRecord1 customerCampaignProcedureInstanceRecord) {
    this.customerCampaignProcedureInstanceRecord = customerCampaignProcedureInstanceRecord;
    return this;
  }

  /**
   * Get customerCampaignProcedureInstanceRecord
   * @return customerCampaignProcedureInstanceRecord
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceRecord1 getCustomerCampaignProcedureInstanceRecord() {
    return customerCampaignProcedureInstanceRecord;
  }

  public void setCustomerCampaignProcedureInstanceRecord(CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceRecord1 customerCampaignProcedureInstanceRecord) {
    this.customerCampaignProcedureInstanceRecord = customerCampaignProcedureInstanceRecord;
  }

  public InlineResponse2008 customerCampaignProcedureRetrieveActionTaskReference(String customerCampaignProcedureRetrieveActionTaskReference) {
    this.customerCampaignProcedureRetrieveActionTaskReference = customerCampaignProcedureRetrieveActionTaskReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Campaign Procedure instance retrieve service call 
   * @return customerCampaignProcedureRetrieveActionTaskReference
  **/
  @ApiModelProperty(example = "CCPRATR709051", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Campaign Procedure instance retrieve service call ")
  
    public String getCustomerCampaignProcedureRetrieveActionTaskReference() {
    return customerCampaignProcedureRetrieveActionTaskReference;
  }

  public void setCustomerCampaignProcedureRetrieveActionTaskReference(String customerCampaignProcedureRetrieveActionTaskReference) {
    this.customerCampaignProcedureRetrieveActionTaskReference = customerCampaignProcedureRetrieveActionTaskReference;
  }

  public InlineResponse2008 customerCampaignProcedureRetrieveActionTaskRecord(Object customerCampaignProcedureRetrieveActionTaskRecord) {
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

  public InlineResponse2008 customerCampaignProcedureRetrieveActionResponse(String customerCampaignProcedureRetrieveActionResponse) {
    this.customerCampaignProcedureRetrieveActionResponse = customerCampaignProcedureRetrieveActionResponse;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return customerCampaignProcedureRetrieveActionResponse
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) ")
  
    public String getCustomerCampaignProcedureRetrieveActionResponse() {
    return customerCampaignProcedureRetrieveActionResponse;
  }

  public void setCustomerCampaignProcedureRetrieveActionResponse(String customerCampaignProcedureRetrieveActionResponse) {
    this.customerCampaignProcedureRetrieveActionResponse = customerCampaignProcedureRetrieveActionResponse;
  }

  public InlineResponse2008 customerCampaignProcedureInstanceReportRecord(CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceReportRecord1 customerCampaignProcedureInstanceReportRecord) {
    this.customerCampaignProcedureInstanceReportRecord = customerCampaignProcedureInstanceReportRecord;
    return this;
  }

  /**
   * Get customerCampaignProcedureInstanceReportRecord
   * @return customerCampaignProcedureInstanceReportRecord
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceReportRecord1 getCustomerCampaignProcedureInstanceReportRecord() {
    return customerCampaignProcedureInstanceReportRecord;
  }

  public void setCustomerCampaignProcedureInstanceReportRecord(CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceReportRecord1 customerCampaignProcedureInstanceReportRecord) {
    this.customerCampaignProcedureInstanceReportRecord = customerCampaignProcedureInstanceReportRecord;
  }

  public InlineResponse2008 customerCampaignProcedureInstanceAnalysis(CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceAnalysis1 customerCampaignProcedureInstanceAnalysis) {
    this.customerCampaignProcedureInstanceAnalysis = customerCampaignProcedureInstanceAnalysis;
    return this;
  }

  /**
   * Get customerCampaignProcedureInstanceAnalysis
   * @return customerCampaignProcedureInstanceAnalysis
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceAnalysis1 getCustomerCampaignProcedureInstanceAnalysis() {
    return customerCampaignProcedureInstanceAnalysis;
  }

  public void setCustomerCampaignProcedureInstanceAnalysis(CRCustomerCampaignProcedureRetrieveOutputModelCustomerCampaignProcedureInstanceAnalysis1 customerCampaignProcedureInstanceAnalysis) {
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
    InlineResponse2008 inlineResponse2008 = (InlineResponse2008) o;
    return Objects.equals(this.customerCampaignProcedureInstanceRecord, inlineResponse2008.customerCampaignProcedureInstanceRecord) &&
        Objects.equals(this.customerCampaignProcedureRetrieveActionTaskReference, inlineResponse2008.customerCampaignProcedureRetrieveActionTaskReference) &&
        Objects.equals(this.customerCampaignProcedureRetrieveActionTaskRecord, inlineResponse2008.customerCampaignProcedureRetrieveActionTaskRecord) &&
        Objects.equals(this.customerCampaignProcedureRetrieveActionResponse, inlineResponse2008.customerCampaignProcedureRetrieveActionResponse) &&
        Objects.equals(this.customerCampaignProcedureInstanceReportRecord, inlineResponse2008.customerCampaignProcedureInstanceReportRecord) &&
        Objects.equals(this.customerCampaignProcedureInstanceAnalysis, inlineResponse2008.customerCampaignProcedureInstanceAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCampaignProcedureInstanceRecord, customerCampaignProcedureRetrieveActionTaskReference, customerCampaignProcedureRetrieveActionTaskRecord, customerCampaignProcedureRetrieveActionResponse, customerCampaignProcedureInstanceReportRecord, customerCampaignProcedureInstanceAnalysis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2008 {\n");
    
    sb.append("    customerCampaignProcedureInstanceRecord: ").append(toIndentedString(customerCampaignProcedureInstanceRecord)).append("\n");
    sb.append("    customerCampaignProcedureRetrieveActionTaskReference: ").append(toIndentedString(customerCampaignProcedureRetrieveActionTaskReference)).append("\n");
    sb.append("    customerCampaignProcedureRetrieveActionTaskRecord: ").append(toIndentedString(customerCampaignProcedureRetrieveActionTaskRecord)).append("\n");
    sb.append("    customerCampaignProcedureRetrieveActionResponse: ").append(toIndentedString(customerCampaignProcedureRetrieveActionResponse)).append("\n");
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
