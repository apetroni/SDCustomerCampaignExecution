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
 * SDCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class SDCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis   {
  @JsonProperty("controlRecordPortfolioAnalysisReference")
  private String controlRecordPortfolioAnalysisReference = null;

  public SDCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysisReference(String controlRecordPortfolioAnalysisReference) {
    this.controlRecordPortfolioAnalysisReference = controlRecordPortfolioAnalysisReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record portfolio analysis view maintained by the service center 
   * @return controlRecordPortfolioAnalysisReference
  **/
  @ApiModelProperty(example = "739764", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record portfolio analysis view maintained by the service center ")
  
    public String getControlRecordPortfolioAnalysisReference() {
    return controlRecordPortfolioAnalysisReference;
  }

  public void setControlRecordPortfolioAnalysisReference(String controlRecordPortfolioAnalysisReference) {
    this.controlRecordPortfolioAnalysisReference = controlRecordPortfolioAnalysisReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SDCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis sdCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis = (SDCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis) o;
    return Objects.equals(this.controlRecordPortfolioAnalysisReference, sdCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis.controlRecordPortfolioAnalysisReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controlRecordPortfolioAnalysisReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDCustomerCampaignExecutionRetrieveInputModelServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis {\n");
    
    sb.append("    controlRecordPortfolioAnalysisReference: ").append(toIndentedString(controlRecordPortfolioAnalysisReference)).append("\n");
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
