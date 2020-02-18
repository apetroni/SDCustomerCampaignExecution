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
 * BQCandidateSelectionRetrieveInputModelCandidateSelectionInstanceReport1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class BQCandidateSelectionRetrieveInputModelCandidateSelectionInstanceReport1   {
  @JsonProperty("candidateSelectionInstanceReportReference")
  private String candidateSelectionInstanceReportReference = null;

  public BQCandidateSelectionRetrieveInputModelCandidateSelectionInstanceReport1 candidateSelectionInstanceReportReference(String candidateSelectionInstanceReportReference) {
    this.candidateSelectionInstanceReportReference = candidateSelectionInstanceReportReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return candidateSelectionInstanceReportReference
  **/
  @ApiModelProperty(example = "731994", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report ")
  
    public String getCandidateSelectionInstanceReportReference() {
    return candidateSelectionInstanceReportReference;
  }

  public void setCandidateSelectionInstanceReportReference(String candidateSelectionInstanceReportReference) {
    this.candidateSelectionInstanceReportReference = candidateSelectionInstanceReportReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQCandidateSelectionRetrieveInputModelCandidateSelectionInstanceReport1 bqCandidateSelectionRetrieveInputModelCandidateSelectionInstanceReport1 = (BQCandidateSelectionRetrieveInputModelCandidateSelectionInstanceReport1) o;
    return Objects.equals(this.candidateSelectionInstanceReportReference, bqCandidateSelectionRetrieveInputModelCandidateSelectionInstanceReport1.candidateSelectionInstanceReportReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(candidateSelectionInstanceReportReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQCandidateSelectionRetrieveInputModelCandidateSelectionInstanceReport1 {\n");
    
    sb.append("    candidateSelectionInstanceReportReference: ").append(toIndentedString(candidateSelectionInstanceReportReference)).append("\n");
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
