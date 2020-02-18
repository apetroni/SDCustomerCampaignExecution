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
 * SDCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecord1ServiceDomainPerformanceAnalysis
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class SDCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecord1ServiceDomainPerformanceAnalysis   {
  @JsonProperty("performanceAnalysisReference")
  private String performanceAnalysisReference = null;

  public SDCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecord1ServiceDomainPerformanceAnalysis performanceAnalysisReference(String performanceAnalysisReference) {
    this.performanceAnalysisReference = performanceAnalysisReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the internal performance analysis view maintained by the service center 
   * @return performanceAnalysisReference
  **/
  @ApiModelProperty(example = "761670", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the internal performance analysis view maintained by the service center ")
  
    public String getPerformanceAnalysisReference() {
    return performanceAnalysisReference;
  }

  public void setPerformanceAnalysisReference(String performanceAnalysisReference) {
    this.performanceAnalysisReference = performanceAnalysisReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SDCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecord1ServiceDomainPerformanceAnalysis sdCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecord1ServiceDomainPerformanceAnalysis = (SDCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecord1ServiceDomainPerformanceAnalysis) o;
    return Objects.equals(this.performanceAnalysisReference, sdCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecord1ServiceDomainPerformanceAnalysis.performanceAnalysisReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(performanceAnalysisReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecord1ServiceDomainPerformanceAnalysis {\n");
    
    sb.append("    performanceAnalysisReference: ").append(toIndentedString(performanceAnalysisReference)).append("\n");
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
