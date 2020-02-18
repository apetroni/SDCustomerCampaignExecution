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
 * SDCustomerCampaignExecutionFeedbackInputModelServiceDomainFeedbackActionRecord
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class SDCustomerCampaignExecutionFeedbackInputModelServiceDomainFeedbackActionRecord   {
  @JsonProperty("serviceDomainServicingSessionReference")
  private String serviceDomainServicingSessionReference = null;

  @JsonProperty("controlRecordInstanceReference")
  private String controlRecordInstanceReference = null;

  @JsonProperty("behaviorQualifierInstanceReference")
  private String behaviorQualifierInstanceReference = null;

  @JsonProperty("feedbackRecordType")
  private String feedbackRecordType = null;

  @JsonProperty("feedbackRecord")
  private Object feedbackRecord = null;

  public SDCustomerCampaignExecutionFeedbackInputModelServiceDomainFeedbackActionRecord serviceDomainServicingSessionReference(String serviceDomainServicingSessionReference) {
    this.serviceDomainServicingSessionReference = serviceDomainServicingSessionReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return serviceDomainServicingSessionReference
  **/
  @ApiModelProperty(example = "796678", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session ")
  
    public String getServiceDomainServicingSessionReference() {
    return serviceDomainServicingSessionReference;
  }

  public void setServiceDomainServicingSessionReference(String serviceDomainServicingSessionReference) {
    this.serviceDomainServicingSessionReference = serviceDomainServicingSessionReference;
  }

  public SDCustomerCampaignExecutionFeedbackInputModelServiceDomainFeedbackActionRecord controlRecordInstanceReference(String controlRecordInstanceReference) {
    this.controlRecordInstanceReference = controlRecordInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance if appropriate 
   * @return controlRecordInstanceReference
  **/
  @ApiModelProperty(example = "724385", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance if appropriate ")
  
    public String getControlRecordInstanceReference() {
    return controlRecordInstanceReference;
  }

  public void setControlRecordInstanceReference(String controlRecordInstanceReference) {
    this.controlRecordInstanceReference = controlRecordInstanceReference;
  }

  public SDCustomerCampaignExecutionFeedbackInputModelServiceDomainFeedbackActionRecord behaviorQualifierInstanceReference(String behaviorQualifierInstanceReference) {
    this.behaviorQualifierInstanceReference = behaviorQualifierInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the behavior qualifier instance if appropriate 
   * @return behaviorQualifierInstanceReference
  **/
  @ApiModelProperty(example = "789747", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the behavior qualifier instance if appropriate ")
  
    public String getBehaviorQualifierInstanceReference() {
    return behaviorQualifierInstanceReference;
  }

  public void setBehaviorQualifierInstanceReference(String behaviorQualifierInstanceReference) {
    this.behaviorQualifierInstanceReference = behaviorQualifierInstanceReference;
  }

  public SDCustomerCampaignExecutionFeedbackInputModelServiceDomainFeedbackActionRecord feedbackRecordType(String feedbackRecordType) {
    this.feedbackRecordType = feedbackRecordType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The layout/type of the feedback provided 
   * @return feedbackRecordType
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The layout/type of the feedback provided ")
  
    public String getFeedbackRecordType() {
    return feedbackRecordType;
  }

  public void setFeedbackRecordType(String feedbackRecordType) {
    this.feedbackRecordType = feedbackRecordType;
  }

  public SDCustomerCampaignExecutionFeedbackInputModelServiceDomainFeedbackActionRecord feedbackRecord(Object feedbackRecord) {
    this.feedbackRecord = feedbackRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The content of the feedback in any suitable format and media 
   * @return feedbackRecord
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The content of the feedback in any suitable format and media ")
  
    public Object getFeedbackRecord() {
    return feedbackRecord;
  }

  public void setFeedbackRecord(Object feedbackRecord) {
    this.feedbackRecord = feedbackRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SDCustomerCampaignExecutionFeedbackInputModelServiceDomainFeedbackActionRecord sdCustomerCampaignExecutionFeedbackInputModelServiceDomainFeedbackActionRecord = (SDCustomerCampaignExecutionFeedbackInputModelServiceDomainFeedbackActionRecord) o;
    return Objects.equals(this.serviceDomainServicingSessionReference, sdCustomerCampaignExecutionFeedbackInputModelServiceDomainFeedbackActionRecord.serviceDomainServicingSessionReference) &&
        Objects.equals(this.controlRecordInstanceReference, sdCustomerCampaignExecutionFeedbackInputModelServiceDomainFeedbackActionRecord.controlRecordInstanceReference) &&
        Objects.equals(this.behaviorQualifierInstanceReference, sdCustomerCampaignExecutionFeedbackInputModelServiceDomainFeedbackActionRecord.behaviorQualifierInstanceReference) &&
        Objects.equals(this.feedbackRecordType, sdCustomerCampaignExecutionFeedbackInputModelServiceDomainFeedbackActionRecord.feedbackRecordType) &&
        Objects.equals(this.feedbackRecord, sdCustomerCampaignExecutionFeedbackInputModelServiceDomainFeedbackActionRecord.feedbackRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDomainServicingSessionReference, controlRecordInstanceReference, behaviorQualifierInstanceReference, feedbackRecordType, feedbackRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDCustomerCampaignExecutionFeedbackInputModelServiceDomainFeedbackActionRecord {\n");
    
    sb.append("    serviceDomainServicingSessionReference: ").append(toIndentedString(serviceDomainServicingSessionReference)).append("\n");
    sb.append("    controlRecordInstanceReference: ").append(toIndentedString(controlRecordInstanceReference)).append("\n");
    sb.append("    behaviorQualifierInstanceReference: ").append(toIndentedString(behaviorQualifierInstanceReference)).append("\n");
    sb.append("    feedbackRecordType: ").append(toIndentedString(feedbackRecordType)).append("\n");
    sb.append("    feedbackRecord: ").append(toIndentedString(feedbackRecord)).append("\n");
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
