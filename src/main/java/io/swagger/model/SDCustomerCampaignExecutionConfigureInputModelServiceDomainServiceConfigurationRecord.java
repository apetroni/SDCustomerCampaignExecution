package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CustomercampaignexecutionsdreferenceidconfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceAgreement;
import io.swagger.model.CustomercampaignexecutionsdreferenceidconfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup;
import io.swagger.model.CustomercampaignexecutionsdreferenceidconfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceSubscription;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SDCustomerCampaignExecutionConfigureInputModelServiceDomainServiceConfigurationRecord
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class SDCustomerCampaignExecutionConfigureInputModelServiceDomainServiceConfigurationRecord   {
  @JsonProperty("serviceDomainServiceConfigurationSettingReference")
  private String serviceDomainServiceConfigurationSettingReference = null;

  @JsonProperty("serviceDomainServiceConfigurationSettingType")
  private String serviceDomainServiceConfigurationSettingType = null;

  @JsonProperty("serviceDomainServiceConfigurationSetup")
  private CustomercampaignexecutionsdreferenceidconfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup serviceDomainServiceConfigurationSetup = null;

  @JsonProperty("serviceDomainServiceSubscription")
  private CustomercampaignexecutionsdreferenceidconfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceSubscription serviceDomainServiceSubscription = null;

  @JsonProperty("serviceDomainServiceAgreement")
  private CustomercampaignexecutionsdreferenceidconfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceAgreement serviceDomainServiceAgreement = null;

  public SDCustomerCampaignExecutionConfigureInputModelServiceDomainServiceConfigurationRecord serviceDomainServiceConfigurationSettingReference(String serviceDomainServiceConfigurationSettingReference) {
    this.serviceDomainServiceConfigurationSettingReference = serviceDomainServiceConfigurationSettingReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return serviceDomainServiceConfigurationSettingReference
  **/
  @ApiModelProperty(example = "710630", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service ")
  
    public String getServiceDomainServiceConfigurationSettingReference() {
    return serviceDomainServiceConfigurationSettingReference;
  }

  public void setServiceDomainServiceConfigurationSettingReference(String serviceDomainServiceConfigurationSettingReference) {
    this.serviceDomainServiceConfigurationSettingReference = serviceDomainServiceConfigurationSettingReference;
  }

  public SDCustomerCampaignExecutionConfigureInputModelServiceDomainServiceConfigurationRecord serviceDomainServiceConfigurationSettingType(String serviceDomainServiceConfigurationSettingType) {
    this.serviceDomainServiceConfigurationSettingType = serviceDomainServiceConfigurationSettingType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return serviceDomainServiceConfigurationSettingType
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter ")
  
    public String getServiceDomainServiceConfigurationSettingType() {
    return serviceDomainServiceConfigurationSettingType;
  }

  public void setServiceDomainServiceConfigurationSettingType(String serviceDomainServiceConfigurationSettingType) {
    this.serviceDomainServiceConfigurationSettingType = serviceDomainServiceConfigurationSettingType;
  }

  public SDCustomerCampaignExecutionConfigureInputModelServiceDomainServiceConfigurationRecord serviceDomainServiceConfigurationSetup(CustomercampaignexecutionsdreferenceidconfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup serviceDomainServiceConfigurationSetup) {
    this.serviceDomainServiceConfigurationSetup = serviceDomainServiceConfigurationSetup;
    return this;
  }

  /**
   * Get serviceDomainServiceConfigurationSetup
   * @return serviceDomainServiceConfigurationSetup
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CustomercampaignexecutionsdreferenceidconfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup getServiceDomainServiceConfigurationSetup() {
    return serviceDomainServiceConfigurationSetup;
  }

  public void setServiceDomainServiceConfigurationSetup(CustomercampaignexecutionsdreferenceidconfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup serviceDomainServiceConfigurationSetup) {
    this.serviceDomainServiceConfigurationSetup = serviceDomainServiceConfigurationSetup;
  }

  public SDCustomerCampaignExecutionConfigureInputModelServiceDomainServiceConfigurationRecord serviceDomainServiceSubscription(CustomercampaignexecutionsdreferenceidconfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceSubscription serviceDomainServiceSubscription) {
    this.serviceDomainServiceSubscription = serviceDomainServiceSubscription;
    return this;
  }

  /**
   * Get serviceDomainServiceSubscription
   * @return serviceDomainServiceSubscription
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CustomercampaignexecutionsdreferenceidconfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceSubscription getServiceDomainServiceSubscription() {
    return serviceDomainServiceSubscription;
  }

  public void setServiceDomainServiceSubscription(CustomercampaignexecutionsdreferenceidconfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceSubscription serviceDomainServiceSubscription) {
    this.serviceDomainServiceSubscription = serviceDomainServiceSubscription;
  }

  public SDCustomerCampaignExecutionConfigureInputModelServiceDomainServiceConfigurationRecord serviceDomainServiceAgreement(CustomercampaignexecutionsdreferenceidconfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceAgreement serviceDomainServiceAgreement) {
    this.serviceDomainServiceAgreement = serviceDomainServiceAgreement;
    return this;
  }

  /**
   * Get serviceDomainServiceAgreement
   * @return serviceDomainServiceAgreement
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CustomercampaignexecutionsdreferenceidconfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceAgreement getServiceDomainServiceAgreement() {
    return serviceDomainServiceAgreement;
  }

  public void setServiceDomainServiceAgreement(CustomercampaignexecutionsdreferenceidconfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceAgreement serviceDomainServiceAgreement) {
    this.serviceDomainServiceAgreement = serviceDomainServiceAgreement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SDCustomerCampaignExecutionConfigureInputModelServiceDomainServiceConfigurationRecord sdCustomerCampaignExecutionConfigureInputModelServiceDomainServiceConfigurationRecord = (SDCustomerCampaignExecutionConfigureInputModelServiceDomainServiceConfigurationRecord) o;
    return Objects.equals(this.serviceDomainServiceConfigurationSettingReference, sdCustomerCampaignExecutionConfigureInputModelServiceDomainServiceConfigurationRecord.serviceDomainServiceConfigurationSettingReference) &&
        Objects.equals(this.serviceDomainServiceConfigurationSettingType, sdCustomerCampaignExecutionConfigureInputModelServiceDomainServiceConfigurationRecord.serviceDomainServiceConfigurationSettingType) &&
        Objects.equals(this.serviceDomainServiceConfigurationSetup, sdCustomerCampaignExecutionConfigureInputModelServiceDomainServiceConfigurationRecord.serviceDomainServiceConfigurationSetup) &&
        Objects.equals(this.serviceDomainServiceSubscription, sdCustomerCampaignExecutionConfigureInputModelServiceDomainServiceConfigurationRecord.serviceDomainServiceSubscription) &&
        Objects.equals(this.serviceDomainServiceAgreement, sdCustomerCampaignExecutionConfigureInputModelServiceDomainServiceConfigurationRecord.serviceDomainServiceAgreement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDomainServiceConfigurationSettingReference, serviceDomainServiceConfigurationSettingType, serviceDomainServiceConfigurationSetup, serviceDomainServiceSubscription, serviceDomainServiceAgreement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDCustomerCampaignExecutionConfigureInputModelServiceDomainServiceConfigurationRecord {\n");
    
    sb.append("    serviceDomainServiceConfigurationSettingReference: ").append(toIndentedString(serviceDomainServiceConfigurationSettingReference)).append("\n");
    sb.append("    serviceDomainServiceConfigurationSettingType: ").append(toIndentedString(serviceDomainServiceConfigurationSettingType)).append("\n");
    sb.append("    serviceDomainServiceConfigurationSetup: ").append(toIndentedString(serviceDomainServiceConfigurationSetup)).append("\n");
    sb.append("    serviceDomainServiceSubscription: ").append(toIndentedString(serviceDomainServiceSubscription)).append("\n");
    sb.append("    serviceDomainServiceAgreement: ").append(toIndentedString(serviceDomainServiceAgreement)).append("\n");
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
