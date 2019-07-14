/**
 * generated by Xtext 2.17.0
 */
package br.ufes.inf.storyGen;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see br.ufes.inf.storyGen.StoryGenPackage
 * @generated
 */
public interface StoryGenFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  StoryGenFactory eINSTANCE = br.ufes.inf.storyGen.impl.StoryGenFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Story</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Story</em>'.
   * @generated
   */
  Story createStory();

  /**
   * Returns a new object of class '<em>World</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>World</em>'.
   * @generated
   */
  World createWorld();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns a new object of class '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event</em>'.
   * @generated
   */
  Event createEvent();

  /**
   * Returns a new object of class '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condition</em>'.
   * @generated
   */
  Condition createCondition();

  /**
   * Returns a new object of class '<em>Bool Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bool Exp</em>'.
   * @generated
   */
  BoolExp createBoolExp();

  /**
   * Returns a new object of class '<em>Binary Bool Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Binary Bool Exp</em>'.
   * @generated
   */
  BinaryBoolExp createBinaryBoolExp();

  /**
   * Returns a new object of class '<em>Binary Qnty Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Binary Qnty Exp</em>'.
   * @generated
   */
  BinaryQntyExp createBinaryQntyExp();

  /**
   * Returns a new object of class '<em>Unary Bool Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unary Bool Exp</em>'.
   * @generated
   */
  UnaryBoolExp createUnaryBoolExp();

  /**
   * Returns a new object of class '<em>Negate Bool Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Negate Bool Exp</em>'.
   * @generated
   */
  NegateBoolExp createNegateBoolExp();

  /**
   * Returns a new object of class '<em>Unary Quantity Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unary Quantity Exp</em>'.
   * @generated
   */
  UnaryQuantityExp createUnaryQuantityExp();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  StoryGenPackage getStoryGenPackage();

} //StoryGenFactory
