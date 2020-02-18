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
 * SDCustomerCampaignExecutionRetrieveInputModelServiceDomainOfferedService1ServiceDomainServiceRecord
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class SDCustomerCampaignExecutionRetrieveInputModelServiceDomainOfferedService1ServiceDomainServiceRecord   {
  @JsonProperty("serviceDomainServiceVersion")
  private String serviceDomainServiceVersion = null;

  public SDCustomerCampaignExecutionRetrieveInputModelServiceDomainOfferedService1ServiceDomainServiceRecord serviceDomainServiceVersion(String serviceDomainServiceVersion) {
    this.serviceDomainServiceVersion = serviceDomainServiceVersion;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return serviceDomainServiceVersion
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate ")
  
    public String getServiceDomainServiceVersion() {
    return serviceDomainServiceVersion;
  }

  public void setServiceDomainServiceVersion(String serviceDomainServiceVersion) {
    this.serviceDomainServiceVersion = serviceDomainServiceVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SDCustomerCampaignExecutionRetrieveInputModelServiceDomainOfferedService1ServiceDomainServiceRecord sdCustomerCampaignExecutionRetrieveInputModelServiceDomainOfferedService1ServiceDomainServiceRecord = (SDCustomerCampaignExecutionRetrieveInputModelServiceDomainOfferedService1ServiceDomainServiceRecord) o;
    return Objects.equals(this.serviceDomainServiceVersion, sdCustomerCampaignExecutionRetrieveInputModelServiceDomainOfferedService1ServiceDomainServiceRecord.serviceDomainServiceVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDomainServiceVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDCustomerCampaignExecutionRetrieveInputModelServiceDomainOfferedService1ServiceDomainServiceRecord {\n");
    
    sb.append("    serviceDomainServiceVersion: ").append(toIndentedString(serviceDomainServiceVersion)).append("\n");
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
