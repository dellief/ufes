/**
 * generated by Xtext 2.14.0
 */
package br.ufes.inf.mdd.trab2.storyGenerator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Bool Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.mdd.trab2.storyGenerator.UnaryBoolExp#getId <em>Id</em>}</li>
 *   <li>{@link br.ufes.inf.mdd.trab2.storyGenerator.UnaryBoolExp#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.mdd.trab2.storyGenerator.StoryGeneratorPackage#getUnaryBoolExp()
 * @model
 * @generated
 */
public interface UnaryBoolExp extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' reference.
   * @see #setId(Attribute)
   * @see br.ufes.inf.mdd.trab2.storyGenerator.StoryGeneratorPackage#getUnaryBoolExp_Id()
   * @model
   * @generated
   */
  Attribute getId();

  /**
   * Sets the value of the '{@link br.ufes.inf.mdd.trab2.storyGenerator.UnaryBoolExp#getId <em>Id</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' reference.
   * @see #getId()
   * @generated
   */
  void setId(Attribute value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * The literals are from the enumeration {@link br.ufes.inf.mdd.trab2.storyGenerator.BooleanValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see br.ufes.inf.mdd.trab2.storyGenerator.BooleanValue
   * @see #setValue(BooleanValue)
   * @see br.ufes.inf.mdd.trab2.storyGenerator.StoryGeneratorPackage#getUnaryBoolExp_Value()
   * @model
   * @generated
   */
  BooleanValue getValue();

  /**
   * Sets the value of the '{@link br.ufes.inf.mdd.trab2.storyGenerator.UnaryBoolExp#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see br.ufes.inf.mdd.trab2.storyGenerator.BooleanValue
   * @see #getValue()
   * @generated
   */
  void setValue(BooleanValue value);

} // UnaryBoolExp
