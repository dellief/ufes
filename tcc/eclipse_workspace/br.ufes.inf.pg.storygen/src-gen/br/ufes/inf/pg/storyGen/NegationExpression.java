/**
 * generated by Xtext 2.17.0
 */
package br.ufes.inf.pg.storyGen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Negation Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.pg.storyGen.NegationExpression#getOperand <em>Operand</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.pg.storyGen.StoryGenPackage#getNegationExpression()
 * @model
 * @generated
 */
public interface NegationExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operand</em>' containment reference.
   * @see #setOperand(Expression)
   * @see br.ufes.inf.pg.storyGen.StoryGenPackage#getNegationExpression_Operand()
   * @model containment="true"
   * @generated
   */
  Expression getOperand();

  /**
   * Sets the value of the '{@link br.ufes.inf.pg.storyGen.NegationExpression#getOperand <em>Operand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operand</em>' containment reference.
   * @see #getOperand()
   * @generated
   */
  void setOperand(Expression value);

} // NegationExpression
