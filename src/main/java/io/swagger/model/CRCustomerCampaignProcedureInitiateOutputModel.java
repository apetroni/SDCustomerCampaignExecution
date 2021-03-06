package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CRCustomerCampaignProcedureInitiateOutputModelCustomerCampaignProcedureInstanceRecord1;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CRCustomerCampaignProcedureInitiateOutputModel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class CRCustomerCampaignProcedureInitiateOutputModel   {
  @JsonProperty("customerCampaignProcedureInstanceReference")
  private String customerCampaignProcedureInstanceReference = null;

  @JsonProperty("customerCampaignProcedureInitiateActionReference")
  private String customerCampaignProcedureInitiateActionReference = null;

  @JsonProperty("customerCampaignProcedureInitiateActionRecord")
  private Object customerCampaignProcedureInitiateActionRecord = null;

  @JsonProperty("customerCampaignProcedureInstanceStatus")
  private String customerCampaignProcedureInstanceStatus = null;

  @JsonProperty("customerCampaignProcedureInstanceRecord")
  private CRCustomerCampaignProcedureInitiateOutputModelCustomerCampaignProcedureInstanceRecord1 customerCampaignProcedureInstanceRecord = null;

  public CRCustomerCampaignProcedureInitiateOutputModel customerCampaignProcedureInstanceReference(String customerCampaignProcedureInstanceReference) {
    this.customerCampaignProcedureInstanceReference = customerCampaignProcedureInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Campaign Procedure instance 
   * @return customerCampaignProcedureInstanceReference
  **/
  @ApiModelProperty(example = "CCPIR731200", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Campaign Procedure instance ")
  
    public String getCustomerCampaignProcedureInstanceReference() {
    return customerCampaignProcedureInstanceReference;
  }

  public void setCustomerCampaignProcedureInstanceReference(String customerCampaignProcedureInstanceReference) {
    this.customerCampaignProcedureInstanceReference = customerCampaignProcedureInstanceReference;
  }

  public CRCustomerCampaignProcedureInitiateOutputModel customerCampaignProcedureInitiateActionReference(String customerCampaignProcedureInitiateActionReference) {
    this.customerCampaignProcedureInitiateActionReference = customerCampaignProcedureInitiateActionReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return customerCampaignProcedureInitiateActionReference
  **/
  @ApiModelProperty(example = "CCPIAR768266", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call ")
  
    public String getCustomerCampaignProcedureInitiateActionReference() {
    return customerCampaignProcedureInitiateActionReference;
  }

  public void setCustomerCampaignProcedureInitiateActionReference(String customerCampaignProcedureInitiateActionReference) {
    this.customerCampaignProcedureInitiateActionReference = customerCampaignProcedureInitiateActionReference;
  }

  public CRCustomerCampaignProcedureInitiateOutputModel customerCampaignProcedureInitiateActionRecord(Object customerCampaignProcedureInitiateActionRecord) {
    this.customerCampaignProcedureInitiateActionRecord = customerCampaignProcedureInitiateActionRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return customerCampaignProcedureInitiateActionRecord
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record ")
  
    public Object getCustomerCampaignProcedureInitiateActionRecord() {
    return customerCampaignProcedureInitiateActionRecord;
  }

  public void setCustomerCampaignProcedureInitiateActionRecord(Object customerCampaignProcedureInitiateActionRecord) {
    this.customerCampaignProcedureInitiateActionRecord = customerCampaignProcedureInitiateActionRecord;
  }

  public CRCustomerCampaignProcedureInitiateOutputModel customerCampaignProcedureInstanceStatus(String customerCampaignProcedureInstanceStatus) {
    this.customerCampaignProcedureInstanceStatus = customerCampaignProcedureInstanceStatus;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Customer Campaign Procedure instance (e.g. initialised, pending, active) 
   * @return customerCampaignProcedureInstanceStatus
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Customer Campaign Procedure instance (e.g. initialised, pending, active) ")
  
    public String getCustomerCampaignProcedureInstanceStatus() {
    return customerCampaignProcedureInstanceStatus;
  }

  public void setCustomerCampaignProcedureInstanceStatus(String customerCampaignProcedureInstanceStatus) {
    this.customerCampaignProcedureInstanceStatus = customerCampaignProcedureInstanceStatus;
  }

  public CRCustomerCampaignProcedureInitiateOutputModel customerCampaignProcedureInstanceRecord(CRCustomerCampaignProcedureInitiateOutputModelCustomerCampaignProcedureInstanceRecord1 customerCampaignProcedureInstanceRecord) {
    this.customerCampaignProcedureInstanceRecord = customerCampaignProcedureInstanceRecord;
    return this;
  }

  /**
   * Get customerCampaignProcedureInstanceRecord
   * @return customerCampaignProcedureInstanceRecord
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CRCustomerCampaignProcedureInitiateOutputModelCustomerCampaignProcedureInstanceRecord1 getCustomerCampaignProcedureInstanceRecord() {
    return customerCampaignProcedureInstanceRecord;
  }

  public void setCustomerCampaignProcedureInstanceRecord(CRCustomerCampaignProcedureInitiateOutputModelCustomerCampaignProcedureInstanceRecord1 customerCampaignProcedureInstanceRecord) {
    this.customerCampaignProcedureInstanceRecord = customerCampaignProcedureInstanceRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CRCustomerCampaignProcedureInitiateOutputModel crCustomerCampaignProcedureInitiateOutputModel = (CRCustomerCampaignProcedureInitiateOutputModel) o;
    return Objects.equals(this.customerCampaignProcedureInstanceReference, crCustomerCampaignProcedureInitiateOutputModel.customerCampaignProcedureInstanceReference) &&
        Objects.equals(this.customerCampaignProcedureInitiateActionReference, crCustomerCampaignProcedureInitiateOutputModel.customerCampaignProcedureInitiateActionReference) &&
        Objects.equals(this.customerCampaignProcedureInitiateActionRecord, crCustomerCampaignProcedureInitiateOutputModel.customerCampaignProcedureInitiateActionRecord) &&
        Objects.equals(this.customerCampaignProcedureInstanceStatus, crCustomerCampaignProcedureInitiateOutputModel.customerCampaignProcedureInstanceStatus) &&
        Objects.equals(this.customerCampaignProcedureInstanceRecord, crCustomerCampaignProcedureInitiateOutputModel.customerCampaignProcedureInstanceRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCampaignProcedureInstanceReference, customerCampaignProcedureInitiateActionReference, customerCampaignProcedureInitiateActionRecord, customerCampaignProcedureInstanceStatus, customerCampaignProcedureInstanceRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CRCustomerCampaignProcedureInitiateOutputModel {\n");
    
    sb.append("    customerCampaignProcedureInstanceReference: ").append(toIndentedString(customerCampaignProcedureInstanceReference)).append("\n");
    sb.append("    customerCampaignProcedureInitiateActionReference: ").append(toIndentedString(customerCampaignProcedureInitiateActionReference)).append("\n");
    sb.append("    customerCampaignProcedureInitiateActionRecord: ").append(toIndentedString(customerCampaignProcedureInitiateActionRecord)).append("\n");
    sb.append("    customerCampaignProcedureInstanceStatus: ").append(toIndentedString(customerCampaignProcedureInstanceStatus)).append("\n");
    sb.append("    customerCampaignProcedureInstanceRecord: ").append(toIndentedString(customerCampaignProcedureInstanceRecord)).append("\n");
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
