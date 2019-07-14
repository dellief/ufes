/*
 * generated by Xtext 2.14.0
 */
package br.ufes.inf.mdd.trab2.parser.antlr;

import br.ufes.inf.mdd.trab2.parser.antlr.internal.InternalStoryGeneratorParser;
import br.ufes.inf.mdd.trab2.services.StoryGeneratorGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class StoryGeneratorParser extends AbstractAntlrParser {

	@Inject
	private StoryGeneratorGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalStoryGeneratorParser createParser(XtextTokenStream stream) {
		return new InternalStoryGeneratorParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Story";
	}

	public StoryGeneratorGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(StoryGeneratorGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
