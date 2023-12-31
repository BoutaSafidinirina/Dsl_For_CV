/*
 * generated by Xtext 2.32.0
 */
package org.xtext.example.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.ide.contentassist.antlr.internal.InternalCvParser;
import org.xtext.example.services.CvGrammarAccess;

public class CvParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(CvGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, CvGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getEducationAccess().getGroup(), "rule__Education__Group__0");
			builder.put(grammarAccess.getExperienceAccess().getGroup(), "rule__Experience__Group__0");
			builder.put(grammarAccess.getModelAccess().getNameAssignment_4(), "rule__Model__NameAssignment_4");
			builder.put(grammarAccess.getModelAccess().getTitleAssignment_7(), "rule__Model__TitleAssignment_7");
			builder.put(grammarAccess.getModelAccess().getAboutAssignment_10(), "rule__Model__AboutAssignment_10");
			builder.put(grammarAccess.getModelAccess().getEducationAssignment_13(), "rule__Model__EducationAssignment_13");
			builder.put(grammarAccess.getModelAccess().getExperienceAssignment_16(), "rule__Model__ExperienceAssignment_16");
			builder.put(grammarAccess.getModelAccess().getContactAssignment_19(), "rule__Model__ContactAssignment_19");
			builder.put(grammarAccess.getEducationAccess().getDegreeAssignment_4(), "rule__Education__DegreeAssignment_4");
			builder.put(grammarAccess.getEducationAccess().getUniversityAssignment_7(), "rule__Education__UniversityAssignment_7");
			builder.put(grammarAccess.getEducationAccess().getYearAssignment_10(), "rule__Education__YearAssignment_10");
			builder.put(grammarAccess.getExperienceAccess().getPositionAssignment_4(), "rule__Experience__PositionAssignment_4");
			builder.put(grammarAccess.getExperienceAccess().getCompanyAssignment_7(), "rule__Experience__CompanyAssignment_7");
			builder.put(grammarAccess.getExperienceAccess().getYearAssignment_10(), "rule__Experience__YearAssignment_10");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private CvGrammarAccess grammarAccess;

	@Override
	protected InternalCvParser createParser() {
		InternalCvParser result = new InternalCvParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public CvGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CvGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
