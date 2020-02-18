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
 * CRCustomerCampaignProcedureExchangeOutputModel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class CRCustomerCampaignProcedureExchangeOutputModel   {
  @JsonProperty("customerCampaignProcedureExchangeActionTaskReference")
  private String customerCampaignProcedureExchangeActionTaskReference = null;

  @JsonProperty("customerCampaignProcedureExchangeActionTaskRecord")
  private Object customerCampaignProcedureExchangeActionTaskRecord = null;

  @JsonProperty("customerCampaignProcedureExchangeActionResponse")
  private String customerCampaignProcedureExchangeActionResponse = null;

  public CRCustomerCampaignProcedureExchangeOutputModel customerCampaignProcedureExchangeActionTaskReference(String customerCampaignProcedureExchangeActionTaskReference) {
    this.customerCampaignProcedureExchangeActionTaskReference = customerCampaignProcedureExchangeActionTaskReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Campaign Procedure instance exchange service call 
   * @return customerCampaignProcedureExchangeActionTaskReference
  **/
  @ApiModelProperty(example = "CCPEATR792588", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Campaign Procedure instance exchange service call ")
  
    public String getCustomerCampaignProcedureExchangeActionTaskReference() {
    return customerCampaignProcedureExchangeActionTaskReference;
  }

  public void setCustomerCampaignProcedureExchangeActionTaskReference(String customerCampaignProcedureExchangeActionTaskReference) {
    this.customerCampaignProcedureExchangeActionTaskReference = customerCampaignProcedureExchangeActionTaskReference;
  }

  public CRCustomerCampaignProcedureExchangeOutputModel customerCampaignProcedureExchangeActionTaskRecord(Object customerCampaignProcedureExchangeActionTaskRecord) {
    this.customerCampaignProcedureExchangeActionTaskRecord = customerCampaignProcedureExchangeActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return customerCampaignProcedureExchangeActionTaskRecord
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record ")
  
    public Object getCustomerCampaignProcedureExchangeActionTaskRecord() {
    return customerCampaignProcedureExchangeActionTaskRecord;
  }

  public void setCustomerCampaignProcedureExchangeActionTaskRecord(Object customerCampaignProcedureExchangeActionTaskRecord) {
    this.customerCampaignProcedureExchangeActionTaskRecord = customerCampaignProcedureExchangeActionTaskRecord;
  }

  public CRCustomerCampaignProcedureExchangeOutputModel customerCampaignProcedureExchangeActionResponse(String customerCampaignProcedureExchangeActionResponse) {
    this.customerCampaignProcedureExchangeActionResponse = customerCampaignProcedureExchangeActionResponse;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return customerCampaignProcedureExchangeActionResponse
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response ")
  
    public String getCustomerCampaignProcedureExchangeActionResponse() {
    return customerCampaignProcedureExchangeActionResponse;
  }

  public void setCustomerCampaignProcedureExchangeActionResponse(String customerCampaignProcedureExchangeActionResponse) {
    this.customerCampaignProcedureExchangeActionResponse = customerCampaignProcedureExchangeActionResponse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CRCustomerCampaignProcedureExchangeOutputModel crCustomerCampaignProcedureExchangeOutputModel = (CRCustomerCampaignProcedureExchangeOutputModel) o;
    return Objects.equals(this.customerCampaignProcedureExchangeActionTaskReference, crCustomerCampaignProcedureExchangeOutputModel.customerCampaignProcedureExchangeActionTaskReference) &&
        Objects.equals(this.customerCampaignProcedureExchangeActionTaskRecord, crCustomerCampaignProcedureExchangeOutputModel.customerCampaignProcedureExchangeActionTaskRecord) &&
        Objects.equals(this.customerCampaignProcedureExchangeActionResponse, crCustomerCampaignProcedureExchangeOutputModel.customerCampaignProcedureExchangeActionResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCampaignProcedureExchangeActionTaskReference, customerCampaignProcedureExchangeActionTaskRecord, customerCampaignProcedureExchangeActionResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CRCustomerCampaignProcedureExchangeOutputModel {\n");
    
    sb.append("    customerCampaignProcedureExchangeActionTaskReference: ").append(toIndentedString(customerCampaignProcedureExchangeActionTaskReference)).append("\n");
    sb.append("    customerCampaignProcedureExchangeActionTaskRecord: ").append(toIndentedString(customerCampaignProcedureExchangeActionTaskRecord)).append("\n");
    sb.append("    customerCampaignProcedureExchangeActionResponse: ").append(toIndentedString(customerCampaignProcedureExchangeActionResponse)).append("\n");
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
