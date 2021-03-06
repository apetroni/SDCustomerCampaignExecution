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
 * CustomercampaignexecutionactivationServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class CustomercampaignexecutionactivationServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup   {
  @JsonProperty("serviceDomainServiceConfigurationParameter")
  private String serviceDomainServiceConfigurationParameter = null;

  public CustomercampaignexecutionactivationServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup serviceDomainServiceConfigurationParameter(String serviceDomainServiceConfigurationParameter) {
    this.serviceDomainServiceConfigurationParameter = serviceDomainServiceConfigurationParameter;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The default activation setting for the offered service configuration parameter  
   * @return serviceDomainServiceConfigurationParameter
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The default activation setting for the offered service configuration parameter  ")
  
    public String getServiceDomainServiceConfigurationParameter() {
    return serviceDomainServiceConfigurationParameter;
  }

  public void setServiceDomainServiceConfigurationParameter(String serviceDomainServiceConfigurationParameter) {
    this.serviceDomainServiceConfigurationParameter = serviceDomainServiceConfigurationParameter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomercampaignexecutionactivationServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup customercampaignexecutionactivationServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup = (CustomercampaignexecutionactivationServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup) o;
    return Objects.equals(this.serviceDomainServiceConfigurationParameter, customercampaignexecutionactivationServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup.serviceDomainServiceConfigurationParameter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDomainServiceConfigurationParameter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomercampaignexecutionactivationServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup {\n");
    
    sb.append("    serviceDomainServiceConfigurationParameter: ").append(toIndentedString(serviceDomainServiceConfigurationParameter)).append("\n");
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
