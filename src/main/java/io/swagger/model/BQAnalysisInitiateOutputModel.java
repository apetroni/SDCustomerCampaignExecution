package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BQAnalysisInitiateOutputModelCustomerCampaignProcedureInstanceRecord1;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQAnalysisInitiateOutputModel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class BQAnalysisInitiateOutputModel   {
  @JsonProperty("customerCampaignProcedureInstanceRecord")
  private BQAnalysisInitiateOutputModelCustomerCampaignProcedureInstanceRecord1 customerCampaignProcedureInstanceRecord = null;

  @JsonProperty("analysisInstanceReference")
  private String analysisInstanceReference = null;

  @JsonProperty("analysisInitiateActionReference")
  private String analysisInitiateActionReference = null;

  @JsonProperty("analysisInitiateActionRecord")
  private Object analysisInitiateActionRecord = null;

  @JsonProperty("analysisInstanceStatus")
  private String analysisInstanceStatus = null;

  public BQAnalysisInitiateOutputModel customerCampaignProcedureInstanceRecord(BQAnalysisInitiateOutputModelCustomerCampaignProcedureInstanceRecord1 customerCampaignProcedureInstanceRecord) {
    this.customerCampaignProcedureInstanceRecord = customerCampaignProcedureInstanceRecord;
    return this;
  }

  /**
   * Get customerCampaignProcedureInstanceRecord
   * @return customerCampaignProcedureInstanceRecord
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BQAnalysisInitiateOutputModelCustomerCampaignProcedureInstanceRecord1 getCustomerCampaignProcedureInstanceRecord() {
    return customerCampaignProcedureInstanceRecord;
  }

  public void setCustomerCampaignProcedureInstanceRecord(BQAnalysisInitiateOutputModelCustomerCampaignProcedureInstanceRecord1 customerCampaignProcedureInstanceRecord) {
    this.customerCampaignProcedureInstanceRecord = customerCampaignProcedureInstanceRecord;
  }

  public BQAnalysisInitiateOutputModel analysisInstanceReference(String analysisInstanceReference) {
    this.analysisInstanceReference = analysisInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Analysis instance 
   * @return analysisInstanceReference
  **/
  @ApiModelProperty(example = "AIR739404", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Analysis instance ")
  
    public String getAnalysisInstanceReference() {
    return analysisInstanceReference;
  }

  public void setAnalysisInstanceReference(String analysisInstanceReference) {
    this.analysisInstanceReference = analysisInstanceReference;
  }

  public BQAnalysisInitiateOutputModel analysisInitiateActionReference(String analysisInitiateActionReference) {
    this.analysisInitiateActionReference = analysisInitiateActionReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return analysisInitiateActionReference
  **/
  @ApiModelProperty(example = "AIAR719947", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call ")
  
    public String getAnalysisInitiateActionReference() {
    return analysisInitiateActionReference;
  }

  public void setAnalysisInitiateActionReference(String analysisInitiateActionReference) {
    this.analysisInitiateActionReference = analysisInitiateActionReference;
  }

  public BQAnalysisInitiateOutputModel analysisInitiateActionRecord(Object analysisInitiateActionRecord) {
    this.analysisInitiateActionRecord = analysisInitiateActionRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return analysisInitiateActionRecord
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record ")
  
    public Object getAnalysisInitiateActionRecord() {
    return analysisInitiateActionRecord;
  }

  public void setAnalysisInitiateActionRecord(Object analysisInitiateActionRecord) {
    this.analysisInitiateActionRecord = analysisInitiateActionRecord;
  }

  public BQAnalysisInitiateOutputModel analysisInstanceStatus(String analysisInstanceStatus) {
    this.analysisInstanceStatus = analysisInstanceStatus;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Analysis instance (e.g. initialised, pending, active) 
   * @return analysisInstanceStatus
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Analysis instance (e.g. initialised, pending, active) ")
  
    public String getAnalysisInstanceStatus() {
    return analysisInstanceStatus;
  }

  public void setAnalysisInstanceStatus(String analysisInstanceStatus) {
    this.analysisInstanceStatus = analysisInstanceStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQAnalysisInitiateOutputModel bqAnalysisInitiateOutputModel = (BQAnalysisInitiateOutputModel) o;
    return Objects.equals(this.customerCampaignProcedureInstanceRecord, bqAnalysisInitiateOutputModel.customerCampaignProcedureInstanceRecord) &&
        Objects.equals(this.analysisInstanceReference, bqAnalysisInitiateOutputModel.analysisInstanceReference) &&
        Objects.equals(this.analysisInitiateActionReference, bqAnalysisInitiateOutputModel.analysisInitiateActionReference) &&
        Objects.equals(this.analysisInitiateActionRecord, bqAnalysisInitiateOutputModel.analysisInitiateActionRecord) &&
        Objects.equals(this.analysisInstanceStatus, bqAnalysisInitiateOutputModel.analysisInstanceStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCampaignProcedureInstanceRecord, analysisInstanceReference, analysisInitiateActionReference, analysisInitiateActionRecord, analysisInstanceStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQAnalysisInitiateOutputModel {\n");
    
    sb.append("    customerCampaignProcedureInstanceRecord: ").append(toIndentedString(customerCampaignProcedureInstanceRecord)).append("\n");
    sb.append("    analysisInstanceReference: ").append(toIndentedString(analysisInstanceReference)).append("\n");
    sb.append("    analysisInitiateActionReference: ").append(toIndentedString(analysisInitiateActionReference)).append("\n");
    sb.append("    analysisInitiateActionRecord: ").append(toIndentedString(analysisInitiateActionRecord)).append("\n");
    sb.append("    analysisInstanceStatus: ").append(toIndentedString(analysisInstanceStatus)).append("\n");
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
