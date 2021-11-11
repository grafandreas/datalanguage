/**
 * generated by Xtext 2.25.0
 */
package org.grafandreas.datalang.check;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Req Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.grafandreas.datalang.check.ReqCheck#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.grafandreas.datalang.check.ReqCheck#getErrorTemplate <em>Error Template</em>}</li>
 *   <li>{@link org.grafandreas.datalang.check.ReqCheck#getAttachToFields <em>Attach To Fields</em>}</li>
 * </ul>
 *
 * @see org.grafandreas.datalang.check.CheckPackage#getReqCheck()
 * @model
 * @generated
 */
public interface ReqCheck extends EObject
{
  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(XExpression)
   * @see org.grafandreas.datalang.check.CheckPackage#getReqCheck_Expr()
   * @model containment="true"
   * @generated
   */
  XExpression getExpr();

  /**
   * Sets the value of the '{@link org.grafandreas.datalang.check.ReqCheck#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(XExpression value);

  /**
   * Returns the value of the '<em><b>Error Template</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Error Template</em>' containment reference.
   * @see #setErrorTemplate(ErrorTemplate)
   * @see org.grafandreas.datalang.check.CheckPackage#getReqCheck_ErrorTemplate()
   * @model containment="true"
   * @generated
   */
  ErrorTemplate getErrorTemplate();

  /**
   * Sets the value of the '{@link org.grafandreas.datalang.check.ReqCheck#getErrorTemplate <em>Error Template</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Error Template</em>' containment reference.
   * @see #getErrorTemplate()
   * @generated
   */
  void setErrorTemplate(ErrorTemplate value);

  /**
   * Returns the value of the '<em><b>Attach To Fields</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attach To Fields</em>' containment reference.
   * @see #setAttachToFields(Names)
   * @see org.grafandreas.datalang.check.CheckPackage#getReqCheck_AttachToFields()
   * @model containment="true"
   * @generated
   */
  Names getAttachToFields();

  /**
   * Sets the value of the '{@link org.grafandreas.datalang.check.ReqCheck#getAttachToFields <em>Attach To Fields</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attach To Fields</em>' containment reference.
   * @see #getAttachToFields()
   * @generated
   */
  void setAttachToFields(Names value);

} // ReqCheck
