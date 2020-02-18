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
 * BQExecutionUpdateOutputModelCustomerCampaignProcedureInstanceRecordCustomerCampaignProcedureResult
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class BQExecutionUpdateOutputModelCustomerCampaignProcedureInstanceRecordCustomerCampaignProcedureResult   {
  @JsonProperty("customerCampaignProcedureLeadOpportunityDescription")
  private String customerCampaignProcedureLeadOpportunityDescription = null;

  @JsonProperty("leadOpportunityProcedureInstanceReference")
  private String leadOpportunityProcedureInstanceReference = null;

  public BQExecutionUpdateOutputModelCustomerCampaignProcedureInstanceRecordCustomerCampaignProcedureResult customerCampaignProcedureLeadOpportunityDescription(String customerCampaignProcedureLeadOpportunityDescription) {
    this.customerCampaignProcedureLeadOpportunityDescription = customerCampaignProcedureLeadOpportunityDescription;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A description of leads and opportunities generated by the customer campaign 
   * @return customerCampaignProcedureLeadOpportunityDescription
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A description of leads and opportunities generated by the customer campaign ")
  
    public String getCustomerCampaignProcedureLeadOpportunityDescription() {
    return customerCampaignProcedureLeadOpportunityDescription;
  }

  public void setCustomerCampaignProcedureLeadOpportunityDescription(String customerCampaignProcedureLeadOpportunityDescription) {
    this.customerCampaignProcedureLeadOpportunityDescription = customerCampaignProcedureLeadOpportunityDescription;
  }

  public BQExecutionUpdateOutputModelCustomerCampaignProcedureInstanceRecordCustomerCampaignProcedureResult leadOpportunityProcedureInstanceReference(String leadOpportunityProcedureInstanceReference) {
    this.leadOpportunityProcedureInstanceReference = leadOpportunityProcedureInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the lead/opportunity as handled by the Lead/Opportunity Management Service Domain 
   * @return leadOpportunityProcedureInstanceReference
  **/
  @ApiModelProperty(example = "744925", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the lead/opportunity as handled by the Lead/Opportunity Management Service Domain ")
  
    public String getLeadOpportunityProcedureInstanceReference() {
    return leadOpportunityProcedureInstanceReference;
  }

  public void setLeadOpportunityProcedureInstanceReference(String leadOpportunityProcedureInstanceReference) {
    this.leadOpportunityProcedureInstanceReference = leadOpportunityProcedureInstanceReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQExecutionUpdateOutputModelCustomerCampaignProcedureInstanceRecordCustomerCampaignProcedureResult bqExecutionUpdateOutputModelCustomerCampaignProcedureInstanceRecordCustomerCampaignProcedureResult = (BQExecutionUpdateOutputModelCustomerCampaignProcedureInstanceRecordCustomerCampaignProcedureResult) o;
    return Objects.equals(this.customerCampaignProcedureLeadOpportunityDescription, bqExecutionUpdateOutputModelCustomerCampaignProcedureInstanceRecordCustomerCampaignProcedureResult.customerCampaignProcedureLeadOpportunityDescription) &&
        Objects.equals(this.leadOpportunityProcedureInstanceReference, bqExecutionUpdateOutputModelCustomerCampaignProcedureInstanceRecordCustomerCampaignProcedureResult.leadOpportunityProcedureInstanceReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCampaignProcedureLeadOpportunityDescription, leadOpportunityProcedureInstanceReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQExecutionUpdateOutputModelCustomerCampaignProcedureInstanceRecordCustomerCampaignProcedureResult {\n");
    
    sb.append("    customerCampaignProcedureLeadOpportunityDescription: ").append(toIndentedString(customerCampaignProcedureLeadOpportunityDescription)).append("\n");
    sb.append("    leadOpportunityProcedureInstanceReference: ").append(toIndentedString(leadOpportunityProcedureInstanceReference)).append("\n");
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
