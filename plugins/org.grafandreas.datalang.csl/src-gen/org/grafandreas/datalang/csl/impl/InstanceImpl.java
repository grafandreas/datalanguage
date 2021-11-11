/**
 * generated by Xtext 2.25.0
 */
package org.grafandreas.datalang.csl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.grafandreas.datalang.cdl.Type;

import org.grafandreas.datalang.csl.CslPackage;
import org.grafandreas.datalang.csl.IDAssignment;
import org.grafandreas.datalang.csl.Instance;
import org.grafandreas.datalang.csl.ValueAssignment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.grafandreas.datalang.csl.impl.InstanceImpl#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link org.grafandreas.datalang.csl.impl.InstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.grafandreas.datalang.csl.impl.InstanceImpl#getIds <em>Ids</em>}</li>
 *   <li>{@link org.grafandreas.datalang.csl.impl.InstanceImpl#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceImpl extends MinimalEObjectImpl.Container implements Instance
{
  /**
   * The cached value of the '{@link #getDeclaration() <em>Declaration</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaration()
   * @generated
   * @ordered
   */
  protected Type declaration;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getIds() <em>Ids</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIds()
   * @generated
   * @ordered
   */
  protected EList<IDAssignment> ids;

  /**
   * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValues()
   * @generated
   * @ordered
   */
  protected EList<ValueAssignment> values;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InstanceImpl()
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
    return CslPackage.Literals.INSTANCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Type getDeclaration()
  {
    if (declaration != null && declaration.eIsProxy())
    {
      InternalEObject oldDeclaration = (InternalEObject)declaration;
      declaration = (Type)eResolveProxy(oldDeclaration);
      if (declaration != oldDeclaration)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CslPackage.INSTANCE__DECLARATION, oldDeclaration, declaration));
      }
    }
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type basicGetDeclaration()
  {
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDeclaration(Type newDeclaration)
  {
    Type oldDeclaration = declaration;
    declaration = newDeclaration;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CslPackage.INSTANCE__DECLARATION, oldDeclaration, declaration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CslPackage.INSTANCE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<IDAssignment> getIds()
  {
    if (ids == null)
    {
      ids = new EObjectContainmentEList<IDAssignment>(IDAssignment.class, this, CslPackage.INSTANCE__IDS);
    }
    return ids;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ValueAssignment> getValues()
  {
    if (values == null)
    {
      values = new EObjectContainmentEList<ValueAssignment>(ValueAssignment.class, this, CslPackage.INSTANCE__VALUES);
    }
    return values;
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
      case CslPackage.INSTANCE__IDS:
        return ((InternalEList<?>)getIds()).basicRemove(otherEnd, msgs);
      case CslPackage.INSTANCE__VALUES:
        return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
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
      case CslPackage.INSTANCE__DECLARATION:
        if (resolve) return getDeclaration();
        return basicGetDeclaration();
      case CslPackage.INSTANCE__NAME:
        return getName();
      case CslPackage.INSTANCE__IDS:
        return getIds();
      case CslPackage.INSTANCE__VALUES:
        return getValues();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CslPackage.INSTANCE__DECLARATION:
        setDeclaration((Type)newValue);
        return;
      case CslPackage.INSTANCE__NAME:
        setName((String)newValue);
        return;
      case CslPackage.INSTANCE__IDS:
        getIds().clear();
        getIds().addAll((Collection<? extends IDAssignment>)newValue);
        return;
      case CslPackage.INSTANCE__VALUES:
        getValues().clear();
        getValues().addAll((Collection<? extends ValueAssignment>)newValue);
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
      case CslPackage.INSTANCE__DECLARATION:
        setDeclaration((Type)null);
        return;
      case CslPackage.INSTANCE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CslPackage.INSTANCE__IDS:
        getIds().clear();
        return;
      case CslPackage.INSTANCE__VALUES:
        getValues().clear();
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
      case CslPackage.INSTANCE__DECLARATION:
        return declaration != null;
      case CslPackage.INSTANCE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CslPackage.INSTANCE__IDS:
        return ids != null && !ids.isEmpty();
      case CslPackage.INSTANCE__VALUES:
        return values != null && !values.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //InstanceImpl
