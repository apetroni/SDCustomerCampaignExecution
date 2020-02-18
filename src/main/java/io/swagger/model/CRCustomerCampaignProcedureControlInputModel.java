package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidcontrolCustomerCampaignProcedureControlActionRequest;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CRCustomerCampaignProcedureControlInputModel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class CRCustomerCampaignProcedureControlInputModel   {
  @JsonProperty("customerCampaignExecutionServicingSessionReference")
  private String customerCampaignExecutionServicingSessionReference = null;

  @JsonProperty("customerCampaignProcedureInstanceReference")
  private String customerCampaignProcedureInstanceReference = null;

  @JsonProperty("customerCampaignProcedureControlActionTaskRecord")
  private Object customerCampaignProcedureControlActionTaskRecord = null;

  @JsonProperty("customerCampaignProcedureControlActionRequest")
  private CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidcontrolCustomerCampaignProcedureControlActionRequest customerCampaignProcedureControlActionRequest = null;

  public CRCustomerCampaignProcedureControlInputModel customerCampaignExecutionServicingSessionReference(String customerCampaignExecutionServicingSessionReference) {
    this.customerCampaignExecutionServicingSessionReference = customerCampaignExecutionServicingSessionReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return customerCampaignExecutionServicingSessionReference
  **/
  @ApiModelProperty(example = "CCESSR776804", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session ")
  
    public String getCustomerCampaignExecutionServicingSessionReference() {
    return customerCampaignExecutionServicingSessionReference;
  }

  public void setCustomerCampaignExecutionServicingSessionReference(String customerCampaignExecutionServicingSessionReference) {
    this.customerCampaignExecutionServicingSessionReference = customerCampaignExecutionServicingSessionReference;
  }

  public CRCustomerCampaignProcedureControlInputModel customerCampaignProcedureInstanceReference(String customerCampaignProcedureInstanceReference) {
    this.customerCampaignProcedureInstanceReference = customerCampaignProcedureInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Campaign Procedure instance 
   * @return customerCampaignProcedureInstanceReference
  **/
  @ApiModelProperty(example = "CCPIR789093", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Campaign Procedure instance ")
  
    public String getCustomerCampaignProcedureInstanceReference() {
    return customerCampaignProcedureInstanceReference;
  }

  public void setCustomerCampaignProcedureInstanceReference(String customerCampaignProcedureInstanceReference) {
    this.customerCampaignProcedureInstanceReference = customerCampaignProcedureInstanceReference;
  }

  public CRCustomerCampaignProcedureControlInputModel customerCampaignProcedureControlActionTaskRecord(Object customerCampaignProcedureControlActionTaskRecord) {
    this.customerCampaignProcedureControlActionTaskRecord = customerCampaignProcedureControlActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return customerCampaignProcedureControlActionTaskRecord
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record ")
  
    public Object getCustomerCampaignProcedureControlActionTaskRecord() {
    return customerCampaignProcedureControlActionTaskRecord;
  }

  public void setCustomerCampaignProcedureControlActionTaskRecord(Object customerCampaignProcedureControlActionTaskRecord) {
    this.customerCampaignProcedureControlActionTaskRecord = customerCampaignProcedureControlActionTaskRecord;
  }

  public CRCustomerCampaignProcedureControlInputModel customerCampaignProcedureControlActionRequest(CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidcontrolCustomerCampaignProcedureControlActionRequest customerCampaignProcedureControlActionRequest) {
    this.customerCampaignProcedureControlActionRequest = customerCampaignProcedureControlActionRequest;
    return this;
  }

  /**
   * Get customerCampaignProcedureControlActionRequest
   * @return customerCampaignProcedureControlActionRequest
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidcontrolCustomerCampaignProcedureControlActionRequest getCustomerCampaignProcedureControlActionRequest() {
    return customerCampaignProcedureControlActionRequest;
  }

  public void setCustomerCampaignProcedureControlActionRequest(CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidcontrolCustomerCampaignProcedureControlActionRequest customerCampaignProcedureControlActionRequest) {
    this.customerCampaignProcedureControlActionRequest = customerCampaignProcedureControlActionRequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CRCustomerCampaignProcedureControlInputModel crCustomerCampaignProcedureControlInputModel = (CRCustomerCampaignProcedureControlInputModel) o;
    return Objects.equals(this.customerCampaignExecutionServicingSessionReference, crCustomerCampaignProcedureControlInputModel.customerCampaignExecutionServicingSessionReference) &&
        Objects.equals(this.customerCampaignProcedureInstanceReference, crCustomerCampaignProcedureControlInputModel.customerCampaignProcedureInstanceReference) &&
        Objects.equals(this.customerCampaignProcedureControlActionTaskRecord, crCustomerCampaignProcedureControlInputModel.customerCampaignProcedureControlActionTaskRecord) &&
        Objects.equals(this.customerCampaignProcedureControlActionRequest, crCustomerCampaignProcedureControlInputModel.customerCampaignProcedureControlActionRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCampaignExecutionServicingSessionReference, customerCampaignProcedureInstanceReference, customerCampaignProcedureControlActionTaskRecord, customerCampaignProcedureControlActionRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CRCustomerCampaignProcedureControlInputModel {\n");
    
    sb.append("    customerCampaignExecutionServicingSessionReference: ").append(toIndentedString(customerCampaignExecutionServicingSessionReference)).append("\n");
    sb.append("    customerCampaignProcedureInstanceReference: ").append(toIndentedString(customerCampaignProcedureInstanceReference)).append("\n");
    sb.append("    customerCampaignProcedureControlActionTaskRecord: ").append(toIndentedString(customerCampaignProcedureControlActionTaskRecord)).append("\n");
    sb.append("    customerCampaignProcedureControlActionRequest: ").append(toIndentedString(customerCampaignProcedureControlActionRequest)).append("\n");
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
