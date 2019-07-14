/**
 * generated by Xtext 2.17.0
 */
package br.ufes.inf.storyGen.impl;

import br.ufes.inf.storyGen.BinaryQntyExp;
import br.ufes.inf.storyGen.NumOp;
import br.ufes.inf.storyGen.StoryGenPackage;
import br.ufes.inf.storyGen.UnaryQuantityExp;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Qnty Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.storyGen.impl.BinaryQntyExpImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link br.ufes.inf.storyGen.impl.BinaryQntyExpImpl#getNumOp <em>Num Op</em>}</li>
 *   <li>{@link br.ufes.inf.storyGen.impl.BinaryQntyExpImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryQntyExpImpl extends MinimalEObjectImpl.Container implements BinaryQntyExp
{
  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected UnaryQuantityExp left;

  /**
   * The default value of the '{@link #getNumOp() <em>Num Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumOp()
   * @generated
   * @ordered
   */
  protected static final NumOp NUM_OP_EDEFAULT = NumOp.EQ;

  /**
   * The cached value of the '{@link #getNumOp() <em>Num Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumOp()
   * @generated
   * @ordered
   */
  protected NumOp numOp = NUM_OP_EDEFAULT;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected UnaryQuantityExp right;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BinaryQntyExpImpl()
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
    return StoryGenPackage.Literals.BINARY_QNTY_EXP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnaryQuantityExp getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(UnaryQuantityExp newLeft, NotificationChain msgs)
  {
    UnaryQuantityExp oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StoryGenPackage.BINARY_QNTY_EXP__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLeft(UnaryQuantityExp newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StoryGenPackage.BINARY_QNTY_EXP__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StoryGenPackage.BINARY_QNTY_EXP__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StoryGenPackage.BINARY_QNTY_EXP__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NumOp getNumOp()
  {
    return numOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNumOp(NumOp newNumOp)
  {
    NumOp oldNumOp = numOp;
    numOp = newNumOp == null ? NUM_OP_EDEFAULT : newNumOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StoryGenPackage.BINARY_QNTY_EXP__NUM_OP, oldNumOp, numOp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnaryQuantityExp getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(UnaryQuantityExp newRight, NotificationChain msgs)
  {
    UnaryQuantityExp oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StoryGenPackage.BINARY_QNTY_EXP__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRight(UnaryQuantityExp newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StoryGenPackage.BINARY_QNTY_EXP__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StoryGenPackage.BINARY_QNTY_EXP__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StoryGenPackage.BINARY_QNTY_EXP__RIGHT, newRight, newRight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case StoryGenPackage.BINARY_QNTY_EXP__LEFT:
        return basicSetLeft(null, msgs);
      case StoryGenPackage.BINARY_QNTY_EXP__RIGHT:
        return basicSetRight(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case StoryGenPackage.BINARY_QNTY_EXP__LEFT:
        return getLeft();
      case StoryGenPackage.BINARY_QNTY_EXP__NUM_OP:
        return getNumOp();
      case StoryGenPackage.BINARY_QNTY_EXP__RIGHT:
        return getRight();
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
      case StoryGenPackage.BINARY_QNTY_EXP__LEFT:
        setLeft((UnaryQuantityExp)newValue);
        return;
      case StoryGenPackage.BINARY_QNTY_EXP__NUM_OP:
        setNumOp((NumOp)newValue);
        return;
      case StoryGenPackage.BINARY_QNTY_EXP__RIGHT:
        setRight((UnaryQuantityExp)newValue);
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
      case StoryGenPackage.BINARY_QNTY_EXP__LEFT:
        setLeft((UnaryQuantityExp)null);
        return;
      case StoryGenPackage.BINARY_QNTY_EXP__NUM_OP:
        setNumOp(NUM_OP_EDEFAULT);
        return;
      case StoryGenPackage.BINARY_QNTY_EXP__RIGHT:
        setRight((UnaryQuantityExp)null);
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
      case StoryGenPackage.BINARY_QNTY_EXP__LEFT:
        return left != null;
      case StoryGenPackage.BINARY_QNTY_EXP__NUM_OP:
        return numOp != NUM_OP_EDEFAULT;
      case StoryGenPackage.BINARY_QNTY_EXP__RIGHT:
        return right != null;
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
    result.append(" (numOp: ");
    result.append(numOp);
    result.append(')');
    return result.toString();
  }

} //BinaryQntyExpImpl
