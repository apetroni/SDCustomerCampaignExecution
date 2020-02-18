package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CustomercampaignexecutionactivationServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SDCustomerCampaignExecutionActivateInputModelServiceDomainServiceConfigurationRecord
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class SDCustomerCampaignExecutionActivateInputModelServiceDomainServiceConfigurationRecord   {
  @JsonProperty("serviceDomainServiceConfigurationSettingReference")
  private String serviceDomainServiceConfigurationSettingReference = null;

  @JsonProperty("serviceDomainServiceConfigurationSettingType")
  private String serviceDomainServiceConfigurationSettingType = null;

  @JsonProperty("serviceDomainServiceConfigurationSetup")
  private CustomercampaignexecutionactivationServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup serviceDomainServiceConfigurationSetup = null;

  public SDCustomerCampaignExecutionActivateInputModelServiceDomainServiceConfigurationRecord serviceDomainServiceConfigurationSettingReference(String serviceDomainServiceConfigurationSettingReference) {
    this.serviceDomainServiceConfigurationSettingReference = serviceDomainServiceConfigurationSettingReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return serviceDomainServiceConfigurationSettingReference
  **/
  @ApiModelProperty(example = "700761", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service ")
  
    public String getServiceDomainServiceConfigurationSettingReference() {
    return serviceDomainServiceConfigurationSettingReference;
  }

  public void setServiceDomainServiceConfigurationSettingReference(String serviceDomainServiceConfigurationSettingReference) {
    this.serviceDomainServiceConfigurationSettingReference = serviceDomainServiceConfigurationSettingReference;
  }

  public SDCustomerCampaignExecutionActivateInputModelServiceDomainServiceConfigurationRecord serviceDomainServiceConfigurationSettingType(String serviceDomainServiceConfigurationSettingType) {
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

  public SDCustomerCampaignExecutionActivateInputModelServiceDomainServiceConfigurationRecord serviceDomainServiceConfigurationSetup(CustomercampaignexecutionactivationServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup serviceDomainServiceConfigurationSetup) {
    this.serviceDomainServiceConfigurationSetup = serviceDomainServiceConfigurationSetup;
    return this;
  }

  /**
   * Get serviceDomainServiceConfigurationSetup
   * @return serviceDomainServiceConfigurationSetup
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CustomercampaignexecutionactivationServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup getServiceDomainServiceConfigurationSetup() {
    return serviceDomainServiceConfigurationSetup;
  }

  public void setServiceDomainServiceConfigurationSetup(CustomercampaignexecutionactivationServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup serviceDomainServiceConfigurationSetup) {
    this.serviceDomainServiceConfigurationSetup = serviceDomainServiceConfigurationSetup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SDCustomerCampaignExecutionActivateInputModelServiceDomainServiceConfigurationRecord sdCustomerCampaignExecutionActivateInputModelServiceDomainServiceConfigurationRecord = (SDCustomerCampaignExecutionActivateInputModelServiceDomainServiceConfigurationRecord) o;
    return Objects.equals(this.serviceDomainServiceConfigurationSettingReference, sdCustomerCampaignExecutionActivateInputModelServiceDomainServiceConfigurationRecord.serviceDomainServiceConfigurationSettingReference) &&
        Objects.equals(this.serviceDomainServiceConfigurationSettingType, sdCustomerCampaignExecutionActivateInputModelServiceDomainServiceConfigurationRecord.serviceDomainServiceConfigurationSettingType) &&
        Objects.equals(this.serviceDomainServiceConfigurationSetup, sdCustomerCampaignExecutionActivateInputModelServiceDomainServiceConfigurationRecord.serviceDomainServiceConfigurationSetup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDomainServiceConfigurationSettingReference, serviceDomainServiceConfigurationSettingType, serviceDomainServiceConfigurationSetup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDCustomerCampaignExecutionActivateInputModelServiceDomainServiceConfigurationRecord {\n");
    
    sb.append("    serviceDomainServiceConfigurationSettingReference: ").append(toIndentedString(serviceDomainServiceConfigurationSettingReference)).append("\n");
    sb.append("    serviceDomainServiceConfigurationSettingType: ").append(toIndentedString(serviceDomainServiceConfigurationSettingType)).append("\n");
    sb.append("    serviceDomainServiceConfigurationSetup: ").append(toIndentedString(serviceDomainServiceConfigurationSetup)).append("\n");
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
