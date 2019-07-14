/**
 * generated by Xtext 2.17.0
 */
package br.ufes.inf.storyGen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.storyGen.Event#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link br.ufes.inf.storyGen.Event#getName <em>Name</em>}</li>
 *   <li>{@link br.ufes.inf.storyGen.Event#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link br.ufes.inf.storyGen.Event#getConditions <em>Conditions</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.storyGen.StoryGenPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends EObject
{
  /**
   * Returns the value of the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract</em>' attribute.
   * @see #setAbstract(boolean)
   * @see br.ufes.inf.storyGen.StoryGenPackage#getEvent_Abstract()
   * @model
   * @generated
   */
  boolean isAbstract();

  /**
   * Sets the value of the '{@link br.ufes.inf.storyGen.Event#isAbstract <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract</em>' attribute.
   * @see #isAbstract()
   * @generated
   */
  void setAbstract(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see br.ufes.inf.storyGen.StoryGenPackage#getEvent_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link br.ufes.inf.storyGen.Event#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference.
   * @see #setSuperType(Event)
   * @see br.ufes.inf.storyGen.StoryGenPackage#getEvent_SuperType()
   * @model
   * @generated
   */
  Event getSuperType();

  /**
   * Sets the value of the '{@link br.ufes.inf.storyGen.Event#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(Event value);

  /**
   * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
   * The list contents are of type {@link br.ufes.inf.storyGen.Condition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditions</em>' containment reference list.
   * @see br.ufes.inf.storyGen.StoryGenPackage#getEvent_Conditions()
   * @model containment="true"
   * @generated
   */
  EList<Condition> getConditions();

} // Event
