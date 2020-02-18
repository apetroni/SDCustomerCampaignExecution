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
 * SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainOfferedService1ServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainOfferedService1ServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines   {
  @JsonProperty("serviceDomainServiceEligibility")
  private String serviceDomainServiceEligibility = null;

  @JsonProperty("serviceDomainServiceIntendedUses")
  private String serviceDomainServiceIntendedUses = null;

  @JsonProperty("serviceDomainServicePricingandTerms")
  private String serviceDomainServicePricingandTerms = null;

  public SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainOfferedService1ServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines serviceDomainServiceEligibility(String serviceDomainServiceEligibility) {
    this.serviceDomainServiceEligibility = serviceDomainServiceEligibility;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return serviceDomainServiceEligibility
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications ")
  
    public String getServiceDomainServiceEligibility() {
    return serviceDomainServiceEligibility;
  }

  public void setServiceDomainServiceEligibility(String serviceDomainServiceEligibility) {
    this.serviceDomainServiceEligibility = serviceDomainServiceEligibility;
  }

  public SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainOfferedService1ServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines serviceDomainServiceIntendedUses(String serviceDomainServiceIntendedUses) {
    this.serviceDomainServiceIntendedUses = serviceDomainServiceIntendedUses;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return serviceDomainServiceIntendedUses
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service ")
  
    public String getServiceDomainServiceIntendedUses() {
    return serviceDomainServiceIntendedUses;
  }

  public void setServiceDomainServiceIntendedUses(String serviceDomainServiceIntendedUses) {
    this.serviceDomainServiceIntendedUses = serviceDomainServiceIntendedUses;
  }

  public SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainOfferedService1ServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines serviceDomainServicePricingandTerms(String serviceDomainServicePricingandTerms) {
    this.serviceDomainServicePricingandTerms = serviceDomainServicePricingandTerms;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return serviceDomainServicePricingandTerms
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service ")
  
    public String getServiceDomainServicePricingandTerms() {
    return serviceDomainServicePricingandTerms;
  }

  public void setServiceDomainServicePricingandTerms(String serviceDomainServicePricingandTerms) {
    this.serviceDomainServicePricingandTerms = serviceDomainServicePricingandTerms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainOfferedService1ServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines sdCustomerCampaignExecutionRetrieveOutputModelServiceDomainOfferedService1ServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines = (SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainOfferedService1ServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines) o;
    return Objects.equals(this.serviceDomainServiceEligibility, sdCustomerCampaignExecutionRetrieveOutputModelServiceDomainOfferedService1ServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines.serviceDomainServiceEligibility) &&
        Objects.equals(this.serviceDomainServiceIntendedUses, sdCustomerCampaignExecutionRetrieveOutputModelServiceDomainOfferedService1ServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines.serviceDomainServiceIntendedUses) &&
        Objects.equals(this.serviceDomainServicePricingandTerms, sdCustomerCampaignExecutionRetrieveOutputModelServiceDomainOfferedService1ServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines.serviceDomainServicePricingandTerms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDomainServiceEligibility, serviceDomainServiceIntendedUses, serviceDomainServicePricingandTerms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainOfferedService1ServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines {\n");
    
    sb.append("    serviceDomainServiceEligibility: ").append(toIndentedString(serviceDomainServiceEligibility)).append("\n");
    sb.append("    serviceDomainServiceIntendedUses: ").append(toIndentedString(serviceDomainServiceIntendedUses)).append("\n");
    sb.append("    serviceDomainServicePricingandTerms: ").append(toIndentedString(serviceDomainServicePricingandTerms)).append("\n");
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
