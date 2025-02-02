package io.mosip.registration.processor.core.packet.dto.abis;

import java.io.Serializable;
import java.util.Arrays;

import lombok.Data;

/**
 * The Class CandidatesDto.
 * @author M1048860 Kiran Raj
 */
@Data
public class CandidatesDto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4746292144740017993L;

	/** The reference id. */
	private String referenceId;

	/** The scaled score. */
	private String scaledScore;
	
	private String internalScore;
	
	private Analytics[] analytics;
	public Analytics[] getAnalytics() {
		return analytics.clone();
	}

	public void setAnalytics(Analytics[] analytics) {
		this.analytics = analytics!=null?analytics:null;
	}
	
	private AbisScores[] scores;
	public AbisScores[] getScores() {
		return scores.clone();
	}

	public void setAbisScores(AbisScores[] scores) {
		this.scores = scores!=null?scores:null;
	}
}
