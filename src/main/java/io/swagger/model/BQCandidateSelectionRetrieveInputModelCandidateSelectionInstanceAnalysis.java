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
 * BQCandidateSelectionRetrieveInputModelCandidateSelectionInstanceAnalysis
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class BQCandidateSelectionRetrieveInputModelCandidateSelectionInstanceAnalysis   {
  @JsonProperty("candidateSelectionInstanceAnalysisReference")
  private String candidateSelectionInstanceAnalysisReference = null;

  public BQCandidateSelectionRetrieveInputModelCandidateSelectionInstanceAnalysis candidateSelectionInstanceAnalysisReference(String candidateSelectionInstanceAnalysisReference) {
    this.candidateSelectionInstanceAnalysisReference = candidateSelectionInstanceAnalysisReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return candidateSelectionInstanceAnalysisReference
  **/
  @ApiModelProperty(example = "713300", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view ")
  
    public String getCandidateSelectionInstanceAnalysisReference() {
    return candidateSelectionInstanceAnalysisReference;
  }

  public void setCandidateSelectionInstanceAnalysisReference(String candidateSelectionInstanceAnalysisReference) {
    this.candidateSelectionInstanceAnalysisReference = candidateSelectionInstanceAnalysisReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQCandidateSelectionRetrieveInputModelCandidateSelectionInstanceAnalysis bqCandidateSelectionRetrieveInputModelCandidateSelectionInstanceAnalysis = (BQCandidateSelectionRetrieveInputModelCandidateSelectionInstanceAnalysis) o;
    return Objects.equals(this.candidateSelectionInstanceAnalysisReference, bqCandidateSelectionRetrieveInputModelCandidateSelectionInstanceAnalysis.candidateSelectionInstanceAnalysisReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(candidateSelectionInstanceAnalysisReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQCandidateSelectionRetrieveInputModelCandidateSelectionInstanceAnalysis {\n");
    
    sb.append("    candidateSelectionInstanceAnalysisReference: ").append(toIndentedString(candidateSelectionInstanceAnalysisReference)).append("\n");
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
