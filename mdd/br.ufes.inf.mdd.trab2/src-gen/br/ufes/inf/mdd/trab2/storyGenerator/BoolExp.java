/**
 * generated by Xtext 2.14.0
 */
package br.ufes.inf.mdd.trab2.storyGenerator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bool Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.mdd.trab2.storyGenerator.BoolExp#getLeft <em>Left</em>}</li>
 *   <li>{@link br.ufes.inf.mdd.trab2.storyGenerator.BoolExp#getBoolOp <em>Bool Op</em>}</li>
 *   <li>{@link br.ufes.inf.mdd.trab2.storyGenerator.BoolExp#getRight <em>Right</em>}</li>
 *   <li>{@link br.ufes.inf.mdd.trab2.storyGenerator.BoolExp#getParBoolExp <em>Par Bool Exp</em>}</li>
 *   <li>{@link br.ufes.inf.mdd.trab2.storyGenerator.BoolExp#getBinaryBool <em>Binary Bool</em>}</li>
 *   <li>{@link br.ufes.inf.mdd.trab2.storyGenerator.BoolExp#getBinaryQnty <em>Binary Qnty</em>}</li>
 *   <li>{@link br.ufes.inf.mdd.trab2.storyGenerator.BoolExp#getNegateBoolExp <em>Negate Bool Exp</em>}</li>
 *   <li>{@link br.ufes.inf.mdd.trab2.storyGenerator.BoolExp#getUnaryBool <em>Unary Bool</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.mdd.trab2.storyGenerator.StoryGeneratorPackage#getBoolExp()
 * @model
 * @generated
 */
public interface BoolExp extends EObject
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(UnaryBoolExp)
   * @see br.ufes.inf.mdd.trab2.storyGenerator.StoryGeneratorPackage#getBoolExp_Left()
   * @model containment="true"
   * @generated
   */
  UnaryBoolExp getLeft();

  /**
   * Sets the value of the '{@link br.ufes.inf.mdd.trab2.storyGenerator.BoolExp#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(UnaryBoolExp value);

  /**
   * Returns the value of the '<em><b>Bool Op</b></em>' attribute.
   * The literals are from the enumeration {@link br.ufes.inf.mdd.trab2.storyGenerator.BoolOp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bool Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bool Op</em>' attribute.
   * @see br.ufes.inf.mdd.trab2.storyGenerator.BoolOp
   * @see #setBoolOp(BoolOp)
   * @see br.ufes.inf.mdd.trab2.storyGenerator.StoryGeneratorPackage#getBoolExp_BoolOp()
   * @model
   * @generated
   */
  BoolOp getBoolOp();

  /**
   * Sets the value of the '{@link br.ufes.inf.mdd.trab2.storyGenerator.BoolExp#getBoolOp <em>Bool Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool Op</em>' attribute.
   * @see br.ufes.inf.mdd.trab2.storyGenerator.BoolOp
   * @see #getBoolOp()
   * @generated
   */
  void setBoolOp(BoolOp value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(BoolExp)
   * @see br.ufes.inf.mdd.trab2.storyGenerator.StoryGeneratorPackage#getBoolExp_Right()
   * @model containment="true"
   * @generated
   */
  BoolExp getRight();

  /**
   * Sets the value of the '{@link br.ufes.inf.mdd.trab2.storyGenerator.BoolExp#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(BoolExp value);

  /**
   * Returns the value of the '<em><b>Par Bool Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Par Bool Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Par Bool Exp</em>' containment reference.
   * @see #setParBoolExp(BoolExp)
   * @see br.ufes.inf.mdd.trab2.storyGenerator.StoryGeneratorPackage#getBoolExp_ParBoolExp()
   * @model containment="true"
   * @generated
   */
  BoolExp getParBoolExp();

  /**
   * Sets the value of the '{@link br.ufes.inf.mdd.trab2.storyGenerator.BoolExp#getParBoolExp <em>Par Bool Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Par Bool Exp</em>' containment reference.
   * @see #getParBoolExp()
   * @generated
   */
  void setParBoolExp(BoolExp value);

  /**
   * Returns the value of the '<em><b>Binary Bool</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Binary Bool</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Binary Bool</em>' containment reference.
   * @see #setBinaryBool(BinaryBoolExp)
   * @see br.ufes.inf.mdd.trab2.storyGenerator.StoryGeneratorPackage#getBoolExp_BinaryBool()
   * @model containment="true"
   * @generated
   */
  BinaryBoolExp getBinaryBool();

  /**
   * Sets the value of the '{@link br.ufes.inf.mdd.trab2.storyGenerator.BoolExp#getBinaryBool <em>Binary Bool</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Binary Bool</em>' containment reference.
   * @see #getBinaryBool()
   * @generated
   */
  void setBinaryBool(BinaryBoolExp value);

  /**
   * Returns the value of the '<em><b>Binary Qnty</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Binary Qnty</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Binary Qnty</em>' containment reference.
   * @see #setBinaryQnty(BinaryQntyExp)
   * @see br.ufes.inf.mdd.trab2.storyGenerator.StoryGeneratorPackage#getBoolExp_BinaryQnty()
   * @model containment="true"
   * @generated
   */
  BinaryQntyExp getBinaryQnty();

  /**
   * Sets the value of the '{@link br.ufes.inf.mdd.trab2.storyGenerator.BoolExp#getBinaryQnty <em>Binary Qnty</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Binary Qnty</em>' containment reference.
   * @see #getBinaryQnty()
   * @generated
   */
  void setBinaryQnty(BinaryQntyExp value);

  /**
   * Returns the value of the '<em><b>Negate Bool Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Negate Bool Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Negate Bool Exp</em>' containment reference.
   * @see #setNegateBoolExp(NegateBoolExp)
   * @see br.ufes.inf.mdd.trab2.storyGenerator.StoryGeneratorPackage#getBoolExp_NegateBoolExp()
   * @model containment="true"
   * @generated
   */
  NegateBoolExp getNegateBoolExp();

  /**
   * Sets the value of the '{@link br.ufes.inf.mdd.trab2.storyGenerator.BoolExp#getNegateBoolExp <em>Negate Bool Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Negate Bool Exp</em>' containment reference.
   * @see #getNegateBoolExp()
   * @generated
   */
  void setNegateBoolExp(NegateBoolExp value);

  /**
   * Returns the value of the '<em><b>Unary Bool</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unary Bool</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unary Bool</em>' containment reference.
   * @see #setUnaryBool(UnaryBoolExp)
   * @see br.ufes.inf.mdd.trab2.storyGenerator.StoryGeneratorPackage#getBoolExp_UnaryBool()
   * @model containment="true"
   * @generated
   */
  UnaryBoolExp getUnaryBool();

  /**
   * Sets the value of the '{@link br.ufes.inf.mdd.trab2.storyGenerator.BoolExp#getUnaryBool <em>Unary Bool</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unary Bool</em>' containment reference.
   * @see #getUnaryBool()
   * @generated
   */
  void setUnaryBool(UnaryBoolExp value);

} // BoolExp
