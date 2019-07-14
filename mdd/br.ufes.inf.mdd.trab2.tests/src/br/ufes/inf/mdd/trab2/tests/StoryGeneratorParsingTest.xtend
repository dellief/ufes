/*
 * generated by Xtext 2.14.0
 */
package br.ufes.inf.mdd.trab2.tests

import br.ufes.inf.mdd.trab2.storyGenerator.Story
import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(StoryGeneratorInjectorProvider)
class StoryGeneratorParsingTest {
	@Inject
	ParseHelper<Story> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		Assert.assertTrue('''Unexpected errors: «errors.join(", ")»''', errors.isEmpty)
	}
}
