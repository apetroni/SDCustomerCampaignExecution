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
 * BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceRecord1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceRecord1   {
  @JsonProperty("customerCampaignSelectionCriteria")
  private String customerCampaignSelectionCriteria = null;

  @JsonProperty("customerCampaignCandidateEmployeeBusinessUnitReference")
  private String customerCampaignCandidateEmployeeBusinessUnitReference = null;

  @JsonProperty("customerCampaignCandidateReference")
  private String customerCampaignCandidateReference = null;

  public BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceRecord1 customerCampaignSelectionCriteria(String customerCampaignSelectionCriteria) {
    this.customerCampaignSelectionCriteria = customerCampaignSelectionCriteria;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details the selection criteria used to identify candidate customers 
   * @return customerCampaignSelectionCriteria
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details the selection criteria used to identify candidate customers ")
  
    public String getCustomerCampaignSelectionCriteria() {
    return customerCampaignSelectionCriteria;
  }

  public void setCustomerCampaignSelectionCriteria(String customerCampaignSelectionCriteria) {
    this.customerCampaignSelectionCriteria = customerCampaignSelectionCriteria;
  }

  public BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceRecord1 customerCampaignCandidateEmployeeBusinessUnitReference(String customerCampaignCandidateEmployeeBusinessUnitReference) {
    this.customerCampaignCandidateEmployeeBusinessUnitReference = customerCampaignCandidateEmployeeBusinessUnitReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the employee or business unit that confirms eligibility of the candidate if appropriate (e.g. the relationship manager) 
   * @return customerCampaignCandidateEmployeeBusinessUnitReference
  **/
  @ApiModelProperty(example = "783462", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the employee or business unit that confirms eligibility of the candidate if appropriate (e.g. the relationship manager) ")
  
    public String getCustomerCampaignCandidateEmployeeBusinessUnitReference() {
    return customerCampaignCandidateEmployeeBusinessUnitReference;
  }

  public void setCustomerCampaignCandidateEmployeeBusinessUnitReference(String customerCampaignCandidateEmployeeBusinessUnitReference) {
    this.customerCampaignCandidateEmployeeBusinessUnitReference = customerCampaignCandidateEmployeeBusinessUnitReference;
  }

  public BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceRecord1 customerCampaignCandidateReference(String customerCampaignCandidateReference) {
    this.customerCampaignCandidateReference = customerCampaignCandidateReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer selected as a candidate 
   * @return customerCampaignCandidateReference
  **/
  @ApiModelProperty(example = "749125", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer selected as a candidate ")
  
    public String getCustomerCampaignCandidateReference() {
    return customerCampaignCandidateReference;
  }

  public void setCustomerCampaignCandidateReference(String customerCampaignCandidateReference) {
    this.customerCampaignCandidateReference = customerCampaignCandidateReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceRecord1 bqCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceRecord1 = (BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceRecord1) o;
    return Objects.equals(this.customerCampaignSelectionCriteria, bqCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceRecord1.customerCampaignSelectionCriteria) &&
        Objects.equals(this.customerCampaignCandidateEmployeeBusinessUnitReference, bqCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceRecord1.customerCampaignCandidateEmployeeBusinessUnitReference) &&
        Objects.equals(this.customerCampaignCandidateReference, bqCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceRecord1.customerCampaignCandidateReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCampaignSelectionCriteria, customerCampaignCandidateEmployeeBusinessUnitReference, customerCampaignCandidateReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQCandidateSelectionRetrieveOutputModelCandidateSelectionInstanceRecord1 {\n");
    
    sb.append("    customerCampaignSelectionCriteria: ").append(toIndentedString(customerCampaignSelectionCriteria)).append("\n");
    sb.append("    customerCampaignCandidateEmployeeBusinessUnitReference: ").append(toIndentedString(customerCampaignCandidateEmployeeBusinessUnitReference)).append("\n");
    sb.append("    customerCampaignCandidateReference: ").append(toIndentedString(customerCampaignCandidateReference)).append("\n");
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
