package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SDCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis;
import io.swagger.model.SDCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecord1ServiceDomainActivityAnalysis;
import io.swagger.model.SDCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecord1ServiceDomainPerformanceAnalysis;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SDCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecord
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class SDCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecord   {
  @JsonProperty("serviceDomainActivityAnalysis")
  private SDCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecord1ServiceDomainActivityAnalysis serviceDomainActivityAnalysis = null;

  @JsonProperty("serviceDomainPerformanceAnalysis")
  private SDCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecord1ServiceDomainPerformanceAnalysis serviceDomainPerformanceAnalysis = null;

  @JsonProperty("controlRecordPortfolioAnalysis")
  private SDCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;

  public SDCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecord serviceDomainActivityAnalysis(SDCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecord1ServiceDomainActivityAnalysis serviceDomainActivityAnalysis) {
    this.serviceDomainActivityAnalysis = serviceDomainActivityAnalysis;
    return this;
  }

  /**
   * Get serviceDomainActivityAnalysis
   * @return serviceDomainActivityAnalysis
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SDCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecord1ServiceDomainActivityAnalysis getServiceDomainActivityAnalysis() {
    return serviceDomainActivityAnalysis;
  }

  public void setServiceDomainActivityAnalysis(SDCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecord1ServiceDomainActivityAnalysis serviceDomainActivityAnalysis) {
    this.serviceDomainActivityAnalysis = serviceDomainActivityAnalysis;
  }

  public SDCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecord serviceDomainPerformanceAnalysis(SDCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecord1ServiceDomainPerformanceAnalysis serviceDomainPerformanceAnalysis) {
    this.serviceDomainPerformanceAnalysis = serviceDomainPerformanceAnalysis;
    return this;
  }

  /**
   * Get serviceDomainPerformanceAnalysis
   * @return serviceDomainPerformanceAnalysis
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SDCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecord1ServiceDomainPerformanceAnalysis getServiceDomainPerformanceAnalysis() {
    return serviceDomainPerformanceAnalysis;
  }

  public void setServiceDomainPerformanceAnalysis(SDCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecord1ServiceDomainPerformanceAnalysis serviceDomainPerformanceAnalysis) {
    this.serviceDomainPerformanceAnalysis = serviceDomainPerformanceAnalysis;
  }

  public SDCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecord controlRecordPortfolioAnalysis(SDCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
    return this;
  }

  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SDCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
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
    SDCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecord sdCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecord = (SDCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecord) o;
    return Objects.equals(this.serviceDomainActivityAnalysis, sdCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecord.serviceDomainActivityAnalysis) &&
        Objects.equals(this.serviceDomainPerformanceAnalysis, sdCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecord.serviceDomainPerformanceAnalysis) &&
        Objects.equals(this.controlRecordPortfolioAnalysis, sdCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecord.controlRecordPortfolioAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDomainActivityAnalysis, serviceDomainPerformanceAnalysis, controlRecordPortfolioAnalysis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecord {\n");
    
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
