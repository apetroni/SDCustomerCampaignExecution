package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BQAnalysisRetrieveOutputModelAnalysisInstanceAnalysis1;
import io.swagger.model.BQAnalysisRetrieveOutputModelAnalysisInstanceReport1;
import io.swagger.model.BQAnalysisRetrieveOutputModelCustomerCampaignProcedureInstanceRecord1;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQAnalysisRetrieveOutputModel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class BQAnalysisRetrieveOutputModel   {
  @JsonProperty("customerCampaignProcedureInstanceRecord")
  private BQAnalysisRetrieveOutputModelCustomerCampaignProcedureInstanceRecord1 customerCampaignProcedureInstanceRecord = null;

  @JsonProperty("analysisRetrieveActionTaskReference")
  private String analysisRetrieveActionTaskReference = null;

  @JsonProperty("analysisRetrieveActionTaskRecord")
  private Object analysisRetrieveActionTaskRecord = null;

  @JsonProperty("analysisRetrieveActionResponse")
  private String analysisRetrieveActionResponse = null;

  @JsonProperty("analysisInstanceReport")
  private BQAnalysisRetrieveOutputModelAnalysisInstanceReport1 analysisInstanceReport = null;

  @JsonProperty("analysisInstanceAnalysis")
  private BQAnalysisRetrieveOutputModelAnalysisInstanceAnalysis1 analysisInstanceAnalysis = null;

  public BQAnalysisRetrieveOutputModel customerCampaignProcedureInstanceRecord(BQAnalysisRetrieveOutputModelCustomerCampaignProcedureInstanceRecord1 customerCampaignProcedureInstanceRecord) {
    this.customerCampaignProcedureInstanceRecord = customerCampaignProcedureInstanceRecord;
    return this;
  }

  /**
   * Get customerCampaignProcedureInstanceRecord
   * @return customerCampaignProcedureInstanceRecord
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BQAnalysisRetrieveOutputModelCustomerCampaignProcedureInstanceRecord1 getCustomerCampaignProcedureInstanceRecord() {
    return customerCampaignProcedureInstanceRecord;
  }

  public void setCustomerCampaignProcedureInstanceRecord(BQAnalysisRetrieveOutputModelCustomerCampaignProcedureInstanceRecord1 customerCampaignProcedureInstanceRecord) {
    this.customerCampaignProcedureInstanceRecord = customerCampaignProcedureInstanceRecord;
  }

  public BQAnalysisRetrieveOutputModel analysisRetrieveActionTaskReference(String analysisRetrieveActionTaskReference) {
    this.analysisRetrieveActionTaskReference = analysisRetrieveActionTaskReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Analysis instance retrieve service call 
   * @return analysisRetrieveActionTaskReference
  **/
  @ApiModelProperty(example = "ARATR770562", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Analysis instance retrieve service call ")
  
    public String getAnalysisRetrieveActionTaskReference() {
    return analysisRetrieveActionTaskReference;
  }

  public void setAnalysisRetrieveActionTaskReference(String analysisRetrieveActionTaskReference) {
    this.analysisRetrieveActionTaskReference = analysisRetrieveActionTaskReference;
  }

  public BQAnalysisRetrieveOutputModel analysisRetrieveActionTaskRecord(Object analysisRetrieveActionTaskRecord) {
    this.analysisRetrieveActionTaskRecord = analysisRetrieveActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return analysisRetrieveActionTaskRecord
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record ")
  
    public Object getAnalysisRetrieveActionTaskRecord() {
    return analysisRetrieveActionTaskRecord;
  }

  public void setAnalysisRetrieveActionTaskRecord(Object analysisRetrieveActionTaskRecord) {
    this.analysisRetrieveActionTaskRecord = analysisRetrieveActionTaskRecord;
  }

  public BQAnalysisRetrieveOutputModel analysisRetrieveActionResponse(String analysisRetrieveActionResponse) {
    this.analysisRetrieveActionResponse = analysisRetrieveActionResponse;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return analysisRetrieveActionResponse
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) ")
  
    public String getAnalysisRetrieveActionResponse() {
    return analysisRetrieveActionResponse;
  }

  public void setAnalysisRetrieveActionResponse(String analysisRetrieveActionResponse) {
    this.analysisRetrieveActionResponse = analysisRetrieveActionResponse;
  }

  public BQAnalysisRetrieveOutputModel analysisInstanceReport(BQAnalysisRetrieveOutputModelAnalysisInstanceReport1 analysisInstanceReport) {
    this.analysisInstanceReport = analysisInstanceReport;
    return this;
  }

  /**
   * Get analysisInstanceReport
   * @return analysisInstanceReport
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BQAnalysisRetrieveOutputModelAnalysisInstanceReport1 getAnalysisInstanceReport() {
    return analysisInstanceReport;
  }

  public void setAnalysisInstanceReport(BQAnalysisRetrieveOutputModelAnalysisInstanceReport1 analysisInstanceReport) {
    this.analysisInstanceReport = analysisInstanceReport;
  }

  public BQAnalysisRetrieveOutputModel analysisInstanceAnalysis(BQAnalysisRetrieveOutputModelAnalysisInstanceAnalysis1 analysisInstanceAnalysis) {
    this.analysisInstanceAnalysis = analysisInstanceAnalysis;
    return this;
  }

  /**
   * Get analysisInstanceAnalysis
   * @return analysisInstanceAnalysis
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BQAnalysisRetrieveOutputModelAnalysisInstanceAnalysis1 getAnalysisInstanceAnalysis() {
    return analysisInstanceAnalysis;
  }

  public void setAnalysisInstanceAnalysis(BQAnalysisRetrieveOutputModelAnalysisInstanceAnalysis1 analysisInstanceAnalysis) {
    this.analysisInstanceAnalysis = analysisInstanceAnalysis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQAnalysisRetrieveOutputModel bqAnalysisRetrieveOutputModel = (BQAnalysisRetrieveOutputModel) o;
    return Objects.equals(this.customerCampaignProcedureInstanceRecord, bqAnalysisRetrieveOutputModel.customerCampaignProcedureInstanceRecord) &&
        Objects.equals(this.analysisRetrieveActionTaskReference, bqAnalysisRetrieveOutputModel.analysisRetrieveActionTaskReference) &&
        Objects.equals(this.analysisRetrieveActionTaskRecord, bqAnalysisRetrieveOutputModel.analysisRetrieveActionTaskRecord) &&
        Objects.equals(this.analysisRetrieveActionResponse, bqAnalysisRetrieveOutputModel.analysisRetrieveActionResponse) &&
        Objects.equals(this.analysisInstanceReport, bqAnalysisRetrieveOutputModel.analysisInstanceReport) &&
        Objects.equals(this.analysisInstanceAnalysis, bqAnalysisRetrieveOutputModel.analysisInstanceAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCampaignProcedureInstanceRecord, analysisRetrieveActionTaskReference, analysisRetrieveActionTaskRecord, analysisRetrieveActionResponse, analysisInstanceReport, analysisInstanceAnalysis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQAnalysisRetrieveOutputModel {\n");
    
    sb.append("    customerCampaignProcedureInstanceRecord: ").append(toIndentedString(customerCampaignProcedureInstanceRecord)).append("\n");
    sb.append("    analysisRetrieveActionTaskReference: ").append(toIndentedString(analysisRetrieveActionTaskReference)).append("\n");
    sb.append("    analysisRetrieveActionTaskRecord: ").append(toIndentedString(analysisRetrieveActionTaskRecord)).append("\n");
    sb.append("    analysisRetrieveActionResponse: ").append(toIndentedString(analysisRetrieveActionResponse)).append("\n");
    sb.append("    analysisInstanceReport: ").append(toIndentedString(analysisInstanceReport)).append("\n");
    sb.append("    analysisInstanceAnalysis: ").append(toIndentedString(analysisInstanceAnalysis)).append("\n");
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
