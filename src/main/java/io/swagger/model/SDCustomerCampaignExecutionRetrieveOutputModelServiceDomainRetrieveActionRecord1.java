package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis;
import io.swagger.model.SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1ServiceDomainActivityAnalysis;
import io.swagger.model.SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1ServiceDomainPerformanceAnalysis;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1   {
  @JsonProperty("serviceDomainActivityAnalysis")
  private SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1ServiceDomainActivityAnalysis serviceDomainActivityAnalysis = null;

  @JsonProperty("serviceDomainPerformanceAnalysis")
  private SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1ServiceDomainPerformanceAnalysis serviceDomainPerformanceAnalysis = null;

  @JsonProperty("controlRecordPortfolioAnalysis")
  private SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;

  public SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1 serviceDomainActivityAnalysis(SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1ServiceDomainActivityAnalysis serviceDomainActivityAnalysis) {
    this.serviceDomainActivityAnalysis = serviceDomainActivityAnalysis;
    return this;
  }

  /**
   * Get serviceDomainActivityAnalysis
   * @return serviceDomainActivityAnalysis
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1ServiceDomainActivityAnalysis getServiceDomainActivityAnalysis() {
    return serviceDomainActivityAnalysis;
  }

  public void setServiceDomainActivityAnalysis(SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1ServiceDomainActivityAnalysis serviceDomainActivityAnalysis) {
    this.serviceDomainActivityAnalysis = serviceDomainActivityAnalysis;
  }

  public SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1 serviceDomainPerformanceAnalysis(SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1ServiceDomainPerformanceAnalysis serviceDomainPerformanceAnalysis) {
    this.serviceDomainPerformanceAnalysis = serviceDomainPerformanceAnalysis;
    return this;
  }

  /**
   * Get serviceDomainPerformanceAnalysis
   * @return serviceDomainPerformanceAnalysis
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1ServiceDomainPerformanceAnalysis getServiceDomainPerformanceAnalysis() {
    return serviceDomainPerformanceAnalysis;
  }

  public void setServiceDomainPerformanceAnalysis(SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1ServiceDomainPerformanceAnalysis serviceDomainPerformanceAnalysis) {
    this.serviceDomainPerformanceAnalysis = serviceDomainPerformanceAnalysis;
  }

  public SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1 controlRecordPortfolioAnalysis(SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
    return this;
  }

  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1 sdCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1 = (SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1) o;
    return Objects.equals(this.serviceDomainActivityAnalysis, sdCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1.serviceDomainActivityAnalysis) &&
        Objects.equals(this.serviceDomainPerformanceAnalysis, sdCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1.serviceDomainPerformanceAnalysis) &&
        Objects.equals(this.controlRecordPortfolioAnalysis, sdCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1.controlRecordPortfolioAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDomainActivityAnalysis, serviceDomainPerformanceAnalysis, controlRecordPortfolioAnalysis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDCustomerCampaignExecutionRetrieveOutputModelServiceDomainRetrieveActionRecord1 {\n");
    
    sb.append("    serviceDomainActivityAnalysis: ").append(toIndentedString(serviceDomainActivityAnalysis)).append("\n");
    sb.append("    serviceDomainPerformanceAnalysis: ").append(toIndentedString(serviceDomainPerformanceAnalysis)).append("\n");
    sb.append("    controlRecordPortfolioAnalysis: ").append(toIndentedString(controlRecordPortfolioAnalysis)).append("\n");
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
