/**
 * generated by Xtext 2.17.0
 */
package br.ufes.inf.pg.storyGen.impl;

import br.ufes.inf.pg.storyGen.AttributeSetting;
import br.ufes.inf.pg.storyGen.AttributeSettingFrequency;
import br.ufes.inf.pg.storyGen.StoryGenPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Setting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.pg.storyGen.impl.AttributeSettingImpl#isPositive <em>Positive</em>}</li>
 *   <li>{@link br.ufes.inf.pg.storyGen.impl.AttributeSettingImpl#isNegative <em>Negative</em>}</li>
 *   <li>{@link br.ufes.inf.pg.storyGen.impl.AttributeSettingImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link br.ufes.inf.pg.storyGen.impl.AttributeSettingImpl#getFrequency <em>Frequency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeSettingImpl extends MinimalEObjectImpl.Container implements AttributeSetting
{
  /**
   * The default value of the '{@link #isPositive() <em>Positive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPositive()
   * @generated
   * @ordered
   */
  protected static final boolean POSITIVE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPositive() <em>Positive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPositive()
   * @generated
   * @ordered
   */
  protected boolean positive = POSITIVE_EDEFAULT;

  /**
   * The default value of the '{@link #isNegative() <em>Negative</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNegative()
   * @generated
   * @ordered
   */
  protected static final boolean NEGATIVE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNegative() <em>Negative</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNegative()
   * @generated
   * @ordered
   */
  protected boolean negative = NEGATIVE_EDEFAULT;

  /**
   * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAmount()
   * @generated
   * @ordered
   */
  protected static final int AMOUNT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAmount()
   * @generated
   * @ordered
   */
  protected int amount = AMOUNT_EDEFAULT;

  /**
   * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrequency()
   * @generated
   * @ordered
   */
  protected static final AttributeSettingFrequency FREQUENCY_EDEFAULT = AttributeSettingFrequency.EVERY_EVENT;

  /**
   * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrequency()
   * @generated
   * @ordered
   */
  protected AttributeSettingFrequency frequency = FREQUENCY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeSettingImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return StoryGenPackage.Literals.ATTRIBUTE_SETTING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isPositive()
  {
    return positive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPositive(boolean newPositive)
  {
    boolean oldPositive = positive;
    positive = newPositive;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StoryGenPackage.ATTRIBUTE_SETTING__POSITIVE, oldPositive, positive));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isNegative()
  {
    return negative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNegative(boolean newNegative)
  {
    boolean oldNegative = negative;
    negative = newNegative;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StoryGenPackage.ATTRIBUTE_SETTING__NEGATIVE, oldNegative, negative));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getAmount()
  {
    return amount;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAmount(int newAmount)
  {
    int oldAmount = amount;
    amount = newAmount;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StoryGenPackage.ATTRIBUTE_SETTING__AMOUNT, oldAmount, amount));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AttributeSettingFrequency getFrequency()
  {
    return frequency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFrequency(AttributeSettingFrequency newFrequency)
  {
    AttributeSettingFrequency oldFrequency = frequency;
    frequency = newFrequency == null ? FREQUENCY_EDEFAULT : newFrequency;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StoryGenPackage.ATTRIBUTE_SETTING__FREQUENCY, oldFrequency, frequency));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case StoryGenPackage.ATTRIBUTE_SETTING__POSITIVE:
        return isPositive();
      case StoryGenPackage.ATTRIBUTE_SETTING__NEGATIVE:
        return isNegative();
      case StoryGenPackage.ATTRIBUTE_SETTING__AMOUNT:
        return getAmount();
      case StoryGenPackage.ATTRIBUTE_SETTING__FREQUENCY:
        return getFrequency();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case StoryGenPackage.ATTRIBUTE_SETTING__POSITIVE:
        setPositive((Boolean)newValue);
        return;
      case StoryGenPackage.ATTRIBUTE_SETTING__NEGATIVE:
        setNegative((Boolean)newValue);
        return;
      case StoryGenPackage.ATTRIBUTE_SETTING__AMOUNT:
        setAmount((Integer)newValue);
        return;
      case StoryGenPackage.ATTRIBUTE_SETTING__FREQUENCY:
        setFrequency((AttributeSettingFrequency)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case StoryGenPackage.ATTRIBUTE_SETTING__POSITIVE:
        setPositive(POSITIVE_EDEFAULT);
        return;
      case StoryGenPackage.ATTRIBUTE_SETTING__NEGATIVE:
        setNegative(NEGATIVE_EDEFAULT);
        return;
      case StoryGenPackage.ATTRIBUTE_SETTING__AMOUNT:
        setAmount(AMOUNT_EDEFAULT);
        return;
      case StoryGenPackage.ATTRIBUTE_SETTING__FREQUENCY:
        setFrequency(FREQUENCY_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case StoryGenPackage.ATTRIBUTE_SETTING__POSITIVE:
        return positive != POSITIVE_EDEFAULT;
      case StoryGenPackage.ATTRIBUTE_SETTING__NEGATIVE:
        return negative != NEGATIVE_EDEFAULT;
      case StoryGenPackage.ATTRIBUTE_SETTING__AMOUNT:
        return amount != AMOUNT_EDEFAULT;
      case StoryGenPackage.ATTRIBUTE_SETTING__FREQUENCY:
        return frequency != FREQUENCY_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (positive: ");
    result.append(positive);
    result.append(", negative: ");
    result.append(negative);
    result.append(", amount: ");
    result.append(amount);
    result.append(", frequency: ");
    result.append(frequency);
    result.append(')');
    return result.toString();
  }

} //AttributeSettingImpl
