/**
 * generated by Xtext 2.14.0
 */
package br.ufes.inf.mdd.trab2.storyGenerator.impl;

import br.ufes.inf.mdd.trab2.storyGenerator.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StoryGeneratorFactoryImpl extends EFactoryImpl implements StoryGeneratorFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static StoryGeneratorFactory init()
  {
    try
    {
      StoryGeneratorFactory theStoryGeneratorFactory = (StoryGeneratorFactory)EPackage.Registry.INSTANCE.getEFactory(StoryGeneratorPackage.eNS_URI);
      if (theStoryGeneratorFactory != null)
      {
        return theStoryGeneratorFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new StoryGeneratorFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StoryGeneratorFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case StoryGeneratorPackage.STORY: return createStory();
      case StoryGeneratorPackage.WORLD: return createWorld();
      case StoryGeneratorPackage.ATTRIBUTE: return createAttribute();
      case StoryGeneratorPackage.EVENT: return createEvent();
      case StoryGeneratorPackage.CONDITION: return createCondition();
      case StoryGeneratorPackage.BOOL_EXP: return createBoolExp();
      case StoryGeneratorPackage.BINARY_BOOL_EXP: return createBinaryBoolExp();
      case StoryGeneratorPackage.BINARY_QNTY_EXP: return createBinaryQntyExp();
      case StoryGeneratorPackage.UNARY_BOOL_EXP: return createUnaryBoolExp();
      case StoryGeneratorPackage.NEGATE_BOOL_EXP: return createNegateBoolExp();
      case StoryGeneratorPackage.UNARY_QUANTITY_EXP: return createUnaryQuantityExp();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case StoryGeneratorPackage.ATTR_TYPE:
        return createAttrTypeFromString(eDataType, initialValue);
      case StoryGeneratorPackage.BOOLEAN_VALUE:
        return createBooleanValueFromString(eDataType, initialValue);
      case StoryGeneratorPackage.NUM_OP:
        return createNumOpFromString(eDataType, initialValue);
      case StoryGeneratorPackage.BOOL_OP:
        return createBoolOpFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case StoryGeneratorPackage.ATTR_TYPE:
        return convertAttrTypeToString(eDataType, instanceValue);
      case StoryGeneratorPackage.BOOLEAN_VALUE:
        return convertBooleanValueToString(eDataType, instanceValue);
      case StoryGeneratorPackage.NUM_OP:
        return convertNumOpToString(eDataType, instanceValue);
      case StoryGeneratorPackage.BOOL_OP:
        return convertBoolOpToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Story createStory()
  {
    StoryImpl story = new StoryImpl();
    return story;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public World createWorld()
  {
    WorldImpl world = new WorldImpl();
    return world;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event createEvent()
  {
    EventImpl event = new EventImpl();
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition createCondition()
  {
    ConditionImpl condition = new ConditionImpl();
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolExp createBoolExp()
  {
    BoolExpImpl boolExp = new BoolExpImpl();
    return boolExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryBoolExp createBinaryBoolExp()
  {
    BinaryBoolExpImpl binaryBoolExp = new BinaryBoolExpImpl();
    return binaryBoolExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryQntyExp createBinaryQntyExp()
  {
    BinaryQntyExpImpl binaryQntyExp = new BinaryQntyExpImpl();
    return binaryQntyExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryBoolExp createUnaryBoolExp()
  {
    UnaryBoolExpImpl unaryBoolExp = new UnaryBoolExpImpl();
    return unaryBoolExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NegateBoolExp createNegateBoolExp()
  {
    NegateBoolExpImpl negateBoolExp = new NegateBoolExpImpl();
    return negateBoolExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryQuantityExp createUnaryQuantityExp()
  {
    UnaryQuantityExpImpl unaryQuantityExp = new UnaryQuantityExpImpl();
    return unaryQuantityExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttrType createAttrTypeFromString(EDataType eDataType, String initialValue)
  {
    AttrType result = AttrType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAttrTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanValue createBooleanValueFromString(EDataType eDataType, String initialValue)
  {
    BooleanValue result = BooleanValue.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBooleanValueToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumOp createNumOpFromString(EDataType eDataType, String initialValue)
  {
    NumOp result = NumOp.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertNumOpToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolOp createBoolOpFromString(EDataType eDataType, String initialValue)
  {
    BoolOp result = BoolOp.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBoolOpToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StoryGeneratorPackage getStoryGeneratorPackage()
  {
    return (StoryGeneratorPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static StoryGeneratorPackage getPackage()
  {
    return StoryGeneratorPackage.eINSTANCE;
  }

} //StoryGeneratorFactoryImpl
