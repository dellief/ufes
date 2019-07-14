/*
 * generated by Xtext 2.17.0
 */
package br.ufes.inf.ide.contentassist.antlr;

import br.ufes.inf.ide.contentassist.antlr.internal.InternalStoryGenParser;
import br.ufes.inf.services.StoryGenGrammarAccess;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class StoryGenParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(StoryGenGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, StoryGenGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getBoolExpAccess().getAlternatives(), "rule__BoolExp__Alternatives");
			builder.put(grammarAccess.getUnaryBoolExpAccess().getAlternatives(), "rule__UnaryBoolExp__Alternatives");
			builder.put(grammarAccess.getUnaryQuantityExpAccess().getAlternatives(), "rule__UnaryQuantityExp__Alternatives");
			builder.put(grammarAccess.getAttrTypeAccess().getAlternatives(), "rule__AttrType__Alternatives");
			builder.put(grammarAccess.getBooleanValueAccess().getAlternatives(), "rule__BooleanValue__Alternatives");
			builder.put(grammarAccess.getNumOpAccess().getAlternatives(), "rule__NumOp__Alternatives");
			builder.put(grammarAccess.getBoolOpAccess().getAlternatives(), "rule__BoolOp__Alternatives");
			builder.put(grammarAccess.getStoryAccess().getGroup(), "rule__Story__Group__0");
			builder.put(grammarAccess.getWorldAccess().getGroup(), "rule__World__Group__0");
			builder.put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
			builder.put(grammarAccess.getEventAccess().getGroup(), "rule__Event__Group__0");
			builder.put(grammarAccess.getEventAccess().getGroup_3(), "rule__Event__Group_3__0");
			builder.put(grammarAccess.getConditionAccess().getGroup(), "rule__Condition__Group__0");
			builder.put(grammarAccess.getBoolExpAccess().getGroup_0(), "rule__BoolExp__Group_0__0");
			builder.put(grammarAccess.getBinaryBoolExpAccess().getGroup(), "rule__BinaryBoolExp__Group__0");
			builder.put(grammarAccess.getBinaryQntyExpAccess().getGroup(), "rule__BinaryQntyExp__Group__0");
			builder.put(grammarAccess.getNegateBoolExpAccess().getGroup(), "rule__NegateBoolExp__Group__0");
			builder.put(grammarAccess.getStoryAccess().getWorldAssignment_0(), "rule__Story__WorldAssignment_0");
			builder.put(grammarAccess.getStoryAccess().getEventsAssignment_1(), "rule__Story__EventsAssignment_1");
			builder.put(grammarAccess.getWorldAccess().getAttributesAssignment_3(), "rule__World__AttributesAssignment_3");
			builder.put(grammarAccess.getAttributeAccess().getAttrTypeAssignment_0(), "rule__Attribute__AttrTypeAssignment_0");
			builder.put(grammarAccess.getAttributeAccess().getNameAssignment_1(), "rule__Attribute__NameAssignment_1");
			builder.put(grammarAccess.getEventAccess().getAbstractAssignment_0(), "rule__Event__AbstractAssignment_0");
			builder.put(grammarAccess.getEventAccess().getNameAssignment_2(), "rule__Event__NameAssignment_2");
			builder.put(grammarAccess.getEventAccess().getSuperTypeAssignment_3_1(), "rule__Event__SuperTypeAssignment_3_1");
			builder.put(grammarAccess.getEventAccess().getConditionsAssignment_5(), "rule__Event__ConditionsAssignment_5");
			builder.put(grammarAccess.getConditionAccess().getBoolExpAssignment_1(), "rule__Condition__BoolExpAssignment_1");
			builder.put(grammarAccess.getBoolExpAccess().getLeftAssignment_0_1(), "rule__BoolExp__LeftAssignment_0_1");
			builder.put(grammarAccess.getBoolExpAccess().getBoolOpAssignment_0_3(), "rule__BoolExp__BoolOpAssignment_0_3");
			builder.put(grammarAccess.getBoolExpAccess().getRightAssignment_0_5(), "rule__BoolExp__RightAssignment_0_5");
			builder.put(grammarAccess.getBoolExpAccess().getBinaryBoolAssignment_1(), "rule__BoolExp__BinaryBoolAssignment_1");
			builder.put(grammarAccess.getBoolExpAccess().getBinaryQntyAssignment_2(), "rule__BoolExp__BinaryQntyAssignment_2");
			builder.put(grammarAccess.getBoolExpAccess().getNegateBoolExpAssignment_3(), "rule__BoolExp__NegateBoolExpAssignment_3");
			builder.put(grammarAccess.getBoolExpAccess().getUnaryBoolAssignment_4(), "rule__BoolExp__UnaryBoolAssignment_4");
			builder.put(grammarAccess.getBinaryBoolExpAccess().getLeftAssignment_0(), "rule__BinaryBoolExp__LeftAssignment_0");
			builder.put(grammarAccess.getBinaryBoolExpAccess().getBoolOpAssignment_1(), "rule__BinaryBoolExp__BoolOpAssignment_1");
			builder.put(grammarAccess.getBinaryBoolExpAccess().getRightAssignment_2(), "rule__BinaryBoolExp__RightAssignment_2");
			builder.put(grammarAccess.getBinaryQntyExpAccess().getLeftAssignment_0(), "rule__BinaryQntyExp__LeftAssignment_0");
			builder.put(grammarAccess.getBinaryQntyExpAccess().getNumOpAssignment_1(), "rule__BinaryQntyExp__NumOpAssignment_1");
			builder.put(grammarAccess.getBinaryQntyExpAccess().getRightAssignment_2(), "rule__BinaryQntyExp__RightAssignment_2");
			builder.put(grammarAccess.getUnaryBoolExpAccess().getIdAssignment_0(), "rule__UnaryBoolExp__IdAssignment_0");
			builder.put(grammarAccess.getUnaryBoolExpAccess().getValueAssignment_1(), "rule__UnaryBoolExp__ValueAssignment_1");
			builder.put(grammarAccess.getUnaryQuantityExpAccess().getIdAssignment_0(), "rule__UnaryQuantityExp__IdAssignment_0");
			builder.put(grammarAccess.getUnaryQuantityExpAccess().getValueAssignment_1(), "rule__UnaryQuantityExp__ValueAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private StoryGenGrammarAccess grammarAccess;

	@Override
	protected InternalStoryGenParser createParser() {
		InternalStoryGenParser result = new InternalStoryGenParser(null);
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

	public StoryGenGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(StoryGenGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
