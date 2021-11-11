/**
 * generated by Xtext 2.25.0
 */
package org.grafandreas.datalang.csl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.grafandreas.datalang.csl.CslFactory
 * @model kind="package"
 * @generated
 */
public interface CslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "csl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.grafandreas.org/datalang/Csl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "csl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CslPackage eINSTANCE = org.grafandreas.datalang.csl.impl.CslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.grafandreas.datalang.csl.impl.InstancesImpl <em>Instances</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grafandreas.datalang.csl.impl.InstancesImpl
   * @see org.grafandreas.datalang.csl.impl.CslPackageImpl#getInstances()
   * @generated
   */
  int INSTANCES = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCES__NAME = 0;

  /**
   * The feature id for the '<em><b>Instances</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCES__INSTANCES = 1;

  /**
   * The number of structural features of the '<em>Instances</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.grafandreas.datalang.csl.impl.InstanceImpl <em>Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grafandreas.datalang.csl.impl.InstanceImpl
   * @see org.grafandreas.datalang.csl.impl.CslPackageImpl#getInstance()
   * @generated
   */
  int INSTANCE = 1;

  /**
   * The feature id for the '<em><b>Declaration</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__DECLARATION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__NAME = 1;

  /**
   * The feature id for the '<em><b>Ids</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__IDS = 2;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__VALUES = 3;

  /**
   * The number of structural features of the '<em>Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.grafandreas.datalang.csl.impl.IDAssignmentImpl <em>ID Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grafandreas.datalang.csl.impl.IDAssignmentImpl
   * @see org.grafandreas.datalang.csl.impl.CslPackageImpl#getIDAssignment()
   * @generated
   */
  int ID_ASSIGNMENT = 2;

  /**
   * The feature id for the '<em><b>Declaration</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_ASSIGNMENT__DECLARATION = 0;

  /**
   * The feature id for the '<em><b>Id Spec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_ASSIGNMENT__ID_SPEC = 1;

  /**
   * The number of structural features of the '<em>ID Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_ASSIGNMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.grafandreas.datalang.csl.impl.ValueAssignmentImpl <em>Value Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grafandreas.datalang.csl.impl.ValueAssignmentImpl
   * @see org.grafandreas.datalang.csl.impl.CslPackageImpl#getValueAssignment()
   * @generated
   */
  int VALUE_ASSIGNMENT = 3;

  /**
   * The feature id for the '<em><b>Declaration</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_ASSIGNMENT__DECLARATION = 0;

  /**
   * The feature id for the '<em><b>Val Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_ASSIGNMENT__VAL_SPEC = 1;

  /**
   * The number of structural features of the '<em>Value Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_ASSIGNMENT_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.grafandreas.datalang.csl.Instances <em>Instances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instances</em>'.
   * @see org.grafandreas.datalang.csl.Instances
   * @generated
   */
  EClass getInstances();

  /**
   * Returns the meta object for the attribute '{@link org.grafandreas.datalang.csl.Instances#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.grafandreas.datalang.csl.Instances#getName()
   * @see #getInstances()
   * @generated
   */
  EAttribute getInstances_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.grafandreas.datalang.csl.Instances#getInstances <em>Instances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instances</em>'.
   * @see org.grafandreas.datalang.csl.Instances#getInstances()
   * @see #getInstances()
   * @generated
   */
  EReference getInstances_Instances();

  /**
   * Returns the meta object for class '{@link org.grafandreas.datalang.csl.Instance <em>Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instance</em>'.
   * @see org.grafandreas.datalang.csl.Instance
   * @generated
   */
  EClass getInstance();

  /**
   * Returns the meta object for the reference '{@link org.grafandreas.datalang.csl.Instance#getDeclaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Declaration</em>'.
   * @see org.grafandreas.datalang.csl.Instance#getDeclaration()
   * @see #getInstance()
   * @generated
   */
  EReference getInstance_Declaration();

  /**
   * Returns the meta object for the attribute '{@link org.grafandreas.datalang.csl.Instance#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.grafandreas.datalang.csl.Instance#getName()
   * @see #getInstance()
   * @generated
   */
  EAttribute getInstance_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.grafandreas.datalang.csl.Instance#getIds <em>Ids</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ids</em>'.
   * @see org.grafandreas.datalang.csl.Instance#getIds()
   * @see #getInstance()
   * @generated
   */
  EReference getInstance_Ids();

  /**
   * Returns the meta object for the containment reference list '{@link org.grafandreas.datalang.csl.Instance#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see org.grafandreas.datalang.csl.Instance#getValues()
   * @see #getInstance()
   * @generated
   */
  EReference getInstance_Values();

  /**
   * Returns the meta object for class '{@link org.grafandreas.datalang.csl.IDAssignment <em>ID Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ID Assignment</em>'.
   * @see org.grafandreas.datalang.csl.IDAssignment
   * @generated
   */
  EClass getIDAssignment();

  /**
   * Returns the meta object for the reference '{@link org.grafandreas.datalang.csl.IDAssignment#getDeclaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Declaration</em>'.
   * @see org.grafandreas.datalang.csl.IDAssignment#getDeclaration()
   * @see #getIDAssignment()
   * @generated
   */
  EReference getIDAssignment_Declaration();

  /**
   * Returns the meta object for the attribute '{@link org.grafandreas.datalang.csl.IDAssignment#getIdSpec <em>Id Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id Spec</em>'.
   * @see org.grafandreas.datalang.csl.IDAssignment#getIdSpec()
   * @see #getIDAssignment()
   * @generated
   */
  EAttribute getIDAssignment_IdSpec();

  /**
   * Returns the meta object for class '{@link org.grafandreas.datalang.csl.ValueAssignment <em>Value Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Assignment</em>'.
   * @see org.grafandreas.datalang.csl.ValueAssignment
   * @generated
   */
  EClass getValueAssignment();

  /**
   * Returns the meta object for the reference '{@link org.grafandreas.datalang.csl.ValueAssignment#getDeclaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Declaration</em>'.
   * @see org.grafandreas.datalang.csl.ValueAssignment#getDeclaration()
   * @see #getValueAssignment()
   * @generated
   */
  EReference getValueAssignment_Declaration();

  /**
   * Returns the meta object for the containment reference '{@link org.grafandreas.datalang.csl.ValueAssignment#getValSpec <em>Val Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Val Spec</em>'.
   * @see org.grafandreas.datalang.csl.ValueAssignment#getValSpec()
   * @see #getValueAssignment()
   * @generated
   */
  EReference getValueAssignment_ValSpec();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CslFactory getCslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.grafandreas.datalang.csl.impl.InstancesImpl <em>Instances</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grafandreas.datalang.csl.impl.InstancesImpl
     * @see org.grafandreas.datalang.csl.impl.CslPackageImpl#getInstances()
     * @generated
     */
    EClass INSTANCES = eINSTANCE.getInstances();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANCES__NAME = eINSTANCE.getInstances_Name();

    /**
     * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCES__INSTANCES = eINSTANCE.getInstances_Instances();

    /**
     * The meta object literal for the '{@link org.grafandreas.datalang.csl.impl.InstanceImpl <em>Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grafandreas.datalang.csl.impl.InstanceImpl
     * @see org.grafandreas.datalang.csl.impl.CslPackageImpl#getInstance()
     * @generated
     */
    EClass INSTANCE = eINSTANCE.getInstance();

    /**
     * The meta object literal for the '<em><b>Declaration</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE__DECLARATION = eINSTANCE.getInstance_Declaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANCE__NAME = eINSTANCE.getInstance_Name();

    /**
     * The meta object literal for the '<em><b>Ids</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE__IDS = eINSTANCE.getInstance_Ids();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE__VALUES = eINSTANCE.getInstance_Values();

    /**
     * The meta object literal for the '{@link org.grafandreas.datalang.csl.impl.IDAssignmentImpl <em>ID Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grafandreas.datalang.csl.impl.IDAssignmentImpl
     * @see org.grafandreas.datalang.csl.impl.CslPackageImpl#getIDAssignment()
     * @generated
     */
    EClass ID_ASSIGNMENT = eINSTANCE.getIDAssignment();

    /**
     * The meta object literal for the '<em><b>Declaration</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ID_ASSIGNMENT__DECLARATION = eINSTANCE.getIDAssignment_Declaration();

    /**
     * The meta object literal for the '<em><b>Id Spec</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ID_ASSIGNMENT__ID_SPEC = eINSTANCE.getIDAssignment_IdSpec();

    /**
     * The meta object literal for the '{@link org.grafandreas.datalang.csl.impl.ValueAssignmentImpl <em>Value Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grafandreas.datalang.csl.impl.ValueAssignmentImpl
     * @see org.grafandreas.datalang.csl.impl.CslPackageImpl#getValueAssignment()
     * @generated
     */
    EClass VALUE_ASSIGNMENT = eINSTANCE.getValueAssignment();

    /**
     * The meta object literal for the '<em><b>Declaration</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE_ASSIGNMENT__DECLARATION = eINSTANCE.getValueAssignment_Declaration();

    /**
     * The meta object literal for the '<em><b>Val Spec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE_ASSIGNMENT__VAL_SPEC = eINSTANCE.getValueAssignment_ValSpec();

  }

} //CslPackage
