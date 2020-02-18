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
 * SDCustomerCampaignExecutionActivateOutputModelServiceDomainServiceConfigurationRecord1ServiceDomainServiceSubscription
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class SDCustomerCampaignExecutionActivateOutputModelServiceDomainServiceConfigurationRecord1ServiceDomainServiceSubscription   {
  @JsonProperty("serviceDomainServiceSubscriberReference")
  private String serviceDomainServiceSubscriberReference = null;

  @JsonProperty("serviceDomainServiceSubscriberAccessProfile")
  private String serviceDomainServiceSubscriberAccessProfile = null;

  public SDCustomerCampaignExecutionActivateOutputModelServiceDomainServiceConfigurationRecord1ServiceDomainServiceSubscription serviceDomainServiceSubscriberReference(String serviceDomainServiceSubscriberReference) {
    this.serviceDomainServiceSubscriberReference = serviceDomainServiceSubscriberReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party 
   * @return serviceDomainServiceSubscriberReference
  **/
  @ApiModelProperty(example = "769192", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party ")
  
    public String getServiceDomainServiceSubscriberReference() {
    return serviceDomainServiceSubscriberReference;
  }

  public void setServiceDomainServiceSubscriberReference(String serviceDomainServiceSubscriberReference) {
    this.serviceDomainServiceSubscriberReference = serviceDomainServiceSubscriberReference;
  }

  public SDCustomerCampaignExecutionActivateOutputModelServiceDomainServiceConfigurationRecord1ServiceDomainServiceSubscription serviceDomainServiceSubscriberAccessProfile(String serviceDomainServiceSubscriberAccessProfile) {
    this.serviceDomainServiceSubscriberAccessProfile = serviceDomainServiceSubscriberAccessProfile;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party 
   * @return serviceDomainServiceSubscriberAccessProfile
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party ")
  
    public String getServiceDomainServiceSubscriberAccessProfile() {
    return serviceDomainServiceSubscriberAccessProfile;
  }

  public void setServiceDomainServiceSubscriberAccessProfile(String serviceDomainServiceSubscriberAccessProfile) {
    this.serviceDomainServiceSubscriberAccessProfile = serviceDomainServiceSubscriberAccessProfile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SDCustomerCampaignExecutionActivateOutputModelServiceDomainServiceConfigurationRecord1ServiceDomainServiceSubscription sdCustomerCampaignExecutionActivateOutputModelServiceDomainServiceConfigurationRecord1ServiceDomainServiceSubscription = (SDCustomerCampaignExecutionActivateOutputModelServiceDomainServiceConfigurationRecord1ServiceDomainServiceSubscription) o;
    return Objects.equals(this.serviceDomainServiceSubscriberReference, sdCustomerCampaignExecutionActivateOutputModelServiceDomainServiceConfigurationRecord1ServiceDomainServiceSubscription.serviceDomainServiceSubscriberReference) &&
        Objects.equals(this.serviceDomainServiceSubscriberAccessProfile, sdCustomerCampaignExecutionActivateOutputModelServiceDomainServiceConfigurationRecord1ServiceDomainServiceSubscription.serviceDomainServiceSubscriberAccessProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDomainServiceSubscriberReference, serviceDomainServiceSubscriberAccessProfile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDCustomerCampaignExecutionActivateOutputModelServiceDomainServiceConfigurationRecord1ServiceDomainServiceSubscription {\n");
    
    sb.append("    serviceDomainServiceSubscriberReference: ").append(toIndentedString(serviceDomainServiceSubscriberReference)).append("\n");
    sb.append("    serviceDomainServiceSubscriberAccessProfile: ").append(toIndentedString(serviceDomainServiceSubscriberAccessProfile)).append("\n");
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
