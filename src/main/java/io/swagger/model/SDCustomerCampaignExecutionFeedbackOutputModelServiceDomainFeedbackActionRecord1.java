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
 * SDCustomerCampaignExecutionFeedbackOutputModelServiceDomainFeedbackActionRecord1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class SDCustomerCampaignExecutionFeedbackOutputModelServiceDomainFeedbackActionRecord1   {
  @JsonProperty("feedbackRecordDateTime")
  private String feedbackRecordDateTime = null;

  @JsonProperty("feedbackRecordStatus")
  private String feedbackRecordStatus = null;

  @JsonProperty("employeeBusinessUnitReference")
  private String employeeBusinessUnitReference = null;

  public SDCustomerCampaignExecutionFeedbackOutputModelServiceDomainFeedbackActionRecord1 feedbackRecordDateTime(String feedbackRecordDateTime) {
    this.feedbackRecordDateTime = feedbackRecordDateTime;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date/time the feedback submitted for consideration 
   * @return feedbackRecordDateTime
  **/
  @ApiModelProperty(example = "09-22-2018", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date/time the feedback submitted for consideration ")
  
    public String getFeedbackRecordDateTime() {
    return feedbackRecordDateTime;
  }

  public void setFeedbackRecordDateTime(String feedbackRecordDateTime) {
    this.feedbackRecordDateTime = feedbackRecordDateTime;
  }

  public SDCustomerCampaignExecutionFeedbackOutputModelServiceDomainFeedbackActionRecord1 feedbackRecordStatus(String feedbackRecordStatus) {
    this.feedbackRecordStatus = feedbackRecordStatus;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of processing the feedback e.g. received, considered, responded to 
   * @return feedbackRecordStatus
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of processing the feedback e.g. received, considered, responded to ")
  
    public String getFeedbackRecordStatus() {
    return feedbackRecordStatus;
  }

  public void setFeedbackRecordStatus(String feedbackRecordStatus) {
    this.feedbackRecordStatus = feedbackRecordStatus;
  }

  public SDCustomerCampaignExecutionFeedbackOutputModelServiceDomainFeedbackActionRecord1 employeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to business unit/employee responsible for handling feedback 
   * @return employeeBusinessUnitReference
  **/
  @ApiModelProperty(example = "769031", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to business unit/employee responsible for handling feedback ")
  
    public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SDCustomerCampaignExecutionFeedbackOutputModelServiceDomainFeedbackActionRecord1 sdCustomerCampaignExecutionFeedbackOutputModelServiceDomainFeedbackActionRecord1 = (SDCustomerCampaignExecutionFeedbackOutputModelServiceDomainFeedbackActionRecord1) o;
    return Objects.equals(this.feedbackRecordDateTime, sdCustomerCampaignExecutionFeedbackOutputModelServiceDomainFeedbackActionRecord1.feedbackRecordDateTime) &&
        Objects.equals(this.feedbackRecordStatus, sdCustomerCampaignExecutionFeedbackOutputModelServiceDomainFeedbackActionRecord1.feedbackRecordStatus) &&
        Objects.equals(this.employeeBusinessUnitReference, sdCustomerCampaignExecutionFeedbackOutputModelServiceDomainFeedbackActionRecord1.employeeBusinessUnitReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedbackRecordDateTime, feedbackRecordStatus, employeeBusinessUnitReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDCustomerCampaignExecutionFeedbackOutputModelServiceDomainFeedbackActionRecord1 {\n");
    
    sb.append("    feedbackRecordDateTime: ").append(toIndentedString(feedbackRecordDateTime)).append("\n");
    sb.append("    feedbackRecordStatus: ").append(toIndentedString(feedbackRecordStatus)).append("\n");
    sb.append("    employeeBusinessUnitReference: ").append(toIndentedString(employeeBusinessUnitReference)).append("\n");
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
