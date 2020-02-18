package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexchangeCustomerCampaignProcedureExchangeActionRequest;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Body6
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class Body6   {
  @JsonProperty("customerCampaignExecutionServicingSessionReference")
  private String customerCampaignExecutionServicingSessionReference = null;

  @JsonProperty("customerCampaignProcedureInstanceReference")
  private String customerCampaignProcedureInstanceReference = null;

  @JsonProperty("customerCampaignProcedureExchangeActionTaskRecord")
  private Object customerCampaignProcedureExchangeActionTaskRecord = null;

  @JsonProperty("customerCampaignProcedureExchangeActionRequest")
  private CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexchangeCustomerCampaignProcedureExchangeActionRequest customerCampaignProcedureExchangeActionRequest = null;

  public Body6 customerCampaignExecutionServicingSessionReference(String customerCampaignExecutionServicingSessionReference) {
    this.customerCampaignExecutionServicingSessionReference = customerCampaignExecutionServicingSessionReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return customerCampaignExecutionServicingSessionReference
  **/
  @ApiModelProperty(example = "CCESSR712540", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session ")
  
    public String getCustomerCampaignExecutionServicingSessionReference() {
    return customerCampaignExecutionServicingSessionReference;
  }

  public void setCustomerCampaignExecutionServicingSessionReference(String customerCampaignExecutionServicingSessionReference) {
    this.customerCampaignExecutionServicingSessionReference = customerCampaignExecutionServicingSessionReference;
  }

  public Body6 customerCampaignProcedureInstanceReference(String customerCampaignProcedureInstanceReference) {
    this.customerCampaignProcedureInstanceReference = customerCampaignProcedureInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Campaign Procedure instance 
   * @return customerCampaignProcedureInstanceReference
  **/
  @ApiModelProperty(example = "CCPIR733616", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Campaign Procedure instance ")
  
    public String getCustomerCampaignProcedureInstanceReference() {
    return customerCampaignProcedureInstanceReference;
  }

  public void setCustomerCampaignProcedureInstanceReference(String customerCampaignProcedureInstanceReference) {
    this.customerCampaignProcedureInstanceReference = customerCampaignProcedureInstanceReference;
  }

  public Body6 customerCampaignProcedureExchangeActionTaskRecord(Object customerCampaignProcedureExchangeActionTaskRecord) {
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

  public Body6 customerCampaignProcedureExchangeActionRequest(CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexchangeCustomerCampaignProcedureExchangeActionRequest customerCampaignProcedureExchangeActionRequest) {
    this.customerCampaignProcedureExchangeActionRequest = customerCampaignProcedureExchangeActionRequest;
    return this;
  }

  /**
   * Get customerCampaignProcedureExchangeActionRequest
   * @return customerCampaignProcedureExchangeActionRequest
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexchangeCustomerCampaignProcedureExchangeActionRequest getCustomerCampaignProcedureExchangeActionRequest() {
    return customerCampaignProcedureExchangeActionRequest;
  }

  public void setCustomerCampaignProcedureExchangeActionRequest(CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidexchangeCustomerCampaignProcedureExchangeActionRequest customerCampaignProcedureExchangeActionRequest) {
    this.customerCampaignProcedureExchangeActionRequest = customerCampaignProcedureExchangeActionRequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body6 body6 = (Body6) o;
    return Objects.equals(this.customerCampaignExecutionServicingSessionReference, body6.customerCampaignExecutionServicingSessionReference) &&
        Objects.equals(this.customerCampaignProcedureInstanceReference, body6.customerCampaignProcedureInstanceReference) &&
        Objects.equals(this.customerCampaignProcedureExchangeActionTaskRecord, body6.customerCampaignProcedureExchangeActionTaskRecord) &&
        Objects.equals(this.customerCampaignProcedureExchangeActionRequest, body6.customerCampaignProcedureExchangeActionRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCampaignExecutionServicingSessionReference, customerCampaignProcedureInstanceReference, customerCampaignProcedureExchangeActionTaskRecord, customerCampaignProcedureExchangeActionRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body6 {\n");
    
    sb.append("    customerCampaignExecutionServicingSessionReference: ").append(toIndentedString(customerCampaignExecutionServicingSessionReference)).append("\n");
    sb.append("    customerCampaignProcedureInstanceReference: ").append(toIndentedString(customerCampaignProcedureInstanceReference)).append("\n");
    sb.append("    customerCampaignProcedureExchangeActionTaskRecord: ").append(toIndentedString(customerCampaignProcedureExchangeActionTaskRecord)).append("\n");
    sb.append("    customerCampaignProcedureExchangeActionRequest: ").append(toIndentedString(customerCampaignProcedureExchangeActionRequest)).append("\n");
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
